class Vehicle{
 String vehicleno;
 String vname;
 String owner;
 Vehicle(){
 }
 Vehicle(String no,String name,String own){
  vehicleno=no;
  vname=name;
  owner=own;
 }
 void display(){
	 System.out.println(" Vehicle No : "+vehicleno);
	 System.out.println(" Vehicle Name : "+vname);
	 System.out.println(" Owner Name : "+owner);
 }
}
public class VehicleDetails{
	public static void main(String args[]){
	 Vehicle[] obj=new  Vehicle[3];
     obj[0]=new  Vehicle("KL14D1116","CAR","THOMAS");
     obj[1]=new  Vehicle("KL13D882","BIKE","JOHNSON");
     obj[2]=new  Vehicle("KL59V8589","SCOOTTY","JESNA");
     System.out.println("\nDETAILS OF VEHICLE 1:");
	 obj[0].display();
	 System.out.println("\nDETAILS OF VEHICLE 2:");
     obj[1].display();
     System.out.println("\nDETAILS OF VEHICLE 3:");
     obj[2].display();
  }
}