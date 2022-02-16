import javax.swing.*;

public class Inheritance extends staffs{
    static String name;
    static String Regno;
    static staff mystaff=new staff();

    public static void main(String[]args){
        staffname="james";
        getDatas();
        displays();
        mystaff.getData();
        mystaff.display();

    }
    static void getDatas(){
        name= JOptionPane.showInputDialog(name);
        Regno=JOptionPane.showInputDialog(Regno);
    }
    static void displays(){
        JOptionPane.showMessageDialog(null,name);
        JOptionPane.showMessageDialog(null,Regno);
    }
}
class staffs{
    static String staffname;
    static String staffno;
    staffs(){

    }

    public void getData(){
        staffname= JOptionPane.showInputDialog(staffname);
        staffno=JOptionPane.showInputDialog(staffno);
    }
    public void display(){
        JOptionPane.showMessageDialog(null,staffname);
        JOptionPane.showMessageDialog(null,staffno);
    }
}
