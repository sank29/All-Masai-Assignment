class vehicle {
  constructor(name, companyName) {
    this.name = name;
    this.companyName = companyName;
  }

  break() {
    console.log(`Your ${this.name} speed reduce by 10`);
  }
  accelerator() {
    console.log('Your vechicle speed increase by 10');
  }
}

class BMWCar extends vehicle {
  constructor() {
    super();
    this.subName = 'BMW';
  }

  doorOpen() {
    console.log(`${this.name} door oping automatically`);
  }
}

let vechicle1 = new vehicle('BMW', 'BMW');

vechicle1.break();
