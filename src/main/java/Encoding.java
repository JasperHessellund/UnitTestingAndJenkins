public class Encoding {
    //Converts a string to a new string where each character in the new string is "("
    // if that character appears only once in the original string, or ")" if that character appears more than once in
    // the original string. Ignore capitalization when determining if a character is a duplicate.
    // "din"      =>  "((("
    //"recede"   =>  "()()()"
    //"Success"  =>  ")())())"
    //"(( @"     =>  "))(("
    public String encode(String word){
        word = word.toLowerCase();
        String result = "";
        int count = 0;
        if (word.length() < 1 || word.length() > 15) {
            return result;
        }
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < word.length(); j++) {
                if (String.valueOf(word.charAt(i)).equals(String.valueOf(word.charAt(j)))) count++;
            }
            if (count==1) result += "(";
            else result += ")";
            count = 0;
        }
        return result;
    }
}
