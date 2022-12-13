package it.develhope.exercise25;

public class Start {
    public static void main(String[] args) {
        //Variables Declaration for the boolean expression 'b'

        boolean a = true, b = false;
        int c = 2;
        char d = '2';


        boolean A = 55 != 55 && false ^ true; // first condition is false so the boolean expression result is false
        boolean B = !a || !b || c == d; // first condition is true so the result of the expression is true
        boolean C = false && true || false && !false; // first condition is false and second too so the result is false
        boolean D = false && true || false || true; // first condition is false but second true so the result is true

        System.out.println("A: false " + A);
        System.out.println("B: true " + B);
        System.out.println("C: false " + C);
        System.out.println("D: true " + D);
    }
}
