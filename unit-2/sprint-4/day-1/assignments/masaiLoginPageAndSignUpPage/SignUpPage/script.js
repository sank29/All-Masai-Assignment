document.body.style.zoom = '75%';

let signUp = document.querySelector('#signUp');

let userArr = JSON.parse(localStorage.getItem('UserArrLocally')) || [];

console.log(userArr);
signUp.addEventListener('click', function (event) {
  let name = document.querySelector('#name').value;
  let email = document.querySelector('#email').value;
  let password = document.querySelector('#password').value;

  let userObj = {
    name: name,
    email: email,
    password: password,
  };
  if (!userObj.email) {
    alert('Please enter email id');
    return false;
  }
  if (!userObj.password) {
    alert('Please enter password');
    return false;
  }
  if (checkUser(userObj, userArr)) {
    alert('Enter valid email id or this email id register, please login.');
  } else {
    userArr.push(userObj);
    localStorage.setItem('UserArrLocally', JSON.stringify(userArr));
    alert(`Your successfully login ${userObj.name}`);
    window.location.href = '../loginPage/index.html';
  }
});

function checkUser(userObj, userArr) {
  let userFilter = userArr.filter(function (elem) {
    return elem.email === userObj.email;
  });

  if (userFilter.length > 0) {
    return true;
  } else {
    return false;
  }
}
