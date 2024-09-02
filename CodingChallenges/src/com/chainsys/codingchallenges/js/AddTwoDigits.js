/*Write a JavaScript program to add two digits to a given positive integer of length two.*/



function addNumber(num) {
        return num % 10 + Math.floor(num / 10);
}	

console.log(addNumber(15));  
console.log(addNumber(67));  
