import java.util.Scanner;

public class Vetor implements IOperaVetor{
	
	public static int recebeIndex (int index) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe a posicao que deseja adicionar: ");
		index = teclado.nextInt();

		return index;
	}
	
	public static int binarySearch(int[]vetor) {
		Scanner teclado = new Scanner(System.in);
		int busca;
		
		System.out.println("Informe o elemento de busca: ");
		busca = teclado.nextInt();
		
		
		int mid = 0;
		int left = 0, right = vetor.length;
		
		while (left <= right) {
			mid = (left + right)/2;
			
			if (busca == vetor[mid]) {
				return (mid);
			}
			else if (busca < vetor[mid]) {
				right = mid-1;
			} else {
				left = mid+1;
			}
		}
		return -1;
	}

	public static int remove (int index) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe a posicao que deseja remover: ");
		index = teclado.nextInt();

		return index;
	}
	
	//↓↓↓↓↓  MAIN ↓↓↓↓↓↓
	
	public static void main(String[] args) {
		
		int vet[]= new int[6];
		Vetor v = new Vetor();
		int cont = 0;
		int elementosLivres = 0; 
		int index = 0;

		//^^^^^^^^^^^^^^^^^^^^^ VARIAVEIS ^^^^^^^^^^^^^^^^^^^^^
		
		v.insere_final(vet, cont);
		cont++; 
		elementosLivres = vet.length - cont;
		
		v.insere_final(vet, cont);
		cont++;
		elementosLivres = vet.length - cont;
		
		v.insere_final(vet, cont);
		cont++;
		elementosLivres = vet.length - cont;
		
		v.insere_final(vet, cont);
		cont++;
		elementosLivres = vet.length - cont;
		
		v.insere_final(vet, cont);
		cont++;
		elementosLivres = vet.length - cont;
		
		
		index = recebeIndex(index);
		elementosLivres -= 1;
		cont +=  1;
		v.insere_posicao(vet, index);
		
		v.buscar_elemento(vet);

		
		index = remove(index);
		v.remover_elemento(vet, index);
		cont--;
		elementosLivres = vet.length - cont;
		
		v.informa_elementos(vet, elementosLivres);
		
		v.verificar_contem(vet);
		
		//========================= PRINT DO VETOR =========================
		
		for (int i = 0; i < cont; i++) {
			System.out.println("elemento ["+i+"]: " + vet[i]);
		}
	}
	
	
	Scanner teclado = new Scanner(System.in);
	
	@Override
	public void informa_elementos(int[] vetor, int elementosLivres) {
		System.out.println("O numero de elementos que podem ser armazenados no vetor: "+vetor.length);
		
		System.out.println("O numero de elementos livres e: "+elementosLivres);
	}

	@Override
	public void insere_final(int[] vetor, int cont) {
		// TODO Auto-generated method stub
		
		System.out.println("Informe um valor para inserir: ");
		vetor[cont] = teclado.nextInt(); 	
	}

	@Override
	public void insere_posicao(int[]vetor, int index) {
		// TODO Auto-generated method stub
		
		System.out.println("Informe o valor: ");
		vetor[index] = teclado.nextInt();
	}

	@Override
	public void buscar_elemento(int[] vetor) {
		// TODO Auto-generated method stub
		int elementoEncontrado = 0;
		
		elementoEncontrado = binarySearch(vetor);
		
		
		System.out.println("valor encontrado no indice["+elementoEncontrado+"]");
	}

	@Override
	public void remover_elemento(int[]vetor, int index) {
		
		vetor[index] = 0;
		
	}

	@Override
	public void verificar_contem(int[] vetor) {
		// TODO Auto-generated method stub
		int verif = 0;
		
		System.out.println("Informe a posicao que deseja verificar: ");
		verif = teclado.nextInt(); 	
		
		if (vetor[verif] == 0) {
			System.out.println("posicao vazia.");
		} else {
			System.out.println("posicao["+verif+"] = "+ vetor[verif]);
		}
	}
}
