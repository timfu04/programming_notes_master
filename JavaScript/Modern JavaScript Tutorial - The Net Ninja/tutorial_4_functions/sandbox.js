/* 1. Function declaration */
function greet(){
    console.log('hello there');
}

greet(); // call or invoke function



/* 2. Function expression */
// Store function in a variable
const speak = function(){
    console.log('good day!');
};

speak();



/* 3. Arguments & parameters */
const speak2 = function(name){ // "name" is a parameter. "name" is a local variable, within this function scope
    console.log(`good day ${name}!`); 
};

speak2('mario'); // passing an argument


// Default parameters
const speak3 = function(name = 'luigi', time = 'night'){ // these are the default values to these parameters if no arguments are passed
    console.log(`good ${time} ${name}!`); 
};

speak3(); // without passing any arguments
speak3('shaun', 'day'); // argument passed will override default parameters
speak3('shaun'); // first parameter will be overridden, second parameter will be default value



/* 4. Returning values */
const calcArea = function(radius){
    return 3.14 * radius**2;
}

const area = calcArea(5);
console.log(area);



/* 5. Arrow function */
// Regular function 
const calcArea2 = function(radius){
    return 3.14 * radius**2;
}

const area2 = calcArea2(10);
console.log(area2);

// Arrow function
const calcArea3 = (radius) => { // remove "function" keyword
    return 3.14 * radius**2;
}
const area3 = calcArea3(5);
console.log('area is:', area3);

// Arrow function but more compacted
const calcArea4 = radius => 3.14 * radius**2; // can remove parameter parenthesis when there is exact one parameter
const area4 = calcArea4(5);
console.log('area is:', area4);

// Practise arrow functions (convert regular functions to arrow functions)
// Question 1
const greet2_ques = function(){
    return 'hello, world';
}

const greet2_ans = () => 'hello, world';
const result = greet2_ans();
console.log(result); 

// Question 2 
const bill_ques = function(products, tax){
    let total = 0;
    for(let i = 0; i < products.length; i++){
        total += products[i] + products[i] * tax;
    }
    return total;
}
console.log(bill_ques([10, 15, 30], 0.2));

const bill_ans = (products, tax) => {
    let total = 0;
    for(let i = 0; i < products.length; i++){
        total += products[i] + products[i] * tax;
    }
    return total;
}
console.log(bill_ans([20, 15, 45], 0.2));



/* 6. Functions vs Methods */
// Functions (self defined)
const greet3 = () => 'hello';

let result2 = greet3();
console.log(result2);

// Methods (functions that associate with object or datatype)
const f_name = 'shaun';

let result3 = f_name.toUpperCase();
console.log(result3);


/* 7. Callback & forEach */

// A callback function is a function passed into another function as an argument
const myFunc = (callbackFunc) => { 
    // do something
    let value = 50;
    callbackFunc(value);
}

myFunc(function(value){ // declare "callbackFunc" function within "myFunc" function call
    // do something
    console.log(value);
})

// Common way to defined call back functions (same as above, converted to arrow function)
myFunc(value => { 
    // do something
    console.log(value);
})

// forEach
// Example 1 (callback function inside function call)
let people = ['mario', 'luigi', 'ryu', 'shaun', 'chun-li'];

people.forEach(function(person){ // "person" refers to the elements of the "people" array
    console.log(person);
})

// Common way to defined forEach with call back function (same as above, converted to arrow function)
people.forEach(person => { 
    console.log(person);
})

// Similar to above, getting index value from array
people.forEach((person, index) => { 
    console.log(index, person);
})

// Example 2 (callback function outside function call)
let people2 = ['mario', 'luigi', 'ryu', 'shaun', 'chun-li'];

const logPerson = (person, index) =>{
    console.log(`${index} - ${person}`);
};

people2.forEach(logPerson);


// Example 3 (create HTML template with forEach and callback function)
const ul = document.querySelector('.people'); // get a reference to the 'ul'

const people3 = ['mario', 'luigi', 'ryu', 'shaun', 'chun-li'];

let html = ``;

people3.forEach(person =>{
    // create HTML template
    html+=`<li style="color:purple">${person}</li>`;
})

console.log(html);

ul.innerHTML = html; // place newly created HTML template into 'ul'


