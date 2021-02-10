var lt =[
    { name: "Rahul", age: 30, salary:15000, dob: new Date('1990-12-23') },
    { name: "Gill", age: 19, salary:300, dob: new Date('2001-04-13') },
    { name: "Virat", age: 26, salary:17000, dob: new Date('1994-11-09') },
    { name: "Ravi", age: 30, salary:16000, dob: new Date('1990-05-01') },
    { name: "Thakur", age: 26, salary:2000, dob: new Date('1994-09-22') }
]

var hat = lt.filter(myFunction);
function myFunction(value) {
  return value["salary"]>5000;
}
console.log(hat)

lt.forEach(element => {
    if (element["salary"]<1000 && element["age"]<20)  {
        element["salary"]+=5*element["salary"];
    }
});

lt.forEach(element => {
    for (var key in element) {
    console.log("Key = "+ key +", Value = "+ element[key]); } 
});