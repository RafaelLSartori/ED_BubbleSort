package view;

import javax.swing.JOptionPane;

import br.edu.fateczl.bubble.BubbleSort;

public class Principal {

	public static void main(String[] args) {
		BubbleSort m = new BubbleSort();
		int opc = 0;
		int[] vet;
		while(opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Digite qual exercício deseja ordernar usando BubbleSort 1, 2 ou 3: "));
			switch(opc) {
				case 1: int[] vet1 = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
				m.bubbleSort(vet1);
					break;
				case 2:	int[] vet2 = {44, 43, 42, 41, 40, 39, 38};
				m.bubbleSort(vet2);
					break;
				case 3: int[] vet3 = {101, 102, 103, 125, 124, 123, 104, 105, 106, 122};
				m.bubbleSort(vet3);
					break;
				case 9: JOptionPane.showMessageDialog(null, "FIM!");
					break;
				default: JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA!");	
			}
		}		
	}
}
