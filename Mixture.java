class Mixture {
    static boolean isConnected ;
    static  int maxValume = 5 ;
    static int minValume;
    static int currentValume ;

    public static void main (String[] args) {
        System.out.println("The Main Method Started ..");
            boolean connected = isOnOrOff() ;
            System.out.println("The Mixture connected" + " "+connected );
        System.out.println("The Main Method Ended Here ..");
        int increase = increseValume();
        System.out.println("The incresed Levels is " + increase);
        int increase2 = increseValume();
        System.out.println("The incresed levels is " + increase2);
        decressValume();
        decressValume();
        decressValume();
        decressValume();
        increseValume();
        increseValume();
  
    }

    public static boolean isOnOrOff() {
        System.out.println("The turn On OR OFF fuction started ..");
        if(isConnected == false) {
            isConnected = true ;
            System.out.println("The Mixture is Turn on....");
        }
        else if (isConnected == true) {
            isConnected = false ;
            System.out.println("The Mixture is  off  now ...");
        }
        return isConnected;
    }


    public static int increseValume() {
        System.out.println("The Mxture Level is Started");
        if (isConnected == true )
         {
            if(currentValume < maxValume) {
                System.out.println("The current Level is increased untill the max Level");
                    currentValume = currentValume +1 ;
                System.out.println("The current Levels is " + currentValume);
            
            }
            else {
                System.out.println("the maxture  is reached the full off the levels ");
            }
        }
        else {
            System.out.println("The Mixture is Turn of you Turn on the Mixture Now Then try it again");
        } 
     
    
        System.out.println("The increse Level  is Ended Here");
        return currentValume;
    }
    

    public static int decressValume() {
        System.out.println("the drcresing Level is stated");
        if(isConnected == true) {
            if(maxValume > currentValume) {
                System.out.println("Decresing the Mixture Level");
                currentValume = currentValume -1 ;
                System.out.println("the Mixture Level is Decresed" +" " + currentValume);
            
            }
            else {
                System.out.println("the  mixture default level reached you will be bleande again to incresed tha levels");
            }
        }
        else {
            System.out.println("Mixture is off now buddy so you will be turn on the mixture then try to blended the products");
        }
        return currentValume;
    }
    
}
