package GroupProject;


public class Item  {
    
 
   public String itemName;
   public double weight;
   public String description;
   private double pricePaid;
   private double salePrice;
   public String itemId;
   public double quantity;
   public static int counter;
   public Vendor vendor;
   
   
   public Item(String itemName, double weight, String description,double quantity, double pricePaid, double salePrice,Vendor vendor)
   {
   this.itemName = itemName;
   this.weight= weight;
   this.description=description;
   this.quantity = quantity;
   this.pricePaid=pricePaid;
   this.salePrice=salePrice;
   this.itemId = "i"+counter; 
   this.vendor = vendor;
   counter++;
   }
 
   
   public void setItemName(String itemName )
    {
        this.itemName = itemName;
    }
   
     public void setWeight(double weight )
    {
        this.weight = weight;
    }
     public void setDescription(String description)
    {
        this.description = description;
    }
     public void setQuantity(int quantity)
     {
        this.quantity = quantity;
     }
         public void setPricePaid(double pricePaid)
    {
        this.pricePaid = pricePaid;
    }
         public void setSalePrice(double salePrice)
    {
        this.salePrice = salePrice;
    }
  
} 
