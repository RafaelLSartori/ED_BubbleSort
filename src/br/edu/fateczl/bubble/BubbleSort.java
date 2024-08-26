package br.edu.fateczl.bubble;

public class BubbleSort {
	public BubbleSort() {
		super();
	}
	
    public void bubbleSort(int[] vet){
        int tamanho = vet.length;
        for (int i = 0; i < (tamanho -1); i++ ){
        	System.out.println("Rodada" + i + " ");
            for (int j = (i+1); j < tamanho; j++){
                if (vet[i] > vet[j]){
                    int aux = vet[i];
                    vet[i] = vet[j];
                    vet[j] = aux;
                }
            }
        }
        for (int i = 0; i < vet.length; i++){
			System.out.print(vet[i] + " ");
		}
    }
}
