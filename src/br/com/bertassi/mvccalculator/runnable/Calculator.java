/*
 *  Swing Calculator
 *  Developed by Bertassi
 *  Copyright 2018 All Rights Reserved
 */
package br.com.bertassi.mvccalculator.runnable;

import br.com.bertassi.mvccalculator.controller.CalculatorController;
import br.com.bertassi.mvccalculator.gui.NewCalculatorGUI;
import br.com.bertassi.mvccalculator.model.CalculatorModel;

/**
 *
 * @author eduardo
 */
public class Calculator
{
    public static void main (String args[])
    {
        CalculatorModel calculatorModel = new CalculatorModel();
        NewCalculatorGUI calculatorView = new NewCalculatorGUI();
        CalculatorController calculatorController = new CalculatorController(calculatorModel, calculatorView);
    }  
}
