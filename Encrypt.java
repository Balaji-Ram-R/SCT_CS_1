import java.util.Scanner;
public class Encrypt {
    //create a function to encrypt or decrypt the input text
    public static String encrypt(String txt,int s){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < txt.length(); i++) {
            if (Character.isUpperCase(txt.charAt(i))) {
                int res = txt.charAt(i);
                res = (((res+s)-65)%26)+65;
                //System.out.println(res);
                sb.append((char)res);
            }else if (Character.isLowerCase(txt.charAt(i))) {
                int res = txt.charAt(i);
                res=(((res+s)-97)%26)+97;
                //System.out.println(res);
                sb.append((char)res);
            }
        }
        System.out.println(sb.toString());
        return sb.toString();
    }
    public static void main(String[] args) {
        String inp;int s;
        Scanner sc =new Scanner(System.in);
        System.out.println("Choose - \n1.Encrypt\n2.Decrypt\n");
        int ch = sc.nextInt();
        
        switch (ch) {
            case 1:
            System.out.println("Enter the text to encrypt: ");
            sc.nextLine();
            inp=sc.nextLine();
            System.out.println("Enter the Shift Value: ");
            s = sc.nextInt();
            encrypt(inp,s);
            sc.close();
            break;
            
            case 2:
            System.out.println("Enter the text to Decrypt: ");
            sc.nextLine();
            inp=sc.nextLine();
            System.out.println("Enter the Shift Value: ");
            s = sc.nextInt();
            encrypt(inp,26-s);
            sc.close();
            break;

            default:
                break;
        }
        
    }
}
