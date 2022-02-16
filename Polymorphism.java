import javax.swing.*;

public class Polymorphism {
    public static void main(String[]args){

}
class triangle{
    Double length;
    Double height;
    Double result;

    void area(){
        result=(length*height);
    }

}
class rectangle{
    Double length;
    Double width;
    Double result;

    void area(){
        result=(length*width);
    }
}

}
class cylinder{
    Double radius;
    Double pie;
    Double height;
    Double result;

    void area(){
        result=pie*(2*radius*radius + 2*radius*height);
    }
}



//using the same method to perform different methods
