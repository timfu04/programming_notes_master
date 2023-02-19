const prefix_suffix = "#".repeat(20);

/* 4. Changing text inside element */
console.log(`${prefix_suffix} 4. Changing text inside element ${prefix_suffix}`)

// Change text for one element
const para5 = document.querySelector("p");
console.log(para5.innerText);

para5.innerText = "ninjas are awesome!"; // also updates in the browser


// Change text for multipe elements
const paras3 = document.querySelectorAll("p");

paras3.forEach(para => {
    console.log(para.innerText);
    para.innerText += " new text"; // concatenate each <p> tag with "new text"
});



/* 5. Changing HTML inside element */ 
console.log(`${prefix_suffix} 5. Changing HTML inside element ${prefix_suffix}`)

const content = document.querySelector(".content")
console.log(content.innerHTML);

content.innerHTML += "<h2> this is a new h2 </h2>";

const people = ["mario", "luigi", "yoshi"];

people.forEach(person =>{
    content.innerHTML += `<p>${person}</p>`;
});



/* 6. Getting and setting attribute of a element */
console.log(`${prefix_suffix} 6. Getting and setting attribute of an element ${prefix_suffix}`)

const link = document.querySelector("a");

console.log(link.getAttribute("href"));
link.setAttribute("href", "https://www.youtube.com/"); // update existing attribute
link.innerText = "The one and only YouTube"

const mssg = document.querySelector("p");
console.log(mssg.getAttribute("class"));
mssg.setAttribute("class", "success"); // update existing attribute
mssg.setAttribute("style", "color: green"); // add new attribute




