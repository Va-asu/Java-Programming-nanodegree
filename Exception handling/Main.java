public class Main
{
	public static void main(String[] args) {
		String[] str={"1234",null,"78322","2344",null};
		Phone[] p=new Phone[str.length];
		for(int i=0;i<str.length;i++)
		{
		    try{
		        p[i]=new  Phone("iphone",str[i]); 
		        System.out.println(p[i]);
		    }catch(Exception ex)
		    {
		        System.out.println(ex);
		        //use ex.getLocalizedMessage() to get only specific error mentioned in throw function
		    }
		}
		 for (int i = 0; i < str.length; i++) {
            System.out.println(new Phone("iPhone", str[i]));

        }
	}
}
