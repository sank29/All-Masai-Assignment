let button = document.querySelector('#submitProduct');
class Product {
  constructor(name, id, price) {
    this.name = name;
    this.id = id;
    this.price = price;
  }
}
class UpdatedProductInfo {
  constructor(name, price) {
    this.name = name;
    this.price = price;
  }
}
button.addEventListener('click', event => {
  let name = document.querySelector('#productName').value;
  let id = document.querySelector('#productId').value;
  let price = document.querySelector('#productPrice').value;

  addProductRequest(name, id, price);
});

//////create product

addProductRequest = async (name, id, price) => {
  let newProduct = new Product(name, id, price);
  console.log(newProduct);

  let res = await fetch('http://localhost:3000/api/product', {
    method: 'POST',
    body: JSON.stringify(newProduct),
    headers: {
      'Content-Type': 'application/json',
    },
  });
  res = await res.json();
  console.log(res);
};

getDbData = async () => {
  let res = await fetch('http://localhost:3000/api/product');
  res = await res.json();
  console.log(res);
  return res;
};

displayDbData = async () => {
  let dbData = await getDbData();
  dbData.forEach(product => {
    let displayDataDiv = document.querySelector('#displayData');
    let cardDiv = document.createElement('div');
    cardDiv.setAttribute('class', 'cardDiv');

    let name = document.createElement('p');
    name.innerText = `Product Name: ${product.name}`;

    let price = document.createElement('p');
    price.innerText = `Product Price: ${product.price}`;

    let id = document.createElement('p');
    id.innerText = `Product Id: ${product.id}`;

    cardDiv.append(name, price, id);
    displayDataDiv.append(cardDiv);
  });
};
displayDbData();

/// delete product

let deleteButton = document.querySelector('#deleteProduct');
deleteButton.addEventListener('click', event => {
  let id = document.querySelector('#deleteId').value;
  console.log(id);
  deleteRequest(id);
});

deleteRequest = async id => {
  let res = await fetch(`http://localhost:3000/api/product/${id}`, {
    method: 'DELETE',
  });
  res = await res.json();
  console.log(res);
};

// update Product
let updateButton = document.querySelector('#updateProduct');

updateButton.addEventListener('click', event => {
  let whichId = document.querySelector('#whichId').value;
  let name = document.querySelector('#updateName').value;
  let price = document.querySelector('#updatePrice').value;
  let updateProductInfo = new UpdatedProductInfo(name, price);
  updateProduct(whichId, updateProductInfo);
});

updateProduct = (whichId, updateProductInfo) => {
  let res = fetch(`http://localhost:3000/api/product/${whichId}`, {
    method: 'PUT',
    body: JSON.stringify(updateProductInfo),
    headers: {
      'Content-Type': 'application/json',
    },
  });
};
