package q06;

public class StringManipulator {
    public static void main(String[] args) {
        StringManipulator str = new StringManipulator();
        System.out.println(str.reverse("HelloWorld"));
        System.out.println(str.reverse("HelloWorld",3));
        System.out.println(str.reverse("HelloWorld",2,9));
    }
    public String reverse(String s){
        StringBuffer sbf = new StringBuffer(s);

        sbf.reverse();

        return s;
    }
    // – Reverses a string.
           public String reverse(String s, int n){

               return s;
           }
    // – Reverses the first n characters of a string.
    public String reverse(String s, int start, int end){

        return s;
    }
    //– Reverses a substring
}
