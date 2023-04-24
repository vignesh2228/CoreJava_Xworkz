class OttPlatform {
    static String koriyanSerises[] = {"My Name","Nevertheless","The Heirs","itaewon Class","Memories of the Alhambra","100 days of Princes","Gagnam Beauty","Rookie Historian","The World Of the Married","who are the Schools 2015","ENcounter","Queen ANd I ","The Docter ","Men Are Men","Evergreen"};
    static String hindiMovie[] = {"Pathaan","Mission Majnu","Brahamastra","Cirkus","RRR","CUttiPutlli","Haseen Dillruba","Sardar Udham ","Tadap","Shershaah","Ek Villon Returns","goodbye","Liger","Antim","Jersey","Ram Sethu"};
 
    static String englishMovie[] = {"lights out","Top Gun","piret of karabiyan","Capton","Death race","Death Note","Jungle book","Narniya","Dr. Strange","HUlk","iron Man","rognarok","vennom","dont braeth","skull island"};

    public static void main(String[] args){
        System.out.println("The Main Started");
            getkoriyanSerises();
            getHindiMovie();
            getEngilshMovie();
        System.out.println("The Main ended");
    }
    public static void getkoriyanSerises() {
        System.out.println("");
        System.out.println("The koriyan Serises are ");
        System.out.println("");
        for(int s = 0 ; s < hindiMovie.length ; s++) {
            System.out.println(hindiMovie[s]);
        }
        return;
    }
    public static void getHindiMovie() {
        System.out.println("");
        System.out.println("The Hindi Movie are ");
        System.out.println("");
        for(int s = 0 ; s < hindiMovie.length ; s++) {
            System.out.println(hindiMovie[s]);
        }
        return;
    }
    public static void getEngilshMovie() {
        System.out.println("");
        System.out.println("The Engilsh Movie are ");
        System.out.println("");
        for(int v = 0 ; v < englishMovie.length ; v++) {
            System.out.println(koriyanSerises[v]);
        }
        return;
    }
    
    
}