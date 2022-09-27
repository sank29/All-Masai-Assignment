// All the JS Code for the Add Students Page Goes Here

let form = document.querySelector('form');
let addmission = JSON.parse(localStorage.getItem('admission')) || [];

function addStudent(form) {
  form.addEventListener('submit', function (event) {
    event.preventDefault();
    let obj = {
      name: form.name.value,
      email: form.email.value,
      mobile: form.phone.value,
      gender: form.gender.value,
      course: form.course.value,
    };
    addmission.push(obj);
    localStorage.setItem('admission', JSON.stringify(addmission));
    form.name.value = '';
    form.email.value = '';
    form.phone.value = '';
    form.gender.value = '';
    form.course.value = '';
  });
}
addStudent(form);
