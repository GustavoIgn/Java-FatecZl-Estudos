public class Func_Teste_Ex_41 {
    public static void main(String args[]) {
        int dado1 = 0, dado2 = 0;
        System.out.println(dados(dado1, dado2));
    }

    static String dados(int dado1, int dado2) {
        StringBuilder resultado = new StringBuilder();

        for (dado1 = 1; dado1 <= 6; dado1++) {
            for (dado2 = 1; dado2 <= 6; dado2++) {
                if (dado1 + dado2 == 7) {
                    resultado.append("Os valores são ").append(dado1).append(" + ").append(dado2).append("\n");
                }
            }
        }

        return resultado.toString();
    }
}