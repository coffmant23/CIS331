package GroupProject;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;


public class Customer {
    
    public String fname;
    public String lname;
    protected String address;
    protected String phoneNumber;
    protected String email;
    public String customerId;
    public static int counter = 0;
    public static int bCounter = 0;
    public static ObservableList obsCustomerlist = FXCollections.observableArrayList();
    public String notes;
    
    
    
    public Customer(String fname, String lname, String email, String address , String phoneNumber)      
    {
        this.fname = fname;
        this.lname = lname;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.customerId = "c"+counter;
        counter++;
        obsCustomerlist.add(customerId + "  " +this.lname);
        notes = "";
          
    }
            
    public Customer( String fname, String lname,String email )
    {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.customerId= "b"+counter;
        counter++;
        obsCustomerlist.add(customerId + "  " +this.lname);
        notes = "";
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
       public static int getCustomerCounter()
       {
           return counter;
       }
       public String toString()
       {
           String output = "";
           output = fname;
           return output;
           
       }
       public String comboBoxFormat()
       {
           return customerId + "  " +lname;
       }
      
       public String setNotes(String notes)
       {
        return   this.notes = notes;
       }
       
}

