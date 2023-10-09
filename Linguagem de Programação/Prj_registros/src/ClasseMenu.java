// ****  CLASSE PRINCIPAL *****************
import javax.swing.*;

class ClasseMenu {   //  CLASSE PRINCIPAL
    public static void main(String[] args) {
        // INSTÂNCIA DA CLASSE ABSTRATA COM 3 REGISTROS TIPO VETOR 
        Aluno[] aluno = new Aluno[3];

        int i;

        // EXECUÇÃO DO MÉTODO CONSTRUTOR
        for (i = 0; i < 3; i++) {
            aluno[i] = new Aluno();
        }

        int opc = 0;
        while (opc != 9) {
            opc = Integer.parseInt(JOptionPane.showInputDialog("1 -  Cadastra Alunos \n 2 - Consulta Registros \n 9 - Finaliza"));
            switch (opc) {
                case 1:
                    aluno = FCadastra(aluno); // CHAMADA FUNÇÃO
                    break;
                case 2:
                    FConsulta(aluno); // CHAMADA PROCEDIMENTO
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "Programa finalizado");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida");
            } // FECHA SWITCH
        }  // FECHA WHILE
    }   // FECHA METODO PRINCIPAL

    // FUNÇÃO RECEBENDO REGISTRO aluno E RETORNANDO TIPO ALUNO[]    
    static Aluno[] FCadastra(Aluno[] aluno) {
        int i;
        for (i = 0; i < 3; i++) {
            aluno[i].pnome = JOptionPane.showInputDialog("Entre o nome do aluno:");
            aluno[i].unome = JOptionPane.showInputDialog("Entre o sobrenome do aluno:");
            aluno[i].pontos = Integer.parseInt(JOptionPane.showInputDialog("Pontos do aluno:"));
        }
        return aluno;
    }

// PROCEDIMENTO RECEBENDO REGISTRO aluno TIPO ALUNO[]    
    static void FConsulta(Aluno[] aluno) {
        int i;

        for (i = 0; i < 3; i++) {
            System.out.println(aluno[i].pnome + " " + aluno[i].unome
                    + " pontos: " + aluno[i].pontos);
        }
    }
}
