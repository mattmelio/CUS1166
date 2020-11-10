import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Queue;

//Needs to calculate completion time by adding up everyime job time in the queue.
public class VehicleController
{  
   private ArrayList<Vehicle> vehicles;

   public VehicleController()
   {  
      vehicles = new ArrayList<Vehicle>();
   }
   
   public void readVehicles(String filename) 
         throws IOException
   {  
      try (Scanner in = new Scanner(new File(filename)))
      {
         while (in.hasNext())
         {  
            int licensePlate = in.nextInt();
            int jobTime = in.nextInt();
            Vehicle v = new Vehicle(licensePlate, jobTime);
            addVehicle(v);
         }
      }
   }
   
   public void addVehicle(Vehicle v)
   {  
      vehicles.add(v);
   }

   public Vehicle findVehicle(int licensePlate, int jobTime)
   {  
      for (Vehicle v : Vehicle)
      {  
         if (v.match(licensePlate, jobTime))
         {
            return v;
         }
      }
      return null;
   }
}


