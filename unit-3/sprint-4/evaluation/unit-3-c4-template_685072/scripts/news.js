// Ude Import export (MANDATORY)
import navbar from '../components/navbar.js';
const detailsNews = JSON.parse(localStorage.getItem('news'));
let navbarDiv = document.querySelector('#navbar');
navbarDiv.innerHTML = navbar();
const detailed_news = document.querySelector('#detailed_news');

const appendData = data => {
  let cardDiv = document.createElement('div');
  cardDiv.setAttribute('class', 'news');

  const img = document.createElement('img');
  img.src = data.urlToImage;

  const title = document.createElement('h2');
  title.innerText = data.title;

  const des = document.createElement('p');
  des.innerText = data.description;

  const contest = document.createElement('p');
  contest.innerText = data.content;

  detailed_news.append(img, title, des, contest);
};

appendData(detailsNews);

let input = document.querySelector('#search_input');
input.addEventListener('keypress', event => {
  if (event.key === 'Enter') {
    let query = input.value;
    localStorage.setItem('query', query);
    window.location.href = './search.html';
    // getData(query);
  }
});
