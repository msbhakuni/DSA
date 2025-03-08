import java.util.Scanner;
public class palindrom {
    public static void main(String args[]){
        System.out.println("Select your choice :\n 1. Check if a Number is a Palindrome: \n "+
        "2. Check if a String is a Palindrome:\n " + 
        "3. checks if a string is a palindrome, ignoring spaces, punctuation, and case sensitivity :");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.nextLine();
        String s = "";
        if(choice!=1)
             s = scanner.nextLine();
    
        boolean ans=false;
        switch(choice) {
        case 1 :  {     
                      System.out.print("enter size of array : ");
                      int size = scanner.nextInt();
                      int arr[] = new int[size];
                      for(int i = 0;i<size;i++) arr[i]=scanner.nextInt();
                      ans = checkNumber(arr);
                }
            break;
            
        case 2 :  {
                        ans = checkString(s);
        } 
            break;
        case 3 : {
                    ans = checkNonAlpha(s);
        }
        
            break;
        }

    //Check if a String is a Palindrome:
    //    boolean ans = checkNumber(arr);

    //Check if a Number is a Palindrome:
    //    boolean ans = checkString(s);

    //Ignore Non-Alphanumeric Characters: ignoring spaces, punctuation, and case sensitivity.
    //    boolean ans = checkNonAlpha(s);

        System.out.println(ans);
    }

    static boolean checkNumber(int arr[]){
        int i=0;
        int j=arr.length-1;

        while(i<j){
            if(arr[i]==arr[j]){
                i++;
                j--;
            } else
                return false;
        }
        return true;
    }

    static boolean checkString(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            } else
                return false;
        }
        return true;
    }

    static boolean checkNonAlpha(String s){
        StringBuilder ans = new StringBuilder();

        for(char c : s.toCharArray()) {
            if(Character.isLetterOrDigit(c))
                ans.append(Character.toLowerCase(c));
        }
        return checkString(ans.toString());
    }
}