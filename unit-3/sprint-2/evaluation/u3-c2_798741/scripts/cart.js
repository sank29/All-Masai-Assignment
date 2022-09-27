let cartItems = JSON.parse(localStorage.getItem('cart_items')) || [];
let totalDiv = document.querySelector('#total-div');
let cartDiv = document.querySelector('#cart');

function displayTotalPrice() {
  let h2 = document.createElement('h2');
  h2.setAttribute('id', 'cart_total');

  let totalPrice = 0;
  cartItems.forEach(function (elements) {
    totalPrice += elements.price;
  });
  h2.innerText += totalPrice;
  totalDiv.append(h2);
}

displayTotalPrice();

function displayData(data) {
  cartDiv.innerHTML = '';

  data.forEach(function (data) {
    let img = document.createElement('img');
    img.src = data.image;

    let name = document.createElement('p');
    name.innerText = data.name;

    let price = document.createElement('p');
    price.innerText = data.price;

    let button = document.createElement('button');
    button.innerText = 'remove';
    button.setAttribute('class', 'remove');

    let newDiv = document.createElement('div');
    newDiv.setAttribute('class', 'food');

    newDiv.append(img, name, price, button);
    cartDiv.append(newDiv);
  });
}

displayData(cartItems);

//remove button
let allRemoveButton = document.querySelectorAll('.remove');

function removeButton(data) {
  allRemoveButton.forEach(function (button, index) {
    button.addEventListener('click', function (event) {
      cartItems.splice(index, 1);
      localStorage.setItem('cart_items', JSON.stringify(cartItems));
      displayData(cartItems);
      displayTotalPrice();
      window.location.reload();
    });
  });
}

removeButton(cartItems);
