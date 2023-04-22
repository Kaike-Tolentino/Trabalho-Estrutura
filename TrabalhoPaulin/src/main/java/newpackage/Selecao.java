
package newpackage;

public class Selecao {
     int v[];
    static double tempoexSelecao;
    public static void Selecao(int[] v) {
        long inicio =System.currentTimeMillis();
       
        for(int i = 0;i<v.length-1; i++){
            int posMenor = i;
            
            for(int j = i+1;j<v.length;j++){
                if(v[j]<v[posMenor]){
                    posMenor = j;
                }  
            }
            if(posMenor!=i){
                int aux = v[i];
                v[i]= v[posMenor];
                v[posMenor] = aux;
                
            }
        }
        long fim =System.currentTimeMillis();
        long tempoexecucao = fim-inicio;
        tempoexSelecao = tempoexecucao;
    }

    public static double getTempoexSelecao() {
        return tempoexSelecao;
    }
}
