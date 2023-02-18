const prefix_suffix = "#".repeat(20)

/* 1. Object literals */
console.log(`${prefix_suffix} 1. Object literals ${prefix_suffix}`)

// Create object
let user = {
    name : "crystal",
    age : 30,
    email : "crystal@thenetninja.co.uk",
    location : "berlin",
    blogs : ["why mac and cheese rules", "10 things to make with marmite"] 
};

// Access object properties with dot notation
console.log(user);
console.log(user.name);

// Update "age" property
user.age = 40
console.log(user.age);

// Access object properties with [] notation (can pass in dynamic values)
console.log(user["email"]);

// Update "name" property
user["name"] = "chun-li"
console.log(user["name"]);

// Access object properties by passing in variable
const key = "location"
console.log(user[key])

console.log(typeof user)



/* 2. Add methods to object */
console.log(`${prefix_suffix} 2. Add methods to object ${prefix_suffix}`)

// Add "login" method to object
let user2 = {
    name : "crystal",
    age : 30,
    email : "crystal@thenetninja.co.uk",
    location : "berlin",
    blogs : ["why mac and cheese rules", "10 things to make with marmite"],
    login: function(){
        console.log("the user logged in")
    },
    logout: function(){
        console.log("the user logged out")
    }
};

user2.login();
user2.logout();



/* 3. "this" keyword */
console.log(`${prefix_suffix} 3. "this" keyword ${prefix_suffix}`)

// "this" is a context object, it represents the context in which the current code is executed
// If "this" is used in global scope, it refers to Window object
console.log(this)

let user3 = {
    name : "crystal",
    age : 30,
    email : "crystal@thenetninja.co.uk",
    location : "berlin",
    blogs : ["why mac and cheese rules", "10 things to make with marmite"],
    login: function(){
        console.log("the user logged in")
    },
    logout: function(){
        console.log("the user logged out")
    },
    logBlogs: function(){ // Do not use arrow function with "this" keyword, because it will not change the context to current object, instead use regular function
        console.log(this) // "this" here refers "user3" object
        console.log('this user has written the following blogs:');
        this.blogs.forEach(blog =>{
            console.log(blog);
        })
    }
    // logBlogs(){ // Compact way to write regular function
    //     console.log(this) // "this" here refers "user3" object
    //     console.log('this user has written the following blogs:');
    //     this.blogs.forEach(blog =>{
    //         console.log(blog);
    //     })
    // }
};

user3.logBlogs();



/* 4. Store objects in arrays */
console.log(`${prefix_suffix} 4. Store objects in arrays ${prefix_suffix}`)

// const blogs = [
//     {title : "why mac and cheese rules", 
//      likes : 30},
//     {title : "10 things to make with marmite", 
//      likes : 50}
// ];

// console.log(blogs)

let user4 = {
    name : "crystal",
    age : 30,
    email : "crystal@thenetninja.co.uk",
    location : "berlin",
    blogs : [{title : "why mac and cheese rules", likes : 30},
             {title : "10 things to make with marmite", likes : 50}],
    login(){
        console.log("the user logged in")
    },
    logout(){
        console.log("the user logged out")
    },
    logBlogs(){
        console.log('this user has written the following blogs:');
        this.blogs.forEach(blog =>{
            console.log(blog.title, blog.likes);
        })
    }
};

user4.logBlogs();



/* 5. Math object */
console.log(`${prefix_suffix} 5. Math object ${prefix_suffix}`)

console.log(Math);
console.log(Math.PI);
console.log(Math.E);

const area = 7.7;
console.log(Math.round(area)); // rounding
console.log(Math.floor(area)); // round down
console.log(Math.ceil(area)); // round up
console.log(Math.trunc(area)); // remove decimals and left with integer

// Random numbers
const random = Math.random();
console.log(random);

console.log(Math.round(random * 1)); // random number between 0 and 1 (inclusive)
console.log(Math.round(random * 100)); // random number between 0 and 100 (inclusive)



/* 6. Primitive & Reference types */

// primitive - store in stack - store variables directly in the stack
// reference type - store in heap - store pointer in stack which points to the heap

// Primitive values
let scoreOne = 50;
let scoreTwo = scoreOne; // make a copy of "scoreOne"

console.log(`scoreOne : ${scoreOne}`, `scoreTwo : ${scoreTwo}`);

// Update scoreOne value
scoreOne = 100;
console.log(`scoreOne : ${scoreOne}`, `scoreTwo : ${scoreTwo}`); // scoreOne and scoreTwo has different values


// Reference values
const userOne = {name : "ryu", age : 30}
const userTwo = userOne; // make a copy of userOne

console.log(userOne, userTwo);

// Update userOne age value
userOne.age = 40;
console.log(userOne, userTwo); // age from userOne and userTwo are the same because they are pointing the same object


