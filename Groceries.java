class Groceries {
    static String[] groceries = {"basmathi rice", "oil", "Nescoffe coffy powder","salt","pannier","Atta","dhall","wheet","karam masala","coriander powder",};
    static String[] Chocolates = {"Cadbury","Ammul","Nestle","Parle","Marse choculate","diry milk","Ferrero Rocher Chocolate","Lotus Chocolates","Campco Chocolates","Hershey Chocolates","Pacari Chocolates"," Lotte Chocolates","Toblerone Chocolates","Fabelle Chocolate","Lindt Chocolates"};
    static String[] shampoos = {"Headen Sholder","Sunskilk","cleanik plues","karthika","dove","Garniya","Amway Shampoo","Avon Shampoo","Axe Shampoo","Biotique Shampoo","Dabur Shampoo","Denver Shampoo"};
    static String perfumes[] = {"Axe","denver","Misr Oud","Dominus Best","Park Avenue","skinn by Titan Raw","RTamsons Lovely","Black","Good Girl Coralina","Engage W2","Renee Eau"};
    static String soaps[] = {"Detto","dove","Misure Sandel","Lux","pears","Himalaya","one with nature","Park Avaenue cool Blue"};
    static String tShirts[] ={"Levi's","Arrow","Blackberry","Jack & Jones","Louie Philipps","Gucci","Mufti","Pepe Jeans","Nike","Tommy- hilger","adidas","us polo","fila"};

    public static void main (String[] args) {
        System.out.println("Main ");
            getGroceries();
            getChoculates();
            getPerfume();
            getShampoo();
            getShoaps();
            getTshirts();
        System.out.println("end");
        return ;
    }
    public static void getGroceries() {
        System.out.println("");
        System.out.println("The GROCERIES list are below :");
        for (int index = 0 ; index < groceries.length ; index++) {
            System.out.println(groceries[index]);
        }
        return ;
    }
    public static void getChoculates(){
        System.out.println("");
        System.out.println("The Choculates are below : ");
        for (int chocolate = 0 ; chocolate < Chocolates.length ; chocolate++){
            System.out.println(Chocolates[chocolate]);
        }
        return ;
    }
    public static void getShampoo() {
        System.out.println("");
        System.out.println("The Shampoo are listed below");
        for (int shampoo = 0 ; shampoo < shampoos.length ; shampoo++) {
            System.out.println(shampoos[shampoo]);
        }
        return ;
    }
    public static void getPerfume() {
        System.out.println("");
        System.out.println("The Perfume are listed below");
        for (int perfume = 0 ; perfume < perfumes.length ; perfume++) {
            System.out.println(perfumes[perfume]);
        }
        return ;
    }
    public static void getShoaps() {
        System.out.println("");
        System.out.println("The Choculate are listed below");
        for (int shoap = 0 ; shoap < soaps.length ; shoap++) {
            System.out.println(soaps[shoap]);
        }
        return ;
    }
    public static void getTshirts() {
        System.out.println("");
        System.out.println("The T-Shirts are listed below");
        for (int tShirt = 0 ; tShirt < tShirts.length ; tShirt++) {
            System.out.println(tShirts[tShirt]);
        }
        return ;
    }
}