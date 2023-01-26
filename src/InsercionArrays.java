public class InsercionArrays {
    public static void main(String[] args) {
        // Insercion manual
        int[]a={7,1,5,2};
        inserta2(a,9,2);
    }
    static int[] inserta(int[] in, int e, int pos){
        int[]out=new int[in.length+1];
        for (int i = 0; i < out.length; i++) {
            if (out[i]<=in[pos]) {
                out[i] = in[i];
            } else if (out[i]==in[pos]) {
                out[pos]=in[i+1];
                out[pos]=e;
            }
        }
        return out;
    }

    static int[] inserta2(int[] in, int e, int pos){
        int[]out=new int[in.length+1];
        for (int i = 0; i < pos; i++) {
            out[i]=in[i];
        }
        out[pos]=e;
        for (int i = pos+1; i < out.length; i++) {
            out[i]=in[i];
        }
    return out;
    }
}
