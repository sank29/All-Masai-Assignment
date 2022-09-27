slideshow = document.querySelector('#slideshow');

let imageArr = [
  'https://images.unsplash.com/photo-1460881680858-30d872d5b530?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTJ8fG1vdmllc3xlbnwwfDB8MHx8&auto=format&fit=crop&w=500&q=60',
  'https://images.unsplash.com/photo-1595769816263-9b910be24d5f?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8NHx8bW92aWVzfGVufDB8MHwwfHw%3D&auto=format&fit=crop&w=500&q=60',
  'https://images.unsplash.com/photo-1594909122845-11baa439b7bf?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8M3x8bW92aWVzfGVufDB8MHwwfHw%3D&auto=format&fit=crop&w=500&q=60',
  'https://images.unsplash.com/photo-1517604931442-7e0c8ed2963c?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Nnx8bW92aWVzfGVufDB8MHwwfHw%3D&auto=format&fit=crop&w=500&q=60',
  'https://images.unsplash.com/photo-1542204165-65bf26472b9b?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8bW92aWVzfGVufDB8MHwwfHw%3D&auto=format&fit=crop&w=500&q=60',
  'https://images.unsplash.com/photo-1522869635100-9f4c5e86aa37?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTB8fG1vdmllc3xlbnwwfDB8MHx8&auto=format&fit=crop&w=500&q=60',
];

let i = 0;
let image = document.createElement('img');

setInterval(function () {
  if (i > imageArr.length - 1) {
    i = 0;
  }
  image.src = imageArr[i];

  slideshow.append(image);
  i++;
}, 2000);

function login() {
  window.location.href = 'login.html';
}

function signup() {
  window.location.href = 'signup.html';
}

//Movie poster part

let movieArr = JSON.parse(localStorage.getItem('movies')) || [];

let movieObj = function (name, data, poster, rating) {
  this.name = name;
  this.releaseDate = data;
  this.poster = poster;
  this.imdbRating = rating;
};

let interstellar = new movieObj(
  'Interstellar',
  '7 November 2014',
  'http://static.hd-trailers.net/images/interstellar-127916-poster-xlarge.jpg',
  8.6
);

let starWars = new movieObj(
  'Star Wars: Episode IV: A New Hope',
  '1 July 1978',
  'https://images.indulgexpress.com/uploads/user/ckeditor_images/article/2019/11/30/Star_wars.jpg',
  8.6
);

let rogueOne = new movieObj(
  'Rogue One: A Star Wars Story',
  '16 December 2016',
  'https://c4.wallpaperflare.com/wallpaper/53/481/282/rogue-one-a-star-wars-story-star-wars-jyn-erso-movies-wallpaper-preview.jpg',
  7.8
);

let schindlersList = new movieObj(
  `Schindler's List`,
  '4 February 1994',
  'https://m.media-amazon.com/images/M/MV5BNDE4OTMxMTctNmRhYy00NWE2LTg3YzItYTk3M2UwOTU5Njg4XkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_.jpg',
  9.0
);

let theShawshankRedemption = new movieObj(
  'The Shawshank Redemption',
  '22 September 1994',
  'https://m.media-amazon.com/images/M/MV5BMDFkYTc0MGEtZmNhMC00ZDIzLWFmNTEtODM1ZmRlYWMwMWFmXkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_FMjpg_UX1000_.jpg',
  9.3
);

let apollo11 = new movieObj(
  'apollo 11',
  '1 March 2019',
  'https://images.squarespace-cdn.com/content/v1/5f1811b47a7edc2eea4892b4/1633047733072-I6VNASXIUML2LCNMANCJ/Apollo-11-Poster.jpg',
  8.1
);

let theLordoFTheRings = new movieObj(
  'The Lord of the Rings',
  '15 March 2002',
  'https://images-na.ssl-images-amazon.com/images/I/8150KG7y2EL.jpg',
  8.8
);

let theHobbit = new movieObj(
  'The Hobbit: An Unexpected Journey',
  '28 November 2012',
  'https://m.media-amazon.com/images/M/MV5BMTcwNTE4MTUxMl5BMl5BanBnXkFtZTcwMDIyODM4OA@@._V1_FMjpg_UX1000_.jpg',
  7.8
);

let castAway = new movieObj(
  'Cast Away',
  '7 December 2000',
  'https://m.media-amazon.com/images/M/MV5BN2Y5ZTU4YjctMDRmMC00MTg4LWE1M2MtMjk4MzVmOTE4YjkzXkEyXkFqcGdeQXVyNTc1NTQxODI@._V1_FMjpg_UX1000_.jpg',
  7.8
);

movieArr.push(
  interstellar,
  starWars,
  rogueOne,
  schindlersList,
  theShawshankRedemption,
  apollo11,
  theLordoFTheRings,
  theHobbit,
  castAway
);

let movieDiv = document.querySelector('#movies');
localStorage.setItem('movie', JSON.stringify(movieArr));

function display(movieArr) {
  movieDiv.innerHTML = '';
  movieArr.forEach(function (elements) {
    let moviePoster = document.createElement('div');
    moviePoster.setAttribute('class', ' poster');

    let posterImg = document.createElement('img');
    posterImg.setAttribute('src', elements.poster);

    let h2 = document.createElement('h2');
    h2.innerText = `${elements.name}`;

    let h3 = document.createElement('h3');
    h3.innerText = `${elements.releaseDate}`;

    let p = document.createElement('p');
    p.innerText = `Rating: ${elements.imdbRating}`;

    moviePoster.append(posterImg, h2, h3, p);
    movieDiv.append(moviePoster);
  });
}

display(movieArr);

// Sort part

let lowTohigh = document.querySelector('#sort-lh');
let highToLow = document.querySelector('#sort-hl');

function accending(movieArr) {
  lowTohigh.addEventListener('click', function () {
    let sortedArr;
    movieArr.forEach(function (elements) {
      sortedArr = movieArr.sort(function (a, b) {
        return b.imdbRating - a.imdbRating;
      });
    });
    display(sortedArr);
  });
}

accending(movieArr);

function descending(movieArr) {
  highToLow.addEventListener('click', function () {
    let sortedArr;
    movieArr.forEach(function (elements) {
      sortedArr = movieArr.sort(function (a, b) {
        return a.imdbRating - b.imdbRating;
      });
    });
    display(sortedArr);
  });
}

descending(movieArr);
