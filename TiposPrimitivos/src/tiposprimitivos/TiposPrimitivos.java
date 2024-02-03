package tiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivos {
    
    public static void main(String[] args) {
        String nome = "Mateus";
        float nota = 8.5f;
        System.out.printf("A nota de %s é %.1f \n", nome, nota); 
        System.out.format("A nota de %s é %.1f \n", nome, nota); 
        //(\n) Quebra de linha 
        //(...printf("...%f",nota)) formatação 
        //(%.2f) formatação com duas casas decimais
        //(%s) E identico ao print(f"o {nome} tirou {nota}") em python
        
        //Para colocar dados e necessario import java.util.Scanner;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome1 = teclado.nextLine();
        System.out.printf("Digite a nota do aluno %s: ", nome1);
        float nota1 = teclado.nextFloat();
        System.out.printf("A nota de %s é %.1f \n", nome1, nota1); 
    }
}
