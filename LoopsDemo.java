public class LoopsDemo 
{
    public static void main(String[] args)
     {
        
    // 1. FOR LOOP
    System.out.println("For Loop:");
    for (int i=0; i<= 5; i++)
       {
        System.out.println(i);
       }
     
    // 2. WHILE LOOP
    System.out.println("While Loop:");
    int j = 1;
    while(j <= 5)
    {
        System.out.println(j);
        j++;
    } 

    // NESTED LOOP
    System.out.println("Nested Loop:");
    
        for(int row = 1; row <=3; row++)
        {
            for(int column = 1; column <=3; column++)
            {
                System.out.print("* ");
            }
        
            System.out.println();
        }
    

     }
}
