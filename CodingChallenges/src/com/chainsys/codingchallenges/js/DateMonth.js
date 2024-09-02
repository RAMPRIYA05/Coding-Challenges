/* Write a JavaScript program to get the current date.
Expected Output :
mm-dd-yyyy, mm/dd/yyyy or dd-mm-yyyy, dd/mm/yyyy

This JavaScript program retrieves the current date and formats it in multiple ways (mm-dd-yyyy, mm/dd/yyyy, dd-mm-yyyy, dd/mm/yyyy). It uses the Date object to get the current day, month, and year, and then adds leading zeros if necessary to ensure proper formatting. Finally, it logs the formatted date strings to the console.*/


var today = new Date();
var dd = today.getDate();
var mm = today.getMonth() + 1;
var yyyy = today.getFullYear();
if (dd < 10) {
    dd = '0' + dd;
} 

if (mm < 10) {
    mm = '0' + mm;
} 

today = mm + '-' + dd + '-' + yyyy;
console.log("mm/dd/yyyy:"+today);

today = mm + '/' + dd + '/' + yyyy;
console.log("mm/dd/yyyy:"+today);

today = dd + '-' + mm + '-' + yyyy;
console.log("dd-mm-yyyy:"+today);

today = dd + '/' + mm + '/' + yyyy;
console.log("dd/mm/yyyy:"+today); 
