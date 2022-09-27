class LoginUser {
  constructor(username, password) {
    this.password = password;
    this.username = username;
  }
}
class LoginUserLocal {
  constructor(token, username) {
    this.token = token;
    this.username = username;
  }
}

let form = document.querySelector('form');

loginUserCreating = form => {
  form.addEventListener('submit', async event => {
    event.preventDefault();
    let loginUser = new LoginUser(form.username.value, form.password.value);
    console.log(loginUser);
    try {
      let res = await postRequest(loginUser);
      res = await res.json();
      let token = res.token;
      console.log(token);
      let newUserLogin = new LoginUserLocal(token, loginUser.username);
      localStorage.setItem('userToken', JSON.stringify(newUserLogin));
      alert('Login Successful');
      window.location.href = 'user.html';
    } catch (error) {
      alert('Login faild. Please check username or password');
    }
  });
};

loginUserCreating(form);

postRequest = async loginUser => {
  let res = await fetch('https://masai-api-mocker.herokuapp.com/auth/login', {
    method: 'POST',
    body: JSON.stringify(loginUser),
    headers: {
      'Content-Type': 'application/json',
    },
  });
  return res;
};
