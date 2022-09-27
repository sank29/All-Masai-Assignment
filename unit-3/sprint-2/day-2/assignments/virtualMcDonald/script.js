let submitButton = document.querySelector('#submit');
p = document.createElement('p');
let displayText = document.querySelector('#display');
let image = document.createElement('img');
// submitButton.addEventListener('click', function (event) {
//   allInput.forEach(function (box, index) {});
// });

function submit() {
  let allInput = document.querySelectorAll('.value');
  let orderedFood = [];

  allInput.forEach(function (box) {
    if (box.checked === true) {
      let text = document.querySelector(`#${box.id}`);
      if (box.id === 'bigMac') {
        orderedFood.push('Big Mac🍔');
      }
      if (box.id === 'quarterPounder') {
        orderedFood.push('Quarter Pounder🍔');
      }
      if (box.id === 'doubleQuarterPounder') {
        orderedFood.push('Double Quarter Pounder🍔');
      }
      if (box.id === 'macDouble') {
        orderedFood.push('Mc Double🍔');
      }
      if (box.id === 'hamburger') {
        orderedFood.push('Hamburger🍔');
      }
      if (box.id === 'mcChicken') {
        orderedFood.push('Mc Chicken🍗');
      }
      if (box.id === 'fries') {
        orderedFood.push('Fries🍟');
      }
    }
  });
  display(orderedFood);
  let i = 0;

  let foodPromise = new Promise((resolve, reject) => {
    let timeRequired = time();
    setTimeout(function () {
      resolve(
        `Your order is done!😃 Please collect the order!🤤 Thank You! 😄 Your order id is ${timeRequired}`
      );
    }, timeRequired * 1000);

    // let id = setInterval(function () {
    //   if (timeRequired === i) {
    //     clearInterval(id);
    //   }
    //   let p = document.createElement('p');
    //   p.innerText = i;
    //   displayText.append(p);
    //   i++;
    // }, 1000);
  });

  async function promise() {
    let result = await foodPromise;
    p.innerText = result;

    image.src =
      'https://64.media.tumblr.com/e415cde1bff3149aaae57ef96ffb1924/100ada82053a788d-a8/s500x750/18a03a040e1b0490e4b7cd890f0de5c32c270a4a.gifv';
    displayText.append(p, image);
  }
  promise();
}

function display(orderedFood) {
  let str = '';

  orderedFood.forEach(function (elements, index) {
    str += elements;

    if (orderedFood.length - 1 === index) {
      p.innerText += `Your total order are ${index + 1}, and they are ${str}
    And your order is in process.⏳ We let you know when order is done!😎
    `;
    }
  });
  image.src =
    'https://cdnb.artstation.com/p/assets/images/images/013/835/387/original/nur-athirah-zulkifli-456ecc82-98c9-4e65-8c4c-b5800125330b.gif?1541302337';
  displayText.append(p);
  displayText.append(image);
}

//Random time

function time() {
  return Math.floor(Math.random() * (20 - 10) + 10);
}
