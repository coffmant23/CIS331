/*
Nicholas Coffman
Jonathan Doan
Manfred Hueskes
Pierre Giaon
Shuvam Mishra
*/
package GroupProject;

public class Sale {
    public Item itemSold;
    public String saleID;
    public double quantity;
    public String date;
    public String custID;
    public int transaction;
    public int saleNumber;
    

    public Sale(Item itemSold, double quantity, String date, String custID, int transaction){
        this.quantity = quantity;
        this.itemSold = itemSold;
        this.date = date;
        this.custID = custID;
        this.transaction = transaction;
        this.saleID = "s" + saleNumber;
        this.itemSold.sale(quantity);
        saleNumber++;
    }

    public static void printSale(Sale sale){//might need to fix the formatting here
        double q1 = sale.quantity;
        String name = sale.itemSold.itemName;
        double salePrice = sale.itemSold.salePrice;
        double total = q1*salePrice ;
        System.out.printf("%-11s\t%-7.0f\t$%-10.2f\t$%-9.2f\t%-8s\n",name,q1,salePrice,total,sale.date);
    }

    public String toString(){
        String saleString = new String("");
        saleString += itemSold.itemName + " " + saleID + " " + quantity + " " + date + " " + custID + " " + transaction;
        return saleString;
    }
}
