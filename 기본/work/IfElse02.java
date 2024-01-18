//package jb01.part07;

public class IfElse02 {

    public static void main(String args[]) {

        int x = 1;
        int y = 2;

        // & ==> and 연산자
        if (x == 3 & y == 2) {
            System.out.println("x= 1이고 y= 2입니다.");
        }

        // | ==> or 연산자
        if (x == 1 | y == 3) {
            System.out.println("x= 1이거나 y= 3입니다.");
        }

        // && ==> and 연산자
        if (x == 3 && y == 2) {
            System.out.println("x= 1이고 y= 2입니다.");
        }

        // || ==> or 연산자
        if (x == 1 || y == 3) {
            System.out.println("x= 1이거나 y= 3입니다.");
        }
    }
}