import java.util.*;
//Longest substring without repeating characters
// Classic example of sliding window problem
// we are storing character and its index in the hashmap

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
                left = Math.max(map.get(c)+1,left);  //Math.max is important. Consider case of abba. Left should increase in forward manner.
            }
            map.put(c,right);
            max_len = Math.max(max_len,right-left+1);
        }

        System.out.println("ans is : "+max_len);
    }
}