import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Respondente
{
    private String nome, cidade, estado, nomeEscola;
    private int dia, mes, ano;

    public Respondente()
    {
        setEstado(estado);
        setNomeEscola(nomeEscola);
        setCidade(cidade);
        setDia(dia);
        setAno(ano);
    }
        public String getNome(){return nome;}
        public String getCidade(){return cidade;}
        public String getEstado(){return estado;}
        public String getNomeEscola(){return nomeEscola;}
    
        public void setDia(int dia){this.dia = dia;}
        public void setAno(int ano){this.ano = ano;}
        public void setNome(String nome){this.nome = nome;}
        public void setCidade(String cidade){this.cidade = cidade;}
        public void setEstado(String estado){this.estado = estado;}        
        public void setNomeEscola(String nomeEscola){this.nomeEscola = nomeEscola;}
        
        public String toString(){
            return "Nome: " + nome + " Cidade: " + cidade + " Estado: " + estado + " Escola: "+ nomeEscola;
        }
    public int getIdade(){
         int anoNasc;   
         int anoAtual;  
         Date hoje = new Date();
         Calendar cal = Calendar.getInstance();
         
         cal.setTime(hoje);
         int dia1 = cal.get(Calendar.DAY_OF_YEAR);
         int ano1 = cal.get(Calendar.YEAR);
      
         int nAno = ano1 - ano;
         
         if(dia1 < dia){
             nAno--; //Ainda não completou aniversario esse ano.  
            }
         //Impressão  
         return nAno;
         
    }
    
    
    }
