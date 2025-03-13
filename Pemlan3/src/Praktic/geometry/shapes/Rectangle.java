package Praktic.geometry.shapes;

public class Rectangle {
    //field
    private int id;
    private double panjang;
    private double lebar;


    public Rectangle(int id, double panjang, double lebar) {
        this.id = id;
        this.panjang = panjang;
        this.lebar = lebar;
    }


    // Getter untuk id, panjang, dan lebar
    public int getId() {

        return id;
    }

    public double getPanjang(double panjang) {
        return panjang;
    }

    public double getLebar(double lebar) {
        return lebar;
    }

    //setter untuk id, panjang, dan lebar
    public void setId(int id) {
        this.id = id;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    // Getter untuk keliling
    public double getKeliling() {
        return 2 * (panjang + lebar);
    }

    // Getter untuk luas
    public double getLuas() {
        return panjang * lebar;
    }

    public void printDeskripsi() {

        System.out.println("ID       : " + id);
        System.out.println("Panjang  : " + panjang);
        System.out.println("Lebar    : " + lebar);
        System.out.println("Keliling : " + getKeliling());
        System.out.println("Luas     : " + getLuas());

    }


}
