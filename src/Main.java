import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Random number = new Random();
        int x = number.nextInt(100);
        //System.out.println("Gizli sayı: "+x);
        int right = 0;
        boolean isWrong =false;
        int guess=0;
        int[] wrongs= new int[5];
        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen bir 1 ile 100 arasında 1 sayı tahmin ediniz: ");
        while(right<5){
            System.out.print("Tahmininiz: ");
            guess=input.nextInt();
            if(guess<0 || guess>100 ) {
                if (!isWrong) {
                    System.out.println("Hatalı tahmin girdiniz \nLütfen 1 ile 100 arasında bir değer giriniz ");
                    System.out.println("Bir sonraki hatalı tahminde hakkınızdan düşülecektir");
                    isWrong = true;
                    continue;
                } else{
                    wrongs[right] = guess;
                    right++;
                    System.out.println("Hatalı tahmin girdiniz \nKalan tahmin hakkınız: " + (5 - right));
                    continue;
                    }
                }
            if(guess==x){
                System.out.println("Kazandınız, tahmininiz = "+x);
                break;
            }else{
                wrongs[right]=guess;
                right++;
                System.out.println("Hatalı tahmin girdiniz \nKalan tahmin hakkınız: "+(5-right));
                if(guess>x){
                    System.out.println("Tahmin ettiğiniz sayı gizli sayıdan büyüktür");
                }else{
                    System.out.println("Tahmin ettiğiniz sayı gizli sayıdan küçüktür");
                }
            }
        }
        if(right>=4){
            System.out.println("Kaybettiniz, Tahminleriniz: "+Arrays.toString(wrongs));
            System.out.print("Gizli Sayı = " +x);
        }
    }
}