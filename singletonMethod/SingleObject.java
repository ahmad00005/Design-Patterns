package singletonMethod;

public class SingleObject {
	//create an object of SingleObject
	   private static SingleObject instance;

	   //make the constructor private so that this class cannot be
	   //instantiated
	   private SingleObject(){}

	   //Get the only object available
	   public static SingleObject getInstance(){
		  if(instance==null) {
			 instance = new SingleObject();
		  }
	      return instance;
	   }

	   public void showMessage(String s){
	      System.out.println(s);
	   }
}
