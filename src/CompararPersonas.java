public class CompararPersonas {
    public static void main(String[] args) {
        PersonaArray a=new PersonaArray();
        a.nombre="a";
        PersonaArray b=new PersonaArray();
        b.nombre="b";

        System.out.println(a==b);
        System.out.println(a.equals(b));
    }
}
