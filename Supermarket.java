class Supermarket {
    static String[] groceries = {"basmathi rice", "oil", "Nescoffe coffy powder","salt","pannier","Atta","dhall","wheet","karam masala","coriander powder",};
    static String[] chocolate = {"Cadbury","Ammul","Nestle","Parle","Marse choculate","diry milk","Ferrero Rocher Chocolate","Lotus Chocolates","Campco Chocolates","Hershey Chocolates","Pacari Chocolates"," Lotte Chocolates","Toblerone Chocolates","Fabelle Chocolate","Lindt Chocolates"};
    static String[] shampoo = {"Headen Sholder","Sunskilk","cleanik plues","karthika","dove","Garniya","Amway Shampoo","Avon Shampoo","Axe Shampoo","Biotique Shampoo","Dabur Shampoo","Denver Shampoo"};
    static String perfume[] = {"Axe","denver","Misr Oud","Dominus Best","Park Avenue","skinn by Titan Raw","RTamsons Lovely","Black","Good Girl Coralina","Engage W2","Renee Eau"};
    static String soaps[] = {"Detto","dove","Misure Sandel","Lux","pears","Himalaya","one with nature","Park Avaenue cool Blue"};
    static String tShirts[] ={"Levi's","Arrow","Blackberry","Jack & Jones","Louie Philipps","Gucci","Mufti","Pepe Jeans","Nike","Tommy- hilger","adidas","us polo","fila"};
    public static void main (String[] args) {
        System.out.println("The superMarket Groceries are blow : ");
        System.out.println("");
        for (int Name = 0; Name < groceries.length ; Name++){
            System.out.println(groceries[Name]);

        }
        System.out.println("");
        System.out.println("choculate Section here :");
        for (int cho = 0; cho < chocolate.length ; cho++){
            System.out.println(chocolate[cho]);
        }
        System.out.println("");
        System.out.println("shampoo Section here : ");
        for (int sha = 0; sha < shampoo.length ; sha++){
            System.out.println(shampoo[sha]);
        }
        System.out.println("");
        System.out.println("Perfume section here :");
        for (int per = 0; per < perfume.length ; per++){
            System.out.println(perfume[per]);
        }
        System.out.println("");
        System.out.println("soap section here :");
        for (int soap = 0; soap < soaps.length ; soap++){
            System.out.println(soaps[soap]);
        }
        System.out.println("");
        System.out.println("T shirt section here");
        for (int t = 0; t < tShirts.length ; t++){
            System.out.println(tShirts[t]);
        }
    }
}