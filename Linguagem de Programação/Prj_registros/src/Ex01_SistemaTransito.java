
import javax.swing.JOptionPane;

public class Ex01_SistemaTransito {

    public static void main(String[] args) {
        //instancia da classe estatistica
        Estatistica estatistica[] = new Estatistica[10];

        // execução do método construtor
        for (int i = 0; i < 10; i++) {
            estatistica[i] = new Estatistica();
        }

        int opc = 0;
        while (opc != 9) {
            opc = Integer.parseInt(JOptionPane.showInputDialog("MENU ESTATÍSTICA \nACIDENTES DE 2023: \n 1 - Cadastro Estatística \n 2 - Consulta por quantidade de acidentes \n 3 - Consulta por estatísticas de acidentes \n 4 - Acidentes acima da média das 10 cidades \n 9 - Finalizar"));
            switch (opc) {
                case 1:
                    estatistica = ClasseMETODOS.FCADRASTRAESTATISTICA(estatistica);
                    break;
                case 2:
                    ClasseMETODOS.PQTDACIDENTES(estatistica);
                    break;
                case 3:
                    ClasseMETODOS.PMAIORMENOR(estatistica);
                    break;
                case 4:
                    ClasseMETODOS.PACIMA(estatistica);
                    break;
                case 9:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "OPÇÂO INVÁLIDA");
                    break;
            }
        }
    }

    
}
