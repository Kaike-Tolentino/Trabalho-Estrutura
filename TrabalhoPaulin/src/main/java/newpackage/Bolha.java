
package newpackage;

public class Bolha {
     int []vetor;
    static double tempoexBolha;
    public static void Bolha(int[] v) {
        boolean troca = true;
            long inicio =System.currentTimeMillis();
            
            while(troca){
                troca = false;
                for(int i =0; i < v.length-1 ; i++){
                    if(v[i]>v[i+1]){
                        int aux = v[i];
                        v[i] = v[i+1];
                        v[i+1] = aux;
                        troca = true;
                    }
                }
            }
            long fim =System.currentTimeMillis();
            long tempoexecucao = fim-inicio;
            tempoexBolha = tempoexecucao;
            
           
    }

    public static double getTempoexBolha() {
        return tempoexBolha;
    }
}
