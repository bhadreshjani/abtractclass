package assignment;
abstract class figure      //abstarct class
{
	double dim1,dim2,dim3;  // all required dimension for all there figure
	abstract void findarea();               //method declararion
	abstract void findperameter();          
	
}
class  circle extends figure                            // class circle 
{

	circle (double r)               // constructur assigning value to dim1
	{
		dim1 = r;
	}
	circle ()
	{
	}
	void findarea ()                   //find area of circel
	{
		System.out.println("Arear of Circle = " + 2*3.14*(dim1*dim1));
	}
	void findperameter()             //find perimeter of circle
	{
		System.out.println("perimeter of circle =" +3.14*(dim1*dim1));  //dim1 is reduis
	}
}
class rectangle extends figure                      // class rectagle defination
{
	rectangle(double l,double w)    // constructor assigning to dim1 and dim2
	{
		dim1=l;
		dim2=w;
	}
	rectangle()
	{
		
	}
	void findarea ()    //find area of rectangle
	{
		System.out.println("Area of Ractaqngle =" + dim1*dim2);
	}
	void findperameter()    //find perimeter of rectangle
	{
		System.out.println("perimeter of Ractangle =" + 2*(dim1*dim2));
	}
	
}
class tringle extends figure        // class tringle defination
{
	tringle (double d1,double d2,double d3)   //costructor assigning to dim1,dim2 and dim3
	{
		dim1=d1;
		dim2=d2;
		dim3=d3;
	}
	void findarea ()    //find area of tringle
	{
		System.out.println("Area of Triangle =" + (dim1*dim2)/2);
	}
	void findperameter()   //find perimeter of tringle
	{
		System.out.println("perimeter of Triangle =" + (dim1+dim2+dim3));
	}
	
}
public class figuredimension {
public static void main(String args[])
{
	double rd=5;    // giving raduis value for circle
	double l=6,w=4;   // giging length and width for rectangle
	double d1=6,d2=6,d3=6;  // giving value for all three dimension of triangle
	circle c = new circle(rd);                    //creating objects and calling 
	rectangle r=new rectangle(l,w);               //costructor for three class
	tringle t =new tringle(d1,d2,d3);
	c.findarea();                          // calling function to find
	c.findperameter();                     // area and perimeter
	r.findarea();                          // of circle, rectangle 
	r.findperameter();                     // and trinagle
	t.findarea();
	t.findperameter();
	
}
}
