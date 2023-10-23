import java.util.Scanner;

import static java.lang.Math.abs;

public class Main {


    static int SumaCifara(int n){
        int suma = 0;
        while(abs(n)>0){
            suma+=abs(n)%10;
            n=n/10;
        }
        return suma;
    }
    public static void main(String[] args){
        int n;
        Scanner ulaz=new Scanner(System.in);
        System.out.println("Unesi n: ");
        n=ulaz.nextInt();
        for(int i=1;i<n;i++){
            if(i%SumaCifara(i)==0){
                System.out.println(" "+i);
            }
        }
    }


}