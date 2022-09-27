// write code here, dont change anything in HTML and css files
// refer to id's mentioned in html files carefully
// Follow the exact column order for tables,for eg: name should be filled under "name" column
// we are using form here, make sure you are using "submit" eventListener , or else you will get 0 marks

let form = document.querySelector('form');

form.addEventListener('submit', formInput);

function formInput(event) {
  event.preventDefault();
  let tbody = document.querySelector('tbody');
  let image = document.querySelector('#image').value;
  let name = document.querySelector('#name').value;
  let select = document.querySelector('select');
  let batch = select.value;
  let dsa = document.querySelector('#dsa').value;
  let cs = document.querySelector('#cs').value;
  let coding = document.querySelector('#coding').value;

  let row = document.createElement('tr');

  //Image
  let td1 = document.createElement('td');
  let img = document.createElement('img');
  img.setAttribute('src', image);
  td1.append(img);

  //Name
  let td2 = document.createElement('td');
  td2.innerText = name;

  //batch
  let td3 = document.createElement('td');
  td3.innerText = batch;

  //dsa marks
  let td4 = document.createElement('td');
  td4.innerText = dsa;

  //skillathon marks
  let td5 = document.createElement('td');
  td5.innerText = cs;

  //coding marks
  let td6 = document.createElement('td');
  td6.innerText = coding;

  //percentage
  let totalMarks = Number(dsa) + Number(cs) + Number(coding);
  let percentage = (totalMarks / 30) * 100;
  let td7 = document.createElement('td');
  td7.innerText = `${percentage.toFixed(2)}%`;

  // status
  let td8 = document.createElement('td');
  if (percentage < 50) {
    td8.innerText = 'Async';
    td8.style.backgroundColor = 'red';
  } else {
    td8.innerText = 'Regular';
    td8.style.backgroundColor = 'green';
  }

  let td9 = document.createElement('td');
  td9.innerText = 'DELETE';
  td9.style.backgroundColor = 'red';

  td9.addEventListener('click', function (event) {
    event.target.parentNode.remove();
  });
  row.append(td1, td2, td3, td4, td5, td6, td7, td8, td9);
  tbody.append(row);
}
