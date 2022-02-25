//Gabriela Ayumi Endo Gondo

package ordenacaovetor;


public class OrdenacaoVetor {
    
    //Verifica o menor elemento do vetor e troca-o de posição com o elemento inicial
    public static void selectionSort(int[] vetor){
        int menor;
        int imenor;
        int aux;
        
        for(int i = 0; i < vetor.length; i++){
            menor = vetor[i];
            imenor = i;

            //Captura o menor elemento do vetor e seu indice
            for(int j = i+1; j < vetor.length; j++){
                if(vetor[j] < menor){
                    menor = vetor[j];
                    imenor = j;
                }
            }
            
            //Realiza a troca de posicoes
            aux = vetor[i];
            vetor[i] = menor;
            vetor[imenor] = aux;
            //imprime(vetor);
        }
    }
    
    //Força a implementacao do BubbleSort comecando pelos indices 0 e 1
    public static int[] bubbleSort(int[] vetor){
        return bubbleSort(vetor, vetor.length);
    }
    
    //Na recursao, variáveis de controle são passadas como parametro
    //Troca a posicao do elemento inicial com qualquer elemento menor subsequente
    private static int[] bubbleSort(int[] vetor, int cont){
        int aux;
        
        if(cont <= 1){
            return vetor;
        } else {
            for(int i = 0; i < vetor.length-1; i++){
                if(vetor[i+1] < vetor[i]){
                    aux = vetor[i+1];
                    vetor[i+1] = vetor[i];
                    vetor[i] = aux;
                    //imprime(vetor);
                }
            }
            
            return bubbleSort(vetor, cont-1);
        }
    }
    
    public static void imprime(int[] vetor){
        for(int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {
       int[] vetor = {3,6,8,1,4,9,0};
       System.out.print("Vetor não ordenado: ");
       imprime(vetor);
       
       bubbleSort(vetor);
       System.out.print("Vetor ordenado (BubbleSort): ");
       imprime(vetor);
       
       selectionSort(vetor);
       System.out.print("Vetor ordenado (SelectionSort): ");
       imprime(vetor);
       
       
    }

}
