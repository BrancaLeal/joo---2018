package main;

		import java.io.InputStream;
		import java.util.Random;
		import java.util.Scanner;

		public class ParImpar {
			
		    public static void main (String [] args) throws InterruptedException {

		        // Primeiro preparo para receber o input do teclado

				InputStream entradaTeclado = System.in;
				Scanner respostaUsuario = new Scanner(entradaTeclado);

		        //Segundo declaro as variáveis necessárias para o jogo

				int numeroMaquina = 0;
				int numeroUsuario = 0;
				String escolhaUsuario = "";

		        System.out.println("Olá! Vamos jogar par ou impar?");

		        // Resposta "Sim"

				if (respostaUsuario.hasNext("Sim")) {

					System.out.println("Maravilha! Vamos iniciar o jogo!");

		            // O comando seguinte é apenas para recuper e limpar o conteúdo da resposta do usuário, pois já sabemos o que precisamos
					respostaUsuario.nextLine();

		            {System.out.println("Ecolhe PAR ou IMPAR?");}

		            // agora preciso guardar esta reposta em uma variável, porque preciso saber se ele escolheu PAR ou IMPAR mais tarde

		            escolhaUsuario =  respostaUsuario.nextLine();

		            // para verificar se, independente de maiúsculas e minúsculas chamo o método "equalsIgnoreCase"
					// FIXME - Notem que aqui eu n�o verifico se o usu�rio escreveu qualquer outra coisa!

		            if (escolhaUsuario.equalsIgnoreCase("par")) {
						System.out.println("IMPAR");
					} else {
						System.out.println("PAR");
					}

					System.out.println("Escolha um numero");

		        	if (respostaUsuario.hasNextInt()) {

						numeroUsuario = respostaUsuario.nextInt();
						System.out.println("Você escolheu: " + numeroUsuario);
						System.out.println("Vou escolher o meu...");

		                Random rand = new Random();
						numeroMaquina = rand.nextInt(99999);

						//Este comando é para aguardar que o processamento espere 1 segundo (1000 = milisegundos)
						Thread.sleep(1000);

						System.out.println("Ok! Escolhi o " + numeroMaquina);

						if ((numeroUsuario + numeroMaquina) % 2 == 0 && escolhaUsuario.equalsIgnoreCase("PAR")) {
							System.out.println("Você venceu!");
						} else if ((numeroUsuario + numeroMaquina) % 2 != 0 && escolhaUsuario.equalsIgnoreCase("IMPAR")) {
							System.out.println("Você venceu!");
		                } else {
		                	System.out.println("Venci, logo você perdeu!");
		                }
	                } else {
	                	System.out.println("Você não sabe brincar...");
	                }
		        } else {
		                System.out.println("Que pena!");
				}

				respostaUsuario.close();

			}
		}
