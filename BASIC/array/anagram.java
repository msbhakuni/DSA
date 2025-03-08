import java.util.*;
public class anagram {
    public static void main (String args[]) {
        
        System.out.println("Check if 2 strings are anagram or not - ");
        System.out.println("String 1 : ");
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        System.out.println("String 2 : ");
        String s2 = scanner.nextLine();

        boolean ans = checkAnagram(s1,s2);
        System.out.println(ans);
    }

    static boolean checkAnagram(String s1, String s2) {
        if(s1.length()!=s2.length()) return false;

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1,arr2))
            return true;
        
        return false;
    }

}