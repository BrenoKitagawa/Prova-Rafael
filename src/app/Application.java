package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Application {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat formate = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		int id = 1;
		char continuar;
		
		do {
			System.out.println("Lista de pessoas");
			System.out.println("-----------------------");
			System.out.println("Escolha as opções a baixo");
			System.out.println("1-Cadastrar nova pessoa ");
			System.out.println("2-Listar todas as pessoas ");
			System.out.println("3-buscar telefone de uma pessoa ");
			System.out.println("4-Editar telefone de uma pessoa");
			System.out.println("5-Sair do sistema ");
			System.out.println("-----------------------");
			
			int opcao=sc.nextInt();
				switch(opcao) {
					case 1:{
						sc.nextLine();
							System.out.println("Digite o nome da pessoa ");
						String name= sc.nextLine();
						System.out.println("Digite a data de nascimento ");
						Date data=formate.parse(sc.nextLine());
						System.out.println("Digite o sexo ");
						String sexo=sc.nextLine();
						System.out.println("Digite o nome da mae ");
						String mae=sc.nextLine();
						System.out.println("Digite o nome do pai ");
						String pai=sc.nextLine();
						System.out.println("Digite o endeço ");
						String endereco=sc.nextLine();
						System.out.println("Digite o email ");
						String email=sc.nextLine();
						System.out.println("Digite o telefone ");
						String telefone=sc.nextLine();
						System.out.println("ult da Foto...");
						String foto=sc.nextLine();
						
						Pessoa novaPessoa = new Pessoa(id,name,data,sexo,mae,pai,endereco,email,telefone,foto);
						
						
						pessoas.add(novaPessoa);
						System.out.println("Pessoa adicionada com sucesso");
						id= id+1;
						
						
						
					}
						
						break;
					case 2:{
						System.out.println("Lista de pessoas");
						
						
						if(pessoas.isEmpty()) {
							System.out.println("Lista está vazia no momento");
						}
						
						for(Pessoa pe : pessoas) {
							System.out.println("id: " + pe.pes_id);
							System.out.println("nome: "+pe.pes_nome);
							System.out.println("data de nascimento: " +pe.pes_data_nascimento);
							System.out.println("telefone: " +pe.getTelefone());
							
						}
					}
						break;
					case 3:{
						sc.nextLine();
						System.out.println("Digite o telefone da pessoa que gostaria de pesquisar");
						String procurar = sc.nextLine();
						
						
						for(int i = 0 ; i < pessoas.size(); i++) {
							if(pessoas.get(i).getTelefone().contains(procurar)) {
								System.out.println("Pessoa encontrada");
								System.out.println("nome:"+pessoas.get(i).pes_nome);
								System.out.println("Telefone:"+pessoas.get(i).getTelefone());
								break;
							}
				
						}
					}
						break;
					case 4:{
						System.out.println("Digite o id da pessoa que gostaria de editar");
						int procurar = sc.nextInt();
						for(int i = 0 ; i < pessoas.size(); i++) {
							if(pessoas.get(i).pes_id == procurar) {
								System.out.println("Pessoa encontrada");
								
								System.out.println("nome:"+pessoas.get(i).pes_nome);
								System.out.println("Telefone:"+pessoas.get(i).getTelefone());
								
								System.out.println("Digite o novo numero de telefone dessa pessoa");
								sc.nextLine();
								String newTelefone = sc.nextLine();
								
								pessoas.get(i).setTelefone(newTelefone);
								System.out.println("nome:"+pessoas.get(i).pes_nome);
								System.out.println("Telefone atualizado:"+pessoas.get(i).getTelefone());
								break;
							}
				
						}
						
					}
						break;
					default:
						System.out.println("Saindo do sistema..");
						break;
					
				}
				if(opcao!=5) {
					
					System.out.println("Deseja continuar no sistema ??(Y/N)");
				}
				
				
			
			
			
			
			
			continuar = sc.next().charAt(0);
		}while(continuar == 'y' || continuar == 'Y');
		
		sc.close();
	
		
		

	}
	

}
