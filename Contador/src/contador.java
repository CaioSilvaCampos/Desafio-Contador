import java.util.Scanner;

public class contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
        try {
			contar(parametroUm, parametroDois);
		}catch (ParametrosInvalidosException e) {
			System.out.println("O 2 parametro deve ser maior que o primeiro");
		}
        
        
    }
    static void contar(int num1, int num2) throws ParametrosInvalidosException {
        if(num1 > num2) {
            throw new ParametrosInvalidosException();
        } 
        
        int contagem = num2 - num1;
        for(int i = 0; i<=contagem;i++) {
            System.out.println("Imprimindo o numéro " + i);
        }
    }
}
