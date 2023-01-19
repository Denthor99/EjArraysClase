import java.util.Arrays;
public class ImpimirArrayMain {
    public static void main(String[] args) {
        int [] a= {2,4,6,8,10};
        System.out.println(Arrays.toString(a));
        arrayEntreLlaves(a);

    }
    static void arrayEntreLlaves (int []a){
        System.out.print("{");
        for (int i=0;i<a.length;i++){
            if (a[i]!=a.length){
                System.out.print(a[i]);
                System.out.print(", ");
            }
        }
        System.out.print("}");
    }

}
