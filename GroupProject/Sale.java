/*
Nicholas Coffman
Jonathan Doan
Manfred Hueskes
Pierre Giaon
Shuvam Mishra
*/
package GroupProject;
import java.util.*;
import java.text.SimpleDateFormat;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Sale {
    public Item itemSold;
    public String saleID;
    public double quantity;
    public String date;
    public String custID;
    public int transaction;
    public int saleTracker=5;
    public static ObservableList obsSalelist = FXCollections.observableArrayList();
    

    public Sale(Item itemSold, double quantity, String custID, int transaction){
        this.quantity = quantity;
        this.itemSold = itemSold;
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        this.date = sdf.format(cal.getTime());
        this.custID = custID;
        this.transaction = transaction;
        this.saleID = "s" + saleTracker;
        itemSold.sale(quantity);
        saleTracker++;
        
    }
    public Sale(Item itemSold, double quantity, String date, String custID, int transaction){
        this.quantity = quantity;
        this.itemSold = itemSold;
        this.date = date;
        this.custID = custID;
        this.transaction = transaction;
        this.saleID = "s" + saleTracker;
        itemSold.sale(quantity);
        saleTracker++;
    }

    public static void printSale(Sale sale){//might need to fix the formatting here
        double q1 = sale.quantity;
        String name = sale.itemSold.itemName;
        double salePrice = sale.itemSold.salePrice;
        double total = q1*salePrice ;
        System.out.printf("%-11s\t%-7.0f\t$%-10.2f\t$%-9.2f\t%-8s\n",name,q1,salePrice,total,sale.date);
    }
     public static String printReceipt(Sale sale){//might need to fix the formatting here
        String receipt = "";
         double q1 = sale.quantity;
        String name = sale.itemSold.itemName;
        double salePrice = sale.itemSold.salePrice;
        double total = q1*salePrice ;
        receipt += String.format("%-15s\t\t%-5.0f\t\t\t$%-10.2f\t$%-9.2f\t\t%-8s\n",name,q1,salePrice,total,sale.date);
        return receipt;
    }

    public String toString(){
        String saleString = new String("");
        saleString += itemSold.itemName + " " + saleID + " " + quantity + " " + date + " " + custID + " " + transaction;
        return saleString;
    }
    public String comboBoxFormat()
       {
           return saleID + "  " +itemSold.itemName;
       }
}   
