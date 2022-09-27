class NewMenu {
  constructor(id, img, title, description, price) {
    this.id = id;
    this.img = img;
    this.title = title;
    this.description = description;
    this.price = price;
  }
}
const value = id => {
  return document.querySelector(`${id}`).value;
};

const form = document.querySelector('#addForm');

const getInputData = form => {
  form.addEventListener('submit', async event => {
    event.preventDefault();
    const id = value('#id');
    const img = value('#img');
    const title = value('#title');
    const des = value('#des');
    const price = value('#price');
    const newFood = new NewMenu(id, img, title, des, price);
    let res = await postRequest(newFood);
    res = await res.json();
    console.log(res);
  });
};
getInputData(form);

const postRequest = async newFood => {
  let res = await fetch('http://localhost:3000/api/food', {
    method: 'POST',
    body: JSON.stringify(newFood),
    headers: {
      'Content-Type': 'application/json',
    },
  });
  return res;
};

const getAllDbData = async () => {
  let res = await fetch('http://localhost:3000/api/food');
  res = await res.json();
  console.log(res);
  return res;
};

const displayMenu = async () => {
  let data = await getAllDbData();

  data.forEach(food => {
    let addedMenu = document.querySelector('#addedMenu');
    let foodCard = document.createElement('div');
    let imgDiv = document.createElement('div');
    let pDiv = document.createElement('div');

    foodCard.setAttribute('class', 'card');

    let img = document.createElement('img');
    img.src = food.img;
    imgDiv.append(img);

    let title = document.createElement('p');
    title.innerText = food.title;
    title.style.fontSize = '25px';
    title.style.fontWeight = 'bold';

    let id = document.createElement('p');
    id.innerText = food.id;

    let des = document.createElement('p');
    des.innerText = food.description;

    let price = document.createElement('p');
    price.innerText = `Cost Rs ${food.price} for two`;

    let payment = document.createElement('p');
    payment.innerText = 'Accepts Cash payments';

    pDiv.append(title, id, des, price, payment);
    foodCard.append(imgDiv, pDiv);
    addedMenu.append(foodCard);
  });
};

displayMenu();

//editing menu

class EditedMenu {
  constructor(img, title, description, price) {
    this.img = img;
    this.title = title;
    this.description = description;
    this.price = price;
  }
}

const editForm = document.querySelector('#editForm');

editForm.addEventListener('submit', async event => {
  event.preventDefault();
  const id = value('#editId');
  const img = value('#editImg');
  const title = value('#editTitle');
  const des = value('#editDes');
  const price = value('#editPrice');

  let editedFood = new EditedMenu(img, title, des, price);
  let res = await editMenu(editedFood, id);
  console.log(res);
});

const editMenu = async (editedFood, id) => {
  let res = await fetch(`http://localhost:3000/api/food/${id}`, {
    method: 'PATCH',
    body: JSON.stringify(editedFood),
    headers: {
      'Content-Type': 'application/json',
    },
  });
  res = await res.json();
  return res;
};

/// delete id

const deleteButton = document.querySelector('#deleteId');

console.log(deleteButton);
deleteButton.addEventListener('click', event => {
  const id = value('#deleteMenu');
  console.log(id);
  deleteRequest(id);
});

const deleteRequest = async id => {
  let res = await fetch(`http://localhost:3000/api/food/${id}`, {
    method: 'DELETE',
  });
};
