public class helloworld {

    public static void main(String[] args) {
        System.out.println("Hello, World!");

        //ask user to iniput 2 numbers
        int a = 0;  //initialize a to 0
        int b = 0;  //initialize b to 0 
        //ask user to input 2 numbers
        System.out.println("Enter 2 numbers: ");
        //read the first number
        a = Integer.parseInt(System.console().readLine());
        //read the second number
        b = Integer.parseInt(System.console().readLine());
        //add the 2 numbers
        int c = add(a, b);
        //print the result
        System.out.println("The sum of " + a + " and " + b + " is " + c);
        
    }

    // add a function to add 2 numbers
    public static int add(int a, int b) {
        return a + b;
    }   
}