class Statically {
    //fix this code, so all of the instantiation and console.logs() work.  Try not to change the signature of the class, unless absolutely necessary.
    static #glue = "Epoxy";
    jello = "Jello";

    static moveAndShake() {
        console.log(`Never stagnate in life.  Be agile, change, and improve...`);
    }

    static stubborn() {
        Statically.moveAndShake();
        console.log(`Please don't make me change... I just don't like it...`);
    }
    static explain() {
        Statically.stubborn();
        console.log(Statically.#glue);
        //In java usin static means it can be acessed before any objects of its class are created 
        //In javascript static isnt called on instances of the class instead their called on the class itself
    }
    getGlue() {
        return Statically.#glue;
    }

}

const stats = new Statically();
Statically.moveAndShake();
Statically.stubborn();
Statically.explain();
console.log(stats.getGlue());
console.log(stats.jello);