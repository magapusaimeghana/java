// Thread to display "Good Morning" every 1 second 
class GoodMorningThread extends Thread  
{ 
       public void run()  
       { 
         try  
{ 
              while (true)  
{ 
                  System.out.println("Good Morning"); 
                  Thread.sleep(1000); // Sleep for 1 second 
             } 
         }  
catch (InterruptedException e)  
{ 
              System.out.println(e); 
         } 
     } 
} 
 
// Thread to display "Hello" every 2 seconds 
class HelloThread extends Thread  
{ 
    public void run()  
    { 
        try  
        { 
            while (true)  
             { 
                System.out.println("Hello"); 
                Thread.sleep(2000); // Sleep for 2 seconds 
              } 
        } 
        catch (InterruptedException e)  
        { 
            System.out.println(e); 
           }
    } 
} 
 
// Thread to display "Welcome" every 3 seconds 
class WelcomeThread extends Thread  
{ 
    public void run()  
    { 
        try  
         { 
            while (true)  
             { 
                 System.out.println("Welcome"); 
                 Thread.sleep(3000); // Sleep for 3 seconds 
             } 
        }  
        catch (InterruptedException e)  
        { 
            System.out.println(e); 
        } 
    } 
} 
 
// Main class to start the threads 
public class Internal  
{ 
    public static void main(String[] args)  
    { 
        // Create instances of each thread 
        GoodMorningThread t1 = new GoodMorningThread(); 
        HelloThread t2 = new HelloThread(); 
        WelcomeThread t3 = new WelcomeThread(); 
 
        // Start the threads 
        t1.start(); 
        t2.start(); 
        t3.start(); 
    } 
}