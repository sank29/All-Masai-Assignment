import navbar from "../components/navbar.js";
import { getData, append } from "../components/fetch.js";

let navbarId = document.querySelector("#navbar");
let cont = document.querySelector("#container");
navbarId.innerHTML = navbar();

const url = `https://fakestoreapi.com/products/category/jewelery`;

let getDataAsynFunction = async () => {
  let data = await getData(url);
  append(data, cont);
};

getDataAsynFunction();
