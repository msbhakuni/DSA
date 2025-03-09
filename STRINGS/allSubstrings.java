import java.util.*;
// time complexity is O(n3) , its not efficient. Even iterative method have O(n2)  i.e 2 for-loops
class allSubstrings {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string name : ");
        String str = scanner.nextLine();
        findAllSubstrings(str,0,1);
        return;
    }

    public static void findAllSubstrings(String str,int start, int end){

        if(start==str.length())
            return;
        if(end>str.length()){
            findAllSubstrings(str,start+1,start+2);
            return;
        }
        System.out.println(str.substring(start,end));
        findAllSubstrings(str,start,end+1);
    }
}