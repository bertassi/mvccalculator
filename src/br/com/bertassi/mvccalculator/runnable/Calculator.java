/*
 *  Swing Calculator
 *  Developed by Bertassi
 *  Copyright 2018 All Rights Reserved
 */
package br.com.bertassi.mvccalculator.runnable;

import br.com.bertassi.mvccalculator.controller.CalculatorController;
import br.com.bertassi.mvccalculator.model.CalculatorModel;
import br.com.bertassi.mvccalculator.gui.CalculatorGUI;

/**
 *
 * @author eduardo
 */
public class Calculator
{
    public static void main (String args[])
    {
        CalculatorModel calculatorModel = new CalculatorModel();
        CalculatorGUI calculatorView = new CalculatorGUI();
        CalculatorController calculatorController = new CalculatorController(calculatorModel, calculatorView);
    }  
}
