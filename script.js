var gold = {
	a : 1
};

// var blue = extend({}, gold);
// blue.b = 2;

var rose = Object.create(gold);
rose.b = 3;

console.log(rose.a)