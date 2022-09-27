// Ude Import export (MANDATORY)
// Onclicking store the news in local storage with key "news" so that you can access that on news.html page
import navbar from '../components/navbar.js';
let query = localStorage.getItem('query');
let result = document.querySelector('#results');
let navbarDiv = document.querySelector('#navbar');
navbarDiv.innerHTML = navbar();

let input = document.querySelector('#search_input');
input.addEventListener('keypress', event => {
  if (event.key === 'Enter') {
    let inputValue = input.value;
    getData(inputValue);
  }
});

const getData = async query => {
  let res = await fetch(`https://masai-api.herokuapp.com/news?q=${query}`);
  res = await res.json();
  let { articles } = res;
  console.log(articles);
  appendData(articles);
};

getData(query);

const appendData = data => {
  result.innerHTML = '';
  data.forEach(data => {
    let imgDiv = document.createElement('div');
    let textDiv = document.createElement('div');
    let cardDiv = document.createElement('div');
    cardDiv.setAttribute('class', 'news');

    const img = document.createElement('img');
    img.src = data.urlToImage;

    const title = document.createElement('h2');
    title.innerText = data.title;

    const des = document.createElement('p');
    des.innerText = data.description;

    imgDiv.append(img);
    textDiv.append(title, des);
    cardDiv.append(imgDiv, textDiv);
    result.append(cardDiv);
  });
  let allNewsDiv = document.querySelectorAll('.news');
  console.log(allNewsDiv);
  storingNews(allNewsDiv, data);
};

// storing news

const storingNews = (allNewsDiv, data) => {
  allNewsDiv.forEach((allDivs, index) => {
    allDivs.addEventListener('click', event => {
      console.log(data[index]);
      localStorage.setItem('news', JSON.stringify(data[index]));
      window.location.href = './news.html';
    });
  });
};
