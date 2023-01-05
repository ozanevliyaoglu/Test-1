
public class MainApp {
    public static void main(String[] args) {
                // Tek satırlı açıklama
        /*

        Çok
        Satırlı
        Açıklama birimi
         */

        // Değişken oluşturma
        // DeğişkenTürü DeğişkenAdı = DeğişkenDeğeri;


        //String
        //Karakter Katarı

        String name= "Ali";
        String surname= "Bilmem";
        String team= "Fenerbahçe";
        String st1= "100";
        String st2= "200";

        String stSum = st1+st2;
        System.out.println(stSum);

        String city= "Ankara";
        String ankaMall= "Ankara";

        //Tam Sayı Türleri

        //long  (long olduğunu belli etmek için eşitliğin sağ tarafında bulunan değerin sonuna l eklemek gerekir)
        int intSpace= 832476842;
        long space=   678234682364l;

        //int
        int age= 30;
        int year= 2022;
        int between = year - age;
        System.out.println(between);

        //short
        short area= 32000;

        //byte
        byte userClass= 127;
        userClass= -128;

        // ondalıklı değerler
        // double
        double ondalik1= 40.5;
        double ondalik2= 55.5;
        double ondalikSum = ondalik1 + ondalik2;
        System.out.println( ondalikSum);

        //float (değerin sonuna f eklenir)

        float user_F1= 19.4f;

        //char

        char c1= 'c';

        // boolean
        //true - false

        boolean status1 =false;
          status1 = true;
        System.out.println(status1);

    }
}
