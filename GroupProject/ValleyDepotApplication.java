
package GroupProject;
import java.util.*;

public class ValleyDepotApplication {


  
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Customer[] customerList = new Customer[4];
        Item[] itemList = new Item[1];
        
        int customerTracker = 1;  
        int itemTracker =0;
        int choiceSelector = 0;
        
        customerList[0]= new Customer("Nick","Coffman","12 apple wood","555-555-5555","myemail@dukes.com",0);
        customerList[1]= new Customer("John","Good","12 apple wood","555-555-5555","myemail@dukes.com",0);
        customerList[2]= new Customer("Adam","Zing","12 apple wood","555-555-5555","myemail@dukes.com",0);
        customerList[3]= new Customer("Chance","ay","12 apple wood","555-555-5555","myemail@dukes.com",0);
        
        do
        {
     
          System.out.println("Please select a Menu option\n1. Create Customer"
                  + "\n2. Edit Customer\n"
                  + "3. Create Item\n4. Edit Item\n5. Enter Sale\n6. Create Vendor"
                  + "\n7. Edit Vendor\n8. Exit");
         
          choiceSelector = input.nextInt();
 
          switch(choiceSelector)
          {
              
              
              
              
              
              
              case 1:
                  
                  
                  int choice;                 
                  System.out.println("Please type in the corresponding number"
                          + "for the type of customer\n1. Individual Customer\n"
                          + "2. Business Customer");
                  choice = input.nextInt();
                  if (choice ==1)
                  {
                    customerList = createCustomer(input,
                            customerTracker, customerList);
                  }                 
                  else if (choice ==2)
                  {
                    customerList = createBusinessCustomer(input,
                            customerTracker, customerList);
                  }            
                  customerTracker++;
                  break;
                  
                  
                  
                  
              case 2:
                  displayCurrentCustomers(customerList);
                  System.out.println("Please type the ID number of which "
                          + "customer to edit");
                  int editChoice = input.nextInt();
                  String edit;
                  for(int i =0 ; i < customerList.length; i++)
                  {
                      if( customerList[i].customerId == editChoice)
                      {
                          System.out.println("Please select the "
                                  + "respective number of what you would like"
                                  + " to edit\n1. Edit First Name\n2. Edit"
                                  + " Last Name\n3. Edit Address\n");
                          int attEdit = input.nextByte();
                          
                          switch ( attEdit)
                          {
                              case 1:
                                  System.out.println("Please type the correct version");
                                  edit = input.next();
                                  customerList[i].setFname(edit);
                                  break;
                              case 2:
                                  System.out.println("Please type the correct version");
                                  edit = input.next();
                                  customerList[i].setLname(edit);
                                  break;
                              case 3:
                                  System.out.println("Please type the correct version");
                                  edit = input.next();
                                  customerList[i].setAddress(edit);
                                  break;
                              case 4:
                                  System.out.println("Please type the correct version");
                                  edit = input.next();
                                  customerList[i].setPhoneNumber(edit);
                                  break;
                          }            
                      }
                  }
                  break;
                  
                  
                  
                  
              case 3:
                  itemList = createItem(input, itemTracker,itemList);
                  
                  itemTracker++;
                  break;
              case 4:
                  
                  break;
              case 5:
                  
                  break;
              case 6:
                 
                  break;
              case 7:
                  
                  break;
                                      
          }
 
        } while(choiceSelector != 8);
        
        
        
       
    }
    
    
    public static Customer[] createCustomer(Scanner input, int customerTracker,
            Customer[] customerArray)
    {
        Customer[] newArray = new Customer[customerTracker+1];
          String fname;
          String lname;
          String address;
          String phoneNumber;
          String email;
          
        System.out.println("Please enter customer's first name: ");
        fname = input.next();
        System.out.println("Please enter customer's last name: ");
        lname = input.next();
        System.out.println("Please enter customer's address: ");
        address = input.next();
        System.out.println("Please enter customer's phoneNumber: ");
        phoneNumber = input.next();
        System.out.println("Please enter customer's email: ");
        email = input.next();
        
        if (customerTracker == 0 )
        {
            
            newArray[0] = new Customer(fname,lname,address,phoneNumber,email,customerTracker);
        }
        else{
        for (int i = 0 ;i < customerArray.length; i++ )
        {
          newArray[i] = customerArray[i];
        }
        newArray[customerTracker]  = new Customer(fname,lname,address,
                phoneNumber,email, customerTracker);
        
        
        }
       return newArray;
    }
    
    public static Customer[] createBusinessCustomer(Scanner input, int customerTracker,
            Customer[] customerArray)
            
    {
        Customer[] newArray = new Customer[customerTracker+1];
          String fname;
          String lname;
          String email;
          String phoneNumber;
          String businessAddress;
          String businessName;
          String contractorNumber;
          
                  
          
          
        System.out.println("Please enter the business name: ");
        businessName = input.next(); 
        System.out.println("Please enter business reps first name: ");
        fname = input.next();
        System.out.println("Please enter business reps last name: ");
        lname = input.next();
        System.out.println("Please enter business phoneNumber: ");
        phoneNumber = input.next();
        System.out.println("Please enter business address: ");
        businessAddress = input.next();
        System.out.println("Please enter contractor number: ");
        contractorNumber = input.next();
        System.out.println("Please enter business email: ");
        email = input.next();
        
        
        if (customerTracker == 0 )
        {
            
            newArray[0] = new Contractor(fname,lname,email,customerTracker,phoneNumber,businessName, businessAddress , contractorNumber);
        }
        else{
        for (int i = 0 ;i < customerArray.length; i++ )
        {
          newArray[i] = customerArray[i];
        }
        newArray[customerTracker]  = new Contractor(fname,lname,email,customerTracker,
                phoneNumber,businessName, businessAddress, contractorNumber);
        }
        
        
        return newArray;
    }
    
    
    public static void displayCurrentCustomers(Customer[] customerList)
    {
        System.out.println("Customer Name:\tID Number:\n"
                    + "-------------------------");
        for ( int i = 0; i < customerList.length; i++)
        {
            
            System.out.printf("%-20s\t%d\t\n",
                  customerList[i].fname+" "+customerList[i].lname,
                    customerList[i].customerId);
            
          
        }
        System.out.println("");
    }
    
    public static Item[] createItem(Scanner input, int customerTracker, Item[] itemList)
    {
        
       Item[] newArray = new Item[customerTracker+1];
        String itemName;
        double weight;
        String description;
        double pricePaid;
        double salePrice;
          
        System.out.println("Please enter item's name: ");
        itemName = input.next();
        System.out.println("Please enter item's weight: ");
        weight = input.nextDouble();
        System.out.println("Please enter the item description: ");
        description = input.next();
        System.out.println("Please enter the price paid for item: ");
        pricePaid = input.nextDouble();
        System.out.println("Please enter the sale price for item: ");
        salePrice = input.nextDouble();
         
        if (customerTracker == 0 )
        {
            
            newArray[0] = new Item(itemName, weight, description, pricePaid, salePrice);
        }
        else{
       
        for (int i = 0 ;i < itemList.length; i++ )
        {
          newArray[i] = itemList[i];
        }
        newArray[0]  = new Item(itemName, weight, description, pricePaid, salePrice);
        }
        return newArray;
    }
    
    public static void initialMethod()
    {
        Customer a = new Customer("Nick","Coffman","12 apple wood","555-555-5555","myemail@dukes.com",0);
    }
}

  
