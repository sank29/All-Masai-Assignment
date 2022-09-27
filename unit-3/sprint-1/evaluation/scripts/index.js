//store the products array in localstorage as "data"

let form = document.querySelector('form');
let arrData = JSON.parse(localStorage.getItem('data')) || [];

function productObj(brand, name, price, image) {
  this.brand = brand;
  this.name = name;
  this.price = price;
  this.image = image;
}

form.addEventListener('submit', function (event) {
  event.preventDefault();

  let brand = form.product_brand.value;
  let name = form.product_name.value;
  let price = form.product_price.value;
  let image = form.product_image.value;

  let data = new productObj(brand, name, price, image);
  arrData.push(data);

  console.log(arrData);
  localStorage.setItem('data', JSON.stringify(arrData));
});

let showButton = document.querySelector('#show_products');

showButton.addEventListener('click', function () {
  window.location.href = './inventory.html';
});
