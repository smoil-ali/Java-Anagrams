
import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
       if ((a == null || b == null) || (a.length() != b.length())) {
            return false;
        }
        char[] ARRAY_A = a.toUpperCase().toCharArray();
        char[] ARRAY_B = b.toUpperCase().toCharArray();
        int status=0;
        for(int i=0;i<ARRAY_A.length;i++){
            for(int j=0;j<ARRAY_A.length;j++){
                if(ARRAY_A[i]==ARRAY_B[j]){
                    status=1;
                    break;
                }else{
                    status=0;
                }
            }
            if(status==0){
                return false;
            }
        }

        for(int i=0;i<ARRAY_A.length;i++){
            int count1=0;
            int count2=0;
            for(int j=0;j<ARRAY_A.length;j++){
                if(ARRAY_A[i]==ARRAY_A[j]){
                    count1+=1;
                }
                if(ARRAY_A[i]==ARRAY_B[j]){
                    count2+=1;
                }

            }
            if(count1!=count2){
                return false;
            }
        }
        return true; 
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
