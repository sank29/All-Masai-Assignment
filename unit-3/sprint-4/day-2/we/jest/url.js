function searchParams(url, param) {
  let u = new URL(url);
  let params = new URLSearchParams(u.search);
  let f = param.get(param);
  return f;
}

export default searchParams;
