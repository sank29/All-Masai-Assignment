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
