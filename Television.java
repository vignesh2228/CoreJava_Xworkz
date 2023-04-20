class Television {
    static boolean isConnected ;
    static int maxVolume = 12 ;
    static int minVolume ;
    static int currentVolume;

    public static void main (String [] args) {
        System.out.println("The Main is Startted");
            isOnOrOff();
            increseVolume();
            increseVolume();
            increseVolume();
            decreaseVolume();
            decreaseVolume();
            increseVolume();

        System.out.println("The Main is ENded ");
    }

    public static boolean isOnOrOff() {
        System.out.println("The Television on or off function stareted");
            if (isConnected == false) {
                isConnected = true ;
                System.out.println("The Television turn on " + isConnected);
            }
            else if (isConnected == true) {
                isConnected = false ;
                System.out.println("the television is  off now ");
            }
        System.out.println("The Television on or of functio ENded ");
        return isConnected;
    }

    public static int increseVolume() {
        System.out.println("The volume increase is started ");
            if(isConnected == true ) {
                if(currentVolume < maxVolume ) {
                    System.out.println("The volume is incresed one by one");
                    currentVolume = currentVolume + 1 ;
                    System.out.println("The Current volume is increased " + currentVolume);
                }
                else {
                    System.out.println("The current Volume is reached in maxVolume you not increases anymore");
                }
            }
            else {
                System.out.println("You should probabaly turn on your TV frist then try it again");
            }
        System.out.println("The volume increased is Ended ");
        return currentVolume;
    }

    public static int decreaseVolume() {
        System.out.println("The Volume is decresed is Started now ");
            if(isConnected == true) {
                if (maxVolume > currentVolume) {
                    System.out.println("Current Volume is decresed to the default volume");
                    currentVolume = currentVolume -1 ;
                    System.out.println("The current Volume is decresed " + currentVolume);
                }
                else {
                    System.out.println("The current Volume default you enjoy the movie or song you gone a be incresed the volume");
                }
            }
            else {
                System.out.println("You should probabaly turn on your TV frist then try it again");
            }
        System.out.println("The Volume is decresed is ENded now ");
        return currentVolume; 
    }
}