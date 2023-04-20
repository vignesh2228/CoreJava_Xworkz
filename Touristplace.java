class Touristplace {
    static String palces[] = {"ooty","kodanadu","kodaikanal","Rameshwaram","dhanush Kodi","mahapalipuram","pandiseri","gova","Bangalore palces","Nandhini Hills","Cubbon Park","Jantar manter","india Gate","ladak","Ulsoor Lake"};
    public static void main (String[] args) {
            System.out.println("the Main Started "); 
                getTouristplaces();
        }
    public static void getTouristplaces() {
        System.out.println("the tourist places are listed below : ");
        System.out.println("");
        for(int index = 0; index < palces.length ; index++){
            System.out.println(palces[index]);
        }
    }
    }
