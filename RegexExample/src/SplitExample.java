import java.util.Arrays;

public class SplitExample {
    public static void main(String[] args) {
        String names="ram,shyam,sita,gita";
        String[] split = names.split(",");
        Arrays.sort(split);
        SplitExample splitExample=new SplitExample();
        SplitExample splitExample2=new SplitExample();
        System.out.println(splitExample.hashCode());
        System.out.println(splitExample2.hashCode());



        System.out.println(names);
    }
}
