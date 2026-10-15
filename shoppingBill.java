import java.util.*;
public class shoppingBill {
    public static double calculateElectronicsGST(double a ,double b){
        double amount =a+b;
        double gst=amount *18/100; 
         return amount+gst; 
}

public static double calculateFashionGST(double c,double d){
    double amount=c+d;
    double gst=amount*13/100;
    return amount +gst;

}


public static double calculateFoodGST(double e){
    double gst =e*7/100;
    return e+gst;
}


public static double totalBill(double a, double b,double c,double d,double e ){
    double electronics=calculateElectronicsGST(a,b);
    double fashion=calculateFashionGST(c,d);
    double food=calculateFoodGST(e);
    return electronics+fashion+food;
}


public static double calculateDiscountedBill(double a,double b,double c,double d ,double e){
    double total=totalBill(a,b,c,d,e);
    double discount = total*20/100;
    double payable = total-discount;
    System.out.printf("Total after GST=%.2f%n",total);
    System.out.printf("Discount=%.2f%n",discount);
    return payable;

}

public static void main(String[] args){
    calculateDiscountedBill(100,100,100,100,100);
}
}

