import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class runOwner {
	
	static public int ownerId;
    static public int vpn;
    static public String modelp;
    static public String make;
    static public String color;
    static public String location;
    static public String time;
    static public int mileage;
	static private Job cJob; 
	
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		Owner model  = new Owner(0,0, null,null,null,null,null,0,null);

        //Calls client view class
        OwnerView view = new OwnerView();

        //calls client controller class
        ownerController controller = new ownerController(model, view);
        
        System.out.println("Enter Owner ID: ");
        ownerId = kb.nextInt();
        System.out.println("Enter VPN #: ");
        vpn = kb.nextInt();
        System.out.println("Enter Model: ");
        modelp = kb.next();
        System.out.println("Enter Make: ");
        make = kb.next();
        System.out.println("Enter Color: ");
        color = kb.next();
        System.out.println("Enter Location: ");
        location = kb.next();
        System.out.println("Enter Time Desired: ");
        time = kb.next();
        System.out.println("Enter Mileage: ");
        mileage = kb.nextInt();
        
        model.setOwnerId(ownerId);
        model.setVpn(vpn);
        model.setModelp(modelp);
        model.setMake(make);
        model.setColor(color);
        model.setLocation(location);
        model.setTime(time);
        model.setMileage(mileage);
        
        ownerId=model.getOwnerId(); 
        vpn=model.getVpn();
        modelp=model.getModelp();
        make=model.getMake();
        color=model.getColor();
        location=model.getLocation();
        time=model.getTime();
        mileage=model.getMileage();
        
        try {
		      File myObj = new File("ownerFile.txt");
		      if (myObj.createNewFile()) {
		        System.out.println("File created: " + myObj.getName());
		      } else {
		        System.out.println("File already exists.");
		      }
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
        
        try {
		      FileWriter myWriter = new FileWriter("ownerFile.txt");
		      myWriter.write("Owner ID:" + "\t" + ownerId);
		      myWriter.write("VPN:" + "\t" + vpn);
		      myWriter.write("Make:" + "\t" + make);
		      myWriter.write("Model:" + "\t" + modelp);
		      myWriter.write("Mileage:" + "\t" + mileage);
		      myWriter.write("Color:" + "\t" + color);
		      myWriter.write("Location:" + "\t" + location);
		      myWriter.write("Time:" + "\t" + time);
		      myWriter.close();
		      System.out.println("Successfully saved to file.");
		      
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		 }
	}

