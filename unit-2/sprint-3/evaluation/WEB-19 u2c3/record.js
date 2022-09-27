// fill in javascript code here
let form = document.querySelector('form');

form.addEventListener('submit', function (event) {
  event.preventDefault();
  //   name
  let name = document.querySelector('#name').value;
  let td1 = document.createElement('td');
  td1.innerText = name;

  //id
  let id = document.querySelector('#employeeID').value;
  let td2 = document.createElement('td');
  td2.innerText = id;

  //department
  let department = document.querySelector('#department').value;
  let td3 = document.createElement('td');
  td3.innerText = department;

  //Experience
  let experience = document.querySelector('#exp').value;
  let td4 = document.createElement('td');
  td4.innerText = experience;

  //Email
  let email = document.querySelector('#email').value;
  let td5 = document.createElement('td');
  td5.innerText = email;

  //mobile
  let mobile = document.querySelector('#mbl').value;
  let td6 = document.createElement('td');
  td6.innerText = mobile;

  //role
  let td7 = document.createElement('td');
  if (experience > 5) {
    td7.innerText = 'Senior';
  } else if (experience >= 2 && experience < 5) {
    td7.innerText = 'Junior';
  } else if (experience <= 1) {
    td7.innerText = 'Fresher';
  }

  //Delete
  let button = document.createElement('button');
  button.innerText = 'Button';

  button.addEventListener('click', function (event) {
    event.target.parentNode.remove();
  });

  let row = document.createElement('tr');
  row.append(td1, td2, td3, td4, td5, td6, td7, button);

  let tbody = document.querySelector('tbody');
  tbody.append(row);
  console.log(name);

  //filter

  //   arr = [];
  //   obj = {
  //     name: document.querySelector('#name').value,
  //     id: document.querySelector('#employeeID').value,
  //     department: document.querySelector('#department').value,
  //     experience: document.querySelector('#exp').value,
  //     email: document.querySelector('#email').value,
  //     mobile: document.querySelector('#mbl').value,
  //   };
  //   arr.push(obj);
  //   console.log(obj);
});
// let arr = [];
// let obj;

// let filter = document.createElement('input');
// let submit = document.createElement('button');

// let div = document.createElement('div');
// let bodyDiv = document.querySelector('h1+div');

// console.log(bodyDiv);
// div.append(filter, submit);
// bodyDiv.prepend(div);

// submit.addEventListener('click', function (event) {
//   filterValue = filter.value;

//   let displayElements = arr.filter(function (elements) {
//     return elements.department === filterValue;
//   });
//   displayElements.forEach(function (elements) {});
//   console.log(displayElements);
// });
