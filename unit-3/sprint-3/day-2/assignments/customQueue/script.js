class Queue {
  constructor() {
    this.queue = [];
    this.length = 0;
  }

  enQueue(element) {
    this.queue.push(element);
    this.length++;
  }

  deQueue(element) {
    this.queue.unshift(element);
    this.length++;
  }

  enQueueThree(...arr) {
    for (let elements of arr) {
      this.queue.push(elements);
      this.length++;
    }
  }

  deQueueThree() {
    for (let i = 0; i <= 2; i++) {
      this.queue.shift();
      this.length--;
    }
  }
}

let queue1 = new Queue();
console.log(queue1);
queue1.enQueue(1);
queue1.enQueue(2);
queue1.deQueue(3);
queue1.enQueueThree(10, 20, 30);
queue1.deQueueThree();
console.log(queue1);
