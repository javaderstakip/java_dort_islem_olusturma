
import java.util.Random;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


//        // Random sınıfını kullanarak rastgele sayı üreticisi oluşturuyoruz
//        Random random = new Random();
//
//        // İki basamaklı rastgele iki sayı üretiyoruz (10-99 arası)
//        int number1 = random.nextInt(90) + 10;  // 10 ile 99 arasında birinci sayı
//        int number2 = random.nextInt(90) + 10;  // 10 ile 99 arasında ikinci sayı
//
//        // Çarpma işlemini istenilen formatta yazdırıyoruz
//        System.out.printf("%4d\n", number1);   // İlk sayı 4 karakter genişliğinde sağa yaslı yazdırılır
//        System.out.printf("x %2d\n", number2); // İkinci sayı, x işareti ile birlikte hizalanarak yazdırılır
//        System.out.println("-----");           // Alt çizgi (çarpma çizgisi)



//        Random random = new Random();
//
//        // Her sütun için işlem oluşturup yan yana yazdıracağız
//        for (int i = 0; i < 5; i++) {
//            int number1 = random.nextInt(90) + 10;  // 10 ile 99 arasında birinci sayı
//            int number2 = random.nextInt(90) + 10;  // 10 ile 99 arasında ikinci sayı
//
//            // İlk sayıları yan yana yazdır
//            System.out.printf("%4d    ", number1);
//        }
//        System.out.println(); // Satırı sonlandırıyoruz
//
//        for (int i = 0; i < 5; i++) {
//            int number1 = random.nextInt(90) + 10;
//            int number2 = random.nextInt(90) + 10;
//
//            // 'x' işaretini ve ikinci sayıları yan yana yazdır
//            System.out.printf("x %2d    ", number2);
//        }
//        System.out.println(); // Satırı sonlandırıyoruz
//
//        for (int i = 0; i < 5; i++) {
//            // Çarpma işlemi çizgilerini yan yana yazdır
//            System.out.print("-----   ");
//        }
//        System.out.println(); // Satırı sonlandırıyoruz


//        Random random = new Random();
//
//        // 6 satır için döngü
//        for (int row = 0; row < 6; row++) {
//            // Her satırda 6 çarpma işlemi için döngü
//            for (int i = 0; i < 6; i++) {
//                int number1 = random.nextInt(90) + 10;  // 10 ile 99 arasında birinci sayı
//                int number2 = random.nextInt(90) + 10;  // 10 ile 99 arasında ikinci sayı
//
//                // İlk sayıları yan yana yazdır
//                System.out.printf("%4d               ", number1);
//            }
//            System.out.println(); // Satırı sonlandırıyoruz
//
//            for (int i = 0; i < 6; i++) {
//                int number2 = random.nextInt(90) + 10; // Her bir döngüde yeni bir sayı üretiyoruz
//                // 'x' işaretini ve ikinci sayıları yan yana yazdır
//                System.out.printf("x %2d               ", number2);
//            }
//            System.out.println(); // Satırı sonlandırıyoruz
//
//            for (int i = 0; i < 6; i++) {
//                // Çarpma işlemi çizgilerini yan yana yazdır
//                System.out.print("----               ");
//            }
//            System.out.println(); // Satırı sonlandırıyoruz
//
//            // Satırlar arasında 2 işlemlik boşluk
//            System.out.println();


//        Random random = new Random();
//
//        // 6 satır için döngü
//        for (int row = 0; row < 6; row++) {
//            // Her satırda 6 çarpma işlemi için döngü
//            for (int i = 0; i < 6; i++) {
//                int number1 = random.nextInt(90) + 10;  // 10 ile 99 arasında birinci sayı
//                int number2 = random.nextInt(90) + 10;  // 10 ile 99 arasında ikinci sayı
//
//                // İlk sayıları yan yana yazdır
//                System.out.printf("%4d               ", number1);
//            }
//            System.out.println(); // Satırı sonlandırıyoruz
//
//            for (int i = 0; i < 6; i++) {
//                int number2 = random.nextInt(90) + 10; // Her bir döngüde yeni bir sayı üretiyoruz
//                // 'x' işaretini ve ikinci sayıları yan yana yazdır
//                System.out.printf("x %2d               ", number2);
//            }
//            System.out.println(); // Satırı sonlandırıyoruz
//
//            for (int i = 0; i < 6; i++) {
//                // Çarpma işlemi çizgilerini yan yana yazdır
//                System.out.print("----               ");
//            }
//            System.out.println(); // Satırı sonlandırıyoruz
//
//            // Satırlar arasında 4 işlemlik boşluk
//            System.out.println(); // Bir boş satır
//            System.out.println(); // İkinci boş satır
//            System.out.println();
//            System.out.println();
//            System.out.println();


        Random random = new Random();

        // Word belgesi oluştur
        try (XWPFDocument document = new XWPFDocument()) {
            // 6 satır için döngü
            for (int row = 0; row < 6; row++) {
                StringBuilder line1 = new StringBuilder();
                StringBuilder line2 = new StringBuilder();
                StringBuilder line3 = new StringBuilder();

                // Her satırda 6 çarpma işlemi için döngü
                for (int i = 0; i < 6; i++) {
                    int number1 = random.nextInt(90) + 10;  // 10 ile 99 arasında birinci sayı
                    int number2 = random.nextInt(90) + 10;  // 10 ile 99 arasında ikinci sayı

                    // İlk sayıları yan yana ekle
                    line1.append(String.format(" %4d                            ", number1));
                    line2.append(String.format("x %2d                            ", number2));
                    line3.append("-----                             ");
                }

                // Paragraf oluştur ve ekle
                XWPFParagraph paragraph1 = document.createParagraph();
                paragraph1.createRun().setText(line1.toString());
                XWPFParagraph paragraph2 = document.createParagraph();
                paragraph2.createRun().setText(line2.toString());
                XWPFParagraph paragraph3 = document.createParagraph();
                paragraph3.createRun().setText(line3.toString());

                // Satırlar arasında 2 boş satır ekle
                document.createParagraph();
                document.createParagraph();
            }

            // Word belgesini kaydet
            try (FileOutputStream out = new FileOutputStream(
                    "C:\\Users\\Msi\\Desktop\\java_carpma_islemi_yazdirma\\java_carpma_islemi_yazdirma.docx"))
            {
                document.write(out);
            }
            System.out.println("Word belgesi başarıyla oluşturuldu.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}