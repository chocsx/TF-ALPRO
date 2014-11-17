import java.util.*;
public class App
{
    void executa(){
        Scanner ms = new Scanner(System.in);
        int escolha;
        ArrayList<Respondente> listaResp = new ArrayList<Respondente>();
        ArrayList<Jogo> listaJogos = new ArrayList<Jogo>();
        do{
        System.out.println("\fBem-Vindo ao Sistema MatematiC@ndo: \n 1: Cadastro Respondente \n 2: Cadastro Jogo ["+ listaJogos.size()+ "] \n 3: Impressão de relatórios \n 4: Excluir Respondente \n 5: Alterar Respondente \n 6: Excluir Jogo");
        System.out.println("Escolha a opção desejada:");
        escolha = ms.nextInt();
                  
        switch(escolha){
            case 1:
                System.out.println("\f Digite o nome do respondente:");
                String nameLista = ms.nextLine();
                nameLista = ms.nextLine();
                String dataCompleta;
                do{
                System.out.println("\f Insira sua data de nascimento COMPLETA (dd/mm/aaaa):");
                dataCompleta = ms.nextLine();
                }while (dataCompleta.length() != 8);
                String estado;
                do{
                    System.out.println("Em que estado do Brasil você mora? (Digite a sigla de UF)");    
                    estado = ms.nextLine();
                }while(estado.length() != 2);
                System.out.println("Qual o nome da sua Escola?");
                String nomeEscola;
                nomeEscola = ms.nextLine();
                break;
            case 2:
                
                System.out.println("\f Qual o Nome do Jogo:");
                String game = ms.nextLine();
                game = ms.nextLine();
                System.out.println( "Qual o Tema do Jogo:");
                String catego = ms.nextLine();
                Jogo  novoJogo = new Jogo(game, catego);
                listaJogos.add(novoJogo);
                Arrays.toString( listaJogos.toArray() );

                break;
            case 4: //excluir respondente
                System.out.println("\f Qual pessoa você quer excluir? "); 
                System.out.println(listaResp);
                String deletaNome;
                deletaNome = ms.nextLine();
                break;
            case 5:
                System.exit(1)  ;
            case 6: 
                System.out.println("Qual jogo você deseja excluir?");
                System.out.println(listaJogos);
                String gameDelete;
                gameDelete = ms.nextLine();

                
                break;
            default:
            System.out.println("Digite um numero válido");
            break;
        }
    }while(escolha != 8);
    
}

}