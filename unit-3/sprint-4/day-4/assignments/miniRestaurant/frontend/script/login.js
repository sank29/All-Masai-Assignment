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
    this.isAdmin = false;
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

      //setting up admin user

      if (
        loginUser.username === 'sanketS' &&
        loginUser.password === 'sanketS'
      ) {
        newUserLogin.isAdmin = true;
        alert('You are login as Admin');
        window.location.href = './admin.html';
      } else {
        newUserLogin.isAdmin = false;
        alert('Login Successful');
        window.location.href = './user.html'
      }

      localStorage.setItem('userToken', JSON.stringify(newUserLogin));
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
