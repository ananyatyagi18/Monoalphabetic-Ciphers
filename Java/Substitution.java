import java.util.Scanner;
public class Substitution
{
    public static char l[]  = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
     public static String Decryption(String s,String ch)
    {
        char p1[] = new char[(s.length())];
        for (int i = 0; i < s.length(); i++)
        {
            for (int j = 0; j < 26; j++)
            {
            	if (Character.isUpperCase(s.charAt(i))){
                	if (Character.toLowerCase(s.charAt(i))==ch.charAt(j))
                    {
                        p1[i] = Character.toUpperCase(l[j]);
                        break;
                    }
                }
                if (ch.charAt(j)==s.charAt(i))
                {
                    p1[i] = l[j];
                    break;
                }
                else{p1[i]=s.charAt(i);}
                }
            }
        return (new String(p1));
    }
     public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
       String ch= sc.nextLine();    //input key
       String en=sc.nextLine();     //input cipher text
        System.out.println("Decrypted message: " + Decryption(en,ch));
        sc.close();
    }
}
