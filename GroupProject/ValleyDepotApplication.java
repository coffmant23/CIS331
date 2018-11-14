package GroupProject;
import java.util.*;

public class ValleyDepotApplication {


  //Main Menu
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Customer[] customerList = new Customer[4];
        Item[] itemList = new Item[10];
        Vendor[] vendorList = new Vendor[3];
        
        int customerTracker = 4;
        int bCustomerTracker = 0;
        int itemTracker =0;
        int choiceSelector = 0;
        double editNum;
        
        vendorList[0] = new Vendor("CompanyA","addressA","123456789");
        vendorList[1] = new Vendor("CompanyB","addressB","987654321");
        vendorList[2] = new Vendor("CompanyC","addressC","543216789");
        customerList[0]= new Customer("Nick","Coffman","12 apple wood","555-555-5555","myemail@dukes.com");
        customerList[1]= new Customer("John","Good","12 apple wood","555-555-5555","myemail@dukes.com");
        customerList[2]= new Customer("Adam","Zing","12 apple wood","555-555-5555","myemail@dukes.com");
        customerList[3]= new Customer("Chance","ay","12 apple wood","555-555-5555","myemail@dukes.com");
        itemList[0]= new Item("Whiskey", 2.0, "Drink of Choice", 10.0, 15.0,vendorList[0]);
        itemList[1]= new Item("Gin", 2.0, "Drink of Choice", 10.0, 15.0,vendorList[0]);
        itemList[2]= new Item("Vodka", 2.0, "Drink of Choice", 10.0, 15.0,vendorList[0]);
        itemList[3]= new Item("Hennesy", 2.0, "Drink of Choice", 10.0, 15.0,vendorList[0]);
        itemList[4]= new Item("Jack Daniels", 2.0, "Drink of Choice", 10.0, 15.0,vendorList[0]);
        itemList[5]= new Item("Capitain Morgan", 2.0, "Drink of Choice", 10.0, 15.0,vendorList[0]);
        itemList[6]= new Item("Cider", 2.0, "Drink of Choice", 10.0, 15.0,vendorList[0]);
        itemList[7]= new Item("Beer", 2.0, "Drink of Choice", 10.0, 15.0,vendorList[0]);
        itemList[8]= new Item("Turkey", 2.0, "Drink of Choice", 10.0, 15.0,vendorList[0]);
        itemList[9]= new Item("Apples", 2.0, "Drink of Choice", 10.0, 15.0,vendorList[0]);
        
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
                  String editChoice = input.next();
                  
                  String edit;
                  
