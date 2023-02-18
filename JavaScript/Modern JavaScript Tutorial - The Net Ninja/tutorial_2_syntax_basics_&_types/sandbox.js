const prefix_suffix = "#".repeat(20)

alert("Hello World Again!");

console.log(1);
console.log(2);



/* 1. Variables & Constants */
// Modern syntax: let, const
// Old / original syntax: var
// Note: Modern syntax might not work in all browsers, some browsers do not support modern JavaScript syntax
// Variable name only contain letters, numbers, underscore, dollar sign, but cannot start with number
// Naming convention: camelCase
console.log(`${prefix_suffix} 1. Variables & Constants ${prefix_suffix}`)

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
// Quote insensitive, can use either single or double quotes
console.log(`${prefix_suffix} 2. Strings ${prefix_suffix}`)

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

// Function - a snippet of code that perform a specific task
// Method - a function that associated with a particular object or data type

// String length
console.log(fullName.length); // accessing object property

// String methods
console.log(fullName.toUpperCase()); // calling object method

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



/* 3. Numbers */
console.log(`${prefix_suffix} 3. Numbers ${prefix_suffix}`)

let radius = 10;
const pi = 3.14;
console.log(radius, pi)

// Math operators +, -, *, /, **, %
console.log(10 / 2);

let result6  = radius % 3
console.log(result6)

let result7  = pi * radius**2
console.log(result7)

// Order of operation (PEMDAS)
let result8 = 5 * (10-3)**2;
console.log(result8)

let likes = 10;
likes = likes + 1; // increment of one
likes++; // increment of one
likes--; // reduction of one
likes+=10; // increment of ten
likes-=5; // reduction of five
likes*=2; // times 2
likes/=2; // divide by 2 
console.log(likes); // (10 + 1 + 1 - 1 + 10 -5) * 2 / 2 

//NaN - Not a Number
console.log(5 / "hello");
console.log(5 * "bye");

let result9 = 'the blog has ' + likes + ' likes';
console.log(result9);



/* 4. Template strings / template literal (insert variables into string without using + symbol) */
console.log(`${prefix_suffix} 4. Template strings ${prefix_suffix}`)

const title = 'Best of reads of 2019';
const author = 'Mario';
const likes2 = 30;

// Concatenation way
let result10 = 'The blog called ' + title + ' by ' + author + ' has ' + likes2 + ' likes';
console.log(result10)

// Template string way
let result11 = `The blog called ${title} by ${author} has ${likes2} likes`;
console.log(result11)

// Creating HTML templates
let html = `
<h2>${title}</h2>
<p>By ${author}</p>
<span>This blog has ${likes2}</span>
`;
console.log(html);



/* 5. Array */
console.log(`${prefix_suffix} 5. Array  ${prefix_suffix}`)

let ninjas = ['shaun', 'ryu', 'chun-li'];
console.log(ninjas[1]);

ninjas[1] = 'ken';
console.log(ninjas[1]);

let ages = [20, 25, 30, 35];
console.log(ages[2]);

let random = ['shaun', 'crystal', 30, 20];
console.log(random);

console.log(ninjas.length);

// Array methods
// Non-destructive methods - does not alters original arrays
let result12 = ninjas.join('&');
console.log(result12)

let result13 = ninjas.indexOf('chun-li');
console.log(result13);

let result14 = ninjas.concat(['naruto', 'sasuke']);
console.log(result14);

// Destructive methods - alters original arrays
let result15 = ninjas.push('kakashi'); // adds 'kakashi' into the array, returns the length of new array 
console.log(ninjas);

result15 = ninjas.pop(); // removes last element of the array, returns the value that removed
console.log(ninjas);



/* 6. Null & Undefined */
console.log(`${prefix_suffix} 6. Null & Undefined  ${prefix_suffix}`)

// Undefined - variable has not been assigned a value;
let age2;
console.log(age2, age2 + 3, `this age is ${age2}`);

// Null - intentional absence of any value
// Why use Null? e.g. to clear form

let age3 = null;
console.log(age3, age3 + 3, `this age is ${age3}`);



/* 7. Boolean */
console.log(`${prefix_suffix} 7. Boolean  ${prefix_suffix}`)

console.log(true, false, "true", "false");

// Methods that return booleans
let email6 = 'luigi@thenetninja.co.uk';

let result16 = email6.includes('@'); // check whether character is included in string
console.log(result16);

let result17 = email6.includes('!');
console.log(result17);

let names = ['mario', 'luigi', 'toad'];

let result18 = names.includes('luigi');
console.log(result18);

let result19 = names.includes('bowser');
console.log(result19);

// Comparison operators
let age4 = 25;
console.log(age4 == 25);
console.log(age4 == 30);
console.log(age4 != 30);
console.log(age4 > 20);
console.log(age4 < 20);
console.log(age4 <= 25);
console.log(age4 >= 25);

let f_name = 'shaun';
console.log(f_name == 'shaun');
console.log(f_name == 'Shaun');
console.log(f_name > 'crystal'); // s comes after c in alphabetical order
console.log(f_name > 'Shaun'); // lower case is greater than upper case
console.log(f_name > 'Crystal');

let age5 = 25;
// Abstract comparison / loose comparison (different types can still be equal)
console.log(age5 == 25);
console.log(age5 == '25'); // this will return true, JavaScript will convert this string to integer in the backgroup before evaluation
console.log(age5 != 25);
console.log(age5 != '25'); // this will return false


// Strict comparison (different types cannot be equal)
console.log(age5 === 25); 
console.log(age5 === '25'); // this will return false, type conversion will not happen in the background (this is an example of implict type conversion)
console.log(age5 !== 25); 
console.log(age5 !== '25'); 



/* 8. Type conversion */
console.log(`${prefix_suffix} 8. Type conversion  ${prefix_suffix}`)

// Explicit type conversion - call function to type conversion
// Implicit type conversion - type conversion happens automatically in the background

let score2 = '100';
score2 = Number(score2); // this is an example of explicit type conversion
console.log(score2 + 1)
console.log(typeof score2);

let result20 = Number('hello');
console.log(result20); // this will return NaN

let result21 = String(50); 
console.log(result21, typeof result21);

// Falsy values - false , 0 , -0 , 0n , "" , null , undefined , and NaN
// Truthy values - all values are truthy except false , 0 , -0 , 0n , "" , null , undefined , and NaN
let result22 = Boolean(100); // Truthy value 
console.log(result22, typeof result22);

let result23 = Boolean(-50); // Truthy value 
console.log(result23, typeof result23);

let result24 = Boolean(0); // Falsy value
console.log(result24, typeof result24);

let result25 = Boolean('0'); // Truthy value
console.log(result25, typeof result25);

let result26 = Boolean(""); // Falsy value
console.log(result26, typeof result26);


