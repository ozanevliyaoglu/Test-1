import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class UseScanner {
    public static void main(String[] args) {

        //Scanner sınıfı
        //Kullanıcıdan veri alımı için kullanılır
        //Verileri console'da alır
        Scanner read2= new Scanner(System.in);
        System.out.println("Adınızı Giriniz!");
        String ad=read2.nextLine();
        System.out.println("Soyadınızı Giriniz!");
        String soyad=read2.nextLine();

        System.out.println(ad +" "+ soyad );


        // Kullanıcıdan ad soyad verisini alan ve bu verileri yan yana yazan bir alıştırma
        Scanner Stringread= new Scanner(System.in);
        //read.nextLine();
        System.out.println("Adınızı Giriniz!");
        String name=Stringread.nextLine();
        System.out.println("Soyadınızı Giriniz!");
        String surname=Stringread.nextLine();

        System.out.println(name +" "+ surname );

    }
}
