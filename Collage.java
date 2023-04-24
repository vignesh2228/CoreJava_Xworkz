class Collage {
    static String dept[] = {"cse","Ece","mechanical","civil","cyber security","It","EEE","petro cimical engineering ", "aironatical Engineering "};
    public static void main (String [] args) {
        System.out.println("The Main Started ");
            getdepartment();
        System.out.println("The Main Ended !!");
    }
    public static void getdepartment() {
        System.out.println("Collage brance's name  :");
        for(int i = 0 ; i < dept.length ; i ++) {
            System.out.println(dept[i]);
        }
    }
}



// syntax of declaration a method 
   // <access-modifier> return type method name (parameter) {
       // return value 
  // }

  // declaration of a method 
     // public static void getKannadaMovie(){
        // block of code 
     //}