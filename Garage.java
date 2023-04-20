class Garage {
    static String garagesName[] = {"Margo Mosberger", "Yuan Ting Lin ", "Kei Chan ", "Nikola ivanov " , "sandra Martin" , "ODON BUTTER" , "Cengiz Eren","Mahir Akcay", "Mackenzie", "Roberto ", "Keith","Muhammad ", "Hanah Senuik", " Sasuke"};
    public static void main (String [] args) {
        System.out.println("The Main Started ");
            getGarageWorkerName();
        System.out.println("The Main Ended ?");
        
    }
    public static void getGarageWorkerName(){
        System.out.println("To peint the garage employee names : ");
        for(int d = 0 ; d < garagesName.length ; d++){
            System.out.println(garagesName[d]);
        }
    }
}