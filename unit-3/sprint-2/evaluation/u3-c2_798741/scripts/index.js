let groceries = document.querySelector('#groceries');
let cartItems = JSON.parse(localStorage.getItem('cart_items')) || [];

async function getData() {
  let data = await fetch('https://grocery-masai.herokuapp.com/items');
  data = await data.json();
  //   console.log(data);
  displayData(data.data);
}

getData();

function displayData(data) {
  data.forEach(function (data) {
    let img = document.createElement('img');
    img.src = data.image;

    let name = document.createElement('p');
    name.innerText = data.name;

    let price = document.createElement('p');
    price.innerText = data.price;

    let button = document.createElement('button');
    button.innerText = 'Add to Cart';
    button.setAttribute('class', 'add_to_cart');

    let newDiv = document.createElement('div');
    newDiv.setAttribute('class', 'item');

    newDiv.append(img, name, price, button);
    groceries.append(newDiv);
  });

  // console.log(wallet.innerText);

  let addToCart = document.querySelectorAll('.add_to_cart');
  clicking(addToCart, data);
}

//pricing

function clicking(addToCart, data) {
  let wallet = document.querySelector('#wallet');
  addToCart.forEach(function (button, index) {
    button.addEventListener('click', function (event) {
      cartItems.push(data[index]);
      localStorage.setItem('cart_items', JSON.stringify(cartItems));
      displayWallet(data[index]);
    });
  });
}

function displayWallet(data) {
  let walletDiv = document.querySelector('#wallet');

  walletAmount = walletDiv.innerText;
  if (walletAmount < data.price) {
    alert('Insufficient balance');
  } else {
    walletDiv.innerText = walletAmount - data.price;
  }
}
