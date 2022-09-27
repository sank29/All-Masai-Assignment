// All the Code for the Admitted page goes here

let addmittedStudent =
  JSON.parse(localStorage.getItem('admission-accepted')) || [];

function display(addmittedStudent) {
  let tbody = document.querySelector('tbody');
  tbody.innerHTML = '';
  addmittedStudent.forEach(function (elem) {
    let row = document.createElement('tr');
    let td1 = document.createElement('td');
    td1.innerText = elem.name;

    let td2 = document.createElement('td');
    td2.innerText = elem.email;

    let td3 = document.createElement('td');
    td3.innerText = elem.course;

    let td4 = document.createElement('td');
    td4.innerText = elem.gender;

    let td5 = document.createElement('td');
    td5.innerText = elem.mobile;

    row.append(td1, td2, td3, td4, td5);

    tbody = document.querySelector('tbody');
    tbody.append(row);
  });
}
display(addmittedStudent);

console.log(addmittedStudent);
