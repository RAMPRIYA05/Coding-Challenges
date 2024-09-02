/**
 * 
 */
/*Write a JavaScript program to check whether two numbers are in the range 30..80 or 100..130 inclusive.

This JavaScript program checks if two given numbers fall within either the range 30 to 80 or the range 100 to 130, inclusive. It returns true if both numbers fall within any of these ranges, and false otherwise.*/

function number(x, y) {
	if ((x >= 30 && x <= 80 && y >= 30 && y <= 80) || (x >= 100 && x <= 130 && y >= 100 && y <= 130)) {
		return true;
	} else {
		return false;
	}
}
console.log(number(44, 66));
console.log(number(70, 95));
console.log(number(50, 89)); 
