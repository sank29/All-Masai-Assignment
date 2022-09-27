// All the Code for All Students Page Goes Here
let addmission = JSON.parse(localStorage.getItem('admission')) || [];
console.log(addmission);

let addmittedStudent =
  JSON.parse(localStorage.getItem('admission-accepted')) || [];

let rejectedStudent =
  JSON.parse(localStorage.getItem('admission-rejected')) || [];

function display(addmission) {
  let tbody = document.querySelector('tbody');
  tbody.innerHTML = '';
  addmission.forEach(function (elem, index) {
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
    let td6 = document.createElement('td');
    td6.innerText = 'Accept';
    let td7 = document.createElement('td');
    td7.innerText = 'Reject';

    row.append(td1, td2, td3, td4, td5, td6, td7);

    tbody = document.querySelector('tbody');
    tbody.append(row);

    td6.addEventListener('click', function (event) {
      let acceptedStudent = addmission[index];
      addmission.splice(index, 1);
      console.log(acceptedStudent);
      addmittedStudent.push(acceptedStudent);
      localStorage.setItem('admission', JSON.stringify(addmission));
      localStorage.setItem(
        'admission-accepted',
        JSON.stringify(addmittedStudent)
      );
      display(addmission);
    });
    td7.addEventListener('click', function (event) {
      let rejectedStudentObj = addmission[index];
      addmission.splice(index, 1);
      rejectedStudent.push(rejectedStudentObj);
      localStorage.setItem('admission', JSON.stringify(addmission));
      localStorage.setItem(
        'admission-rejected',
        JSON.stringify(rejectedStudent)
      );
      display(addmission);
    });
  });
}
display(addmission);

let filter = document.querySelector('#filter');

function filterCourse(addmission, filter) {
  filter.addEventListener('change', function (elem) {
    if (filter.value === 'all') {
      display(addmission);
    } else if (filter.value === 'Web-Development') {
      let filterObj = addmission.filter(function (elem) {
        return elem.course === 'Web-Development';
      });
      display(filterObj);
    } else if (filter.value === 'Android-Development') {
      let filterObj = addmission.filter(function (elem) {
        return elem.course === 'Android-Development';
      });
      display(filterObj);
    } else if (filter.value === 'Data-Analitics') {
      let filterObj = addmission.filter(function (elem) {
        return elem.course === 'Data-Analitics';
      });
      display(filterObj);
    }
  });
}

filterCourse(addmission, filter);
