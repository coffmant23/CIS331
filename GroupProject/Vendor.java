package GroupProject;

import javafx.collections.ObservableList;
import javafx.collections.FXCollections;

public class Vendor {
    
    public String name;
    private String address;
    private String phoneNumber;
    public String vendorId; 
    public static int counter;
    public static ObservableList obsVendorlist = FXCollections.observableArrayList();
    
    
    public Vendor(String name, String address, String phoneNumber)
    {
            this.name =name;
            this.address = address;
            this.phoneNumber = phoneNumber;
            this.vendorId= "v"+counter;
            obsVendorlist.add(vendorId + "  " + this.name);
            counter++;
    }
    
     public void setName(String name )
    {
        this.name = name;
    }
    
     public void setAddress(String address )
    {
        this.address = address;
    }
     
     public void setPhoneNumber(String phoneNumber )
    {
        this.phoneNumber = phoneNumber;
    }
    
    public String toString()
    {
        String vendorInfo = "";
        vendorInfo = ("Vendor ID: " + vendorId + "Vendor Name: " + this.name +
                      "Vendor Address: " + this.address + "Vendor Phone Number : " + this.phoneNumber);
        
        return vendorInfo;
                      
    }
    
    public String comboBoxFormat()
       {
           return vendorId + "  " +name;
       }

    public String getPhone()
       {
           return this.phoneNumber;
       }
    public String getAddress()
       {
           return this.address;
       }
     
    
}


