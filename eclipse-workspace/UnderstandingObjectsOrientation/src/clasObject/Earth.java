package clasObject;

public class Earth {


 public static void main(String arg[]) {
	 
	/* Human human1;
	 human1 = new Human();  */  //These statements can be written in one sentence as below:
	 
	 Human human1 = new Human("Tom Sawyer", 56, 66, "black");
	 Human human2 = new Human("Joe Biden", 78, 68, "brown" );
	
	 human1.speak();
	 human2.speak();  //When we execute these the all have the same data.  We have to adjust it.  
	 
	 
/*	 Human tom;
	 
	 tom = new Human();
	 tom.age = 45;
	 tom.name = "Tom Sawyer";
	 tom.haircolor = "black";
	 tom.heightinInches = 72;
	 
	 tom.speak();*/
	 
	 Human Joe;
/*	 
	 Joe = new Human();
	 Joe.age = 78;
	 Joe.haircolor = "Brown";
	 Joe.heightinInches = 68;
	 Joe.name = "Joe Biden, I am the president of the United States. ";
	 Joe.speak();  */
 }
}
