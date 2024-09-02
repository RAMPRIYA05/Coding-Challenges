 
 /*Write a JavaScript program to check two given integers whether one is positive and another one is negative.

This JavaScript program checks two given integers to determine if one is positive and the other is negative. It utilizes conditional statements and logical operators to evaluate whether one integer is greater than zero (positive) and the other is less than zero (negative), returning true if both conditions are met and false otherwise.*/



function numbers(x, y) {
  if ((x < 0 && y > 0) || (x > 0 && y < 0)) {
    return true;
  } else {  
    return false;
  }
}

console.log(numbers(4, 4));
console.log(numbers(-3, 1));
console.log(numbers(7, -3));
console.log(numbers(-3, -5)); 
