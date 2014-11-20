import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Respondente
{
    private String nome, cidade, estado, nomeEscola, data;


        public Respondente(String nome, String nomeEscola, String cidade, String estado, String Data)
        {
            setNome(nome);
            setEstado(estado);
            setCidade(cidade);
            setData(data);
            setNomeEscola(nomeEscola);
        }
        public String getNome(){return nome;}
        public String getCidade(){return cidade;}
        public String getEstado(){return estado;}
        public String getNomeEscola(){return nomeEscola;}
        public String getData(){return data;}
        public void setNome(String nome){this.nome = nome;}
        public void setNomeEscola(String nomeEscola){this.nomeEscola = nomeEscola;}
        public void setCidade(String cidade){this.cidade = cidade;}
        public void setEstado(String estado){this.estado = estado;}        
        public void setData(String data){this.data = data;}

        
        public String toString(){
            return "Nome: " + nome + " Cidade: " + cidade + " Estado: " + estado + " Escola: "+ nomeEscola;
        }
        public int getIdade(){
             int anoNasc;   
             int anoAtual;  
             int ano = 2014;
             int dia = 05;
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
    
     ArrayList<JogoResp> listaResp = new ArrayList<JogoResp>();
    }
