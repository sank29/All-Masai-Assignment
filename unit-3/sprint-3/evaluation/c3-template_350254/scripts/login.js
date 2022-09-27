let userList = JSON.parse(localStorage.getItem('users')) || [];
let isLogin = JSON.parse(localStorage.getItem('login'));

class LoginUser {
  constructor(email, password) {
    this.email = email;
    this.password = password;
  }
}

class isUserLogin {
  constructor() {
    this.login = false;
  }
}

let loginButton = document.querySelector('#log_in');

loginButton.addEventListener('click', event => {
  let email = document.querySelector('#email').value;
  let password = document.querySelector('#password').value;

  let user = new LoginUser(email, password);

  if (inputCheck(user)) {
    alert('Wrong credentials');
    let userLogin = new isUserLogin();
    userLogin.login = true;
    localStorage.setItem('login', JSON.stringify(userLogin));
  } else {
    alert('Login successful!');
  }
});

inputCheck = newUser => {
  let filterUser = userList.filter(user => {
    return user.email === newUser.email && user.password === newUser.password;
  });

  console.log(filterUser.length);
  if (filterUser.length === 0) {
    return true;
  }
  return false;
};
