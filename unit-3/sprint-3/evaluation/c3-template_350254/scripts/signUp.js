let userList = JSON.parse(localStorage.getItem('users')) || [];

class User {
  constructor(name, email, password) {
    this.name = name;
    this.email = email;
    this.password = password;
    // this.isLogin = false;
  }
}

let signUpButton = document.querySelector('#sign_up');
signUpButton.addEventListener('click', event => {
  let name = document.querySelector('#name').value;
  let email = document.querySelector('#email').value;
  let password = document.querySelector('#password').value;

  let user = new User(name, email, password);

  if (inputCheck(user)) {
    alert('User Already exists');
  } else {
    alert('User succefully SignUp');
    userList.push(user);
    localStorage.setItem('users', JSON.stringify(userList));
  }
});

inputCheck = newUser => {
  let filterUser = userList.filter(user => {
    return user.email === newUser.email;
  });

  console.log(filterUser.length);
  if (filterUser.length !== 0) {
    return true;
  }
  return false;
};
