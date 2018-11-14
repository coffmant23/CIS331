
package GroupProject;

public class Sale {
    public Item itemSold;
    public String saleID;
    public int quantity;
    public String date;
    public String custID;
    public int transaction;

    

    public Sale(Item itemSold, int quantity, String date, String custID, int transaction,int saleTracker){
        this.quantity = quantity;
        this.itemSold = itemSold;
        this.date = date;
        this.custID = custID;
        this.transaction = transaction;
        this.saleID = "s" + saleTracker;
    }

    public void printSale(){//might need to fix the formatting here
        double quantity = itemSold.quantity;
        double total = quantity* itemSold.salePrice;
        System.out.printf("%-11s\t%-5.0f\t$%-10.2f\t-8.2f\t%-8s",itemSold.itemName,quantity,itemSold.salePrice,total,date);
    }

    
}
