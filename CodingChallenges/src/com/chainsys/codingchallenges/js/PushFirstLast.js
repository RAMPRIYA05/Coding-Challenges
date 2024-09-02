/*Write a JavaScript program to create an array by taking the first and last elements from a given array of integers.The length must be larger than or equal to 1.*/



function start(num) {
    var array1 = []; 
    array1.push(num[0], num[num.length - 1]); 
    return array1;
}

console.log(start([10, 20, 30])); 
console.log(start([15, 1, 3, 6])); 
console.log(start([7, 12, 24, 48])); 
