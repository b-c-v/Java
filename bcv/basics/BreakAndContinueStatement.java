package com.bcv.basics;

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


        b1:
        for (int ib1 = 0; ib1 < 3; ib1++) {
            for (int jb1 = 0; jb1 < 3; jb1++) {
                if (ib1 == jb1) {
                    break;
                }
                System.out.println(ib1 + " - " + jb1);
            }
        }
        //1 - 0
        //2 - 0
        //2 - 1


        b2:
        for (int ib2 = 0; ib2 < 3; ib2++) {
            for (int jb2 = 0; jb2 < 3; jb2++) {
                if (ib2 == jb2) {
                    break b2;
                }
                System.out.println(ib2 + " -- " + jb2);
            }
        }
        //no output because fist iteration 0 == 0 is true and we leave the block b2


        b3:
        for (int ib3 = 0; ib3 < 3; ib3++) {
            for (int jb3 = 0; jb3 < 3; jb3++) {
                if (ib3 == jb3) {
                    continue;
                }
                System.out.println(ib3 + " --- " + jb3);
            }
        }
        //0 --- 1
        //0 --- 2
        //1 --- 0
        //1 --- 2
        //2 --- 0
        //2 --- 1

        b4:
        for (int ib4 = 0; ib4 < 3; ib4++) {
            for (int jb4 = 0; jb4 < 3; jb4++) {
                if (ib4 == jb4) {
                    continue b4;
                }
                System.out.println(ib4 + " ---- " + jb4);
            }
        }
        //1 --- 0
        //2 --- 0
        //2 --- 1

        // Вынос мозга do-while-continue
        int mindBlown = 0;
        do {
            ++mindBlown; //1 - 4 -  8
            System.out.println("mindBlown after do " + mindBlown); //1 - 4 - 8
            if (++mindBlown < 5) //2 - 5 - 9
                continue;
            ++mindBlown; //6 - 10
            System.out.println("mindBlown after ++mindBlown " + mindBlown); //6 - 10
        } while (++mindBlown < 10); //3 - 7

    }

}
