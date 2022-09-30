/* 1. for loops */
// {} means code block 
// semicolon is needed for end of statement, but not for end of code block

for(let i = 0; i < 5; i++){
    console.log('in for loop:', i);
}
console.log('for loop finished');

const names = ['shaun', 'mario', 'luigi'];
for(let i = 0; i < names.length; i++){
    let html = `<div>${names[i]}</div>`;
    console.log(html);
    console.log(names[i]);
}



/* 2. while loops */
let i = 0;
while(i < 5){
    console.log('in while loop:', i);
    i++;
}

const names2 = ['luigi', 'shaun', 'mario'];
let i2 = 0;
while(i2 < names2.length){
    console.log(names2[i2]);
    i2++;
}

//do while loops (run the code at least once)
let i3 = 3;
do{
    console.log('val of i is: ', i3);
    i3++;
}while(i3 < 5);


/* 3. if statements */
const age = 25;
if(age > 20){
    console.log('you are over 20 years old');
}

const ninjas = ['shaun', 'ryu', 'chun-li', 'yoshi'];

if(ninjas.length > 3){
    console.log("that's alot of ninjas");
}

const password = 'p@ssword';
if(password.length >= 8){
    console.log('that password is long enough!');
}



/* 4. else statements */
const password2 = 'p@ss';
if(password2.length >= 8){
    console.log('that password is long enough!');
}else{
    console.log('password is not long enough!');
}

const password3 = 'p@ssword1234';
if(password3.length >= 12){
    console.log('that password is mighty strong!');
} else if(password3.length >= 8){
    console.log('that password is long enough!');
}else{
    console.log('password is not long enough!');
}



/* 5. Logical operators - OR || and AND && */
const password4 = 'p@ssword1234';
if(password4.length >= 12 && password4.includes('@')){
    console.log('that password is mighty strong!');
} else if(password4.length >= 8 || password4.includes('@')){
    console.log('that password is long enough!');
}else{
    console.log('password is not long enough!');
}

const password5 = 'p@ss';
if(password5.length >= 12 && password5.includes('@')){
    console.log('that password is mighty strong!');
} else if(password5.length >= 8 || password5.includes('@')){
    console.log('that password is strong enough!');
}else{
    console.log('password is not strong enough!');
}

const password6 = 'p@ss';
if(password6.length >= 12 && password6.includes('@')){
    console.log('that password is mighty strong!');
} else if(password6.length >= 8 || password6.includes('@') && password6.length >= 5){
    console.log('that password is strong enough!');
}else{
    console.log('password is not strong enough!');
}


/* 6. Logical NOT (!) */
console.log(!true);
console.log(!false);

let user = false;
if(!user){
    console.log('you must be logged in to continue');
}



/* 7. break and continue */
const scores = [50, 25, 0, 30, 100, 20, 10];
for(let i = 0; i < scores.length; i++){

    if(scores[i] === 0){
        continue; // skips the code below and enter next iteration
    }

    console.log('your score: ', scores[i]);

    if(scores[i] === 100){
        console.log('congrats, you got the top score!');
        break;
    }
}



/* 8. switch statements */
// if there is a match, it will also run the other cases below, therefore need break
// if there is no match at all, it will run default code block
// switch statement uses strict equality
const grade = 'D';

switch(grade){
    case 'A':
        console.log('you got an A!');
        break;
    case 'B':
        console.log('you got a B!');
        break;
    case 'C':
        console.log('you got a C!');
        break;
    case 'D':
        console.log('you got a D!');
        break;
    case 'E':
        console.log('you got a E!');
        break;
    case 'F':
        console.log('you got a F!');
        break;
    default:
        console.log('not a valid grade');
}



/* 9. Variables & block scope */
// let & const are block scoped
// var is always global scoped

let age2 = 30; // this is in root level / global scope

if(true){
    let age2 = 40; // this is in local scope (within this code block)
    let name = 'shaun'
    console.log('inside 1st code block: ', age2, name); 

    if(true){
        let age2 = 50;
        console.log('inside 2nd code block: ', age2)
    }
}

console.log('outside 1st code block: ', age2, name); 
