package CursoUdemy.POO.Exemplo;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock() {
        return price * quantity;
    }

    /*
    Para alterar algo usar Void, além de quando apenas alterar e não retornar nada colocar
    o que será recebido!!!!!!!!!!!!!!!
     */

    public void addProduct(int quantity) {
        this.quantity += quantity;
    }

    /*
    This será usado para referenciar o atributo da classe, e não o parametro recebido pelo método
     */

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return "\nProduct data: \nName: " + name +
                "\nPrice $ " + String.format("%.2f", price) +
                "\nQuantity in stock " + quantity +
                "\nTotal value $ " + String.format("%.2f", totalValueInStock());
    }
}