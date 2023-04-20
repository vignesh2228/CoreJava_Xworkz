class Specker {
    static boolean isConnected ;
    static String name = "Noice";
    static double price = 10000.00;
    static  int maxValume = 8 ;
    static int minValume;
    static int currentValume ;

    public static void main (String[] args) {
        System.out.println("The Main Method Started ..");
            boolean connected = isOnOrOff() ;
            System.out.println("The Specker connected" + " "+connected );
        System.out.println("The Main Method Ended Here ..");
        int increase = increseValume();
        System.out.println("The incresed Valume is " + increase);
        int increase2 = increseValume();
        System.out.println("The incresed Valume is " + increase2);
        increseValume();
        isOnOrOff();
        increseValume();
        isOnOrOff();
        increseValume();
        decressValume();
        increseValume();
        increseValume();
    }

    public static boolean isOnOrOff() {
        System.out.println("The turn On OR OFF fuction started ..");
        if(isConnected == false) {
            isConnected = true ;
            System.out.println("The Speaker is Turn on....");
        }
        else if (isConnected == true) {
            isConnected = false ;
            System.out.println("The Speacker is  off Right now ...");
        }
        return isConnected;
    }


    public static int increseValume() {
        System.out.println("The increse the valume is Started");
        if (isConnected == true )
         {
            if(currentValume < maxValume) {
                System.out.println("The current valume is increased untill the max valume");
                    currentValume = currentValume +1 ;
                System.out.println("The current Valume is " + currentValume);
            
            }
            else {
                System.out.println("the current Valume is reached ");
            }
        }
        else {
            System.out.println("The Specker is Turn of you Turn on the Speker Right Now");
        } 
     
    
        System.out.println("The increse valume is Ended Here");
        return currentValume;
    }
    

    public static int decressValume() {
        System.out.println("the drcresing Volume is stated");
        if(isConnected == true) {
            if(maxValume > currentValume) {
                System.out.println("Decresing the Volume ");
                currentValume = currentValume -1 ;
                System.out.println("the valume is Decresed" +" " + currentValume);
            
            }
            else {
                System.out.println("the default value achieved");
            }
        }
        else {
            System.out.println("the Specker is off ");
        }
        return currentValume;
    }
    
}
