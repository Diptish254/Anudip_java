
public class Rectangle {

	   int length;      //data member for  length 
	   int  width;      //data member for  Width
	   
	    Rectangle()     //  Default  Constrctors  for not set the value length and Width 
	   {
	    
	   length=0;
	    width=0;
	   }
	   
	  Rectangle( int length,int width )  //parameterized   Constrctors for set the value of length And Width 
	  { 
		   this.length=length;      
		   this.width=width;
	   }
	    
	   
	   void Area ()      //                Method the calculate area of rectangle 
	   {
		   System.out.println(" \n length is "+length);  
	      System.out.println(" \n  width is "+width);
	      
	      int Area;	                        //  data member for  Area     
	      Area=length*width;                // Formula of Area of rectangle 
	      System.out.println("\n Area of Rectangle = "+Area+"\n");	       	       
	   }
	   
	 
	public static void main(String[] args) {
		
		 Rectangle  R1=new  Rectangle();                //  call  default  instanc  
		 System.out.println("call default Constructors............");  
		 Rectangle R2=new Rectangle(20,22);             //  call  parameterized  instanc and set the value length,Width 
		  
		    R1.Area();                  //  call Method using Default   Constrctors
	       	R2.Area();                  // call Method using parameterized  Constrctors 
		     
		   
	}
	
}