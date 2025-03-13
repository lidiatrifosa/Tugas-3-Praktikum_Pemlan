package Praktic.geometry.mains;

import Praktic.geometry.shapes.Circle;
import Praktic.geometry.shapes.Rectangle;

import java.util.Scanner;
public class Main {
    static String GREEN = "\u001B[32m";
    static String BLUE = "\u001B[34m";

    static void printGaris() {
        System.out.println("=========================");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle(0, 0.0, 0.0);

        printGaris();

        System.out.print(BLUE + "Nama          : ");
        String nama = input.next();
        System.out.print(BLUE + "NIM           : ");
        int nim = input.nextInt();

        printGaris();
        System.out.println(BLUE+ "Circle");
        printGaris();

        System.out.print("Isikan ID     : ");
        circle.setId(input.nextInt());
        System.out.print("Isikan radius : ");
        circle.setRadius(input.nextDouble());

        printGaris();
        circle.printInfoCircle();
        printGaris();
        System.out.println(BLUE+ "Rectangle");
        printGaris();

        System.out.print("Isikan ID       : ");
        rectangle.setId(input.nextInt());
        System.out.print("Isikan panjang  : ");
        rectangle.setPanjang(input.nextDouble());
        System.out.print("Isikan lebar    : ");
        rectangle.setLebar(input.nextDouble());

        printGaris();
        rectangle.printDeskripsi();
        printGaris();


    }
}

