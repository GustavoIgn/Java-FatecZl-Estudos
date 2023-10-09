import javax.swing.JOptionPane;

public class Ex_Vet_07 {
    public static void main(String[] args) {
        Ex_Vet_06 vetorAleatório = new Ex_Vet_06();
        int vt[] = new int [20];
        
        int opc = 0;
        while (opc != 9) {
            opc = Integer.parseInt(JOptionPane.showInputDialog(" 1 - Cadastrar Vetor \n 2 - Classificar Vetor \n 3 - Procurar no Vetor \n 9 - Fim"));
            switch (opc) {
                case 1:
                    vt = vetorAleatório.Cadastrar(vt);
                    break;
                case 2:
                    vt = vetorAleatório.Classificar(vt);
                    break;
                case 3:
                    int n = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor para pesquisar:"));
                    int cop = vetorAleatório.Procurar(vt, n);
                    if (cop == -1) {
                        System.out.println("O valor não se encontra no vetor");
                        break;
                    } else {
                        System.out.println("No local " + (cop) + " do vetor se encontra " + n);
                        break;
                    }
                case 9:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA");
            }
        }
    }
}
