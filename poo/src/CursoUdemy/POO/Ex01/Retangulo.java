package CursoUdemy.POO.Ex01;

public class Retangulo {
    public double width, height;

    public double area() {
        return width * height;
    }

    public double perimetro() {
        return width * height * 2.0;
    }

    public double diagonal() {
        double diagonalCalculo;
        diagonalCalculo = Math.sqrt(Math.pow(width, 2.0) + Math.pow(height, 2.0));
        return diagonalCalculo;
    }

    public String toString() {
        return "Area = " + area() + "\nPerímetro = " + perimetro() + "\nDiagonal = " + diagonal();
    }
}