package exercise2;

class Arrays {
    // Take the arrays.js file, and refactor the code into Java in this file.
    int[] nums = new int[] { 10, 23, 3, 4, 5, 2, 1 };
    String[] greetings = new String[] { "hello", "howdy", "hallo", "hola", "bonjour", "ciao", "أهلا" };
    // boolean[] binaries={0,1,1,1,0,0,0,1,1,1,1,1,0,1,0,0,1,0};

    void printNums() {
        for (int num : nums) {
            System.out.printf("%d %n", num);
        }
    };

    void printGreetings() {
        for (String item : greetings) {
            System.out.printf("%s %n", item);
        }
    };

    void printBinaries() {
    };
}
