class Mnc {
    static String companys[] = {"zoho","tcs","hcl","wipro","Accenure","google","facebook","twiter","apple","microsoft","ibm","infosys","Producter & gamble","sony coperation","tata groups"};
    public static void main (String [] args) {
        System.out.println("The Main Started !! ");
            getMnc();
        System.out.println("The Main Ended "); 
    }
    public static void getMnc() {
        System.out.println("The Mnc are bleow : ");
        for (int mnc = 0; mnc < companys.length ; mnc++){
            System.out.println(companys[mnc]);
        }
    }
}