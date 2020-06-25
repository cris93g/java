package exercise2;

class Types {
    static int number;
    static int[] myArray = { 3, 4, 5, 6, 76, 12, 2 };
    static String movieA = "Harry and the Hendersons";
    static String movieB = "Star Wars";
    static char male = 'm';
    static char female = 'f';

    static void printArray() {
        for (int item : myArray) {
            System.out.printf(" %s %n", item);
        }
    }

    public static void main(String[] args) {
        System.out.printf(
                "There are variables that have been declared in this Accessible class.  Fix the code so that all the variables can be accessed by the main method.  print out the values of every variable once the code has been refactored.");
        System.out.printf("value of movieA is ", movieA);
        System.out.printf("value of movieB is ", movieB);
        System.out.printf("value of male is ", male);
        System.out.printf("value female is ", female);
        printArray();
    }
}