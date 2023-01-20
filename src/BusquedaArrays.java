public class BusquedaArrays {
    public static void main(String[] args) {
        // La clase Arrays tiene metodos de busqueda
        /**Creamos un metodo que reciba un numero y un array y devuelva la posición donde se ha encontrado
         el número o -1 si no lo ha encontrado*/
        int num=102;
        int[]nArray={8,9,8,5,4,23,21,5,-1,54,9,45,102,1,0};
        System.out.println(busquedaEjer1(3,nArray));

    }
    public static int busquedaEjer1(int a, int[]b){
        int resul=0;
        for (int i=0;i<b.length;i++){
            if (a==i){
                resul=i;
                break;
            }else if (a!=i){
                resul=-1;
                break;
            }
        }
        return resul;
    }
}
