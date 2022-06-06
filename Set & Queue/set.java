import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        HashSet<String>set=new HashSet<>();
        for(int i=0;i<n;i++)
        {
           set.add(scn.next());
        }
        for(String str:set)
        {
          System.out.println(str);
        }
    }
}