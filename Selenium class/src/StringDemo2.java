public class StringDemo2 {
    public static void main(String[] args) {

        String str1 = "i am doing my work i very good at work";
        /*
        System.out.println("Length of char : "+str1.length());
        System.out.println("char at 9th place: "+str1.charAt(9));
*/
        String[] stArr = str1.split(" ");

        for (int i=0; i<stArr.length;i++)
        {
            String temp1 = stArr[i];
            int l = temp1.length();

            if (stArr[i].charAt(l-1)=='y')
                System.out.println(stArr[i]);

        }
    }
}
