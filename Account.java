
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JOptionPane;


public class Account extends Exception{
    private String FirstName;
    private String LastName;
    private String Email;
    private String PhoneNumber;
    private String Gender;
    private String Address;
    private String ID; 
    private String TotalPrice; 
    
    
    public boolean isNameValid(String name) throws Exception {
        int i=0;
        char test;
         if(name.length()<2) // To checke lentgh
            throw new Exception();
         
         
           while(name.length()>i) {
             test=name.charAt(i);
             
             if(!Character.isAlphabetic(test))
                 throw new Exception();
             
             i++;
           }
           
           return true;
    }
        public boolean isIDValid(String ID) throws Exception {
        int i=0;
        char test;
         if(ID.length()!=10) // To checke lentgh
            throw new Exception();
         
         
           while(ID.length()>i) {
             test=ID.charAt(i);
             
             if(!Character.isDigit(test))
                 throw new Exception();
             
             i++;
           }
           
           return true;
    }
    
     public boolean isPhoneNumberValid(String PhoneNumber) throws Exception {
    
        if(PhoneNumber.length()!=10) // To check lentgh
            throw new Exception();
    int i=0;
    char test;
    
           while(PhoneNumber.length()>i) {
             test=PhoneNumber.charAt(i);
             
             if(!Character.isDigit(test))
                 throw new Exception();
             
             i++;
           }
           
           return true;
     }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getEmail() {
        return Email;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public String getGender() {
        return Gender;
    }

    public String getAddress() {
        return Address;
    }

    public String getID() {
        return ID;
    }

    public String getTotalPrice() {
        return TotalPrice;
    }
      public boolean isEmailValid(String Email) throws Exception {
          
          int Location1=-1, Location2=-1;
          
          if(!(Character.isAlphabetic(Email.charAt(0))))
             throw new Exception();
             
      int i=1;
          while(Email.length()>i) {
              
              if(Email.charAt(i)=='@')
                  Location1=i;
          
              if(Email.charAt(i)=='.')
                Location2=i;
  
          i++;
      }
      
          if(Location1==-1 || Location2==-1)
           throw new Exception();
          
          if(Location1>Location2)
           throw new Exception();
          
          return true;
   }
      public void setFirstName(String n) {
              FirstName=n;  
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
      public void writeAccount() throws FileNotFoundException, IOException {
      
          FileOutputStream f=new FileOutputStream("Account.dat", true);
          DataOutputStream r=new DataOutputStream(f);
          
          String text="Name: "+FirstName+" "+LastName+" ID: "+ID+" Address: "+Address+" Phone Number: "
                  +PhoneNumber+" Email: "+Email+"\n";
          r.writeUTF(text);
          
      }
      public void readAccount() throws FileNotFoundException, IOException {
          FileInputStream f=new FileInputStream("Account.dat");
          DataInputStream r=new DataInputStream(f);
          String text="";
          while(true) {
              try {
                  text+=r.readUTF();
              }
              catch(EOFException e) {
                  break;
            }
          }
              JOptionPane.showMessageDialog(null, text);
              

   }

}
