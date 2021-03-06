class Ninja {
    constructor(name) {
        this.name = name;
        this.health = 20;
        this.speed = 3;
        this.strength = 3;
    }

    sayName() {
        console.log(`This ninja is called ${ this.name }.`);
    }

    showStats() {
        console.log(`Ninja: ${ this.name }`);
        console.log(`Strength: ${ this.strength }`);
        console.log(`Health: ${ this.health }`);
    }

    drinkSake() {
        this.health += 10;
        console.log(`${ this.name } drank sake and gained 10 health points!`);


    }
}

class Sensei extends Ninja {
    constructor(name) {
        super(name);
        this.health = 200;
        this.speed = 10;
        this.strength = 10;
        this.wisdom = 10;
    }

    speakWisdom() {
        super.drinkSake();
        console.log(`${ this.name } says "What one programmer can do in one month, two programmers can do in two months."`);
    }

    showStats() {
        console.log(`Sensei: ${ this.name }, Health: ${ this.health }, Speed: ${ this.speed }, Strength: ${ this.strength }, Wisdom: ${ this.wisdom }`);
    }
}

const ninja1 = new Ninja("Hyabusa");
ninja1.sayName();
ninja1.showStats();
ninja1.drinkSake();
ninja1.showStats();

console.log("-".repeat(100));

const superSensei = new Sensei("Master Splinter");
superSensei.sayName();
superSensei.showStats();
superSensei.speakWisdom();
superSensei.showStats();