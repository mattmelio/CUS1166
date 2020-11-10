
public class ownerController {
	
	private Owner model;
    private OwnerView view;
    
    public ownerController( Owner model, OwnerView view){
        this.model = model;
        this.view = view;
     }
    
    public void setOwnerId(int ownerId) {
        model.setOwnerId(ownerId);
    }

    public void setVpn(int vpn) {
    	model.setVpn(vpn);
    }

    public void setModelp(String modelp) {
    	model.setModelp(modelp);
    }
   
    public void setMake(String make) {
    	model.setMake(make);
    }

    public void setColor(String color) {
    	model.setColor(color);
    }

    public void setLocation(String location) {
    	model.setLocation(location);
    }

    public void setTime(String time) {
    	model.setTime(time);
    }

    public void setMileage(int mileage) {
    	model.setMileage(mileage);
    }

    public void setJobc(Job cJob)
   	{
    	model.setJobc(cJob);
   	}
    //Getter Methods
    public int getOwnerId(){
        return model.getOwnerId();       
     }

    public int getVpn() {
        return model.getVpn();
    }

    public String getModelp() {
    	return model.getModelp();
    }

    public String getMake() {
        return model.getMake();
    }

    public String getColor() {
        return model.getColor();
    }
    
    public String getLocation() {
        return model.getLocation();
    }

    public String getTime() {
        return model.getTime();
    }

    public int getMileage() {
        return model.getMileage();
    }
    
    public Job getJobc()
	{
		return model.getJobc();
	}

	
}
