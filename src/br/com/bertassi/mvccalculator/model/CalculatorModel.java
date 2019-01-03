/*
 *  Swing Calculator
 *  Developed by Bertassi
 *  Copyright 2018 All Rights Reserved
 */
package br.com.bertassi.mvccalculator.model;

import br.com.bertassi.mvccalculator.model.exceptions.DivideByZeroException;

/**
 *
 * @author eduardo
 */
public class CalculatorModel
{
    public double Add (double a, double b)
    {
        return a + b;
    }

    public double Subtract (double a, double b)
    {
        return a - b;
    }

    public double Mutiply (double a, double b)
    {
        return a * b;
    }

    public double Divide (double dividend, double divisor) throws DivideByZeroException
    {
        if (divisor == 0)
        {
            throw new DivideByZeroException("Error: Division by zero.");
        }
        else
        {
            return dividend / divisor;
        }
    }
    
    public double Percentage (double a)
    {
        return a / 100;
    }   

    public double ChangeSignal (double a)
    {
        return -a;
    }      
}
