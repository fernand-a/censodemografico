package CensoDemografico;

import java.util.Scanner;

public class CensoDemografico {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		//declarando variaveis
		int feminino = 0, masculino = 0, outros = 0, g;
		float num, altura = 0, alturafem = 0, alturamasc = 0, alturaout = 0, porcentagem = 0, idadefem = 0, idademasc = 0, idadeout = 0,
				idade = 0, idadenum = 0, midade, mafeminino, mimasculino;
				
		//repeticao
		for (num = 0; num <= 999; num++) {
		    
			//exibicao de texto
			System.out.println(
					"responda a pesquisa\ngenero:\n0-feminino\n1-masculino\n2-outros");
					
			//atribuicao de valor
			g = leia.nextInt();
			
			//armazenando dados
			switch (grupo) {
			case 0:
				feminino++;
				System.out.println("altura");
				altura = leia.nextFloat();
				alturafem = alturafem + altura;
				System.out.println("idade");
				idade = leia.nextFloat();
				idadefem = idadefem + idade;
				if (idade >= 18 && idade <= 35)
					idadenum++;
				break;
			case 1:
				masculino++;
				System.out.println(altura");
				altura = leia.nextFloat();
				alturamasc = alturamasc + altura;
				System.out.println("idade");
				idade = leia.nextFloat();
				idademasc = idademasc + idade;
				if (idade >= 18 && idade <= 35)
					idadenum++;

				break;
			case 2:
				outros++;
				System.out.println("altura");
				altura = leia.nextFloat();
				alturaout = alturaout + altura;
				System.out.println("idade");
				idade = leia.nextFloat();
				idadeoutros = idadeoutros + idade;
				if (idade >= 18 && idade <= 35)
					idadenum++;
				break;
			}

		}
		//declaracao variaveis matematicas
		midade = (idadefem + idademasc + idadeout) / (feminino + masculino + outros);
		mafeminino = alturafem / fem;
		mimasculino = idademasc / masc;
		porcentagem = idadenum / (feminino + masculino + outros);
		
		//exibicao de texto
		System.out.println("media de idade " + midade);
		System.out.println("\nmedia altura mulheres " + mafeminimo);
		System.out.println("\nmedia idade homens " + mimasculino);
		System.out.println("\noutros " + outros);
		System.out.println("\npercentual de pessoas com idade entre 18 e 35 anos " + (porcentagem * 100) + "%");

	}

}
