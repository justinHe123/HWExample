public class Homework {

    public static boolean abcTest(String input){
        return input.contains("abc") && !input.contains(".abc");
    }

    public static String alternateStrings(String first, String second){
        String alternate = "";
        int leastLength = Math.min(first.length(), second.length());
        for (int i = 0; i < leastLength; i++){
            alternate += first.substring(i, i + 1) + second.substring(i, i + 1);
        }
        if (first.length() > second.length()){
            return alternate + first.substring(leastLength);
        } else {
            return alternate + second.substring(leastLength);
        }
    }
}