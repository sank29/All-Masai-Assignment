class User {
  constructor(name, email, password, username, mobile, description) {
    this.name = name;
    this.email = email;
    this.password = password;
    this.username = username;
    this.mobile = mobile;
    this.description = description;
  }
}
let form = document.querySelector('form');

userCreating = form => {
  form.addEventListener('submit', async event => {
    event.preventDefault();
    let newUser = new User(
      form.name.value,
      form.email.value,
      form.password.value,
      form.username.value,
      form.mobile.value,
      form.description.value
    );
    let res = await postRequest(newUser);
    res = await res.json();
    alert(res.message);
    window.location.href = './login.html';
  });
};
userCreating(form);

postRequest = async newUser => {
  let res = await fetch(
    'https://masai-api-mocker.herokuapp.com/auth/register',
    {
      method: 'POST',
      body: JSON.stringify(newUser),
      headers: {
        'Content-Type': 'application/json',
      },
    }
  );
  return res;
};
