class Student{
 int ID;
 String name;
 float m1,m2,m3;
 

  Student (){
  ID=1;
  name="kiran";
  m1=35;
  m2=43;
  m3=56;
  }
  Student(int StudentID, String Studentname,float Studentm1,float Studentm2,float Studentm3){
	  ID = StudentID ;
	  name=Studentname;
	  m1=Studentm1;
	  m2=Studentm2;
	  m3=Studentm3;
	  
  }
  
  Student(float Studentm1,float Studentm2,float Studentm3){
	ID = 3;
	name="Jesna"; 
	m1=Studentm1;
	m2=Studentm2;
	m3=Studentm3;
	  
  }

   
	   
  void disply(){
	 float total= m1+m2+m3;
	float avarage = total/3;
	System.out.println("   STUDENT  ");
	System.out.println("ID = "+ID);
    System.out.println("name = "+name);
	System.out.println("m1 = "+m1);
	System.out.println("m2 = "+m2);
	System.out.println("m3 = "+m3);
	  System.out.println("total = "+total); 
    System.out.println("avarage = "+avarage); 
	
  }
}
public class StudentDetails1{
	public static void main (String args[]){
		Student obj1= new Student();
        obj1.disply();
		Student obj2= new Student(2,"maya",23,33,45);
		obj2.disply();
		Student obj3=new Student(45,46,47);
		obj3.disply();
		
		
	}
}
