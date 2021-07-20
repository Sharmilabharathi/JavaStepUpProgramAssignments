import java.util.Scanner;

/**
 * @author Sharmila
 * Program to add prime numbers in an array.
 */
public class PrimeSum {

    public static void main(String[] args) {

        //Reading array size input
        System.out.println("Enter the array size:");
        int noOfElements = new Scanner(System.in).nextInt();
        //Array Instantiation
        int[] primeArray = new int[noOfElements];

        if(noOfElements==0){
            System.out.println("InvalidArraySize");
            System.exit(0);
        }else{
            int primeArraySum=sumPrimeArray(primeArray,noOfElements);
            System.out.println("Sum Of Prime Values in an array: "+primeArraySum);
        }
    }

    public static int sumPrimeArray(int[] array, int size){
        int count,sumPrime=0;
        //Reading array elements
        System.out.println("Enter the array elements:");
        for(int i=0;i<size;i++){
            array[i]=new Scanner(System.in).nextInt();
            //Checking for negative or invalid input
            if(array[i]<0){
                System.out.println("InvalidInput");
                System.exit(0);
            }
            else{
                count = 0;
                for (int j = 1; j <= array[i]; j++) {
                    if (array[i] % j == 0) {
                        count++;
                    }
                }
                if (count == 2)
                    sumPrime = sumPrime + array[i];
            }

        }

        return sumPrime;
    }

}

