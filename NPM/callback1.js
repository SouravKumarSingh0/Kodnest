//Function (normal)
function greet(){
    console.log("Hello");
    return 5;
}
console.log(greet());

//anonymous function
let x = function(){
    console.log("Sourav");
    return 6;
}
console.log(x());

//Arrow function (for single value)
let y = () => 5;
console.log(y());

// Arrow function (for return value)
let z = () => {
    return 5;
}
console.log(z());

//Call back function - in parameter function itself is present
function greet(){
    return "Hello";
}

let m = function display(a){
    return a;
}
console.log(m(greet));
console.log(m(greet())); //function call