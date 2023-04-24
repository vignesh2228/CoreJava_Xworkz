class Pub {
    static String pub[] = {"The Red Lion","The Crown INN","The Royal oak","The Wite Hourse","The Black Bull ","The Black Boar","The Rose and Corwn","The BEll","The King's Head","The Coach and Horses","The Gerous And bullden","Bleach","The Grimson Lion Pub"};
    public static void main (String [] args) {
        System.out.println("The Main Started  ");
            getPub();
        System.out.println("The Main Ended !!");
    }
    public static void getPub(){
        System.out.println("list out the bangalore PUB Names : ");
        for (int pubs = 0; pubs < pub.length ; pubs++){
            System.out.println(pub[pubs]);
        }
    }
}