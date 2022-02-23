public class Constructor {
    int x; //creates a class attribute
    //class constructor for main class
    public Constructor(){
        x=5; //sets the initial value for the class attribute x  
    }
    public static void main (String[]args){
        Constructor myObj = new Constructor(); //create an object class(call constructor)
        System.out.println(myObj.x); //print value of x 
    }
}
