import java.util.Scanner;

public class OwnerView {
	
	 public int ownerId;
	    public int vpn;
	    public String modelp;
	    public String make;
	    public String color;
	    public String location;
	    public String time;
	    public int mileage;
		private Job cJob; 
		
		 public void OwnerInfo() {

		        System.out.println("Owner ID:" + "\t" + ownerId);
		        System.out.println("VPN:" + "\t" + vpn);
		        System.out.println("Make:" + "\t" + make);
		        System.out.println("Model:" + "\t" + modelp);
		        System.out.println("Mileage:" + "\t" + mileage);
		        System.out.println("Color:" + "\t" + color);
		        System.out.println("Location:" + "\t" + location);
		        System.out.println("Time:" + "\t" + time);
		        System.out.println("Job:" + "\t" + cJob);

         }
		 
}
