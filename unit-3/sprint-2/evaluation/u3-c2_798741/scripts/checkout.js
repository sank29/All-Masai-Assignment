let form = document.querySelector('form');

form.addEventListener('submit', function (event) {
  event.preventDefault();
  console.log('form clicked');
  alertTheUser();
});

let id = 0;
let setTimeoutId;

async function alertTheUser() {
  setTimeoutId = setInterval(function () {
    intervalFunction(id);
    id++;
  }, 1000);
}

function intervalFunction(id) {
  if (id === 0) {
    alert('Your order is confirmed');
  } else if (id === 3) {
    alert('Your order is being Packed');
  } else if (id === 8) {
    alert('Your order is in transit');
  } else if (id === 10) {
    alert('Your order is out for delivery');
  } else if (id === 12) {
    alert('Order delivered');
    clearInterval(setTimeoutId);
  }
}
