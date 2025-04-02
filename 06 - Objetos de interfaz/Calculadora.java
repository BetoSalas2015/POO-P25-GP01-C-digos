import java.awt.*;
import java.awt.event.*;

public class Calculadora extends Frame {
    private Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    private Button btnMas, btnMenos, btnMult, btnDiv, btnPunto, btnIgual, btnC;
    private TextField txtDisplay;
    private Panel pnlTeclado, pnlDisplay;
    private double numero1, numero2, resultado;
    private char operacion;
    private boolean operando, punto;
    private String displayNum, sign;

    public Calculadora() {
        super("Calculadora"); 

        btn0 = new Button("0");         btn1 = new Button("1");
        btn2 = new Button("2");         btn3 = new Button("3");
        btn4 = new Button("4");         btn5 = new Button("5");
        btn6 = new Button("6");         btn7 = new Button("7");
        btn8 = new Button("8");         btn9 = new Button("9");
        btnMas = new Button("+");       btnMenos = new Button("-");
        btnMult = new Button("*");      btnDiv = new Button("/");
        btnPunto = new Button(".");     btnIgual = new Button("=");
        btnC = new Button("C");

        txtDisplay = new TextField("0");

        pnlDisplay = new Panel();
        pnlTeclado = new Panel();

        pnlTeclado.setLayout( new GridLayout(4, 4, 2, 2) );
        pnlTeclado.add(btn7);
        pnlTeclado.add(btn8);
        pnlTeclado.add(btn9);
        pnlTeclado.add(btnDiv);
        pnlTeclado.add(btn4);
        pnlTeclado.add(btn5);
        pnlTeclado.add(btn6);
        pnlTeclado.add(btnMult);
        pnlTeclado.add(btn1);
        pnlTeclado.add(btn2);
        pnlTeclado.add(btn3);
        pnlTeclado.add(btnMenos);
        pnlTeclado.add(btnIgual);
        pnlTeclado.add(btn0);
        pnlTeclado.add(btnPunto);
        pnlTeclado.add(btnMas);

        pnlDisplay.setLayout(new BorderLayout() );
        pnlDisplay.add(btnC, "East") ;
        pnlDisplay.add(txtDisplay,"Center");

        //  BorderLayout es default a Frame
        add(pnlDisplay, "North");
        add(pnlTeclado, "Center");

        // Inicializar estado de calculadora
        punto = operando = true;

        // Declarar los generadores de eventos
        addWindowListener( new CloseWindow() );
    }

    private class CloseWindow extends WindowAdapter {
        @Override
        public void windowClosing(WindowEvent e) {
            setVisible(false);
            dispose(); 
        } 
    }

    public boolean action(Event e, Object o) {
        if (e.target instanceof Button) {
            if (e.target == btnC) {
                txtDisplay.setText("0");
                punto = operando = true;
                numero1 = numero2 = resultado = 0;
            } else {
                if (e.target == btnMas || e.target == btnMenos || 
                     e.target == btnMult || e.target == btnDiv) {
                    if (operando) {
                        Button btnTemp = (Button) e.target;
                        sign = new String(btnTemp.getLabel());
                        operacion = sign.charAt(0);
                        numero1 = Double.parseDouble(txtDisplay.getText());
                        txtDisplay.setText("0");
                        operando = false;
                        punto = true;
                    }
                } else {
                    if (e.target == btnPunto) {
                        if (punto) {
                            displayNum = new String( txtDisplay.getText());
                            displayNum = displayNum + ".";
                            txtDisplay.setText(displayNum);
                            punto = false;
                        }
                    } else {
                        if (e.target == btnIgual) {
                            numero2 = Double.parseDouble(txtDisplay.getText());
                            switch (operacion) {
                                case '+': resultado = numero1 + numero2; break;
                                case '-': resultado = numero1 - numero2; break;
                                case '*': resultado = numero1 * numero2; break;
                                case '/': resultado = numero1 / numero2; break;
                            }
                            txtDisplay.setText(String.valueOf(resultado));
                            operando = punto = true;
                        } else {
                            displayNum = new String(txtDisplay.getText());
                            if (displayNum.equals("0")) {
                                displayNum = "";
                            }
                            Button btnTemp = (Button) e.target;
                            displayNum = displayNum + btnTemp.getLabel();
                            txtDisplay.setText(displayNum);
                        }
                    }
                }
            }
            return true;
        }
        return super.action(e, o);
    }

    public static void main(String args[]) {
        Calculadora calc = new Calculadora();
        calc.resize(300, 320);
        calc.show();
    }
}
