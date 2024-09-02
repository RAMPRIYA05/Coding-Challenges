/*Write a JavaScript program to sort an array of all prime numbers between 1 and a given integer.*/


function prime(num) {
  var num1 = [], 
      num2 = []; 

  for (var i = 0; i <= num; i++) {
    num2.push(true);
  }

  for (i = 2; i <= num; i++) {
    if (num2[i]) {
      num1.push(i);

      for (var j = 1; i * j <= num; j++) {
       num2[i * j] = false;
      }
    }
  }

  return num1; 
}

console.log(prime(1)); 
console.log(prime(14)); 
console.log(prime(25)); 
