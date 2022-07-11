package Exercise;

import java.util.Arrays;

public class Luhn_Algorithmus_2 {
	public static void main(String[] args) {
		 
        String cardNumber="2718281828458567";
 
        boolean validCreditCardNumber = isValidCreditCardNumber(cardNumber);
 
        if(validCreditCardNumber)
        {
            System.out.println(cardNumber+" is valid as per luhn algorithm");
        }
        else
        {
            System.out.println(cardNumber+" is not valid as per luhn algorithm");
        }
    }
 
    public static boolean isValidCreditCardNumber(String cardNumber)
    {
        // int array for processing the cardNumber
        int[] cardIntArray=new int[cardNumber.length()];
 
        for(int i=0;i<cardNumber.length();i++)
        {
            char c= cardNumber.charAt(i);
            cardIntArray[i]=  Integer.parseInt(""+c);
        }
 
        for(int i=cardIntArray.length-2;i>=0;i=i-2)
        {
            int num = cardIntArray[i];
            num = num * 2;  // step 1
            if(num>9)
            {
                num = num%10 + num/10;  // step 2
            }
            cardIntArray[i]=num;
        }
 
        int sum = sumDigits(cardIntArray);  // step 3
 
        System.out.println(sum);
 
        if(sum%10==0)  // step 4
        {
            return true;
        }
 
        return false;
 
    }
 
    public static int sumDigits(int[] arr)
    {
        return Arrays.stream(arr).sum();
    }
}

