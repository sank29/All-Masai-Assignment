let login = document.querySelector('#clickLogin');
let loginUserObj = JSON.parse(localStorage.getItem('loginUserData')) || [];

login.addEventListener('click', function (event) {
  let email = document.querySelector('#email').value;
  let password = document.querySelector('#password').value;

  let loginUserObj = {
    email: email,
    password: password,
  };

  let signUpData = JSON.parse(localStorage.getItem('UserArrLocally'));

  if (checkUser(loginUserObj, signUpData) === true) {
    localStorage.setItem('loginUserData', JSON.stringify(loginUserObj));
    alert(`login successfully`);
  } else {
    alert('Please cheak your email id or password');
  }
});

function checkUser(loginUserObj, signUpData) {
  let loginUserFilterObj = signUpData.filter(function (element) {
    console.log(element.email);
    return (
      element.email === loginUserObj.email &&
      element.password === loginUserObj.password
    );
  });
  console.log(loginUserFilterObj);
  console.log(loginUserFilterObj.length - 1);
  if (loginUserFilterObj.length > 0) {
    return true;
  } else {
    return false;
  }
}
