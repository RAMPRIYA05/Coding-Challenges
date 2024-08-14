/**
 * 
 */const past = (h, m, s) => {

	const h1 = 60 * 60 * 1000;
	const m1 = 60 * 1000;
	const s1 = 1000;

	const h2 = h * h1


	const m2 = m1 * m;

	const s2 = s1 * s;
	total = h2 + m2 + s2;
	return total;

}


console.log(past(0, 0, 1))
console.log(past(0, 1, 1))
console.log(past(1, 0, 1))
console.log(past(1, 1, 1))
console.log(past(1, 1, 0))
console.log(past(0, 1, 0))




