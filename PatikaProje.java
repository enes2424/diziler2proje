import java.util.Scanner;

public class PatikaProje {

	public static void main(String[] args) {
		int[] dizi = {15,12,788,1,-1,-778,2,0};
		int theNearestNumberSmallerThanTheEnteredNumber = 0, theNearestNumberGreaterThanTheEnteredNumber = 0, j = 0;
		System.out.print("Dizi : {");
        for (int i : dizi) {
        	System.out.print(i);
        	if (j != dizi.length - 1) System.out.print(",");
        	j++;
        }
        System.out.println("}");
        Scanner input = new Scanner(System.in);
        System.out.print("Girilen Sayı : ");
        int num = input.nextInt();
        for (int i : dizi) {
        	if (i < num) {
        		theNearestNumberSmallerThanTheEnteredNumber = i;
        	}
        	if (i > num) {
        		theNearestNumberGreaterThanTheEnteredNumber = i;
        	}
        }
        for (int i : dizi) {
        	if (i < num && i > theNearestNumberSmallerThanTheEnteredNumber) theNearestNumberSmallerThanTheEnteredNumber = i;
        	if (i > num && i < theNearestNumberGreaterThanTheEnteredNumber) theNearestNumberGreaterThanTheEnteredNumber = i;
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + theNearestNumberSmallerThanTheEnteredNumber);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + theNearestNumberGreaterThanTheEnteredNumber);
	}

}
