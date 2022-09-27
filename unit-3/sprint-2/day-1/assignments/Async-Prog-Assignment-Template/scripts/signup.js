let form = document.querySelector('form');
let data = JSON.parse(localStorage.getItem('data')) || [];

function signUpObj(name, contact, email, password) {
  this.name = name;
  this.contact = contact;
  this.email = email;
  this.password = password;
}

form.addEventListener('submit', function (event) {
  event.preventDefault();

  let name = form.name.value;
  let contact = form.contact.value;
  let email = form.email.value;
  let password = form.password.value;

  if (name === '') {
    alert('Please enter name');
  } else if (contact === '') {
    alert('Please enter contact');
  } else if (email === '') {
    alert('Please enter email');
  } else if (password === '') {
    alert('Please enter password');
  } else {
    let user = new signUpObj(name, contact, email, password);
    data.push(user);
    localStorage.setItem('data', JSON.stringify(data));
  }
});

function home() {
  window.location.href = 'index.html';
}

function login() {
  window.location.href = 'login.html';
}
