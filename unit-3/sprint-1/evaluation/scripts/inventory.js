let productData = document.querySelector('#products_data');

let arrData = JSON.parse(localStorage.getItem('data')) || [];

function display(arrData) {
  productData.innerHTML = '';
  arrData.forEach(function (elements) {
    let subDiv = document.createElement('div');

    let image = document.createElement('img');
    image.setAttribute('src', elements.image);

    let p1 = document.createElement('p');
    p1.innerText = elements.brand;

    let p2 = document.createElement('p');
    p2.innerText = elements.name;

    let p3 = document.createElement('p');
    p3.innerText = elements.price;

    let removeButton = document.createElement('button');
    removeButton.setAttribute('id', 'remove_product');
    removeButton.innerText = 'Remove';

    subDiv.append(image, p1, p2, p3, removeButton);
    productData.append(subDiv);
  });
}

display(arrData);

//remove

let removeButton = document.querySelectorAll('#remove_product');

removeButton.forEach(function (button, index) {
  button.addEventListener('click', function () {
    arrData.splice(index, 1);
    localStorage.setItem('data', JSON.stringify(arrData));
    display(arrData);
    window.location.reload();
  });
});

let addProuctButton = document.querySelector('#add_product');

addProuctButton.addEventListener('click', function () {
  window.location.href = './index.html';
});
