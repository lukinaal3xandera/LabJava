package com.company;

import java.util.Scanner;
import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {
        double x;
        double y, a, a1,a2,a3, b, b1, b2, c, c1;

        Scanner num = new Scanner(System.in);
        x = num.nextDouble();

        if (x < -1){
            a1 = abs(x - 5);
            a2 = pow(a1 ,5);
            a3 = log10(abs(pow(6,x)-a2));
            a = (pow(x,6) - a3);

            y = a;
            System.out.println(y);
            System.out.println("Принадлежит");
        }
        else if (x>=-1|x<=1){
            b1 = 1 - 2*(pow(x,2));
            b2 = x/b1;
            b = sin(b2);

            y = b;
            System.out.println(y);
            System.out.println("Принадлежит");
        }

        else if (x>=1){
           c1= 1/(pow(x,4));
            c = asin(c1);

            y = c;
            System.out.println(y);
            System.out.println("Принадлежит");
        }
        else {
            System.out.println("Не принадлежит");
        }

	// write your code here
    }
}
