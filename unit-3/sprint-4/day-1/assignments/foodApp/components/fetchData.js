let getData = async url => {
  let data = await fetch(url);
  data = await data.json();
  return data;
};

export default getData;
