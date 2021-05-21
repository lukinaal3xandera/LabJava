package com.company;

import java.util.Scanner;
import static java.lang.Math.*;


public class Main {

    public static void main(String[] args) {
        double x;
        double numb, domin, frac, a, b, c, d1, d2, e, e1, e2, y;

        Scanner num = new Scanner(System.in);
        x = num.nextDouble();

        numb = (exp(abs(x))/2);
        domin =(exp(abs(x))/2) + 1;
        frac = numb/domin;
        a = acos(pow(frac,5));
        b = (exp(pow(x,2)/5));
        d1 = sin(x);
        d2 = cos(x);
        e1 = pow(2, d1);
        e2 = pow(x, d2);
        e = e1 + e2;
        c = log(e);
        y = a+b+c;
        System.out.println(y);

        if ((x<= -5|x>= 5)&(y<=0|y>=6)){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

	// write your code here
    }
}

