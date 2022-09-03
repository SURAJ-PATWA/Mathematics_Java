import java.io.*;
import java.util.*;

class GCD_or_HCF_of_two_Numbers {


    static int gcd(int a, int b)
    {
        if(b==0)
            return a;

        return gcd(b, a % b);
    }

    public static void main (String[] args) {

        int a = 7, b = 13;

        System.out.println(gcd(a, b));

    }
}
