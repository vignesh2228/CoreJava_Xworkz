class Hospital{
    static String docters[] = {"Suriya Menon - General Medicion ", "Saravanan - General Medicion ", "Sujith Kumar - General Medicion ", "Tolstoy R - General Medicion ", "Denesh - General Medicion ", "Murali - General Medicion " ,"Jayachandran -General Medicion ", "Jagathishwaran - General Medicion ", "Vellamal -General Medicion ","Ramkumar -General Medicion ", "kathirason - General Medicion ","velusamy -General Medicion ", "MUthukumar S -General Medicion ", "Keerthana - General Medicion "};
    public static void main (String[] args) {
        System.out.println(" The Main Started ");
            getDocter();
        System.out.println("The Main Ended "); 
    }
    public static void getDocter() {
        System.out.println("the PSG Hospital Gendral Medison doctors list : ");
        for(int e = 0; e < docters.length ; e++){
            System.out.println(docters[e]);
        }
    }  
}