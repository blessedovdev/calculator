import javax.swing.JOptionPane;
class InputDialog{
    public static void main(String[]args){
        int a1,a2,a3;
        String a4,a5;
        a4=JOptionPane.showInputDialog("Введите первое число");
        a1=Integer.parseInt(a4);
        a4=JOptionPane.showInputDialog("Введите второе число");
        a2=Integer.parseInt(a4);
        a5=JOptionPane.showInputDialog("Введите действие");
        switch (a5) {
            case "-" -> {
                a3 = a1 - a2;
                JOptionPane.showMessageDialog(null,  a3);
            }
            case "+" -> {
                a3 = a1 + a2;
                JOptionPane.showMessageDialog(null, a3);
            }
            case "/" -> {
                a3 = a1 / a2;
                JOptionPane.showMessageDialog(null,  a3 );
            }
            case "*" -> {
                a3 = a1 * a2;
                JOptionPane.showMessageDialog(null,  a3 );
            }
            default -> JOptionPane.showMessageDialog(null, "ты долбоеб");
        }





    }
}