let getData = async (url) => {
  let res = await fetch(url);
  let data = await res.json();
  return data;
};

let append = async (data, cont) => {
  data.forEach(({ image, title, price }) => {
    let img = document.createElement("img");
    img.src = image;

    let t = document.createElement("p");
    t.innerText = title;

    let p = document.createElement("p");
    p.innerText = price;

    let div = document.createElement("div");
    div.append(img, t, p);
    cont.append(div);
  });
};

export { getData, append };
