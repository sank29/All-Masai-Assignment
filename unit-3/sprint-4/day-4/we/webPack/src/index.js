import axios from 'axios';

// Make a request for a user with a given ID

axios
  .get('https://fakestoreapi.com/products/1')
  .then(function (response) {
    // handle success
    console.log(response);
  })
  .catch(function (error) {
    // handle error
    console.log(error);
  })
  .finally(function () {
    // always executed
  });
