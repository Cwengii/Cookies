package org.example;
//Java code that tells you how many cookies are left in the Jar according to the range that was given.
public class Cookies {
    public static void main(String [] args) {
        int Cookies = 20;
        String extras = "Chocolate chip";
        while (Cookies > 0){
            if (Cookies == 1){
               extras = " ";
            }
            System.out.println(Cookies + " " + extras + " cookies are in the jar." );
            Cookies = Cookies -1;

            if (Cookies > 0){
                System.out.println(Cookies + " " + "Chocolate chip cookies are now left in the jar");
            } else {
                System.out.println("There are no more cookies left in the cookie jar");
            }

        }

    }
}
