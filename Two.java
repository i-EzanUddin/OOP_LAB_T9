class foodApp{
    private double price;
    private int distance;
    private String coupon;
    private String discount;

    public double getTotal(double price){
        this.price = price;
        System.out.println("The price has been returned.");
        return this.price;
    }
    public double getTotal(double price, int distance){
        this.price = price;
        this.distance = distance;
        double total = price + (20 * this.distance);
        System.out.println("Your total price has been returned with distance's cost.");
        return total;
    }
    public double getTotal(double price, int distance, String coupon){
        this.price = price;
        this.distance = distance;
        this.coupon = coupon;
        double total;
        if(coupon.length() == 6){
            discount = coupon.substring(4,6);
        }
        else if(coupon.length() == 7){
            discount = coupon.substring(4,7);
        }
        else{
            System.out.println("Invalid Coupon.");
        }
        double Discount = Double.parseDouble(discount);
        Discount = Discount / 100;
        this.distance = 20 * distance;

        this.price += this.distance;
        total = this.price - (this.price * Discount);
        System.out.println("Your total price has been returned with discount.");
        return total;
    }
}

public class Two {
    public static void main(String[] args){
        foodApp f = new foodApp();

        System.out.println("Total Price = $" + f.getTotal(200));
        System.out.println("Total price with delivery charges = $" + f.getTotal(200,50));
        System.out.println("Total Price with delivery charges and coupon = $" + f.getTotal(200,50,"SAVE25"));
    }
}
