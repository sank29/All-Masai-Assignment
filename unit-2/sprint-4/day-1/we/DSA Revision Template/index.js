let form = document.querySelector('form');
let arr = JSON.parse(localStorage.getItem('array')) || [];

form.addEventListener('submit', function (event) {
  event.preventDefault();
  obj = {
    title: document.querySelector('#title').value,
    link: document.querySelector('#link').value,
    difficulty: document.querySelector('#difficulty').value,
  };
  arr.push(obj);
  localStorage.setItem('array', JSON.stringify(arr));
  displayTable(arr);
});

displayTable(arr);

function displayTable(arr) {
  document.querySelector('tbody').innerHTML = '';
  arr.forEach(function (element, index) {
    let tr = document.createElement('tr');
    let td1 = document.createElement('td');
    td1.innerText = element.title;

    let td2 = document.createElement('td');
    td2.innerText = element.link;

    let td3 = document.createElement('td');
    td3.innerText = element.difficulty;

    let td4 = document.createElement('td');

    if (element.difficulty === 'Easy') {
      td4.innerText = 'No';
    } else {
      td4.innerText = 'Yes';
    }
    let td5 = document.createElement('td');
    td5.innerText = 'Delete';
    tr.append(td1, td2, td3, td4, td5);
    let tbody = document.querySelector('tbody');
    tbody.append(tr);

    // Delete functionality

    td5.addEventListener('click', function (event) {
      event.target.parentNode.remove();
      arr.splice(index, 1);
      localStorage.setItem('array', JSON.stringify(arr));
    });
  });
}