                  for(int i =0 ; i < customerList.length; i++)
                  {
                      if( customerList[i].customerId.equals(editChoice))
                      {
                          System.out.println("Please select the "
                                  + "respective number of what you would like"
                                  + " to edit\n1. Edit First Name\n2. Edit"
                                  + " Last Name\n3. Edit Address\n");
                          int attEdit = input.nextInt();
                          
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
                  itemList = createItem(input,itemList,vendorList);
                  
                  
                  break;

                  
                  
                  
              case 4:
                  displayItems(itemList);
                  System.out.println("Please type the ID number of which "
                          + "item to edit");
                  
                  editChoice = input.next();
               
                  
                  for(int i =0 ; i < itemList.length; i++)
                  {
                      if( itemList[i].itemId.equals(editChoice))
                      {
                          System.out.println("Please select the "
                                  + "respective number of what you would like"
                                  + " to edit\n1. Edit Item Name\n2. Edit weight"
                                  + "\n3. Edit description\n4. Edit purchase price");
                          int attEdit = input.nextInt();
                          
                          switch ( attEdit)
                          {
                              case 1:
                                  System.out.println("Please type the correct version");
                                  edit = input.next();
                                  itemList[i].setItemName(edit);
                                  break;
                              case 2:
                                  System.out.println("Please type the correct version");
                                  editNum = input.nextDouble();
                                  itemList[i].setWeight(editNum);
                                  break;
                              case 3:
                                  System.out.println("Please type the correct version");
                                  edit = input.next();
                                  itemList[i].setDescription(edit);
                                  break;
                              case 4:
                                  System.out.println("Please type the correct version");
                                  editNum = input.nextDouble();
                                  itemList[i].setPricePaid(editNum);
                                  break;
                              case 5:
                                  System.out.println("Please type the correct version");
                                  editNum = input.nextDouble();
                                  itemList[i].setSalePrice(editNum);
                                  break;
                                  
                          }            
                      }
                  }
                  break;
                  
                  
                  
                  
                  
                  
              case 5:                
                  break;
                  
                  
                  
                  
                  
                  
              case 6:
                 vendorList = createVendor(input,vendorList);
                  break;
                  
                  
              case 7:
                  displayCurrentVendors(vendorList);
                  System.out.println("Please type the ID number of which "
                          + "customer to edit");
                  editChoice = input.next();
                  
                  
                  
                  for(int i =0 ; i < vendorList.length; i++)
                  {
                      if( vendorList[i].vendorId.equals(editChoice))
                      {
                          System.out.println("Please select the "
                                  + "respective number of what you would like"
                                  + " to edit\n1. Edit Vendor name\n2. Edit"
                                  + " Vendor Address\n3. Edit Vendor phone number\n");
                          int attEdit = input.nextInt();
                          
                          switch ( attEdit)
                          {
                              case 1:
                                  System.out.println("Please type the correct version");
                                  edit = input.next();
                                  vendorList[i].setName(edit);
                                  break;
                              case 2:
                                  System.out.println("Please type the correct version");
                                  edit = input.next();
                                  vendorList[i].setAddress(edit);
                                  break;
                              case 3:
                                  System.out.println("Please type the correct version");
                                  edit = input.next();
                                  vendorList[i].setPhoneNumber(edit);
                                  break;
                              
                          }            
                      }
                  }
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
            
            newArray[0] = new Customer(fname,lname,address,phoneNumber,email);
        }
        else{
        for (int i = 0 ;i < customerArray.length; i++ )
        {
          newArray[i] = customerArray[i];
        }
        newArray[customerTracker]  = new Customer(fname,lname,address,
                phoneNumber,email);
        
        
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
            
            newArray[0] = new Contractor(fname,lname,email,phoneNumber,businessName, businessAddress , contractorNumber);
        }
        
        
        else{
        for (int i = 0 ;i < customerArray.length; i++ )
        {
          newArray[i] = customerArray[i];
        }
        newArray[customerTracker]  = new Contractor(fname,lname,email,
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
            
            System.out.printf("%-20s\t%s\t\n",
                  customerList[i].fname+" "+customerList[i].lname,
                    customerList[i].customerId);
            
          
        }
        System.out.println("");
    }
    
    public static Item[] createItem(Scanner input, Item[] itemList, Vendor[] vendorList)
    {
        
       Item[] newArray = new Item[itemList.length+1];
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
         
        System.out.println("Please enter the id of the vendor for the item: ");
        displayCurrentVendors(vendorList);
        
        String vendorChecker = input.next();
        int capture =0;
        for (int i = 0; i < vendorList.length; i++)
        {
            if (vendorChecker == vendorList[i].vendorId)
            {
                capture = i; 
            }
        }
        
 
       
        for (int i = 0 ;i < itemList.length; i++ )
        {
          newArray[i] = itemList[i];
        }
        newArray[newArray.length-1]  = new Item(itemName, weight, description, pricePaid, salePrice,vendorList[capture]);
        
        return newArray;
    }
    
    public static void displayItems(Item[] itemList)
    {
        System.out.println("Customer Name:\tID Number:\n"
                    + "-------------------------");
        for ( int i = 0; i < itemList.length; i++)
        {
            
            System.out.printf("%-20s\t%s\t\n",
                  itemList[i].itemName,
                    itemList[i].itemId);
            
          
        }
        System.out.println("");
    }
    
     public static Vendor[] createVendor(Scanner input, Vendor[] vendorList)
    {
        
       Vendor[] newArray = new Vendor[vendorList.length+1];
            String vendorName;
            String vendorAddress;
            String phoneNumber;
          
        System.out.println("Please enter Vendor's name: ");
        vendorName = input.next();
        System.out.println("Please enter Vendor's address: ");
        vendorAddress = input.next();
        System.out.println("Please enter the Vendor's phone number: ");
        phoneNumber = input.next();
        
         
 
       
        for (int i = 0 ;i < vendorList.length; i++ )
        {
          newArray[i] = vendorList[i];
        }
        newArray[newArray.length-1]  = new Vendor(vendorName, vendorAddress, phoneNumber);
        
        return newArray;
    }
     
     public static void displayCurrentVendors(Vendor[] vendorList)
        {
        System.out.println("Vendor Name:\tID Number:\n"
                    + "-------------------------");
        for ( int i = 0; i < vendorList.length; i++)
        {
            
            System.out.printf("%-20s\t%s\t\n",
                  vendorList[i].name,
                    vendorList[i].vendorId);
            
          
        }
        System.out.println("");
    }
}
  
