// package enc;,

import java.util.ArrayList;

class Product {
    private int pid;
    private String productName;
    private double price;
    private int quantity;

    public Product(int pid, String productName, double price, int quantity) {
        this.pid = pid;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public int getPid() {
        return pid;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

public class MainEnc {
    public static void main(String[] args) {
        ArrayList<Product> list=new ArrayList<Product>();
        list.add(new Product(1,"mobile",20000,10));
        list.add(new Product(1,"mobile",20000,10));
        list.add(new Product(1,"mobile",20000,10));
        list.add(new Product(1,"mobile",20000,10));
        list.add(new Product(1,"mobile",20000,10));
        System.out.println("Product ID\tProduct Name\tPrice\tQuantity");
        for(Product p:list){
              Product p1=new Product(1, "mobile", 20000, 10);
        String result=String.format("Pid=%d,PName=%s,Price=%f,and Quantity=%d", p1.getPid(),p1.getProductName(),p1.getPrice(),p1.getQuantity());
        System.out.println(result);

        }

      
    }

}
