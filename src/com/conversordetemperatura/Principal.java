package com.conversordetemperatura;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Usuario usuario = new Usuario();
		
	    String conversao;
		
		// Array
		Object[] opcoes = {"Converter Celcius", "Converter Fahrenheit", "Converter Kelvin", "Sair"};
		Object opcao;
		
		//Loop
		do {
			
		    opcao = JOptionPane.showInputDialog(null,"Escolha o que deseja fazer:" ,"Conversor",JOptionPane.INFORMATION_MESSAGE,null,opcoes, opcoes[0]);
			if(opcao == "Converter Celcius") {
				Object [] opcoees = {"Celcius para Kelvin", "Celcius para Fahrenheit", "Voltar"};
				Object opcaao;
				do {
					opcaao = JOptionPane.showInputDialog(null,"Escolha o que deseja fazer:" ,"Conversor",JOptionPane.INFORMATION_MESSAGE,null,opcoees, opcoees [0]);
					if(opcaao == "Celcius para Kelvin") {
						conversao = JOptionPane.showInputDialog("Informe o valor a ser convertido:");
						conversao = conversao.replace(",", ".");
						JOptionPane.showMessageDialog(null,"K: " + usuario.celciusparakelvin(Double.parseDouble(conversao)));
						
					}
					
					else if(opcaao == "Celcius para Fahrenheit") {
						conversao = JOptionPane.showInputDialog("Informe o valor a ser convertido:");
						conversao = conversao.replace(",", ".");
						JOptionPane.showMessageDialog(null,"°F: " + usuario.celciusparafahrenheit(Double.parseDouble(conversao)));
						
					}
					else {
					}
						
				}while(opcaao != "Voltar");
			}
			else if(opcao == "Converter Fahrenheit") {
				Object [] opcoees = {"Fahrenheit para Kelvin", "Fahrenheit para celcius", "Voltar"};
				Object opcaao;
				do {
					opcaao = JOptionPane.showInputDialog(null,"Escolha o que deseja fazer:" ,"Conversor",JOptionPane.INFORMATION_MESSAGE,null,opcoees, opcoees[0]);
					if(opcaao == "Fahrenheit para Kelvin") {
						conversao = JOptionPane.showInputDialog("Informe o valor a ser convertido:");
						conversao = conversao.replace(",", ".");
						JOptionPane.showMessageDialog(null,"K: " + usuario.fahrenheitparakelvin(Double.parseDouble(conversao)));
						
					}
					
					else if(opcaao == "Fahrenheit para celcius") {
						conversao = JOptionPane.showInputDialog("Informe o valor a ser convertido:");
						conversao = conversao.replace(",", ".");
						JOptionPane.showMessageDialog(null," °C: " + usuario.fahrenheitparacelcius(Double.parseDouble(conversao)));
						
					}
					else {
					}
				}while(opcaao != "Voltar");
			}	
			else if(opcao == "Converter Kelvin") {
				Object [] opcooes = {"Kelvin para Fahrenheit", "Kelvin para Celcius", "Voltar"};
				Object opcaoo;
				do {
					opcaoo = JOptionPane.showInputDialog(null,"Escolha o que deseja fazer:" ,"Conversor",JOptionPane.INFORMATION_MESSAGE,null,opcooes, opcooes[0]);
					if(opcaoo == "Kelvin para Fahrenheit") {
						conversao = JOptionPane.showInputDialog("Informe o valor a ser convertido:");
						conversao = conversao.replace(",", ".");
						JOptionPane.showMessageDialog(null,"°F: " + usuario.kelvinparafahrenheit(Double.parseDouble(conversao)));
						
					}
					
					else if(opcaoo == "Kelvin para Celcius") {
						conversao = JOptionPane.showInputDialog("Informe o valor a ser convertido:");
						conversao = conversao.replace(",", ".");
						JOptionPane.showMessageDialog(null,"°C: " + usuario.kelvinparacelcius(Double.parseDouble(conversao)));
						
					}
					else {
					}
			    }while(opcaoo != "Voltar");
				
			}
			else
				JOptionPane.showMessageDialog(null, "Fim do programa!");
		
		} while(opcao != "Sair");

	}

}
