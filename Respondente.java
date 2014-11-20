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
            String dataString = "02/10/2013"; //Variavel com a data atual no nosso formato
            
            Calendar data = Calendar.getInstance(); 
            String[] list = data.split(dataString, " / ");
            
            data.set(Calendar.DAY_OF_MONTH, Integer.parseInt(dt[0])); //Passo o dia, mes e ano usando o método 'set' e como parametros o ENUM que representa o dia do mes, mes e ano.
            data.set(Calendar.MONTH, (Integer.parseInt(dt[1]))-1); //Detalhe, o Calendar considera que Janeiro é o mês '0', então você deve subtrair '1' do mês que foi passado
            data.set(Calendar.YEAR, Integer.parseInt(dt[2]));      //como parametro, se não caso você cadastr o mês 10, de vez outubro, ele imprimi novembro.
            
            System.out.println(data.getTime()); //O método getTime imprimi a data que você determinou.
             
            }
    
     ArrayList<JogoResp> listaResp = new ArrayList<JogoResp>();
    }
