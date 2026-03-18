public class MainSwitchEx {
    public static void main(String[] args) {
        int day =1;
        String result=switch(day){
            case 1,7->{System.out.println("1&7 case");
            yield "Monday";}
            case 2->"tuesday";
            default->"no day";
        };
        System.out.println(result);
    }

}
