sealed class dem permits Demo {
    void res(){
        System.out.println("result");
    }
}

final class Demo extends dem{
    public void play(){
        System.out.println("demo");
    }
}

public class demo{
    public static void main(String[] args){
        dem d = new Demo();
        d.res();
    }
}
