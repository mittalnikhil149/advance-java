interface A{
    private void str(){
        System.out.println("hello private");
    }
    default void show(){
        str();
    }
}
public class Main implements A{
    public static void main(String[] args) {
        Main m = new Main();
        m.show();
    }
}