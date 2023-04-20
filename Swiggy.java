class Swiggy {

    public static double onlinefood(String food){
        double price = 0.0;
        if("papaya Milkshake" == food) {
            System.out.println("Thanking for Selecting " + food );
            price = 65.00 ;
            return price;
        }
        if("Fresh Fruit Boul" == food) {
            System.out.println("Thanking for Selecting " + food );
            price =  75.00;
            return price;
        }
        if("Classic Buttermilk" == food) {
            System.out.println("Thanking for Selecting " + food );
            price = 40.00;
            return price;
        }
        if("Oreo Milkshake" == food) {
            System.out.println("Thanking for Selecting " + food );
            price = 85 ;
            return price;
        }
        if("Plain Paratha (3pc) Egg" == food) {
            System.out.println("Thanking for Selecting " + food );
            price = 120.00 ;
            return price;
        }
        if("Omelette" == food) {
            System.out.println("Thanking for Selecting " + food );
            price = 45.00 ;
            return price;
        }
        if("Butter Phulka" == food) {
            System.out.println("Thanking for Selecting " + food );
            price = 30.00;
            return price;
        }
        if("Butter Rotti" == food) {
            System.out.println("Thanking for Selecting " + food );
            price = 30.00 ;
            return price;
        }
        if("Rotti" == food) {
            System.out.println("Thanking for Selecting " + food );
            price = 20.00 ;
            return price;
        }
        if("chicken Keema Double" == food) {
            System.out.println("Thanking for Selecting " + food );
            price = 120.00;
            return price;
        }
        if("Butter Paneer Maggi" == food) {
            System.out.println("Thanking for Selecting " + food );
            price = 110.00 ;
            return price;
        }
        if("Fresh Lemon juice" == food) {
            System.out.println("Thanking for Selecting " + food );
            price = 40.00;
            return price;
        }
        return price;
    }
}