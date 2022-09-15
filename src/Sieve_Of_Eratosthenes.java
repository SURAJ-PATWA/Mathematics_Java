import java.util.*;
public class Sieve_Of_Eratosthenes {
    static void sieve(int n){

        if(n<=1)return;

        boolean arr[]=new boolean[n+1];
        Arrays.fill(arr,true);

        for(int i=2;i*i<=n;i++) {
            if (arr[i]) {
                for (int j = 2 * i; j <= n; j = j + i) {
                    arr[j] = false;
               }
            }
        }
    // for printing Output
        for(int i = 2; i<=n; i++){
           if (arr[i]) {
                System.out.print(i+" ");
           }
        }

    }
    public static void main (String[] args) {

        int n = 18;

        sieve(n);

    }
}