package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String [] args){
        System.out.println("Unesite broj x: ");
    Scanner ulaz = new Scanner(System.in);

    int n = ulaz.nextInt();

    int faktorijel = 1;
    for(int i=1;i<=n;i++) {
        faktorijel=faktorijel*i;
    }
    double sinus=Math.sin(n);

        System.out.println("Faktorijel ovog broja je: "+faktorijel);
        System.out.println(("Sinus ovog broja je: "+sinus));


}

}