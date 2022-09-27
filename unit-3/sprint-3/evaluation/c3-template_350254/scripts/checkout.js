let selectedHotel = JSON.parse(localStorage.getItem('selected')) || [];
let mainDiv = document.querySelector('#checkout');
apendData = data => {
  data.forEach(hotels => {
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

    mainDiv.append(img, title, price, ac, rating, button);
  });
};

apendData(selectedHotel);
