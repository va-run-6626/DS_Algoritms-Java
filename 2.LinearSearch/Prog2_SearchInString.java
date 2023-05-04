/**
 * Prog2_SearchInString
 */
public class Prog2_SearchInString {
    public static void main(String[] args) {
        String name = "Varun";
        char target = 'u';
        System.out.println("Does the char '" + target +"' exists in the string : " +search(name,target));
    }
    static boolean search(String str, char target){
        for(char c : str.toCharArray()){
            if(c == target){
                return true;
            }
        }
        return false;
    }
}