
class Estatistica {

    int CodigoCidade;
    String NomeCidade;
    int QtdAcidentes;

    //método construtor...
    Estatistica() {
        this(0, "", 0);
    }
    
    Estatistica(int cdc, String nc, int qtd){
        CodigoCidade = cdc;
        NomeCidade = nc;
        QtdAcidentes = qtd;
    }
}
