/* Write a JavaScript program to replace each character in a given string with the next in the English alphabet.

Note: ‘a’ will be replace by ‘b’ or ‘z’ would be replaced by ‘a’.*/



function alphabet(str) {
  var char = str.split("");
  for(var i = 0; i < char.length; i++) { 
    var n = char[i].charCodeAt() - 'a'.charCodeAt(); 
    n = (n + 1) % 26; 
    char[i] = String.fromCharCode(n + 'a'.charCodeAt()); 
  }
  return char.join(""); 
}

console.log(alphabet("rampriyazzz"));
