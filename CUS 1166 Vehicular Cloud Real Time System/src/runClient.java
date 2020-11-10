import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;


public class runClient {
	
	static Scanner input = new Scanner(System.in);
	
	static private int id;
	static private int deadline;
	static private Job job; 
    public static void main(String[] args) {
    	 
        //Calls client model class
        Client model  = new Client(0, null, 0);

        //Calls client view class
        ClientView view = new ClientView();

        //calls client controller class
        clientController controller = new clientController(model, view);

        //ASK CLIENTS FOR THEIR INFO
        System.out.println("Enter client id: ");
        id = input.nextInt();
        System.out.println("\nEnter the deadline: ");
        deadline = input.nextInt();
        
        //SETS THE CLIENTS INFO
        model.setClientID(id);
        model.setDeadline(deadline);
        
        //GETS THE CLEINTS INFO
        int clientId = model.getClientID();
        int deadline = model.getDeadline();
        
        
        //CREATES A NEW FILE
        try {
		      File myObj = new File("clientFile.txt");
		      if (myObj.createNewFile()) {
		        System.out.println("File created: " + myObj.getName());
		      } else {
		        System.out.println("File already exists.");
		      }
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		
        //WRITES TO THE CREATED FILE
		try {
		      FileWriter myWriter = new FileWriter("clientFile.txt");
		      myWriter.write("Client ID: "+clientId);
		      myWriter.write("Deadline: "+deadline);
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		      
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		 }
        
        
        
        

      
     }
