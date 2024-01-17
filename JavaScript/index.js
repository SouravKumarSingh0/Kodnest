
var a = 10;
var b = 20;
console.log("The sum is = "+(a+b))

let c = 10;
let d = 40;
console.log("The sum is = "+(c+d))

var x = 50;
let y = 30;
const z = 30;

let avg = (x+y+z)/3;
console.log("Average = "+ (avg))
console.log("Hello Javascript")

let e = 20;
if(e%2== 0){
    console.log(e+" is even");
}
else{
    console.log(e+"is odd");
}

for(let i = 1; i <=5; i++){
    console.log(i);
}

let k = 3
for(let j=1; j<=10; j++){
    console.log(k+" * "+j+" = "+(k*j));
}


let s = 'gfg javascript';
console.log(s.trim());
console.log(s.charAt(2));
console.log(s.slice());
//s.concat()
s.indexOf()
s.lastIndexOf
s.toUpperCase()
s.toLowerCase()
s.substring()
s.toString()
s.slice()

let f = "10";
console.log(f); //10

console.log(f==10); //true
//comparison by ignoring the type

console.log(f===10); //false
//comparison by considering the type

// null - means 'no value'
let g;
console.log(g); // undefined
//type of null returns object and null is treated as false value, accessing a variable which is not assigned returns undefined

// undefined - means 'value is undefined'