let hotelList = document.querySelector('#hotels-list');
let input = document.querySelector('#query');
let mainDiv = document.querySelector('#hotels-list');
let dataStoring;
let isLogin = JSON.parse(localStorage.getItem('login'));
// let selectedHotel = JSON.parse(localStorage.getItem('selectedHotel')) || [];
let selectedHotel = JSON.parse(localStorage.getItem('selected')) || [];

enter = async event => {
  let query = input.value;
  let data = await getData(query);
  apendData(data);
  dataStoring = data.hotels;
};

getData = async query => {
  let url = `https://masai-mock-api.herokuapp.com/hotels/search?city=${query}`;
  let data = await fetch(url);
  data = await data.json();
  console.log(data);
  return data;
};

apendData = data => {
  mainDiv.innerHTML = '';
  let { hotels } = data;
  hotels.forEach(hotels => {
    let cardDiv = document.createElement('div');
    cardDiv.setAttribute('id', 'hotel');

    let img = document.createElement('img');
    img.src = hotels.Images.one;

    let title = document.createElement('h1');
    title.innerText = hotels.Title;

    let price = document.createElement('h2');
    price.innerText = `Price per room ${hotels.Price}`;

    let ac = document.createElement('h2');
    ac.innerText = `Ac: ${hotels.Ac}`;

    let rating = document.createElement('h2');
    rating.innerText = `Rating ${hotels.Rating}`;

    let button = document.createElement('button');
    button.innerText = 'BOOK NOW';
    button.setAttribute('class', 'book');

    cardDiv.append(img, title, price, ac, rating, button);
    mainDiv.append(cardDiv);
  });
  isLogin();
};

//sort and filtering part

let lowToHighButton = document.querySelector('#sort_lth');

lowToHighButton.addEventListener('click', event => {
  console.log(dataStoring);
  let sortData = dataStoring.sort((a, b) => {
    return a.Price - b.Price;
  });
  console.log(sortData);
  let obj = {};
  obj.hotels = sortData;
  apendData(obj);
});

let highToHighButton = document.querySelector('#sort_htl');

highToHighButton.addEventListener('click', event => {
  console.log(dataStoring);
  let sortData = dataStoring.sort((a, b) => {
    return b.Price - a.Price;
  });
  console.log(sortData);
  let obj = {};
  obj.hotels = sortData;
  apendData(obj);
});

let filterAc = document.querySelector('#filter_ac');

filterAc.addEventListener('click', event => {
  console.log(dataStoring);
  let sortData = dataStoring.filter(a => {
    return a.Ac === true;
  });
  console.log(sortData);
  let obj = {};
  obj.hotels = sortData;
  apendData(obj);
});

let filterNonAc = document.querySelector('#filter_nonac');

filterNonAc.addEventListener('click', event => {
  console.log(dataStoring);
  let sortData = dataStoring.filter(a => {
    return a.Ac === false;
  });
  console.log(sortData);
  let obj = {};
  obj.hotels = sortData;
  apendData(obj);
});

isLogin = () => {
  let bookNow = document.querySelectorAll('.book');
  console.log(bookNow);
  bookNow.forEach((allButton, index) => {
    allButton.addEventListener('click', event => {
      let loginInfo = JSON.parse(localStorage.getItem('login'));
      console.log(loginInfo);
      if (loginInfo.login === true) {
        let chooseHotel = dataStoring[index];
        selectedHotel.push(chooseHotel);
        localStorage.setItem('selected', JSON.stringify(selectedHotel));
        // location.href = 'checkout.html'
      } else {
        alert('Log In to continue!');
      }
    });
  });
};
