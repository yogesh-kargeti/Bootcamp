function areacir(r){
    var ar=(22*r*r)/7;
    return ar;
}

var rad=window.prompt("Enter the radius (in cm): ");
var t=areacir(rad).toFixed(3);
window.alert("Area of the circle is "+t+" sq. cm");