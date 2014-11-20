import java.util.*; //Scanner
public class Questionario
{
    public String resposta1, resposta2, resposta3, resposta4, resposta5, resposta6;
    
    public Questionario (){}
    
    public void setResposta1 (String resposta1) {this.resposta1 = resposta1;}
    public void setResposta2 (String resposta2) {this.resposta2 = resposta2;}
    public void setResposta3 (String resposta3) {this.resposta3 = resposta3;}
    public void setResposta4 (String resposta4) {this.resposta4 = resposta4;}
    public void setResposta5 (String resposta5) {this.resposta5 = resposta5;}
    public void setResposta6 (String resposta6) {this.resposta6 = resposta6;}
    
    public String getResposta1 () {return resposta1;}
    public String getResposta2 () {return resposta2;}
    public String getResposta3 () {return resposta3;}
    public String getResposta4 () {return resposta4;}
    public String getResposta5 () {return resposta5;}
    public String getResposta6 () {return resposta6;}
    
    public String toString () 
    {
        return "Resposta 1:" + resposta1 + "Resposta 2:" + resposta2 + "Resposta 3:" + resposta3 + "Resposta 4:" + resposta4 + "Resposta 5:" + resposta5 + "Resposta 6:" + resposta6;
    }
}
