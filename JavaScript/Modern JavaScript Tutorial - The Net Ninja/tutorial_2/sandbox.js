alert("Hello World Again!");

console.log(1);
console.log(2);



/* 1. Variables & Constants */
// Modern way to declare variables
let age = 25;
let year = 2019;
console.log(age, year);

age = 30;
console.log(age);

// Old way to declare variables
var score = 75;
console.log(score);

// Modern way to declare constants
const points = 100;
// points = 50; // this will produce error because constant cannot be overridden
console.log(points)



/* 2. Strings */
console.log("this is a string");

let email = 'mario@thenetninja.co.uk';
console.log(email);

// String concatenation
let firstName = 'Brandon';
let lastName = 'Sanderson'

let fullName = firstName + ' ' +lastName
console.log(fullName);

// Getting characters
console.log(fullName[0]);
console.log(fullName[2]);

// String length
console.log(fullName.length);

// String methods
console.log(fullName.toUpperCase());

let result = fullName.toLowerCase();
console.log(result, fullName);

let index = email.indexOf('@'); // return the index of the @ symbol
console.log(index);

// More string methods
let email2 = 'mario@thenetninja.co.uk';
let result2 = email2.lastIndexOf('n');
console.log(result2);

let email3 = 'mario@thenetninja.co.uk';
let result3 = email3.slice(2,5);
console.log(result3);

let email4 = 'mario@thenetninja.co.uk';
let result4 = email4.substr(4,10);
console.log(result4);

let email5 = 'mario@thenetninja.co.uk';
let result5 = email5.replace('n', 'w'); // replace first occurrence only
console.log(result5);

// stopped at 36:25 https://www.youtube.com/watch?v=FhguwBJeqWs&list=PL4cUxeGkcC9haFPT7J25Q9GRB_ZkFrQAc&index=2