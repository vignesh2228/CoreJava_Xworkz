class Swiggytester {

    public static void main(String[] args) {
        System.out.println("The Main is started ");
            String food = "Fresh Lemon juice";
            double price = Swiggy.onlinefood(food);
            System.out.println("The " + food + " price is " + price);

        System.out.println("The Main is ended ");
    }
}