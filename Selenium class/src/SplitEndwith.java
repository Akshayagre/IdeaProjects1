public class SplitEndwith {

    public static void main(String[] args) {

        String str = "He told that we have to stay together in order to escape";
        String[] stArr = str.split(" ");

        for (int i = 0; i < stArr.length; i++) {
            if(stArr[i].endsWith("e"))
            System.out.println(stArr[i]);
        }
    }
}
