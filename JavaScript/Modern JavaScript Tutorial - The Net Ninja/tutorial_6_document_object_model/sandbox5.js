const prefix_suffix = "#".repeat(20);

/* 9. Challenge */ 
console.log(`${prefix_suffix} 9. Challenge ${prefix_suffix}`)

const contents = document.querySelectorAll("p");

// "textContent" returns the text content including hidden text
contents.forEach(content => {
    console.log(content.textContent);

    if (content.textContent.includes("success")){
        content.classList.add("success");
    }
    else if (content.textContent.includes("error")){
        content.classList.add("error");
    }
});



/* 10. Toggling class */
console.log(`${prefix_suffix} 10. Toggling class ${prefix_suffix}`)

// "toggle" adds class if not presented in "classList"
// "toggle" removes class if  presented in "classList"
const title = document.querySelector(".title");

title.classList.toggle("test"); // add class 
title.classList.toggle("test"); // remove class


