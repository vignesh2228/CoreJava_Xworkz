class Chatshop {
    static String chat[] = {"Ram","keerthi","raja","sanjay","karunakaran","nandhagikul","darwin","kathir","kaviyan","Mani","Arun","kaliyaperumal","Sunder","vijay","nithya"};
    public static void main (String [] args) {
        System.out.println("The Main Startes");
            getChatShop();
        System.out.println("The Main Ended !");
    }
    public static void getChatShop() {
        System.out.println("THe Chat list NAme :");
        for(int index=0; index < chat.length ; index++) {
            System.out.println(chat[index]);
        }
    }
}