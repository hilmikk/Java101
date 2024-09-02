import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("A number: ");
        int a = in.nextInt();

        int[] list = {56, 34, 1, 8, 101, -2, -33};

        // Başlangıç değerleri
        Integer minClosest = null;
        Integer maxClosest = null;

        for (int i : list) {
            if (i < a) {
                if (minClosest == null || i > minClosest) {
                    minClosest = i;
                }
            }

            if (i > a) {
                if (maxClosest == null || i < maxClosest) {
                    maxClosest = i;
                }
            }
        }

        if (minClosest != null) {
            System.out.println("En yakın küçük sayı: " + minClosest);
        } else {
            System.out.println("Girilen sayıdan küçük bir değer bulunamadı.");
        }

        if (maxClosest != null) {
            System.out.println("En yakın büyük sayı: " + maxClosest);
        } else {
            System.out.println("Girilen sayıdan büyük bir değer bulunamadı.");
        }
    }
}
