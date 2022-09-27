import navbar from '../components/navbar.js';
import getData from '../components/fetchData.js';
import displayData from '../components/displayData.js';

let navbarDiv = document.querySelector('#navbar');
navbarDiv.innerHTML = navbar();

let reload = async () => {
  let url = `https://www.themealdb.com/api/json/v1/1/random.php`;
  let data = await getData(url);
  let finalData = data;
  displayData(finalData);
};

reload();
