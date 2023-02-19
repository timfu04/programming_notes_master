const prefix_suffix = "#".repeat(20);

/* 8. Adding and removing class */
console.log(`${prefix_suffix} 8. Adding and removing class ${prefix_suffix}`)

const content = document.querySelector("p");

console.log(content.classList);
content.classList.add('error'); // add "error" class 
content.classList.remove('error'); // remove "error" class
content.classList.add('success'); // remove "error" class