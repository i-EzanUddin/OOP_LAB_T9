class electricity{
    private int units;
    private String Usertype;
    private boolean loyalty;

    public double getBill(int unit){
        units = unit;
        double total = 10 * units;
        System.out.println("Total Bill is issued.");
        return total;
    }
    public double getBill(int unit,String type){
        units = unit;
        Usertype = type;
        double total = 0;
        if(Usertype.equals("domestic")){
            total = 10 * units;
        }
        else if (Usertype.equals("commercial")) {
            total = 15 * units;
        }
        System.out.println("Total Bill is issued with type.");
        return total;
    }
    public double getBill(int unit,String type, boolean status){
        units = unit;
        Usertype = type;
        loyalty = status;
        double total = 0;
        if(Usertype.equals("domestic")){
            total = 10 * units;
        }
        else if (Usertype.equals("commercial")) {
            total = 15 * units;
        }
        if(loyalty){
            total = total - (total * 0.05);
            System.out.println("Total Bill is issued with discount.");
        }
        else{
            System.out.println("Total Bill is issued with no discount.");
        }
        return total;
    }
}
public class Three {
    public static void main(String[] args){
        electricity[] person = new electricity[3];
        for(int i = 0; i < 3; i++){
            person[i] = new electricity();
        }
        System.out.println("Person 1 Bill: $" + person[0].getBill(50));
        System.out.println("Person 2 Bill: $" + person[1].getBill(50,"commercial"));
        System.out.println("Person 3 Bill: $" + person[2].getBill(50,"commercial", true));
    }
}
