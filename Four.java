import java.util.Scanner;

abstract class DeliveryCost{
    protected double orderAmount; //Total Cost
    protected int deliveryCost;

    public abstract void calculateCost(double amount);
    public double getOrderAmount(){
        return orderAmount;
    }
    public int getDeliveryCost(){
        return deliveryCost;
    }
}

class standardDelivery extends DeliveryCost{
    @Override
    public void calculateCost(double amount) {
        orderAmount = amount;
        if(amount > 2000){
            deliveryCost = 0;
            System.out.println("Congratulations! There's no delivery cost for u.");
        }
        else{
            deliveryCost = 100;
            orderAmount += deliveryCost;
            System.out.println("You have been charged with $100 for delivery.");
        }
    }
}
class ExpressDelivery extends DeliveryCost{
    @Override
    public void calculateCost(double amount) {
        orderAmount = amount;
         orderAmount += 200;
        System.out.println("You have been charged with $200 for delivery.");
    }
}
class ScheduleDelivery extends DeliveryCost{
    Scanner s = new Scanner(System.in);
    @Override
    public void calculateCost(double amount) {
        orderAmount = amount;
        System.out.print("Enter 1 if you place order 1 or more than 1 day earlier: ");
        int day = s.nextInt();
        if(day == 1){
            System.out.println("Congratulations! You got $100 delivery discount.");
            deliveryCost = 50;
            orderAmount += deliveryCost;
        }
        else{
            System.out.println("You have been charged with $150 for delivery.");
            deliveryCost = 150;
            orderAmount += deliveryCost;
        }
    }
}


public class Four {
    public static void main(String[] args){
        standardDelivery person1 = new standardDelivery();
        person1.calculateCost(1000);
        System.out.println("Total amount is: $" + person1.getOrderAmount());

        ExpressDelivery person2 = new ExpressDelivery();
        person2.calculateCost(2000);
        System.out.println("Total amount is: $" + person2.getOrderAmount());

        ScheduleDelivery person3 = new ScheduleDelivery();
        person3.calculateCost(5000);
        System.out.println("Total amount is: $" + person3.getOrderAmount());
    }
}
