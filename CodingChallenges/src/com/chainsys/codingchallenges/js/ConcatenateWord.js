/*Write a JavaScript program to concatenate two strings except for their first character.

This JavaScript program concatenates two input strings by omitting their first character from each string before concatenation. The length of both input strings should be at least 2.*/


function concatenate(str1, str2) {
    str1 = str1.substring(1, str1.length);
    str2 = str2.substring(1, str2.length);
    return str1 + str2;
}

console.log(concatenate("JAVA", "SCRIPT"));
console.log(concatenate("PYTHON", "C++"));
console.log(concatenate("HTML", "CSS"));
