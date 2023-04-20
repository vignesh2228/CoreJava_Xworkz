class Ubereats {
    public static int uberEats(String foods) {
        int prices = 0; 
        if("chicken briyani" == foods) {
            System.out.println("Thanking for ordering food " + foods);
            prices = 120;
            return prices;
        }
        if("Mutton Briyani" == foods) {
            System.out.println("Thanking for ordering food " + foods);
            prices = 180;
            return prices;
        }
        if("Butter Chicken " == foods) {
            System.out.println("Thanking for odering food" + foods);
            prices = 130;
            return prices ;
        }
        if ("Curry" == foods) {
            System.out.println("Thanking for odering foods" + foods);
            prices = 90;
            return prices;
        }
        if ("keyrice " == foods) {
            System.out.println("Thanking for odering foods " + foods);
            prices = 110;
            return prices;
        }
        if ("pepper Chicken Malsala" == foods) {
            System.out.println("Thanking ordering foods " + foods);
            prices = 160;
            return prices;
        }
        if ("pannier tikka " == foods) {
            System.out.println("Thanking for ordering foods" + foods);
            prices = 140;
            return prices;
        }
        return prices;
    }
}