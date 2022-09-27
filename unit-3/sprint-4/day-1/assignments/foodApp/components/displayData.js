let displayData = data => {
  let appendDataDiv = document.querySelector('#appendData');
  appendDataDiv.innerHTML = '';
  let { meals } = data;
  meals.forEach(data => {
    let foodCard = document.createElement('div');
    foodCard.setAttribute('class', 'foodcard');

    let img = document.createElement('img');
    img.src = data.strMealThumb;

    // let titleDiv = document.createElement('div');
    // titleDiv.setAttribute('class', 'titleDiv');

    let title = document.createElement('h2');
    title.innerText = data.strMeal;

    let instruction = document.createElement('p');
    instruction.innerHTML = `<b>Instructions</b>: ${data.strInstructions}`;

    // titleDiv.append(title);
    foodCard.append(img, title, instruction);
    appendDataDiv.append(foodCard);
  });
};

export default displayData;
