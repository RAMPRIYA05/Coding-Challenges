 /*Write a JavaScript program to create a new string without the first and last characters of a given string.

This JavaScript program takes an input string and returns a new string with the first and last characters removed. The length of the input string should be at least 2.*/


function removeFirstLast(str) {
  
  return str.substring(1, str.length - 1);
}


console.log(removeFirstLast('JavaScript'));
console.log(removeFirstLast('JS'));
console.log(removeFirstLast('Java')); 
console.log(removeFirstLast('css')); 
console.log(removeFirstLast('Python')); 
console.log(removeFirstLast('HTML')); 
