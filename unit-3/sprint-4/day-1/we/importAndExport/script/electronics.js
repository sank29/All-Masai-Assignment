import navbar from "../components/navbar.js";
import { getData, append } from "../components/fetch.js";

let navbarId = document.querySelector("#navbar");
let cont = document.querySelector("#container");
navbarId.innerHTML = navbar();

const url = `https://fakestoreapi.com/products/category/electronics`;

let getDataAsynFunction = async () => {
  let data = await getData(url);
  append(data, cont);
};

getDataAsynFunction();

// let getData = async () => {
//   let res = await fetch(url);
//   let data = await res.json();
//   console.log(data);
//   append(data);
// };

// getData();

// let append = (data) => {
//   let cont = document.querySelector("#container");

//   data.forEach(({ image, title, price }) => {
//     let img = document.createElement("img");
//     img.src = image;

//     let t = document.createElement("p");
//     t.innerText = title;

//     let p = document.createElement("p");
//     p.innerText = price;

//     let div = document.createElement("div");
//     div.append(img, t, p);
//     cont.append(div);
//   });
// };
