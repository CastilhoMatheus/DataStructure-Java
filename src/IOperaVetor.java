
public interface IOperaVetor {
	
	void informa_elementos(int[] vetor, int elementosLivres);//numero de elementos armazenados
	
	void insere_final(int[] vetor, int cont);//insere elemento ao final do vetor
	
	void insere_posicao(int[]vetor, int index);//insere elemento em determinada posi��o
	
	void buscar_elemento(int[]vetor);//retorna o elemento em uma dada posi��o
	
	void remover_elemento(int[]vetor, int index);//remover o elemento em uma dada posi��o
	
	void verificar_contem(int[] vetor);//verificar se um elemento informado est� armazenado no vetor
	
}
