
package GroupProject;


public class Contractor extends Customer {
    
    
    public String businessName;
    public String contractorNumber;
    protected String businessAddress;
    

    public Contractor(String fname, String lname, String email, 
             String phoneNumber, String businessName, String businessAddress
            , String contractorNumber)
    {
    
            
            super(fname, lname,email);
            this.businessName = businessName;
            this.contractorNumber = contractorNumber;
            this.businessAddress = businessAddress;
    }
        
    
       public void setAddress(String address)
    {
        this.businessAddress = address;
    }
    
   
    }
    



