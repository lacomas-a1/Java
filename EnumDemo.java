// An enum is a type that has a fixed list of possible values, which is specified when the enum
// is created. 
public class EnumDemo {
    //Define two enums types -- remember that the defination
    //go OUTSIDE The main () routine
    enum Day {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}
    enum Month {JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC}

    public static void main( String[] args){
        Day tgif; //Declare a variable of type Day.
        Month libra; //Declare a variable of type Month.

        tgif = Day.FRIDAY; //Assigh a value of type Day to tgif
        libra = Month.OCT; //Assigh a value of type Month to libra.

        System.out.print("My sigh is libra, since I was born in: ");
        System.out.println(libra); //Output value will be OCT
        System.out.print("That's the: ");
        System.out.print(libra.ordinal());
        System.out.println("-th month of the year.");
        System.out.println(" ( Counting from 0, of course!)");

        System.out.print("Isn't it nice to get to ");
        System.out.println(tgif); //Output value will be : FRIDAY.
        System.out.println(tgif + "is the " +tgif.ordinal() + "-th day of the week.");
        //You can concatenate enum values onto Strings!
    }
}
