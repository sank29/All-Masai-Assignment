class Bulding {
  constructor(name) {
    this.buildingName = name;
  }
}

class Floor extends Bulding {
  constructor(name, numberOfFloor) {
    super(name);
    this.numberOfFloor = numberOfFloor;
    this.numberOfRoomEachFloor = 5;
    this.floor = [];

    for (let i = 0; i <= this.numberOfFloor - 1; i++) {
      for (let j = 0; j <= this.numberOfRoomEachFloor - 1; j++) {
        let newRomm = new Room();
        newRomm.roomNumber = j;
        newRomm.floorNumber = i;

        if (j % 2 === 0) {
          newRomm.roomSize = 'SM room';
        } else {
          newRomm.roomSize = 'LM room';
        }
        this.floor.push(newRomm);
      }
    }
  }
  bookRoom(typeOfRoom) {
    for (let rooms of this.floor) {
      if (rooms.roomSize === typeOfRoom && rooms.isBook === false) {
        rooms.isBook = true;
        return rooms;
        alert('Room is booked');
      }
    }
    alert(
      `There are no empty rooms for this type or you enter invalid type of room for meeting rooms`
    );
  }

  availableRoom() {
    let availableRoom = this.floor.filter(rooms => {
      return rooms.isBook === false;
    });
    return availableRoom;
  }

  //   cancelBooking(roomNumber, floorNumber) {
  //     let bookedRoom = this.floor.filter(rooms => {
  //       return (
  //         rooms.roomNumber === roomNumber &&
  //         rooms.floorNumber === floorNumber &&
  //         rooms.isBook === true
  //       );
  //     });
  //     if (bookedRoom.length === 0) {
  //       alert('Please enter valid room number or floor number');
  //     } else {
  //       console.log(bookedRoom);
  //       bookedRoom.isBook = false;
  //       alert('Your room got cancel. Thank You!');
  //     }
  //     console.log(bookedRoom);
  //   }

  cancelBooking(roomNumber, floorNumber) {
    let cancelRoom = this.floor.map(rooms => {
      if (
        rooms.roomNumber === roomNumber &&
        rooms.floorNumber === floorNumber &&
        rooms.isBook === true
      ) {
        rooms.isBook = false;
        alert('Your room got cancel. Thank You!');
        return rooms;
      } else if (
        rooms.roomNumber === roomNumber &&
        rooms.floorNumber === floorNumber &&
        rooms.isBook === false
      ) {
        alert(
          'Please enter valid room number or floor number to cancel booking'
        );
      }
    });
  }

  allBookedSlots() {
    let bookedSlots = this.floor.filter(rooms => {
      return rooms.isBook === true;
    });
    return bookedSlots;
  }
}

class Room {
  constructor() {
    this.roomName = 'Meeting room';
    this.isBook = false;
  }
}

let floors = new Floor('tcs', 4); //creating floor with giving building name and number of floors in that building
// console.log(floors);

/*

console.log(floors.bookRoom('SM room'));
console.log(floors.bookRoom('SM room'));
console.log(floors.cancelBooking(0, 0));
console.log(floors.cancelBooking(0, 0));
console.log(floors.availableRoom());

console.log(floors.allBookedSlots());

*/

let main = document.querySelector('#main');
let mainAvailableRoom = document.querySelector('#availableRoom');

let appendData = floors => {
  mainAvailableRoom.innerHTML = '';
  //available rooms
  let allavaillableRooms = floors.availableRoom();
  allavaillableRooms.forEach(rooms => {
    let availableRoomDiv = document.createElement('div');

    let h2 = document.createElement('h2');
    h2.innerText = 'All available rooms';

    let roomName = document.createElement('p');
    roomName.innerText = rooms.roomName;

    let roomNumberandRoomFloor = document.createElement('p');
    roomNumberandRoomFloor.innerText = `Room Number ${rooms.roomNumber} and Floor Number ${rooms.floorNumber}`;

    let roomSize = document.createElement('p');
    roomSize = `Room size ${rooms.roomSize}`;

    availableRoomDiv.append(roomName, roomNumberandRoomFloor, roomSize);
    mainAvailableRoom.append(availableRoomDiv);
  });
};

appendData(floors);

// Booking room

let roomSize = document.querySelector('#roomSize');
let submitButton = document.querySelector('#submit');
let bookedRoomArr = JSON.parse(localStorage.getItem('bookedRoom')) || [];

submitButton.addEventListener('click', event => {
  let roomSizeInput = roomSize.value;
  let rooms = floors.bookRoom(roomSizeInput);
  bookedRoomArr.push(rooms);
  localStorage.setItem('bookedRoom', JSON.stringify(bookedRoomArr));
  console.log(bookedRoomArr);
  appendData(floors);

  let bookedRoom = document.querySelector('#bookedRoom');
  let bookedRoomDivs = document.createElement('div');

  let h2 = document.createElement('h2');
  h2.innerText = 'Your booked rooms';

  let roomName = document.createElement('p');
  roomName.innerText = rooms.roomName;

  let roomNumberandRoomFloor = document.createElement('p');
  roomNumberandRoomFloor.innerText = `Room Number ${rooms.roomNumber} and Floor Number ${rooms.floorNumber}`;

  // let roomSize = document.createElement('p');
  // roomSize = `Room size ${rooms.roomSize}`;
  let cancelBookingButton = document.createElement('button');
  cancelBookingButton.innerText = 'Cancel Booking';

  bookedRoomDivs.append(roomName, roomNumberandRoomFloor, cancelBookingButton);
  bookedRoom.append(bookedRoomDivs);

  //cancel Booking button

  cancelBookingButton.addEventListener('click', function (event) {
    console.log('button press');
    console.log(event);
    console.log(rooms);
    let roomNumber = rooms.roomNumber;
    let floorNumber = rooms.floorNumber;
    floors.cancelBooking(roomNumber, floorNumber);
  });
});

deleteDiv = () => {};
