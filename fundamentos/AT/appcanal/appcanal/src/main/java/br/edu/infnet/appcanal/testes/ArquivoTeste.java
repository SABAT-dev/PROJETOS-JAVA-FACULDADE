package br.edu.infnet.appcanal.testes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.appcanal.domain.Cliente;
import br.edu.infnet.appcanal.domain.Esporte;
import br.edu.infnet.appcanal.domain.Filme;
import br.edu.infnet.appcanal.domain.Plano;
import br.edu.infnet.appcanal.domain.Serie;
import br.edu.infnet.appcanal.domain.Servico;

public class ArquivoTeste {
	public static void main(String[] args) {
			
			String dir = "D:/HD/INFNET/BLOCO JAVA/fundamentos/AT/";
			String arq = "planos.txt";
			
			try {
				
				try {
					FileReader file = new FileReader(dir + arq);				
					BufferedReader leitura = new BufferedReader(file);
					
					FileWriter fileW = new FileWriter(dir + "out_" + arq);
					BufferedWriter escrita = new BufferedWriter(fileW);
					
					String linha = null;
					String[] campos;
					
					linha = leitura.readLine();
					
					List<Servico> servicos = new ArrayList<Servico>();
					Plano plano = new Plano();
					
					while(linha != null) {
						
						campos = linha.split(";");
						
						if(campos.length == 4) {						
							Cliente cliente = new Cliente(
									campos[1],
									Boolean.valueOf(campos[2]),
									Integer.valueOf(campos[3]));
									
							plano.setCliente(cliente);
							plano.setDuracaoPlano(campos[0]);
						} else {
							
							switch (campos[0]) {
							case "Filme":
								Filme infinito = new Filme(
										campos[1],
										campos[2],
										Double.valueOf(campos[3])
										);
								try {
									infinito.setCategoria(campos[4]);
									infinito.setTaxaAdesaoFilme(Double.valueOf(campos[5]));
									infinito.setOscar(Boolean.valueOf(campos[6]));
									
									servicos.add(infinito);
	
								} catch (Exception e) {
									System.out.println(e.getMessage());		
								}
								
	
								break;
	
							case "Serie":
								Serie whatIf = new Serie(
										campos[1],
										campos[2],
										Double.valueOf(campos[3])
										);
								
								try {
									whatIf.setGenero(campos[4]);
									whatIf.setTaxaAdesaoSerie(Double.valueOf(campos[5]));
									whatIf.setLancamento(Boolean.valueOf(campos[6]));
									
									servicos.add(whatIf);
	
								} catch (Exception e) {
									System.out.println(e.getMessage());
								}
								
								break;
	
							case "Esporte":
								Esporte futebol = new Esporte(
										campos[1],
										campos[2],
										Double.valueOf(campos[3])
										);
								try {
									futebol.setTime(campos[4]);
									futebol.setTaxaAdesaoEsporte(Double.valueOf(campos[5]));
									futebol.setPremiado(Boolean.valueOf(campos[6]));
									
									servicos.add(futebol);
									
								} catch (Exception e) {
									System.out.println(e.getMessage());
								}
								
								futebol.setTime(null);
								break;
								
							default:
								System.out.println("Plano sem tipo!!!");
								break;
							}
						}					
	
						linha = leitura.readLine();
					}
					
					plano.setServicos(servicos);
					
					for(Servico sv : plano.getServicos()) {
						escrita.write(
								plano.getDuracaoPlano()+";"+
								plano.getCliente().getNome()+";"+
								sv.getCanal()+";"+
								sv.calcularPreco()+"\r\n");
						System.out.println(sv);
					}	
	
					leitura.close();
					file.close();
					
					escrita.close();
					fileW.close();
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
				
			} finally {
				System.out.println("Processamento realizado!!!");
			}
		}
}