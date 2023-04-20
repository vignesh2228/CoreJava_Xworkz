class Zomatto {
    public static double searchItems(String iteamName) {
        System.out.println("The Search Item start");
         // veg briyani , malasala dhosai , gobi , dragon chicken , chicken briyani , mutton briyani , pizza , French  Fries , chicken shorma, RotiSabi

// static vs instance 
         if("veg briyani" == iteamName) {
            System.out.println("Thanks for selectiong " +iteamName);
            return 90.00;
         } 
         if("masala dhosai" == iteamName) {
            System.out.println("Thanks for Selcting " +iteamName);
            return 30.00;
         }
         if("gobi" == iteamName) {
            System.out.println("Thanks for Selecting " +iteamName);
            return 25.00;
         }
         if("dragon chicken" == iteamName){
            System.out.println("Thanks for Selecting " +iteamName);
            return 250.00;
         }
         if ("chicken briyani" == iteamName) {
            System.out.println("Thanks for Selecting " +iteamName);
            return 120.00;
         }
         if ("mutton briyani" == iteamName) {
            System.out.println("Thanks for Selecting " +iteamName);
            return 210.00;
         }
         if ("pizza" == iteamName){
            System.out.println("Thanks for Selecting " +iteamName);
            return 160.00;
         }
         if("roti sabi" == iteamName){
            System.out.println("Thanks for Selecting " +iteamName);
            return 270.00;

         }
         if("frenchfries" == iteamName ){
            System.out.println("Thanks for Selecting " +iteamName);
            return 180.00;
         }
         if ("chickenshorma" == iteamName) {
            System.out.println("Thanls for Selecting  " +iteamName);
            return 100.00;
         }

        System.out.println("The search Item Ended");
            return 0.00;

    }
}

//Amazon-25 Swiggy-12 UberEasts-13 // quantity of the and calulate the price 
