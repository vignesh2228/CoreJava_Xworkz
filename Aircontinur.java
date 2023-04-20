class Aircontinur {
    static boolean isConnected ;
    static String barnd = "sony";
    static double price = 15000.00 ;
    static int maxSpeed = 10 ;
    static int minSpeed ; 
    static int currentSpeed ;

    public static void main (String [] args) {
        System.out.println("The Main is started");
           boolean ac = isOnOrOff();
           System.out.println("The is turn on now " + isConnected);
           increseSpeed();
           increseSpeed();
           increseSpeed();
           decreseSpeed();
           decreseSpeed();
           increseSpeed();
           increseSpeed();
           decreseSpeed();
           decreseSpeed();
        System.out.println("The Main is Ended ");
    }

    public static boolean isOnOrOff() {
        System.out.println("The Ac is stated ");
            if(isConnected == false) {
                isConnected = true ;
                System.out.println("The Ac will be turned on  Now ");
            }
            else if (isConnected == true) {
                isConnected = false ;
                System.out.println("The Ac will be off now");
            }

        System.out.println("The Ac is Ennded ");
        return isConnected;
    }

    public static int increseSpeed() {
        System.out.println("The Increse Speed is started ");
            if(isConnected == true) {
                if (currentSpeed < maxSpeed) {
                    System.out.println("The Current Speed proced untill the maxiuium reach");
                    currentSpeed = currentSpeed + 1;
                    System.out.println("the Current Speed is " + currentSpeed);
                }
                else {
                    System.out.println("The current speed will reach the maxium capacity of the Ac");
                }
            }
            else {
                System.out.println("to Turn on the poweroff the Ac Then try it Again ");
            }

        System.out.println("The Increse Speed is Ended");
        return currentSpeed;
    }

    public static int decreseSpeed() {
        System.out.println("The Speed is decrese is started ");
            if(isConnected == true ) {
                if (maxSpeed > currentSpeed) {
                    System.out.println("Current Speed is decreased ");
                    currentSpeed = currentSpeed - 1 ;
                    System.out.println("The Current Speed is " + currentSpeed);
                }
                else{
                    System.out.println("The Speed is reached to the default so you can increse the Speed");
                }
            }
            else {
                System.out.println("Hey buddy to not in the supply so power on And Try it again ");
            }

        System.out.println("The Speed is decrease is ended");
        return currentSpeed;
    }
}