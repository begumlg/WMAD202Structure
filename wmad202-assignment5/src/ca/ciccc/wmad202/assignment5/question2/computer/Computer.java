package ca.ciccc.wmad202.assignment5.question2.computer;
import java.util.HashMap;
public class Computer {
    private String user;
    private HashMap<ComputerProgram,String> users;

    public Computer(String user){
        this.user=user;
        this.users=new HashMap<>();

    }
    public void getComputerInfo(){
        for(ComputerProgram c: this.users.keySet()){
            System.out.println(c.getCodes() + ": "+ c);
        }
    }
}
