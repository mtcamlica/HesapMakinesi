import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        int number1, number2, select;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen ilk sayı girişini yapınız : ");
        number1 = input.nextInt();

        System.out.print("Lütfen ikinci sayıyı giriniz : ");
        number2 = input.nextInt();

        System.out.println(" 1- Toplama \n 2- Çıkarma \n 3- Çarpma \n 4- Bölme");
        System.out.print("Seçiminiz : ");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.print("Toplam : " + (number1 + number2));
                break;
            case 2:
                System.out.print("Çıkarma : " + (number1-number2));
                break;
            case 3:
                System.out.print("Çarpma : " + (number1*number2));
                break;
            case 4:
                System.out.print("Bölme : " + (number1/number2));
                break;
            default:
                System.out.print("Geçersiz giriş yaptınız!!");




        }

    }
}
