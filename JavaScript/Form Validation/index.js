function submitForm(){
    let a= document.getElementById("name").innerHTML;
    let b= document.getElementById("password").innerHTML;
    console.log(a);
    console.log(b);

    if(a === ""){
        alert("Please enter the name");
    }
    if(b === ""){
        alert("Please enter the name");
    }
}