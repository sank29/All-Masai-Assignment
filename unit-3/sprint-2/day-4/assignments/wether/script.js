let button = document.querySelector('#submit');

button.addEventListener('click', function (event) {
  let city = document.querySelector('input').value;
  let url = `https://api.openweathermap.org/data/2.5/weather?q=${city}&appid=22a01d25104d127a32d2e2ea8681bd09`;

  getWether(url);
  getFutureData(city);
});

async function getWether(url) {
  let data = await fetch(url);
  data = await data.json();

  append(data);
  console.log(data);
}

function append(data) {
  let url = `https://maps.google.com/maps?q=${data.name}&t=&z=13&ie=UTF8&iwloc=&output=embed`;

  let container = document.querySelector('#container');
  container.innerHTML = '';
  let h2 = document.createElement('h2');
  h2.innerText = `${data.name}🏙️`;

  let temp = document.createElement('p');
  temp.innerText = `Temp🥵: ${data.main.temp}`;

  let minTemp = document.createElement('p');
  minTemp.innerText = `Min Temp🥶: ${data.main.temp_min}`;

  let maxTemp = document.createElement('p');
  maxTemp.innerText = `Max Temp🥵: ${data.main.temp_max}`;

  let wind = document.createElement('p');
  wind.innerText = `Wind Speed💨: ${data.wind.speed}`;

  let clouds = document.createElement('p');
  clouds.innerText = `Clouds☁️: ${data.weather[0].description}`;

  let sunSet = document.createElement('p');
  sunSet.innerText = `Sunrise🌅: ${getTime(
    data.sys.sunrise
  )}  and Sunset🌇: ${getTime(data.sys.sunset)}`;

  container.append(h2, temp, minTemp, maxTemp, wind, clouds, sunSet);

  let iframe = document.querySelector('#gmap_canvas');

  iframe.src = url;
}

function geoLocation() {
  navigator.geolocation.getCurrentPosition(success);
  function success(pos) {
    const crd = pos.coords;
    console.log('Your current position is:');
    console.log(`Latitude : ${crd.latitude}`);
    console.log(`Longitude: ${crd.longitude}`);
    console.log(`More or less ${crd.accuracy} meters.`);
    getMyData(crd.latitude, crd.longitude);
  }
}
geoLocation();

function getMyData(lat, lon) {
  let city = document.querySelector('input').value;

  let url = `https://api.openweathermap.org/data/2.5/weather?lat=${lat}&lon=${lon}&appid=22a01d25104d127a32d2e2ea8681bd09`;

  getWether(url);
}

async function getWether(url) {
  let data = await fetch(url);
  data = await data.json();
  append(data);
}

function getTime(sec) {
  var date = new Date(sec * 1000);
  var timestr = date.toLocaleTimeString();
  return timestr;
}

// Future Weather

let futureDiv = document.querySelector('#future');

async function getFutureData(city) {
  let url = `https://api.openweathermap.org/data/2.5/forecast?q=${city}&cnt=8&appid=22a01d25104d127a32d2e2ea8681bd09`;
  let data = await fetch(url);
  data = await data.json();
  add(data.list);
}

// function filterDates(data) {
//   console.log(data.list);
//   let date = new Date();
//   let day = date.getDate();

//   let filterArr = [];

//   data.list.forEach(function (elements) {
//     // 2022-07-01 18:00:00

//     if (`2022-07-0${day} 18:00:00` === elements.dt_txt) {
//       day++;
//       filterArr.push(elements);
//     }
//     // return `2022-07-02 18:00:00` === elements.dt_txt;
//   });
//   console.log(filterArr);
// }

function add(arr) {
  let weeks = ['Sun', 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat'];
  let future = document.getElementById('future');
  let d = 0;
  future.innerHTML = '';
  arr.forEach(function (el) {
    let curr_date = new Date();
    curr_date.setDate(curr_date.getDate() + d);
    let new_date = new Date(curr_date);
    let day = new_date.getDay();
    let dayName = document.createElement('h2');
    dayName.innerText = weeks[day];
    console.log(dayName);
    let img = document.createElement('img');
    img.src =
      'https://cdn5.vectorstock.com/i/1000x1000/91/54/rainy-weather-forecast-vector-17209154.jpg';
    let temp_max = document.createElement('p');
    temp_max.innerText = el.main.temp_max + 10;
    let temp_min = document.createElement('p');
    temp_min.innerHTML = el.main.temp_max + 10;
    let div = document.createElement('div');
    div.append(dayName, img, temp_max, temp_min);
    future.append(div);
    d++;
  });
}
