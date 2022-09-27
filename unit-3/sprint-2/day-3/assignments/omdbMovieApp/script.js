let submit = document.querySelector('#submit');
let input = document.querySelector('input');
let movieDiv = document.querySelector('#movies');

submit.addEventListener('click', function () {
  let movieName = input.value;
  try {
    let data = fetch(`http://www.omdbapi.com/?s=${movieName}&apikey=1d222791`);
    getMovie(data);
  } catch (error) {
    console.log(error);
  }
});

async function getMovie(data) {
  let movieData = await data;
  movieData = await movieData.json();
  console.log(movieData);
  if (movieData.Response === 'False') {
    movieDiv.innerHTML = '';
    let movieNotFoundTitle = document.createElement('h2');
    movieNotFoundTitle.setAttribute('id', 'notFound');
    movieNotFoundTitle.innerText = `Movie Not found`;

    //gif part
    let image = document.createElement('img');
    image.setAttribute('id', 'notFoundImg');
    image.src = 'https://i.makeagif.com/media/11-04-2015/mfnzwt.gif';
    movieDiv.append(movieNotFoundTitle, image);
  } else {
    display(movieData);
    filterByYears(movieData);
  }
}

// Display Part

function display(movieArr) {
  console.log(movieArr);
  movieDiv.innerHTML = '';

  movieArr.Search.forEach(function (objData) {
    let moviePoster = document.createElement('div');
    moviePoster.setAttribute('class', ' poster');

    let posterImg = document.createElement('img');
    posterImg.setAttribute('src', objData.Poster);

    let h2 = document.createElement('h2');
    h2.innerText = `${objData.Title}`;

    let h3 = document.createElement('h3');
    h3.innerText = `${objData.Type}`;

    let language = document.createElement('p');
    language.innerText = `Year: ${objData.Year}`;

    let p = document.createElement('p');
    p.innerText = `IMDB ID: ${objData.imdbID}`;

    moviePoster.append(posterImg, h2, h3, language, p);
    movieDiv.append(moviePoster);
  });
}

function filterByYears(movieData) {
  let select = document.querySelector('#years');
  movieData = movieData.Search;

  select.addEventListener('change', function (event) {
    let years = select.value;

    let filterArr = movieData.filter(function (elments) {
      return elments.Year > years;
    });

    filterDisplay(filterArr);
  });
}

// display function for filter

function filterDisplay(movieArr) {
  console.log(movieArr);
  movieDiv.innerHTML = '';

  movieArr.forEach(function (objData) {
    let moviePoster = document.createElement('div');
    moviePoster.setAttribute('class', ' poster');

    let posterImg = document.createElement('img');
    posterImg.setAttribute('src', objData.Poster);

    let h2 = document.createElement('h2');
    h2.innerText = `${objData.Title}`;

    let h3 = document.createElement('h3');
    h3.innerText = `${objData.Type}`;

    let language = document.createElement('p');
    language.innerText = `Year: ${objData.Year}`;

    let p = document.createElement('p');
    p.innerText = `IMDB ID: ${objData.imdbID}`;

    moviePoster.append(posterImg, h2, h3, language, p);
    movieDiv.append(moviePoster);
  });
}
