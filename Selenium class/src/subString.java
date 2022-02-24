public class subString {
    public static void main(String[] args) {

        String str1 = "Akshay Agre";

        for (int i=0; i< str1.length(); i++)
        {
            System.out.println(str1.substring(i)+ str1.substring(0,i));
        }
    }

}
