import Java_basic.MyUtils;

public class methodVisibility {

	public static void main(String[] args) {
//		MyUtils.??  					Here you could not call the AtractNumber() from MyUtils because we removed the "static" part.  
		 MyUtils myVar;
		 myVar = new MyUtils();
		 myVar.AtractNumbers(2, 15); //Notice that when we create the String
		 							// MyUtils myvar;  we could use it to call atractNumbers and enter the int(2) and (15)
	}

}

