import java.util.Scanner;

public class Main {
    public static Scanner reader=new Scanner(System.in);
    //type: String str/long lng/char ch
    public static char toChar(int num){
        return (char) num;
    }
    //type: String str/long lng/char ch
    public static String toString(int num){
        return ""+num;
    }
    public static int toInt(char ch){
        return ch;
    }
    public static void main(String[] args) {
        System.out.println("enter number");
        int x=reader.nextInt();
        String y,str = "";
        y=toString(x);
        for (int i = 0; i < y.length(); i++) {
            str+=""+y.charAt(i);
        }
        System.out.println(str);
        System.out.println("length of num"+y.length());

    }
}