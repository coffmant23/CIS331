package GroupProject;


public class Customer {
    
    public String fname;
    public String lname;
    protected String address;
    protected String phoneNumber;
    protected String email;
    public String customerId;
    public static int counter;
    public static int bCounter;
    
    public Customer(String fname
            , String lname
            , String email
            , String address
            , String phoneNumber
            
            )
            
    {
        this.fname = fname;
        this.lname = lname;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.customerId = "c"+counter;
        counter++;
    }
            
    public Customer( String fname , String lname,String email )
    {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.customerId= "b"+bCounter;
        bCounter++;
    }
    
    
    public void setFname(String fName)
    {
        this.fname = fName;
    }
    
        public void setLname(String lName)
    {
        this.lname = lName;
    }
        
        
        public void setAddress(String address)
    {
        this.address = address;
    }
        
        public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }
        
}

