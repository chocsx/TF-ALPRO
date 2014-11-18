public class Jogo
{
    String nomeJogo,temaJogo;
    public Jogo(String nomeJogo, String temaJogo) {
        this.nomeJogo = nomeJogo;
        this.temaJogo = temaJogo;
    }
    public String getJogo(){return nomeJogo;}
    public String getTema(){return nomeJogo;}
    public void setJogo(String nomeJogo){this.nomeJogo = nomeJogo;}
    public void setTema(String temaJogo){this.temaJogo = temaJogo;}

    
    public String toString() { return "Nome do Jogo: " + nomeJogo + " Tema do Jogo:  " + temaJogo; }
    

}
