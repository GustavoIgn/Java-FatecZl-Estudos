
import javax.swing.JOptionPane;

public class ClasseMETODOS {

    static Estatistica[] FCADRASTRAESTATISTICA(Estatistica[] estatistica) {
        for (int i = 0; i < 10; i++) {
            estatistica[i].CodigoCidade = Integer.parseInt(JOptionPane.showInputDialog("Entre o código da " + (i + 1) + "º cidade"));
            estatistica[i].NomeCidade = JOptionPane.showInputDialog("Entre o nome da " + (i + 1) + "º cidade");
            estatistica[i].QtdAcidentes = Integer.parseInt(JOptionPane.showInputDialog("Entre a quantidade de acidentes"));
        }
        return estatistica;
    }

    static void PQTDACIDENTES(Estatistica[] estatistica) {
        System.out.println("As cidades com acidentes entre 100 e 500 são:");
        for (int i = 0; i < 10; i++) {
            if (estatistica[i].QtdAcidentes > 100 && estatistica[i].QtdAcidentes < 500) {
                System.out.println(estatistica[i].NomeCidade + "--> CD: " + estatistica[i].CodigoCidade + "--> Qtd: " + estatistica[i].QtdAcidentes);
                System.out.println("|||||||||||||||||||||||||||||||||||");
            }
        }
    }

    static void PMAIORMENOR(Estatistica[] estatistica) {
        int menor = estatistica[0].QtdAcidentes, maior = estatistica[0].QtdAcidentes;
        int copMenor = 0, copMaior = 0;
        for (int i = 0; i < 10; i++) {
            if (estatistica[i].QtdAcidentes < menor) {
                menor = estatistica[i].QtdAcidentes;
                copMenor = i;
            }
            if (estatistica[i].QtdAcidentes > maior) {
                maior = estatistica[i].QtdAcidentes;
                copMaior = i;
            }
        }

        System.out.println("Cidade com menos acidentes: \n" + estatistica[copMenor].NomeCidade + "--> CD: " + estatistica[copMenor].CodigoCidade + "--> Qtd: " + estatistica[copMenor].QtdAcidentes);
        System.out.println("|||||||||||||||||||||||||||||||||||");
        System.out.println("Cidade com mais acidentes: \n" + estatistica[copMaior].NomeCidade + "--> CD: " + estatistica[copMaior].CodigoCidade + "--> Qtd: " + estatistica[copMaior].QtdAcidentes);
    }

    static void PACIMA(Estatistica[] estatistica) {
        int media = 0;
        for (int i = 0; i < 10; i++) {
            media += estatistica[i].QtdAcidentes;
        }
        media = media / 10;
        System.out.println("Cidade(s) acima da média:");
        for (int i = 0; i < 10; i++) {
            if (estatistica[i].QtdAcidentes > media) {
                System.out.println(estatistica[i].NomeCidade + "--> CD: " + estatistica[i].CodigoCidade + "--> Qtd: " + estatistica[i].QtdAcidentes);
                System.out.println("|||||||||||||||||||||||||||||||||||");
            }
        }
    }
}
