
public class clientController {
	
private Client model;
    private ClientView view;

public clientController(Client model, ClientView view){
       this.model = model;
       this.view = view;
    }


	public void setClientID(int clientID){
       model.setClientID(clientID);      
    }

    public int getClientID(){
       return model.getClientID();       
    }

    public void setJob(Job aJob){
       model.setJob(aJob);
    }
    public Job getJob(){
       return model.getJob();     
    }

    public void setDeadline(int deadline){
           model.setDeadline(deadline);      
    }

    public int getDeadline(){
        return model.getDeadline();
    }
    
    public void updateView(){                
       view.ClientInfo(model.getClientID(), model.getJob(), model.getDeadline());
    }
 
 }


