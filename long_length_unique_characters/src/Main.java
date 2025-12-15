import java.util.HashSet;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String s= "abcanffndnsfilfk;mwelchhfnchnkdmklfj";
        Set set1=new HashSet();
        int max_length= 0;
        int count_value = 0;

        for(int j=0;j<s.length();j++){
            for (int i = 0; i <= s.length(); i++){
                if(set1.contains(s.charAt(0))){
                    if(max_length < count_value) {
                        max_length =count_value;
                        count_value=0;
                        set1.clear();
                    }
                }
                else{

                    count_value++;
                }
            }
        }
        System.out.println("max length is "+max_length);



    }
}