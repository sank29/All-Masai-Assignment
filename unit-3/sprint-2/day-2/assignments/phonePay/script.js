let button = document.querySelector('#submit');
let input = document.querySelector('input');
let middlePart = document.querySelector('#middle');
let bottomPart = document.querySelector('#bottom');
let img = document.createElement('img');
let backButton = document.querySelector('#back');

//promise part
let randomTime = () => {
  return Math.floor(Math.random() * (10 - 1) + 1);
};

//random time

button.addEventListener('click', async () => {
  let inputData = input.value;

  let payment = new Promise(function (ressolve, reject) {
    let time = randomTime();
    img.src = 'https://pbs.twimg.com/media/DwSDiyIUcAAH-g9.jpg';
    bottomPart.innerHTML = '';
    middlePart.append(img);

    setTimeout(function () {
      time > 5
        ? reject('Payment not successful')
        : ressolve('Payment successful');
    }, time * 1000);
  });

  try {
    let finalData = await payment;
    img.setAttribute(
      'src',
      'https://www.consumercomplaints.in/thumb.php?complaints=2390558&src=491206587.png&wmax=900&hmax=900&quality=85&nocrop=1'
    );
    middlePart.innerHTML = '';
    middlePart.append(img);
  } catch (error) {
    img.setAttribute('src', 'https://pbs.twimg.com/media/EO4McJDU4AAb-EG.jpg');
    middlePart.innerHTML = '';
    middlePart.append(img);
  }
});

backButton.addEventListener('click', function () {
  window.location.reload();
});
