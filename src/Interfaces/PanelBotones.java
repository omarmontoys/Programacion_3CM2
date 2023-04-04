package Interfaces;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author OMAR
 */
public class PanelBotones extends JPanel{
    
  private JButton btn0;
  private JButton btn1;
  private JButton btn2;
  private JButton btn3;
  private JButton btn4;
  private JButton btn5;
  private JButton btn6;
  private JButton btn7;
  private JButton btn8;
  private JButton btn9;
  private JButton btnIgual;
  private JButton btnPunto;
  private JButton btnSuma;
  private JButton btnResta;
  private JButton btnMulti;
  private JButton btnDiv;
  
  public PanelBotones(CalculadoraGUI cP){
      Listener_Calculadora escuchador = new Listener_Calculadora(cP.getC(),cP.getCs());
      setLayout(new GridLayout(4, 4));
      this.btn0 = new JButton("0");
      btn0.addActionListener(escuchador);
      this.btn1 = new JButton("1");
      btn1.addActionListener(escuchador);
      this.btn2 = new JButton("2");
      btn2.addActionListener(escuchador);
      this.btn3 = new JButton("3");
      btn3.addActionListener(escuchador);
      this.btn4 = new JButton("4");
      btn4.addActionListener(escuchador);
      this.btn5 = new JButton("5");
      btn5.addActionListener(escuchador);
      this.btn6 = new JButton("6");
      btn6.addActionListener(escuchador);
      this.btn7 = new JButton("7");
      btn7.addActionListener(escuchador);
      this.btn8 = new JButton("8");
      btn8.addActionListener(escuchador);
      this.btn9 = new JButton("9");
      btn9.addActionListener(escuchador);
      this.btnIgual = new JButton("=");
      btnIgual.addActionListener(escuchador);
      this.btnPunto = new JButton(".");
      btnPunto.addActionListener(escuchador);
      this.btnSuma = new JButton("+");
      btnSuma.addActionListener(escuchador);
      this.btnResta = new JButton("-");
      btnResta.addActionListener(escuchador);
      this.btnMulti = new JButton("*");
      btnMulti.addActionListener(escuchador);
      this.btnDiv = new JButton("/");
      btnDiv.addActionListener(escuchador);
      
      add(this.btn7);
      add(this.btn8);
      add(this.btn9);
      add(this.btnDiv);
      add(this.btn4);
      add(this.btn5);
      add(this.btn6);
      add(this.btnMulti);
      add(this.btn1);
      add(this.btn2);
      add(this.btn3);
      add(this.btnResta);
      add(this.btn0);
      add(this.btnPunto);
      add(this.btnIgual);
      add(this.btnSuma);
      
      setVisible(true);
  }

    /**
     * @return the btn0
     */
    public JButton getBtn0() {
        return btn0;
    }

    /**
     * @param btn0 the btn0 to set
     */
    public void setBtn0(JButton btn0) {
        this.btn0 = btn0;
    }

    /**
     * @return the btn1
     */
    public JButton getBtn1() {
        return btn1;
    }

    /**
     * @param btn1 the btn1 to set
     */
    public void setBtn1(JButton btn1) {
        this.btn1 = btn1;
    }

    /**
     * @return the btn2
     */
    public JButton getBtn2() {
        return btn2;
    }

    /**
     * @param btn2 the btn2 to set
     */
    public void setBtn2(JButton btn2) {
        this.btn2 = btn2;
    }

    /**
     * @return the btn3
     */
    public JButton getBtn3() {
        return btn3;
    }

    /**
     * @param btn3 the btn3 to set
     */
    public void setBtn3(JButton btn3) {
        this.btn3 = btn3;
    }

    /**
     * @return the btn4
     */
    public JButton getBtn4() {
        return btn4;
    }

    /**
     * @param btn4 the btn4 to set
     */
    public void setBtn4(JButton btn4) {
        this.btn4 = btn4;
    }

    /**
     * @return the btn5
     */
    public JButton getBtn5() {
        return btn5;
    }

    /**
     * @param btn5 the btn5 to set
     */
    public void setBtn5(JButton btn5) {
        this.btn5 = btn5;
    }

    /**
     * @return the btn6
     */
    public JButton getBtn6() {
        return btn6;
    }

    /**
     * @param btn6 the btn6 to set
     */
    public void setBtn6(JButton btn6) {
        this.btn6 = btn6;
    }

    /**
     * @return the btn7
     */
    public JButton getBtn7() {
        return btn7;
    }

    /**
     * @param btn7 the btn7 to set
     */
    public void setBtn7(JButton btn7) {
        this.btn7 = btn7;
    }

    /**
     * @return the btn8
     */
    public JButton getBtn8() {
        return btn8;
    }

    /**
     * @param btn8 the btn8 to set
     */
    public void setBtn8(JButton btn8) {
        this.btn8 = btn8;
    }

    /**
     * @return the btn9
     */
    public JButton getBtn9() {
        return btn9;
    }

    /**
     * @param btn9 the btn9 to set
     */
    public void setBtn9(JButton btn9) {
        this.btn9 = btn9;
    }

    /**
     * @return the btnIgual
     */
    public JButton getBtnIgual() {
        return btnIgual;
    }

    /**
     * @param btnIgual the btnIgual to set
     */
    public void setBtnIgual(JButton btnIgual) {
        this.btnIgual = btnIgual;
    }

    /**
     * @return the btnPunto
     */
    public JButton getBtnPunto() {
        return btnPunto;
    }

    /**
     * @param btnPunto the btnPunto to set
     */
    public void setBtnPunto(JButton btnPunto) {
        this.btnPunto = btnPunto;
    }

    /**
     * @return the btnSuma
     */
    public JButton getBtnSuma() {
        return btnSuma;
    }

    /**
     * @param btnSuma the btnSuma to set
     */
    public void setBtnSuma(JButton btnSuma) {
        this.btnSuma = btnSuma;
    }

    /**
     * @return the btnResta
     */
    public JButton getBtnResta() {
        return btnResta;
    }

    /**
     * @param btnResta the btnResta to set
     */
    public void setBtnResta(JButton btnResta) {
        this.btnResta = btnResta;
    }

    /**
     * @return the btnMulti
     */
    public JButton getBtnMulti() {
        return btnMulti;
    }

    /**
     * @param btnMulti the btnMulti to set
     */
    public void setBtnMulti(JButton btnMulti) {
        this.btnMulti = btnMulti;
    }

    /**
     * @return the btnDiv
     */
    public JButton getBtnDiv() {
        return btnDiv;
    }

    /**
     * @param btnDiv the btnDiv to set
     */
    public void setBtnDiv(JButton btnDiv) {
        this.btnDiv = btnDiv;
    }

    
}
