public class DemoOnStrings {
    public static void main(String[] args) {
        // sequence of characters enclosed in double quotes
        // "abcdefghijklmnop....z";
        // "123456789!@#$@#@%#^%$%$$%#%^^kjvndvjvjekkjv";

        //concatenation
        /*
            string + string = string
            String + int    = string
            string + float  = string
         */

        String str = "AutomationAutomation873r2tr29yr928ybwcw7ery9yfsvsjbisuci";

        int length = str.length();
        System.out.println("length of string is  " + length);

        //index - starts with zero

        int IndexOfChar = str.indexOf('A');

        System.out.println("index is  "+ IndexOfChar);

        char ch = str.charAt(0);

        int lastIndex = str.length()-1;

        char ch2 = str.charAt(lastIndex);
        System.out.println("character  is  "+ ch2);

       boolean status = str.contains("Auto");
        System.out.println(" given string is containing expected value   "+status);
    }
}
