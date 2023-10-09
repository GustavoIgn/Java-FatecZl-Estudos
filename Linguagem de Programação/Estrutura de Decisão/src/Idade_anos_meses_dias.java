
import javax.swing.JOptionPane;

public class Idade_anos_meses_dias 
{
    public static void main(String[] args) 
    {
    
        int dn, mn, an, da, ma, aa, ida, idm, idd;
    
        dn = Integer.parseInt(JOptionPane.showInputDialog("Insira o dia de nascimento: "));
        mn = Integer.parseInt(JOptionPane.showInputDialog("Insira o mês de nascimento: "));
        an = Integer.parseInt(JOptionPane.showInputDialog("Insira o ano de nascimento: "));
    
        da = Integer.parseInt(JOptionPane.showInputDialog("Insira o dia atual: "));
        ma = Integer.parseInt(JOptionPane.showInputDialog("Insira o mês atual: "));
        aa = Integer.parseInt(JOptionPane.showInputDialog("Insira o ano atual: "));
     
        if (dn < 0 || dn > 31){
            JOptionPane.showMessageDialog(null, "Data Inválida!");
            System.exit(0);
        } else {
            if (dn >= 31 && (mn == 2 || mn == 4 || mn == 6 || mn == 9 || mn == 11)){
                JOptionPane.showMessageDialog(null, "Data Inválida!");
                System.exit(0);
            } else {
                if (dn > 28 && mn == 2){
                    JOptionPane.showMessageDialog(null, "Data Inválida!");
                    System.exit(0);
                }
            }
        }
        if (da < 0 || da > 31) {
            JOptionPane.showMessageDialog(null, "Data Inválida!");
            System.exit(0);
        } else {
            if (da >= 31 && (ma == 2 || ma == 4 || ma == 6 || ma == 9 || ma == 11)){
                JOptionPane.showMessageDialog(null, "Data Inválida!");
                System.exit(0);
            } else {
                if (da > 28 && ma == 2){
                    JOptionPane.showMessageDialog(null, "Data Inválida!");
                    System.exit(0);
                }
            }
        }
    
        if (mn < 1 || mn > 12){
            JOptionPane.showMessageDialog(null, "Data Inválida!");
            System.exit(0);
        } else {
            if (ma < 1 || ma > 12){
                JOptionPane.showMessageDialog(null, "Data Inválida!");
                System.exit(0);
            }
        }
    
        if (an > aa) {
            JOptionPane.showMessageDialog(null, "Data Inválida!");
            System.exit(0);
        }
    
        ida = aa - an;
        idm = ma - mn;
        idd = da - dn;
    
        if (idm < 0 || (idm == 0 && idd < 0)){
            ida = ida - 1;
            idm = idm + 12;
        }
        if (idm < 0){
            idm = idm + 12;
            ida = ida - 1;
        }
    
        int[] diasmes;
        diasmes = new int [13];
        diasmes[1] = 31;
        diasmes[2] = 28;
        diasmes[3] = 31;
        diasmes[4] = 30;
        diasmes[5] = 31;
        diasmes[6] = 30;
        diasmes[7] = 31;
        diasmes[8] = 31;
        diasmes[9] = 30;
        diasmes[10] = 31;
        diasmes[11] = 30;
        diasmes[12] = 31;
    
        if (idd < 0){
            idd = idd + diasmes[mn];
            idm = idm - 1;
        }
        if (idm < 0){
            idm = idm + 12;
            ida = ida - 1;
        }
    
        JOptionPane.showMessageDialog(null,  "Idade atual: " + ida + " anos, " + idm + " meses e " + idd + " dias.");
        System.out.println("Idade atual: " + ida + " anos, " + idm + " meses e " + idd + " dias.");
    }
}
