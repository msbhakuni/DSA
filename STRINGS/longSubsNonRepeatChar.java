import java.util.*;
//Longest substring without repeating characters
// Classic example of sliding window problem

class longSubsNonRepeatChar {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your string : ");
        String str = scanner.nextLine();

        int left = 0;
        int max_len = 0;
        Map<Character,Integer> map = new HashMap<>();
        for(int right=0;right<str.length();right++){
            char c = str.charAt(right);
            if(map.containsKey(c)){
                left = map.get(c)+1;
            }
            map.put(c,right);
            max_len = Math.max(max_len,right-left+1);
        }

        System.out.println("ans is : "+max_len);
    }
}