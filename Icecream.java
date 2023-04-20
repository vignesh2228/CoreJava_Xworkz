class Icecream {
    static String brand[] = {"Beskin-Robbins", "Arun", "Ben -Jerry", "Haagen -Dazs" , "Blue Bell Creams" , "Dreyer's" , "Halo Top Creams","Magunum", "Blue Bunny", "Turkey KIll", "Kwality Wall's","Tillamook ", "Amual Ice creams"};
    public static void main (String [] args) {
        System.out.println("The Main Started ");
            getIceCreamName();
        System.out.println("The Main Ended !!");        
    }
    public static void getIceCreamName() {
        System.out.println("The top 10 ice creams brands names : ");
        for(int x= 0 ; x < brand.length ;  x++){
            System.out.println(brand[x]);
        }
    }
}