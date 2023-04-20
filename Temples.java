class Temples {
    static String temple[] = {"Lord Siva ", "sarasvathi","Mahalakashimi","Ganeshasa","murugan","Indran","Krishinar","Perumal","LOrd Rama","lord Hunuman","karthikeyan","Amman","parvathi","durkai","laskhimi"};
    public static void main (String [] args) {
        System.out.println("The Main Started ");
            getTemleGodNames();
        System.out.println("The Main Ended!!");
    }
    public static void getTemleGodNames(){
        System.out.println("The God NAme Are : ");
        for (int god = 0; god < temple.length ; god++){
            System.out.println(temple[god]);
        }
    }


    
}