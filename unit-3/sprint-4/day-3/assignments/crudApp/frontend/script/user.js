let addUser = document.querySelector('#addUser');
console.log(addUser);

let getUserInfoRequest = async () => {
  let usernameAndToken = JSON.parse(localStorage.getItem('userToken'));
  try {
    let res = await fetch(
      `https://masai-api-mocker.herokuapp.com/user/${usernameAndToken.username}`,
      {
        headers: {
          Authorization: `Bearer ${usernameAndToken.token}`,
        },
      }
    );
    res = await res.json();
    console.log(res);
    appendUser(res);
  } catch (error) {
    console.log(error);
  }
};

getUserInfoRequest();

appendUser = data => {
  let addUser = document.querySelector('#addUser');

  let p1 = document.createElement('p');
  p1.innerText = `Name: ${data.name}`;

  let p2 = document.createElement('p');
  p2.innerText = `Username: ${data.name}`;

  let p3 = document.createElement('p');
  p3.innerText = `Email: ${data.email}`;

  let p4 = document.createElement('p');
  p4.innerText = `Mobile: ${data.mobile}`;

  let p5 = document.createElement('p');
  p5.innerText = `Description: ${data.description}`;

  let p6 = document.createElement('p');
  p6.innerText = `Token: ${data.token}`;

  addUser.append(p1, p2, p3, p4, p5, p6);
};
