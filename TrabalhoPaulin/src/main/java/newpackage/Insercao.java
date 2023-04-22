
package newpackage;

public class Insercao {

    
    static double tempoexInsercao;
    public static void Insercao(int[] v) {
        long inicio =System.currentTimeMillis();
        for (int i = 1; i < v.length; i++) {
            int chave = v[i];
            int j = i - 1;
            while (j >= 0 && v[j] > chave) {
                v[j+1] = v[j];
                j--;
            }
            v[j+1] = chave;
             long fim =System.currentTimeMillis();
             long tempoexecucao = fim-inicio;
             tempoexInsercao = tempoexecucao;
        }
    
   }   

    public static double getTempoexInsercao() {
        return tempoexInsercao;
    }
   


}
