class Solution {
    public String reverseWords(String s) {
     Stack<Character>s1 = new Stack<Character>();
     StringBuffer sb = new StringBuffer();
     for(int i=0 ;i<s.length();i++){
         if(s.charAt(i)== ' '){
           while(!s1.isEmpty()){
            sb.append(s1.pop());
           }
           sb.append(' ');
         }else{
            s1.push(s.charAt(i));
         }
     }
     while(!s1.isEmpty()){
       sb.append(s1.pop());
     }
     return sb.toString();

        
    }
}

//second solutiom
public class ReverseWords {
    public static void main(String[] args) {
        String s = "Let's reverse the characters in each word!";
        String result = reverseWords(s);
        System.out.println(result);
    }

    public static String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        StringBuilder word = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ') {
                word.append(c);
            } else {
                result.append(word.reverse());
                result.append(' ');
                word.setLength(0); // Clear the word builder for the next word
            }
        }
        
        // Append the last word, which won't be followed by a space
        result.append(word.reverse());
        
        return result.toString();
    }
}