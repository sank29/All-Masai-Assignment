// Ude Import export (MANDATORY)
// Onclicking store the news in local storage with key "news" so that you can access that on news.html page

import navbar from '../components/navbar.js';
let result = document.querySelector('#results');
let navbarDiv = document.querySelector('#navbar');
navbarDiv.innerHTML = navbar();

let input = document.querySelector('#search_input');
input.addEventListener('keypress', event => {
  if (event.key === 'Enter') {
    let query = input.value;
    localStorage.setItem('query', query);
    window.location.href = './search.html';
    getData(query);
  }
});

const getData = async query => {
  let res = await fetch(`https://masai-api.herokuapp.com/news?q=${query}`);
  res = await res.json();

  let { articles } = res;
  console.log(articles);
  appendData(articles);
};

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

/// sidebar

let inDiv = document.querySelector('#in');

inDiv.addEventListener('click', async event => {
  let res = await getNewsByCountryCode('in');
  console.log(res);
  appendData(res);
});
let usDiv = document.querySelector('#us');

usDiv.addEventListener('click', async event => {
  let res = await getNewsByCountryCode('us');
  console.log(res);
  appendData(res);
});
let chDiv = document.querySelector('#ch');

chDiv.addEventListener('click', async event => {
  let res = await getNewsByCountryCode('ch');
  console.log(res);
  appendData(res);
});
let ukDiv = document.querySelector('#uk');

ukDiv.addEventListener('click', async event => {
  let res = await getNewsByCountryCode('uk');
  console.log(res);
  appendData(res);
});
let nzDiv = document.querySelector('#nz');

nzDiv.addEventListener('click', async event => {
  let res = await getNewsByCountryCode('nz');
  console.log(res);
  appendData(res);
});

const getNewsByCountryCode = async code => {
  let res = await fetch(
    `https://masai-api.herokuapp.com/news/top-headlines?country=${code}`
  );
  res = await res.json();
  let { articles } = res;
  return articles;
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
