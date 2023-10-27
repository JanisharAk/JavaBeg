package ContinueStatement;

public class Continue {
    public static void main(String[] args) {

        //using for loop
        for(int i=1;i<=5;i++){
            if(i==3){
                //breaking the loop
                continue;
            }
            System.out.println(i);
            //OUTPUT : 1 2 4 5
        }
    }
}
