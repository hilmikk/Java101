import java.util.Scanner ;
import java.util.Arrays;

class ListNumberSorter {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Your array length: ");


        int ArrayLenght = inp.nextInt();
        int[] Array = new int[ArrayLenght];


        System.out.println("Your array elements: ");

        for(int i = 0 ; i<ArrayLenght ; i++){
            System.out.println(i+1 + " element:");
            Array[i]= inp.nextInt();



        }
        Arrays.sort(Array);
        for(int element: Array){
            System.out.println(element);
        }




    }
}
