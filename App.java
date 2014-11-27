import java.util.*; //Scanner
public class App
{
    void executa(){
        Scanner ms = new Scanner(System.in);
        int escolha;
        ArrayList<Respondente> listaResp = new ArrayList<Respondente>();
        ArrayList<Jogo> listaJogos = new ArrayList<Jogo>();
        ArrayList<String> perg1 = new ArrayList<String>();
        ArrayList<Integer> perg2 = new ArrayList<Integer>(); 
        ArrayList<Integer> perg3 = new ArrayList<Integer>();
        ArrayList<Integer> perg4 = new ArrayList<Integer>();
        ArrayList<Integer> perg5 = new ArrayList<Integer>();
        ArrayList<String> perg6 = new ArrayList<String>();
        
        String resposta1, resposta6;
        int resposta2, resposta3, resposta4, resposta5; 
        do{
        System.out.println("\fBem-Vindo ao Sistema MatematiC@ndo: \n 1: Cadastro Respondente["+ listaResp.size()+ "] \n 2: Cadastro Jogo ["+ listaJogos.size()+ 
        "] \n 3: Impressão de relatórios \n 4: Excluir Respondente \n 5: Alterar Respondente \n 6: Excluir Jogo \n 7: Questionário \n 8: Sair");
        System.out.println("Escolha a opção desejada:");
        escolha = ms.nextInt();
                  
        switch(escolha){
            case 1:
                System.out.println("\f Digite o nome do respondente:");
                String nameLista = ms.nextLine();
                nameLista = ms.nextLine();
                String dataCompleta;
                do{
                    System.out.println("Insira sua data de nascimento COMPLETA (dd/mm/aaaa):");
                    dataCompleta = ms.nextLine();
                }while (dataCompleta.length() != 10);
                String estado;
                do{
                    System.out.println("Em que estado do Brasil você mora? (Digite a sigla de UF)");    
                    estado = ms.nextLine();
                }while(estado.length() != 2);
                System.out.println("Qual o nome da sua Cidade?");
                String cidade;
                cidade = ms.nextLine();
                System.out.println("Qual o nome da sua Escola?");
                String nomeEscola;
                nomeEscola = ms.nextLine();
                Respondente novoResp = new Respondente(nameLista, nomeEscola, cidade, estado, dataCompleta );
                listaResp.add(novoResp);
                Arrays.toString( listaResp.toArray() );
            break;
            case 2:
                String game;
                Jogo novoJogo;
                do{
                    System.out.println("\f Qual o Nome do Jogo:");
                    ms.nextLine();
                    game = ms.nextLine();
                    System.out.println( "Qual o Tema do Jogo:");
                    String catego = ms.nextLine();
                    novoJogo = new Jogo(game, catego);
                }while(listaJogos.contains(novoJogo) == true);
                listaJogos.add(novoJogo);
                
                
                Arrays.toString( listaJogos.toArray() );

                break;
            case 4:
            if(listaResp.size() != 0){    
                System.out.printf("Percorrendo a Lista Respondente (usando o índice)\n");
                int i = 0;
                for (Respondente nome: listaResp) {
                    System.out.printf("Posição %d- %s\n", i, nome);
                    i++;
                }
                System.out.printf("\nInforme a posição a ser excluída:\n"); 
                i = ms.nextInt();
                listaResp.remove(i);
            }
                break;
            case 5:
                if(listaResp.size() != 0){
                System.out.printf("Percorrendo a Lista Respondente (usando o índice)\n");
                int j = 0;
                for (Respondente nome: listaResp) {
                    System.out.printf("Posição %d- %s\n", j, nome);
                    j++;
                }
                System.out.printf("\nInforme o respondente a ser Modificado:\n"); 
                j = ms.nextInt();
                String hy;
                    do{System.out.printf("\nInsira o nome:\n"); 
                hy = ms.nextLine();
                listaResp.get(j).setNome(hy);  
            }while(hy == null);                
            }
                break;
            case 6: 
                if(listaJogos.size() != 0){
                System.out.printf("Percorrendo a Lista Jogos (usando o índice)\n");
                int i = 0;
                for (Jogo nomeJogo: listaJogos) {
                    System.out.printf("Posição %d- %s\n", i, nomeJogo);
                    i++;
                }
                System.out.printf("\nInforme a posição a ser excluída:\n"); 
                i = ms.nextInt();
                listaJogos.remove(i);
            }
                break;
            case 7:
            Questionario registra = new Questionario(); //acessa atributos e metodos na classe questionario
              do {

                    System.out.println("\f PERGUNTA 1: Digite o nome do jogo avaliado: ");
                    resposta1 = ms.nextLine();
                    ms.nextLine();
                    perg1.add(resposta1);
                    
                
                    System.out.println("PERGUNTA 2: O jogo avaliado possui atividades crescente de dificuldade? \n 1: Sim 2: Não Sei 3:Não (Digite o Número Correspondente a resposta ex:1");
                    resposta2 = ms.nextInt();
                    perg2.add(resposta2);
                    
                    System.out.println("PERGUNTA 3: O jogo apresenta os desafios de maneira acessível e bem explicada? \n1: Sim 2: Não");
                    resposta3 = ms.nextInt();
                    perg3.add(resposta3);
                    
                    System.out.println("PERGUNTA 4: Voce jogaria o jogo com seus alunos? \n1: Sim 2: Não Sei 3:Não");
                    resposta4 = ms.nextInt();
                    perg4.add(resposta4);
                    
                    System.out.println("PERGUNTA 5: O jogo trata de assuntos que você trabalha com seus alunos?\n1: Sim 2: Não");
                    resposta5 = ms.nextInt();
                    perg5.add(resposta5);
                    
                    System.out.println("PERGUNTA 6: Escreva aqui suas impressões a respeito deste jogo e procure colocar na sua avaliação usando palavras expressivas, tais como: otimo, bom, muito bom, ruim, fraco e outras que julgar melhor caracterizar sua avaliação.");
                    resposta6 = ms.nextLine();
                    perg6.add(resposta6);
                    
                    Questionario jResp = new Questionario();
                } while (resposta6 == null);

                break;
            case 8:
                System.exit(1)  ;
                break;                
            default:
            System.out.println("Digite um numero válido");
            break;
        }
    }while(escolha != 8);
    
}

}