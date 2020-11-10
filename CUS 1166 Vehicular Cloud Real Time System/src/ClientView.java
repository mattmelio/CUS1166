import java.util.Scanner;

public class ClientView {
	Scanner input = new Scanner(System.in);
	
	private int id;
	private int deadline;
	private Job job; 
	
	public void ClientInfo(int clientID, Job aJob, int deadline)
	{
			
		      System.out.println("Client Info: ");
	          System.out.println("Client ID: " + clientID);
	          System.out.println("Job: " + aJob);
	          System.out.println("Deadline: " + deadline);
	}

}