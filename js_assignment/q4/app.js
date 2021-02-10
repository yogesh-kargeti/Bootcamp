var obj1= {a:"apple",b:"ball",c:"cat",d:"dog"};
console.log("Original Object:")
for(var key in obj1) {
    console.log("Key = "+ key +", Value = "+ obj1[key]);
}  
var obj2={...obj1};
console.log("Copied Object:")
for(var key in obj2) {
    console.log("Key = "+ key +", Value = "+ obj2[key]);
}
  