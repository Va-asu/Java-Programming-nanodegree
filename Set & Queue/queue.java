import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        Queue<String>q=new LinkedList<String>();
        for(int i=0;i<n;i++)
        {
           q.add(scn.next());
        }
        while(!q.isEmpty())
        {
          System.out.println(q.remove());
        }
    }
}