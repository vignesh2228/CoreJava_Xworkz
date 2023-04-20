class Netfilx {
    static String[] kannadaMovie = {"kandhara","kgf","pushpa","joker","rajkumar","putti 2","A","karanti","spiderman","no way home ","jack","top gun","bolt","truth or dare","boruto"};
    static String []tamilMovie = {"vikram","kuruvi","ratsason","mogini","Tamil padam","vivegam","valimai","singam","asuran","varisu","puli","maan karathe","vennai thanidi varuvaya","Key"};
    static String englishMovie[] = {"lights out","Top Gun","piret of karabiyan","Capton","Death race","Death Note","Jungle book","Narniya","Dr. Strange","HUlk","iron Man","rognarok","vennom","dont braeth","skull island"};

    public static void main(String[] args) {
        System.out.println("the starting the Main Method");
        // calling outside main method 
            getKannadaMovie();
            readTamilMovies();
            writeEngilshMovie();
        System.out.println("The ending the main Method");
        return ;
        
    }
    
    public static void getKannadaMovie(){
        System.out.println("");
        System.out.println("the list out the kannada movie :");
        System.out.println("");
        for (int what = 0 ; what < kannadaMovie.length ; ++what) {
            System.out.println(kannadaMovie[what]);
            
        }
        return ;
    }
    public static void readTamilMovies() {
        System.out.println("");
        System.out.println("The tamil movie listed below : ");
        System.out.println("");
        for (int why = 0 ; why <= tamilMovie.length -1 ; why++) {
            System.out.println(tamilMovie[why]);
          
        }
        return ;
    }
    public static void writeEngilshMovie(){
        System.out.println("");
        System.out.println("The Engilsh movie list are below : ");
        System.out.println("");
        for (int  where = 0 ; where <= englishMovie.length -1 ; ++where ){
            System.out.println(englishMovie[where]);
        
        }
        return ;
    }
}