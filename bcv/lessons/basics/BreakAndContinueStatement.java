package com.bcv.lessons.basics;

public class BreakAndContinueStatement {

    /*We can use BREAK statement:
    inside loops to break the loop based on some condition
    inside label blocks to break block execution based on some condition

    We can use continue statement to skip current iteration and continue for the next iteration*/

    /*inside switch*/
    public static void main(String[] args) {

        int x = 1;
        switch (x) {
            case 0:
                System.out.println("first");
                break;
            case 1:
                System.out.println("second");
            case 2:
                System.out.println("third");
        }
        //second
        //third

        /*inside loops*/
        for (int i = 0; i < 5; i++) {
            if (i == 3)
                break;
            System.out.println(i);
        }
        //0
        //1
        //2

        /*inside labeled block*/
        int lb = 10;
        b:
        {
            System.out.println("labeled block");
            if (lb == 10)
                break b;
            System.out.println("end labeled block");
        }
        System.out.println("after labeled block");
        //labeled block
        //after labeled block


        /*CONTINUE
        We can use continue statement to skip current iteration and continue for the next iteration
        We can use continue ONLY inside loops if we are using anywhere else we will get compile time error "continue outside of loop"*/


        /*inside loops*/
        for (int j = 0; j < 5; j++) {
            if (j == 3)
                continue;
            System.out.println(j);
        }
        //0
        //1
        //2
        //4

        int c = 5;
        while (c > 0) {
            c--;
            if (c == 2)
                continue;
            System.out.println("c = " + c);
        }
        //4
        //3
        //1
        //0


    }

}
