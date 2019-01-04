/*
 *  Swing Calculator
 *  Developed by Bertassi
 *  Copyright 2018 All Rights Reserved
 */
package br.com.bertassi.mvccalculator.gui.interfaces;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author eduardo
 */
public interface CalculatorInterface
{

    JButton getJButtonAcumulatorClear ();

    JButton getJButtonChangeSignal ();

    JButton getJButtonComma ();

    JButton getJButtonDivision ();

    JButton getJButtonEight ();

    JButton getJButtonEqual ();

    JButton getJButtonFive ();

    JButton getJButtonFour ();

    JButton getJButtonMultiplication ();

    JButton getJButtonNine ();

    JButton getJButtonOne ();

    JButton getJButtonPercentage ();

    JButton getJButtonSeven ();

    JButton getJButtonSix ();

    JButton getJButtonSubtraction ();

    JButton getJButtonSum ();

    JButton getJButtonThree ();

    JButton getJButtonTwo ();

    JButton getJButtonZero ();

    JLabel getJLabelAbout ();

    JLabel getJLabelExpression ();

    JLabel getJLabelVisor ();

    JPanel getjPanelButtons ();

    JPanel getjPanelScreen ();

    void setJButtonAcumulatorClear (JButton jButtonAcumulatorClear);

    void setJButtonChangeSignal (JButton jButtonChangeSignal);

    void setJButtonComma (JButton jButtonComma);

    void setJButtonDivision (JButton jButtonDivision);

    void setJButtonEight (JButton jButtonEight);

    void setJButtonEqual (JButton jButtonEqual);

    void setJButtonFive (JButton jButtonFive);

    void setJButtonFour (JButton jButtonFour);

    void setJButtonMultiplication (JButton jButtonMultiplication);

    void setJButtonNine (JButton jButtonNine);

    void setJButtonOne (JButton jButtonOne);

    void setJButtonPercentage (JButton jButtonPercentage);

    void setJButtonSeven (JButton jButtonSeven);

    void setJButtonSix (JButton jButtonSix);

    void setJButtonSubtraction (JButton jButtonSubtraction);

    void setJButtonSum (JButton jButtonSum);

    void setJButtonThree (JButton jButtonThree);

    void setJButtonTwo (JButton jButtonTwo);

    void setJButtonZero (JButton jButtonZero);

    void setJLabelAbout (String texto);

    void setJLabelExpression (String texto);

    void setJLabelVisor (String texto);

    void setjPanelButtons (JPanel jPanelButtons);

    void setjPanelScreen (JPanel jPanelScreen);
    
}
