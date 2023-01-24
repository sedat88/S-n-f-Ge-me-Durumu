import java.util.Scanner;
public class Main {
    public static void main(String[] orgs) {

        int mat, fizik, turkce, kimya, muzik;
        double total = 0;
        int validSubjects = 0;


        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz : ");
        mat = input.nextInt();
        if (mat >= 0 && mat <= 100) {
            total += mat;
            validSubjects++;
        } else {
            System.out.println("Matematik notu geçerli değildir ve ortalama hesaplamasına dahil edilmeyecektir.");
        }
        System.out.print("Fizik notunuzu giriniz : ");
        fizik = input.nextInt();
        if (fizik >= 0 && fizik <= 100) {
            total += fizik;
            validSubjects++;
        } else {
            System.out.println("Fizik notu geçerli değildir ve ortalama hesaplamasına dahil edilmeyecektir.");
        }
        System.out.print("Türkçe notunuzu giriniz : ");
        turkce = input.nextInt();
        if (turkce >= 0 && turkce <= 100) {
            total += turkce;
            validSubjects++;
        } else {
            System.out.println("Türkçe notu geçerli değildir ve ortalama hesaplamasına dahil edilmeyecektir.");
        }
        System.out.print("Kimya notunuzu giriniz : ");
        kimya = input.nextInt();
        if (kimya >= 0 && kimya <= 100) {
            total += kimya;
            validSubjects++;
        } else {
            System.out.println("Kimya notu geçerli değildir ve ortalama hesaplamasına dahil edilmeyecektir.");
        }
        System.out.print("Müzik notunuzu giriniz : ");
        muzik = input.nextInt();
        if (muzik >= 0 && muzik <= 100) {
            total += muzik;
            validSubjects++;
        } else {
            System.out.println("Müzik notu geçerli değildir ve ortalama hesaplamasına dahil edilmeyecektir.");
        }


           double average = total / validSubjects;

            if(average>=55){
                System.out.println("Tebrikler, sınıfı geçtiniz.");
            }else{
                System.out.println("Üzgünüz, sınıfta kaldınız. ");

            }
              System.out.println("Dönem ortalamanız: " + average);



    }


        }
















