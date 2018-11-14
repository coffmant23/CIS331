

package GroupProject;


public class Item  {
    
 
   public String itemName;
   public double weight;
   public String description;
   private double pricePaid;
   private double salePrice;
   public String itemId;
   public static int counter;
   
   
   public Item(String itemName, double weight, String description,
           double pricePaid, double salePrice)
   {
   this.itemName = itemName;
   this.weight=weight;
   this.description=description;
   this.pricePaid=pricePaid;
   this.salePrice=salePrice;
   this.itemId = "i"+counter; 
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

         public void setPricePaid(double pricePaid)
    {
        this.pricePaid = pricePaid;
    }
         public void setSalePrice(double salePrice)
    {
        this.salePrice = salePrice;
    }
  
} 
   



