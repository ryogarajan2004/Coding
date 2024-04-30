import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int len=str.length();
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++)
            {
                if(j==i|| j==len-i-1){
                    System.err.print(str.charAt(j));
                }else{
                    System.out.print(" ");
                }
            }
            System.err.println();
        }
    }
}
