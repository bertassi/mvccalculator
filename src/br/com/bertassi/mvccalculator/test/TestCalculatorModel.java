/*
 *  Swing Calculator
 *  Developed by Bertassi
 *  Copyright 2018 All Rights Reserved
 */
package br.com.bertassi.mvccalculator.test;

import br.com.bertassi.mvccalculator.model.CalculatorModel;
import br.com.bertassi.mvccalculator.model.exceptions.DivideByZeroException;

/**
 *
 * @author eduardo
 */
public class TestCalculatorModel
{

    /**
     * TestCalculatorModel class.
     */
    public TestCalculatorModel ()
    {

    }

//    public static void main (String args[])
//    {
//        CalculatorModel model = new CalculatorModel();
//        
//        System.out.println("Add: 2 + 4 = " + model.Add(2, 4));
//        System.out.println("Add: 4 + 2 = " + model.Add(4, 2));
//        
//        System.out.println("Subtract: 2 - 4 = " + model.Subtract(2, 4));
//        System.out.println("Subtract: 4 - 2 = " + model.Subtract(4, 2));
//        
//        System.out.println("Mutiply: 2 * 4 = " + model.Mutiply(2, 4));
//        System.out.println("Mutiply: 4 * 2 = " + model.Mutiply(4, 2));
//        
//        try
//        {
//            System.out.println("Divide: 2 / 4 = " + model.Divide(2, 4));
//        }
//        catch (DivideByZeroException ex)
//        {
//            System.out.println(ex.getMessage());
//        }
//        try
//        {
//            System.out.println("Divide: 4 / 2 = " + model.Divide(4, 2));
//        }
//        catch (DivideByZeroException ex)
//        {
//            System.out.println(ex.getMessage());
//        }
//        try
//        {
//            System.out.println("Divide: 2 / 0 = " + model.Divide(2, 0));
//        }
//        catch (DivideByZeroException ex)
//        {
//            System.out.println("Divide: 2 / 0 = " + ex.getMessage());
//        }
//        
//        System.out.println("Percentage: 4% = " + model.Percentage(4));
//        System.out.println("Percentage: 400% = " + model.Percentage(400));
//        
//        System.out.println("Change Signal: 4 = " + model.ChangeSignal(4));
//        System.out.println("Change Signal: -4 = " + model.ChangeSignal(-4));        
//        
//    }
}