function checkPalindrome(string) {

    var len = string.length;
    for (var i = 0; i < len / 2; i++) {
        if (string[i] !== string[len - 1 - i]) {
            return 'It is not a palindrome';
        }
    }
    return 'It is a palindrome';
}

var string = prompt("Enter a string: ");
var value = checkPalindrome(string);
window.alert(value);