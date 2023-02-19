const prefix_suffix = "#".repeat(20);

/* 7. Add and remove styles through "style" property*/
console.log(`${prefix_suffix} 7. Add and remove styles through "style" property ${prefix_suffix}`)

const title = document.querySelector("h1");

// title.setAttribute("style", "margin : 50px;"); // this approach overwrites and remove orange color

console.log(title.style);
console.log(title.style.color);

title.style.margin = "50px"; // add new CSS property
title.style.color = "crimson";
title.style.fontSize = "60px";
title.style.margin = ''; // empty string to remove CSS property


