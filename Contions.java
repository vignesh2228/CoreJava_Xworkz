class Contions {
    static String[] variable = {"knock","Gain","Victory","power","more","Arugh"};
    static int[] numbers = {0,1,2,3,4,5,6,7,8,9,10};
    public static void main (String[] args){
        System.out.println("The Main Started !!");
        System.out.println("");
            getIfElseCondition();
        System.out.println("Ended End !!!");
    }
    // method is funalitity 
    // behaviral  
    //boolean  --- is started
    public static void getIfElseCondition() {
        System.out.println("print If Condition ");
        System.out.println("");
        for(int i = 0 ; i < variable.length ; i++) {
            System.out.println(variable[i]);
        if(variable[i] == ("Gain") && variable[i] != ("there")) {
            System.out.println("the varible is checked !");
           break ;
        }
        else {
            System.out.println("the variable either are not in the variable ??");
        }
        }
        System.out.println("");
        System.out.println("The Else Statement Start here ?");
        System.out.println("");
        for(int n = 0 ; n <= numbers.length ; n++){
            System.out.println(numbers[n]);
        if(numbers[n] == (1)){
            System.out.println("the Numbers are there !!");
            break;
        }
        else {
            System.out.println("The Numbers are not in there !!");
        }
        }


    }
}