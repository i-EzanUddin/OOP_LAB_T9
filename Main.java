import java.util.Scanner;

class DiscountCal{
    private double price;
    private double discount;
    private double couponAmount;

    public void setPrice(double price){
        this.price = price;
    }
    public void setDis(double discount){
        this.discount = discount;
    }
    public void setCouponAmount(double amount){
        couponAmount = amount;
    }
    public void calPrice(double price){
        System.out.println("The final price is: "+ price);
    }
    public void calPrice(double price, double discount){
        discount = discount / 100;
        price = price - (price * discount);
        System.out.println("The final discounted price is: " + price);
    }
    public void calPrice(double price, double discount, double coupon){
        discount = discount / 100;
        price = price - (price * discount);
        price = price - coupon;
        if(price < 1){
            price = 0;
        }
        System.out.println("The final discounted price with coupon amount is: " + price);
    }
}

class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        DiscountCal c1 = new DiscountCal();
        DiscountCal c2 = new DiscountCal();
        DiscountCal c3 = new DiscountCal();

        System.out.print("Enter the amount of product: ");
        double price = s.nextDouble();

        System.out.print("Enter the discounted amount of product: ");
        double discount = s.nextDouble();

        System.out.print("Enter the amount of coupon: ");
        double coupon = s.nextDouble();

        System.out.println("Customer 1:");
        c1.setPrice(price);
        c1.calPrice(price);

        System.out.println("Customer 2:");
        c2.setPrice(price);
        c2.setDis(discount);
        c2.calPrice(price,discount);

        System.out.println("Customer 3:");
        c3.setPrice(price);
        c3.setDis(discount);
        c3.setCouponAmount(coupon);
        c3.calPrice(price,discount,coupon);
    }
}