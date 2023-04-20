class Fan {
    static boolean isConnected ;
    static String brandName = "Novi";
    static double price = 2500.00 ;
    static int maxLeavel = 5 ;
    static int minLeavel;
    static int currentLeavel;

    public static void main (String[] args) {
        System.out.println("The Main is Started");
            boolean connect = isOnOrOff();
            System.out.println("The fan is turned on " + connect);
            incresedLevels();
            incresedLevels();
            incresedLevels();
            decreseLevels();
            incresedLevels();
            incresedLevels();
            decreseLevels();
           

        System.out.println("The Main is ENnded");
    }

    public static boolean isOnOrOff() {
        System.out.println("The Fan started >>");
            if(isConnected == false) {
                isConnected = true ;
                System.out.println("The Swith is Turn on " );
                
            }
            else if(isConnected == true) {
                isConnected = false;
                System.out.println("The Fan is off");
            }

        System.out.println("The Fan Ended <<");
        System.out.println("");
        return isConnected;
    }

    public static int incresedLevels() {
        System.out.println("The Volume in Incresed Started ");
        if(isConnected == true) {
            if(currentLeavel < maxLeavel) {
                System.out.println("The Fan Levels will be increseed ");
                currentLeavel = currentLeavel + 1 ;
                System.out.println("The fan Level are InCreased " + currentLeavel);
            }
            else {
                System.out.println("this is the maximum levels of the fan level ");
            }
        }
        else {
            System.out.println("the fan is off Right now so frist turn on buddy ");
        }
        System.out.println("The Volume is Incresed  Ended ");
        return currentLeavel;
    }

    public static int decreseLevels() {
        System.out.println("The Decrese Level of the fan is started");
        if(isConnected == true) {
            if(maxLeavel > currentLeavel) {
                System.out.println("the decrese the valume is proceded");
                currentLeavel = currentLeavel -1;
                System.out.println("the curunt level of the fan is " + currentLeavel);
            }
            else {
                System.out.println("the currunt level reach the default level");
            }
        }
        else {
            System.out.println("to Turn on the Fan Then Try it Again !");
        }
        System.out.println("The Decrese Level of the fan is Ended");
        return currentLeavel;
    }
    
    
}