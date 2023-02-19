
public class Main {

    static boolean Palindrom(int sayi) {
        int hedef=sayi,ters=0,sonsayi;
        while(hedef!=0){
            sonsayi = hedef%10;
            ters = ters*10+sonsayi;
            hedef/=10;

        }
        if(sayi==ters){
            return true;

        }
        else
            return false;


    }

    public static void main(String[] args) {
        System.out.println(Palindrom(101));
    }


}
