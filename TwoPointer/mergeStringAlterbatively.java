class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] result = new char[word1.length() + word2.length()];
        int i=0; int j=0;
         int k=0;

          while(i<word1.length() && j<word2.length()){
              result[k++]= word1.charAt(i);
              result[k++] = word2.charAt(j);
              i++;
              j++;
          }
            while (i < word1.length()) {
            result[k++] = word1.charAt(i);
            i++;
        }
           while (j < word2.length()) {
            result[k++] = word2.charAt(j);
            j++;
        }
    
        return String.valueOf(result);
    }
}