class If {
    
    public static void  main(String [] args){
    String friends[] = {
        "Arun","Adhi","Darwin","Dhanushiya","karuna","karuna Sree","Mani","Maha","Lavanya","Sugumaran","Sanjay","Samsu Sheik","Kaviyan","Rahul","vicky","Keerthana","Subi","Nandhagokul","pavi","Suruthi",
    };
        System.out.println("Started !");
        System.out.println("Ended !!");

        System.out.println("");
        for(int f = 0 ; f < friends.length ; f++){
            System.out.println(friends[f]);
        if(friends[f] == ("Arun") && friends[f] == ("karuna")) {
            System.out.println("those list are your friends !!" );
        }
        else{
            System.out.println("those guys are not your frinds");
        }
    }
    }
}   