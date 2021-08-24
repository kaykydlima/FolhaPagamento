package empresafuncionario;

import java.util.Scanner;

public class EmpresaFuncionario {

    public static void main(String[] args) {
        // folha de pagamento de uma empresa
        Scanner leia = new Scanner(System.in);
        
        double s1, s2, s3, s4, s5, mSalario, tFolha;
        
        System.out.println("Digite o primeiro salário: ");
        s1 = leia.nextDouble();
        System.out.println("Digite o segundo salário: ");
        s2 = leia.nextDouble();
        System.out.println("Digite o terceiro salário: ");
        s3 = leia.nextDouble();
        System.out.println("Digite o quarto salário: ");
        s4 = leia.nextDouble();
        System.out.println("Digite o quinto salário: ");
        s5 = leia.nextDouble();
        tFolha = s1 + s2 + s3 + s4 + s5;
        System.out.println("O total da folha de pagamento é: " + tFolha);
        mSalario = (s1 + s2 + s3 + s4 + s5) / 5;
        System.out.println("A média salárial é: " + mSalario);
    }
    
}
