const prefix_suffix = "#".repeat(20);

/* 1. querySelector (Recommended)*/
console.log(`${prefix_suffix} 1. querySelector ${prefix_suffix}`)

// "querySelector" returns the first element that matches the selector

const para = document.querySelector("p");
const para2 = document.querySelector(".error");
const para3 = document.querySelector("div.error");
const para4 = document.querySelector("body h1");

console.log(para);
console.log(para2);
console.log(para3);
console.log(para4);



/* 2. querySelectorAll (Recommended)*/
console.log(`${prefix_suffix} 2. querySelectorAll ${prefix_suffix}`)

// "querySelectorAll" returns a NodeList containing all elements that match the selector
// Can use forEach method

const paras = document.querySelectorAll("p")
console.log(paras);
console.log(paras[0]);
console.log(paras[2]);

paras.forEach(para => {
    console.log(para)
})

const errors = document.querySelectorAll(".error");
console.log(errors);



/* 3. Get element by ID, class name, tag name*/
console.log(`${prefix_suffix} 3. Get element by ID, class name, tag name ${prefix_suffix}`)

// Get an element by ID
const title = document.getElementById("page-title");
console.log(title);

// Get elements by their class name
// Returns a HTMLCollection object
// Cannot use forEach method
const errors2 = document.getElementsByClassName("error");
console.log(errors2);

// Get elements by their tag name
const paras2 = document.getElementsByTagName("p");
console.log(paras2);
console.log(paras2[1]);


