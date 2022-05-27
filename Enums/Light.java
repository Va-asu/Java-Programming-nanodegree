public class Light{
    public void lightChange(Stoplight color)
    {
        if(color==Stoplight.Green)
        {
            System.out.println("Ready to go...");
        }else if(color==Stoplight.Red)
        {
            System.out.println("Stop!!");
        }if(color==Stoplight.Yellow)
        {
            System.out.println("Wait here...");
        }
    }
}