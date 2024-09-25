public class Disciplina {
    ICalcMedia calcMedia;
    double media;
    String nome;
    double P1;
    double P2;
    String situacao;

    public ICalcMedia getCalcMedia() {
        return calcMedia;
    }


    public void setCalcMedia(ICalcMedia calcMedia) {
        this.calcMedia = calcMedia;
    }


    public double getMedia() {
        return media;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public double getP1() {
        return P1;
    }


    public void setP1(double p1) {
        P1 = p1;
    }


    public double getP2() {
        return P2;
    }


    public void setP2(double p2) {
        P2 = p2;
    }


    public String getSituacao() {
        return situacao;
    }

    public void CalcularMedia(){
        media = calcMedia.CalculaMedia(P1, P2);
        situacao = calcMedia.Situacao(media);
    }

    public Disciplina(){

    }

    public Disciplina(ICalcMedia calcMedia){
        this.calcMedia = calcMedia;
    }
}
