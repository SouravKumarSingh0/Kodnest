// function creation
function display(a){
    console.log("Display");
    return a+2;
}

display(10);

let a = 10;
let b = 3;
console.log(a/b); //3.333333333333333
console.log(a%b); //1
console.log(a**b); // 1000
console.log(a++); //10
console.log(++a); //12
console.log(--a); //11
console.log(a--); //11


// Object Creation
let student = {
    id:20,
    age:28,
    //function creation
    add(){
        console.log("function of student class.");
    },
    display : function(){
        console.log("display function");
    }
}

console.log("id"+student.id);
console.log("age"+student.age);
student.add();