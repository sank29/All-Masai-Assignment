import navbar from '../components/navbar.js';
import getData from '../components/fetchData.js';
import displayData from '../components/displayData.js';

let navbarDiv = document.querySelector('#navbar');
navbarDiv.innerHTML = navbar();

let input = document.querySelector('input');

input.addEventListener('input', async event => {
  let query = document.querySelector('#query');
  query = query.value;
  let url = `https://www.themealdb.com/api/json/v1/1/search.php?s=${query}`;
  let data = await getData(url);
  let finalData = data;
  displayData(finalData);
});
