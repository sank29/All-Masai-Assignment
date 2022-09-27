let data = JSON.parse(localStorage.getItem('data')) || [];
let form = document.querySelector('form');

function loginUserData(email, password) {
  this.email = email;
  this.password = password;
}

form.addEventListener('submit', function (event) {
  event.preventDefault();

  let email = form.email.value;
  let password = form.password.value;

  let loginUserObj = new loginUserData(email, password);

  let loginUserFilter = data.filter(function (elements) {
    return (
      elements.email === loginUserObj.email &&
      elements.password === loginUserObj.password
    );
  });

  console.log(loginUserFilter);

  if (loginUserFilter.length > 0) {
    alert('Login successfully');
    window.location.href = 'index.html';
  } else {
    alert('Please check Email or Password');
  }
});

function home() {
  window.location.href = 'index.html';
}

function signup() {
  window.location.href = 'signup.html';
}
