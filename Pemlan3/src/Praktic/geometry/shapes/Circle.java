package Praktic.geometry.shapes;

public class Circle {
    //field
    private int id;
    private double radius;
    private final int pembilang = 22;
    private final int penyebut= 7;

    //konstruktor
    public Circle () {}

    // setter ID
    public void setId(int id) {
        this.id = id;
    }

    // setter Radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // getterKeliling
    public double getKeliling() {
        return 2.0 * pembilang/penyebut *radius;
    }

    // getterLuas
    public double getLuas() {
        return pembilang/penyebut * radius * radius ;

    }

    //print informasi circle
    public void printInfoCircle() {
        System.out.println(

                        "ID         : " + id  +"\n" +
                        "Radius     : " + radius + "\n" +
                        "Keliling   : " + getKeliling()+"\n"  +
                        "Luas       : " + getLuas()

        );

    }
}