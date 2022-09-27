// Array.prototype.myMap = fun => {
//   let index = this.length;
//   let newArr = [];

//   for (let i = 0; i <= index - 1; i++) {
//     let element = this.arr[i];
//     let result = fun(element);
//     newArr.push(result);
//   }
//   return newArr;
// };

// Array.prototype.myFilter = fun => {
//   let index = this.length;
//   let newArr = [];

//   for (let i = 0; i <= index - 1; i++) {
//     let element = this.arr[i];
//     let result = fun(element);
//     if (result === true) {
//       newArr.push(element);
//     }
//   }
//   return newArr;
// };

// Array.prototype.myReduce = (accum, fun) => {
//   let i = 0;
//   if (arguments.length < 2) {
//     i = 1;
//     accum = this.arr[0];
//   }
//   for (; i <= this.arr.length - 1; i++) {
//     let currentResult = this.arr[i];
//     accum = func(accum, currentResult);
//   }
//   return accum;
// };

class myArray {
  constructor() {
    this.arr = [];
    this.length = 0;
  }

  push(...arr) {
    this.arr = arr;
    let size = this.length;

    arr.forEach(function (element) {
      size++;
    });

    this.length = size;
  }

  pop() {
    let index = this.length - 1;

    delete this.arr[index];
    this.length--;
    this.arr.length--;
  }

  myForEach(fun) {
    let index = this.length;

    for (let i = 0; i <= index - 1; i++) {
      let element = this.arr[i];
      fun(element);
    }
  }

  myMap(fun) {
    let index = this.length;
    let newArr = [];

    for (let i = 0; i <= index - 1; i++) {
      let element = this.arr[i];
      let result = fun(element);
      newArr.push(result);
    }
    return newArr;
  }

  myFilter(fun) {
    let index = this.length;
    let newArr = [];

    for (let i = 0; i <= index - 1; i++) {
      let element = this.arr[i];
      let result = fun(element);
      if (result === true) {
        newArr.push(element);
      }
    }
    return newArr;
  }

  myReduce(func, accum) {
    let i = 0;
    if (arguments.length < 2) {
      i = 1;
      accum = this.arr[0];
    }
    for (; i <= this.arr.length - 1; i++) {
      let currentResult = this.arr[i];
      accum = func(accum, currentResult);
    }
    return accum;
  }
}

let array1 = new myArray();

array1.push(1, 2, 3, 4, 5);
array1.pop();
console.log(array1);

// array1.myForEach((element)=> {
//   console.log(element);
// });

// console.log(array1);

// let productOfTen = array1.arr.map( (element)=> {
//   return element * 10;
// });

// let productOfTen = array1.myMap( (element) =>{
//   return element * 10;
// });

// let productOfTen = array1.arr.filter((element)=> {
//   return element > 2;
// });
// let productOfTen = array1.myFilter( (element) =>{
//   return element > 2;
// });

// let procutResult = array1.myReduce((accum, element) => {
//   return accum * element;
// });

// console.log(procutResult);

// let chainingResult = array1.arr.myMap(function (element) {
//   return element * 2;
// });
//   .myFilter(function (element) {
//     return element > 10;
//   })
//   .myReduce(function (accum, element) {
//     return accum * element;
//   });
// console.log(chainingResult);
// console.log(array1);
// console.log(chainingResult);
