public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "programming";
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (result.indexOf(c) == -1) {
                result += c;
            }
        }
        System.out.println("String after removing duplicates: " + result);
    }
}
