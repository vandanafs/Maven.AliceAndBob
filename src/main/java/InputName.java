import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class InputName {

    public static void main(String[] args ){
        InputName name=new InputName();

        name.getName();
    }

    String getName(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your name");
        String name=scan.next();
        if(name.equalsIgnoreCase("Alice")|| name.equalsIgnoreCase("Bob")){
            System.out.println("Hi " +name);
        }else{
            System.out.println("Hi "+name);
        }
      return name;
    }
}
