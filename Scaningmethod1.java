import java.util.*;//(astrick) is used to import all the packages
public class Scaningmethod1 {
    //nextLine method of integer data types
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);//creating an object instance
        System.out.println("enter an integer");
        int data = input.nextInt();// for integer data type
        System.out.println("using nextInt():" + data);
        input.close();//close the scanner
    }
}
//nextLine() method is used for strings
//nextBoolean()
//nextbyte()
//nextfloat()
//nextLong()
//nextShort()
//nextDouble()
