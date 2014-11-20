import java.util.*; //Scanner
public class AppQuestionario
{
    public void executa()
    {
        Scanner hk = new Scanner (System.in);
        String resposta1, resposta2, resposta3, resposta4, resposta5, resposta6;
        ArrayList<Questionario> listaQuest = new ArrayList<Questionario>(); //cria lista de respostas por pergunta
        
        String rr = hk.nextLine();
        rr = hk.nextLine();
        
        Questionario registra = new Questionario(); //acessa atributos e metodos na classe questionario
              
        do {
        
            System.out.println("\f PERGUNTA 1: Digite o nome do jogo avaliado:");
            resposta1 = hk.nextLine();
            registra.setResposta1(resposta1);
        
            System.out.println("PERGUNTA 2: O jogo avaliado possui atividades crescente de dificuldade?");
            resposta2 = hk.nextLine();
            registra.setResposta2(resposta2);
        
            System.out.println("PERGUNTA 3: O jogo apresenta os desafios de maneira acessível e bem explicada?");
            resposta3 = hk.nextLine();
            registra.setResposta3(resposta3);
            
            System.out.println("PERGUNTA 4: Voce jogaria o jogo com seus alunos?");
            resposta4 = hk.nextLine();
            registra.setResposta4(resposta4);
            
            System.out.println("PERGUNTA 5: O jogo trata de assuntos que você trabalha com seus alunos?");
            resposta5 = hk.nextLine();
            registra.setResposta5(resposta5);
            
            System.out.println("PERGUNTA 6: Escreva aqui suas impressões a respeito deste jogo e procure colocar na sua avaliação usando palavras expressivas, tais como: otimo, bom, muito bom, ruim, fraco e outras que julgar melhor caracterizar sua avaliação.");
            resposta6 = hk.nextLine();
            registra.setResposta6(resposta6);
        } while (resposta6 == null);
    }
}
