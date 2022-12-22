import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100);
        int right = 0;
        boolean isWin=false;
        int[] wronglist = new int[5];
        Scanner input = new Scanner(System.in);
        System.out.println(number);
        System.out.print("Lütfen Bir Sayı Giriniz : ");
        int mynumb ;


        while (right<5){
            mynumb = input.nextInt();
            if (mynumb==number){
                System.out.println("Tebrikler Doğru tahmin ettiniz");
                isWin = true;
                break;
            }else{

                if(mynumb<number){
                    System.out.println("Küçük Bir sayı Tahmin ettiniz Lütfen Daha Büyük Bir Sayı Seçiniz : ");
                }else{
                    System.out.println("Büyük Bir sayı Tahmin ettiniz Lütfen Daha Küçük Bir Sayı Seçiniz : ");
                }
                wronglist[right++] = mynumb;
                System.out.println("Kalan Hakkınız : " + (5-right));
            }


        }
        if (!isWin){
            System.out.println("Ne yazık ki kazanamadınız " + number + " doğru sayı idi");
            System.out.println("Girdiğiniz Yanlış Sayılar : "+Arrays.toString(wronglist));
        }





    }
}