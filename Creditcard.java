class Creditcard {
    static String name[] = {"American Express","Bank of America","Visa","Captital One","Chase Bank","MasterCard","Wells Fargo","Discover","Citibank","Bank of Baroda","State Bank of India","American Express Gold Card","Canera Bank Card","Credit One ","Rubay"};
    public static void main (String [] args) {
        System.out.println("The Main Started  ");
            getCradName();
        System.out.println("The Main ended !!");
    }
    public static void getCradName() {
        System.out.println("Credit Card names are Below :") ;
        for(int n = 0 ; n <= name.length -1 ; n++){
            System.out.println(name[n]);
        }
    }
}