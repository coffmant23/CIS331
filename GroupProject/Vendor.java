package GroupProject;


public class Vendor {
    
    public String name;
    private String address;
    private String phoneNumber;
    public String vendorId; 
    public static int counter;
    
    public Vendor(String name, String address, String phoneNumber)
    {
            this.name =name;
            this.address = address;
            this.phoneNumber = phoneNumber;
            this.vendorId= "v"+counter;
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

    
    
}


