async function main() {
  let query = document.querySelector('#query').value;
  let data = await getData(query);
  append(data);
}

async function getData(query) {
  const url = `http://www.omdbapi.com/?apikey=1d222791&s=${query}`;
  let res = await fetch(url);
  let data = await res.json();
  return data.Search;
}

function append(data) {
  if (!data) {
    return;
  }

  let container = document.querySelector('#movies');
  container.innerHTML = '';

  data.forEach(function (el, index) {
    let img = document.createElement('img');
    img.src = el.Poster;

    let p = document.createElement('p');
    p.innerText = el.Title;

    let div = document.createElement('div');
    div.setAttribute('class', 'movie');
    div.append(img, p);

    container.append(div);

    //clicking on movie

    let movieDiv = document.querySelectorAll('.movie');
    let clickedDiv = document.querySelector('#clickedMovie');

    movieDiv[index].addEventListener('click', function () {
      clickedDiv.innerHTML = '';
      console.log(data[index]);
      let el = data[index];
      let img = document.createElement('img');
      img.src = el.Poster;

      let p = document.createElement('p');
      p.innerText = el.Title;

      let p1 = document.createElement('p');
      p1.innerText = `Type: ${el.Type}`;

      let p2 = document.createElement('p');
      p2.innerText = `Year: ${el.Year}`;

      let p3 = document.createElement('p');
      p3.innerText = `imdbID: ${el.imdbID}`;

      let div = document.createElement('div');
      div.setAttribute('class', 'clickedDiv');
      div.append(img, p, p1, p2, p3);

      clickedDiv.append(div);
    });
  });
}

let id;

function debounce(func, delay) {
  console.log(id);
  if (id) {
    clearTimeout(id);
  }
  id = setTimeout(function () {
    func();
  }, delay);
}
