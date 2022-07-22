package DadosAlunos;

import java.util.Scanner;

public class Sala {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner entradaDados = new Scanner(System.in);
       Aluno aluno = new Aluno();
       
       System.out.println("Digite o Nome do Aluno");
       aluno.setNome(entradaDados.nextLine());
       
       System.out.println("Digite o Sobrenome do Aluno");
       aluno.setSobrenome(entradaDados.nextLine());
	
       System.out.println("Digite o Nome do Pai do Aluno");
       aluno.setNomePai(entradaDados.nextLine());
       
       System.out.println("Digite o Nome da Mae do Aluno");
       aluno.setNomeMae(entradaDados.nextLine());
       
       System.out.println("Digite o Nota da Unidade 1 do Aluno");
       aluno.setNotaUni1(entradaDados.nextDouble());
       
       System.out.println("Digite o Nota da Unidade 2 do Aluno");
       aluno.setNotaUni2(entradaDados.nextDouble());
       
       
  
	}

}
