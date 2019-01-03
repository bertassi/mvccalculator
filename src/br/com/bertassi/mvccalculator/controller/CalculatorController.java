/*
 *  Swing Calculator
 *  Developed by Bertassi
 *  Copyright 2018 All Rights Reserved
 */
package br.com.bertassi.mvccalculator.controller;

import java.awt.event.ActionListener;
import br.com.bertassi.mvccalculator.model.CalculatorModel;
import br.com.bertassi.mvccalculator.gui.CalculatorGUI;
import br.com.bertassi.mvccalculator.model.ButtonID;
import br.com.bertassi.mvccalculator.model.OperationID;
import java.awt.event.ActionEvent;

/**
 *
 * @author eduardo
 */
public class CalculatorController
{
    private final CalculatorModel model;
    private final CalculatorGUI view;
    private double acumulator;
    private double register;
    private int estadoAtual;
    private int operation;
    boolean append = false;
    double lastAcumulator;
    double lastRegister;    
    private int estadoAnterior;
    private int lastOperation;

    public CalculatorController (CalculatorModel calculatorModel, CalculatorGUI calculatorView)
    {
        this.model = calculatorModel;
        this.view = calculatorView;
        this.initiateListeners();
        this.acumulator = this.lastAcumulator = 0;
        this.register = this.lastRegister = 0;        
        this.estadoAtual = this.operation = this.estadoAnterior = this.lastOperation = OperationID.IDLE;
        this.updateScreen("0");
        
        System.out.println("\n\n");
        System.out.println("------------ Iniciando o Calculator Controller ------------");
        System.out.println("Tela = " + this.view.getJTextFieldScreen().getText());
        System.out.println("Acumulator Atual = " + this.acumulator);
        System.out.println("Acumulator Anterior = " + this.lastAcumulator);
        System.out.println("Registrador Atual = " + this.register);
        System.out.println("Registrador Anterior = " + this.lastRegister);
        System.out.println("Operação Atual = " + this.getOperation(this.operation));
        System.out.println("Operação Anterior = " + this.getOperation(this.lastOperation));
        System.out.println("Ação Atual = " + this.getAction(this.estadoAtual));
        System.out.println("Ação Anterior = " + this.getAction(this.estadoAnterior));
        System.out.println("------------------------");
        System.out.println("\n\n");
    }  
    
    // <editor-fold defaultstate="collapsed" desc="Getters and Setters">
    public String getOperation (int idOperacao)
    {
        String ops = null;
        
        switch (idOperacao)
        {
            case OperationID.ADD: ops = "ADD"; break;
            case OperationID.SUBTRACT: ops = "SUBTRACT"; break;
            case OperationID.MULTIPLY: ops = "MULTIPLY"; break;
            case OperationID.DIVIDE: ops = "DIVIDE"; break;
            case OperationID.EQUAL: ops = "EQUAL"; break;
            case OperationID.IDLE: ops = "IDLE";  break;
        }
        return ops;
    }
    
    public String getAction (int idAcao)
    {
        String ops = null;
        
        switch (idAcao)
        {
            case OperationID.ADD: ops = "ADD"; break;
            case OperationID.SUBTRACT: ops = "SUBTRACT"; break;
            case OperationID.MULTIPLY: ops = "MULTIPLY"; break;
            case OperationID.DIVIDE: ops = "DIVIDE"; break;
            case OperationID.EQUAL: ops = "EQUAL"; break;
            case OperationID.IDLE: ops = "IDLE";  break;
        }
        return ops;
    }    
    
    public void setAction (int action)
    {
        this.estadoAtual = action;
    }    
    
    public void setOperation (int operation)
    {
        this.operation = operation;
    }
    
    private double getAcumulator ()
    {
        return acumulator;
    }

    private void setAcumulator (double acumulator)
    {
        this.acumulator = acumulator;
    }

    public double getRegister ()
    {
        return register;
    }

    public void setRegister (double register)
    {
        this.register = register;
    }// </editor-fold>     

    // <editor-fold defaultstate="collapsed" desc="Listeners">
    private void initiateListeners ()
    {
        this.view.getJButtonZero().addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed (ActionEvent evt)
            {
                System.out.println(">>>>>>>>>>> Button 0");
                buttonActionPerformed(evt, ButtonID.ZERO);
            }
        });
        
        this.view.getJButtonOne().addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed (ActionEvent evt)
            {
                System.out.println(">>>>>>>>>>> Button 1");
                buttonActionPerformed(evt, ButtonID.ONE);
            }
        });

        this.view.getJButtonTwo().addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed (ActionEvent evt)
            {
                System.out.println(">>>>>>>>>>> Button 2");
                buttonActionPerformed(evt, ButtonID.TWO);
            }
        });

        this.view.getJButtonThree().addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed (ActionEvent evt)
            {
                System.out.println(">>>>>>>>>>> Button 3");
                buttonActionPerformed(evt, ButtonID.THREE);
            }
        });

        this.view.getJButtonFour().addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed (ActionEvent evt)
            {
                System.out.println(">>>>>>>>>>> Button 4");
                buttonActionPerformed(evt, ButtonID.FOUR);
            }
        });

        this.view.getJButtonFive().addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed (ActionEvent evt)
            {
                System.out.println(">>>>>>>>>>> Button 5");
                buttonActionPerformed(evt, ButtonID.FIVE);
            }
        });

        this.view.getJButtonSix().addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed (ActionEvent evt)
            {
                System.out.println(">>>>>>>>>>> Button 6");
                buttonActionPerformed(evt, ButtonID.SIX);
            }
        });

        this.view.getJButtonSeven().addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed (ActionEvent evt)
            {
                System.out.println(">>>>>>>>>>> Button 7");
                buttonActionPerformed(evt, ButtonID.SEVEN);
            }
        });

        this.view.getJButtonEight().addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed (ActionEvent evt)
            {
                System.out.println(">>>>>>>>>>> Button 8");
                buttonActionPerformed(evt, ButtonID.EIGHT);
            }
        });

        this.view.getJButtonNine().addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed (ActionEvent evt)
            {
                System.out.println(">>>>>>>>>>> Button 9");
                buttonActionPerformed(evt, ButtonID.NINE);
            }
        });

        this.view.getJButtonDot().addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed (ActionEvent evt)
            {
                System.out.println(">>>>>>>>>>> Button .");
                buttonActionPerformed(evt, ButtonID.DOT);
            }
        });
        
        this.view.getJButtonAdd().addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed (ActionEvent evt)
            {
                System.out.println(">>>>>>>>>>> Button Add");
                operationActionPerformed(evt, OperationID.ADD);
            }
        });   

        this.view.getJButtonSubtract().addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed (ActionEvent evt)
            {
                System.out.println(">>>>>>>>>>> Button Subtract");
                operationActionPerformed(evt, OperationID.SUBTRACT);
            }
        });   

        this.view.getJButtonMultiply().addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed (ActionEvent evt)
            {
                System.out.println(">>>>>>>>>>> Button Multiply");
                operationActionPerformed(evt, OperationID.MULTIPLY);
            }
        });   

        this.view.getJButtonDivide().addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed (ActionEvent evt)
            {
                System.out.println(">>>>>>>>>>> Button Divide");
                operationActionPerformed(evt, OperationID.DIVIDE);
            }
        });           
        
        this.view.getJButtonEqual().addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed (ActionEvent evt)
            {
                System.out.println(">>>>>>>>>>> Button Equal");
                operationActionPerformed(evt, OperationID.EQUAL);
            }
        });  
        
        this.view.getJButtonAcumulatorClear().addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed (ActionEvent evt)
            {
                System.out.println(">>>>>>>>>>> Button Acumulator Clear");
                operationActionPerformed(evt, OperationID.ACUMULATORCLEAR);
            }
        });
        
        this.view.getJButtonChangeSignal().addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed (ActionEvent evt)
            {
                System.out.println(">>>>>>>>>>> Button ChangeSignal");
                operationActionPerformed(evt, OperationID.CHANGESIGNAL);
            }
        });

        this.view.getJButtonPercentage().addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed (ActionEvent evt)
            {
                System.out.println(">>>>>>>>>>> Button Percentage");
                operationActionPerformed(evt, OperationID.PERCENTAGE);
            }
        });
    }// </editor-fold> 

    // <editor-fold defaultstate="collapsed" desc="Action Performed">
    private void buttonActionPerformed (ActionEvent evt, int id)
    {    
        if (this.view.getJTextFieldScreen().getText().equals("0") && this.append == false && this.getOperation(this.operation) == "IDLE")
        {
            this.append = true;
                    
            switch (id)
            {
                case ButtonID.ZERO:
                    this.view.setJTextFieldScreen("0");
                    this.lastAcumulator = this.acumulator;
                    this.setAcumulator(Double.parseDouble("0"));
                    break;
                case ButtonID.ONE:
                    this.view.setJTextFieldScreen("1");
                    this.lastAcumulator = this.acumulator;
                    this.setAcumulator(Double.parseDouble("1"));
                    break;
                case ButtonID.TWO:
                    this.view.setJTextFieldScreen("2");
                    this.lastAcumulator = this.acumulator;
                    this.setAcumulator(Double.parseDouble("2"));
                    break;
                case ButtonID.THREE:
                    this.view.setJTextFieldScreen("3");
                    this.lastAcumulator = this.acumulator;
                    this.setAcumulator(Double.parseDouble("3"));
                    break;
                case ButtonID.FOUR:
                    this.view.setJTextFieldScreen("4");
                    this.lastAcumulator = this.acumulator;
                    this.setAcumulator(Double.parseDouble("4"));
                    break;
                case ButtonID.FIVE:
                    this.view.setJTextFieldScreen("5");
                    this.lastAcumulator = this.acumulator;
                    this.setAcumulator(Double.parseDouble("5"));
                    break;
                case ButtonID.SIX:
                    this.view.setJTextFieldScreen("6");
                    this.lastAcumulator = this.acumulator;
                    this.setAcumulator(Double.parseDouble("6"));
                    break;
                case ButtonID.SEVEN:
                    this.view.setJTextFieldScreen("7");
                    this.lastAcumulator = this.acumulator;
                    this.setAcumulator(Double.parseDouble("7"));
                    break;
                case ButtonID.EIGHT:
                    this.view.setJTextFieldScreen("8");
                    this.lastAcumulator = this.acumulator;
                    this.setAcumulator(Double.parseDouble("8"));
                    break;
                case ButtonID.NINE:
                    this.view.setJTextFieldScreen("9");
                    this.lastAcumulator = this.acumulator;
                    this.setAcumulator(Double.parseDouble("9"));
                    break;
                case ButtonID.DOT:                    
                    appendScreenValue(".");
                    break;
            }
        }
        else if (!this.view.getJTextFieldScreen().getText().equals("0") && this.append == true && this.getOperation(this.operation) == "IDLE")
        {
            if (this.view.getJTextFieldScreen().getText().length() < 18 )
            {
                switch (id)
                {
                    case ButtonID.ZERO:
                        appendScreenValue("0");
                        this.lastAcumulator = this.acumulator;
                        this.setAcumulator(Double.parseDouble(this.view.getJTextFieldScreen().getText()));
                        break;
                    case ButtonID.ONE:
                        appendScreenValue("1");
                        this.lastAcumulator = this.acumulator;
                        this.setAcumulator(Double.parseDouble(this.view.getJTextFieldScreen().getText()));
                        break;
                    case ButtonID.TWO:
                        appendScreenValue("2");
                        this.lastAcumulator = this.acumulator;
                        this.setAcumulator(Double.parseDouble(this.view.getJTextFieldScreen().getText()));
                        break;
                    case ButtonID.THREE:
                        appendScreenValue("3");
                        this.lastAcumulator = this.acumulator;
                        this.setAcumulator(Double.parseDouble(this.view.getJTextFieldScreen().getText()));
                        break;
                    case ButtonID.FOUR:
                        appendScreenValue("4");
                        this.lastAcumulator = this.acumulator;
                        this.setAcumulator(Double.parseDouble(this.view.getJTextFieldScreen().getText()));
                        break;
                    case ButtonID.FIVE:
                        appendScreenValue("5");
                        this.lastAcumulator = this.acumulator;
                        this.setAcumulator(Double.parseDouble(this.view.getJTextFieldScreen().getText()));
                        break;
                    case ButtonID.SIX:
                        appendScreenValue("6");
                        this.lastAcumulator = this.acumulator;
                        this.setAcumulator(Double.parseDouble(this.view.getJTextFieldScreen().getText()));
                        break;
                    case ButtonID.SEVEN:
                        appendScreenValue("7");
                        this.lastAcumulator = this.acumulator;
                        this.setAcumulator(Double.parseDouble(this.view.getJTextFieldScreen().getText()));
                        break;
                    case ButtonID.EIGHT:
                        appendScreenValue("8");
                        this.lastAcumulator = this.acumulator;
                        this.setAcumulator(Double.parseDouble(this.view.getJTextFieldScreen().getText()));
                        break;
                    case ButtonID.NINE:
                        appendScreenValue("9");
                        this.lastAcumulator = this.acumulator;
                        this.setAcumulator(Double.parseDouble(this.view.getJTextFieldScreen().getText()));
                        break;
                    case ButtonID.DOT:
                        if (!this.view.getJTextFieldScreen().getText().contains("."))
                        {
                            appendScreenValue(".");
                        }
                        break;                        
                }
            }
        } 
        if (!this.view.getJTextFieldScreen().getText().equals("0") && this.append == false && this.getOperation(this.operation) != "IDLE")
        {
            this.append = true;
            
            switch (id)
            {
                case ButtonID.ZERO:
                    this.view.setJTextFieldScreen("0");
                    this.lastAcumulator = this.acumulator;
                    this.setAcumulator(Double.parseDouble("0"));                    
                    break;
                case ButtonID.ONE:
                    this.view.setJTextFieldScreen("1");
                    this.lastAcumulator = this.acumulator;
                    this.setAcumulator(Double.parseDouble("1"));
                    break;
                case ButtonID.TWO:
                    this.view.setJTextFieldScreen("2");
                    this.lastAcumulator = this.acumulator;
                    this.setAcumulator(Double.parseDouble("2"));
                    break;
                case ButtonID.THREE:
                    this.view.setJTextFieldScreen("3");
                    this.lastAcumulator = this.acumulator;
                    this.setAcumulator(Double.parseDouble("3"));
                    break;
                case ButtonID.FOUR:
                    this.view.setJTextFieldScreen("4");
                    this.lastAcumulator = this.acumulator;
                    this.setAcumulator(Double.parseDouble("4"));
                    break;
                case ButtonID.FIVE:
                    this.view.setJTextFieldScreen("5");
                    this.lastAcumulator = this.acumulator;
                    this.setAcumulator(Double.parseDouble("5"));
                    break;
                case ButtonID.SIX:
                    this.view.setJTextFieldScreen("6");
                    this.lastAcumulator = this.acumulator;
                    this.setAcumulator(Double.parseDouble("6"));
                    break;
                case ButtonID.SEVEN:
                    this.view.setJTextFieldScreen("7");
                    this.lastAcumulator = this.acumulator;
                    this.setAcumulator(Double.parseDouble("7"));
                    break;
                case ButtonID.EIGHT:
                    this.view.setJTextFieldScreen("8");
                    this.lastAcumulator = this.acumulator;
                    this.setAcumulator(Double.parseDouble("8"));
                    break;
                case ButtonID.NINE:
                    this.view.setJTextFieldScreen("9");
                    this.lastAcumulator = this.acumulator;
                    this.setAcumulator(Double.parseDouble("9"));
                    break;
                case ButtonID.DOT:
                    appendScreenValue(".");
                    break;
            }
        }
        else if (!this.view.getJTextFieldScreen().getText().equals("0") && this.append == true && this.getOperation(this.operation) != "IDLE")
        {
            if (this.view.getJTextFieldScreen().getText().length() < 18 )
            {
                switch (id)
                {
                    case ButtonID.ZERO:
                        appendScreenValue("0");
                        this.lastAcumulator = this.acumulator;
                        this.setAcumulator(Double.parseDouble(this.view.getJTextFieldScreen().getText()));
                        break;
                    case ButtonID.ONE:
                        appendScreenValue("1");
                        this.lastAcumulator = this.acumulator;
                        this.setAcumulator(Double.parseDouble(this.view.getJTextFieldScreen().getText()));
                        break;
                    case ButtonID.TWO:
                        appendScreenValue("2");
                        this.lastAcumulator = this.acumulator;
                        this.setAcumulator(Double.parseDouble(this.view.getJTextFieldScreen().getText()));
                        break;
                    case ButtonID.THREE:
                        appendScreenValue("3");
                        this.lastAcumulator = this.acumulator;
                        this.setAcumulator(Double.parseDouble(this.view.getJTextFieldScreen().getText()));
                        break;
                    case ButtonID.FOUR:
                        appendScreenValue("4");
                        this.lastAcumulator = this.acumulator;
                        this.setAcumulator(Double.parseDouble(this.view.getJTextFieldScreen().getText()));
                        break;
                    case ButtonID.FIVE:
                        appendScreenValue("5");
                        this.lastAcumulator = this.acumulator;
                        this.setAcumulator(Double.parseDouble(this.view.getJTextFieldScreen().getText()));
                        break;
                    case ButtonID.SIX:
                        appendScreenValue("6");
                        this.lastAcumulator = this.acumulator;
                        this.setAcumulator(Double.parseDouble(this.view.getJTextFieldScreen().getText()));
                        break;
                    case ButtonID.SEVEN:
                        appendScreenValue("7");
                        this.lastAcumulator = this.acumulator;
                        this.setAcumulator(Double.parseDouble(this.view.getJTextFieldScreen().getText()));
                        break;
                    case ButtonID.EIGHT:
                        appendScreenValue("8");
                        this.lastAcumulator = this.acumulator;
                        this.setAcumulator(Double.parseDouble(this.view.getJTextFieldScreen().getText()));
                        break;
                    case ButtonID.NINE:
                        appendScreenValue("9");
                        this.lastAcumulator = this.acumulator;
                        this.setAcumulator(Double.parseDouble(this.view.getJTextFieldScreen().getText()));
                        break;
                    case ButtonID.DOT:
                        if (!this.view.getJTextFieldScreen().getText().contains("."))
                        {
                            appendScreenValue(".");
                        }
                        break;                        
                }
            }
        }        
        
        System.out.println("\n\n");
        System.out.println("------------ Button Action Performed ------------");
        System.out.println("Tela = " + this.view.getJTextFieldScreen().getText());
        System.out.println("Acumulator Atual = " + this.acumulator);
        System.out.println("Acumulator Anterior = " + this.lastAcumulator);
        System.out.println("Registrador Atual = " + this.register);
        System.out.println("Registrador Anterior = " + this.lastRegister);
        System.out.println("Operação Atual = " + this.getOperation(this.operation));
        System.out.println("Operação Anterior = " + this.getOperation(this.lastOperation));
        System.out.println("Ação Atual = " + this.getAction(this.estadoAtual));
        System.out.println("Ação Anterior = " + this.getAction(this.estadoAnterior));
        System.out.println("------------------------");
        System.out.println("\n\n");
        
    }// </editor-fold> 
    
    private void operationActionPerformed (ActionEvent evt, int estadoAtual)
    {
        this.estadoAtual = estadoAtual;
        
        System.out.println("\n\n");
        System.out.println("------------ Entrou Operation Action Performed ------------");
        System.out.println("Tela = " + this.view.getJTextFieldScreen().getText());
        System.out.println("Acumulator Atual = " + this.acumulator);
        System.out.println("Acumulator Anterior = " + this.lastAcumulator);
        System.out.println("Registrador Atual = " + this.register);
        System.out.println("Registrador Anterior = " + this.lastRegister);
        System.out.println("Operação Atual = " + this.getOperation(this.operation));
        System.out.println("Operação Anterior = " + this.getOperation(this.lastOperation));
        System.out.println("Ação Atual = " + this.getAction(this.estadoAtual));
        System.out.println("Ação Anterior = " + this.getAction(this.estadoAnterior));
        System.out.println("------------------------");
        System.out.println("\n\n");
                
        switch(this.estadoAtual)
        {
            case OperationID.ADD:
                System.out.println("Entrando na operação ADD...");
                this.estadoAnterior = this.estadoAtual;
                this.lastOperation = this.operation;
                this.lastAcumulator = this.acumulator;
                this.lastRegister = this.register;
                               
                this.operation = OperationID.ADD;
                System.out.println("Registered Operation = " + this.getOperation(this.operation));
                this.append = false;               
                this.register = this.acumulator;
                break;

            case OperationID.SUBTRACT:
                System.out.println("Entrando na operação SUBTRACT...");
                this.estadoAnterior = this.estadoAtual;
                this.lastOperation = this.operation;
                this.lastAcumulator = this.acumulator;
                this.lastRegister = this.register;
                
                this.operation = OperationID.SUBTRACT;
                System.out.println("Registered Operation = " + this.getOperation(this.operation));
                this.append = false;               
                this.register = this.acumulator;                
                break;

            case OperationID.MULTIPLY:
                System.out.println("Entrando na operação MULTIPLY...");                
                this.estadoAnterior = this.estadoAtual;
                this.lastOperation = this.operation;
                this.lastAcumulator = this.acumulator;
                this.lastRegister = this.register;
                
                this.operation = OperationID.MULTIPLY;
                System.out.println("Registered Operation = " + this.getOperation(this.operation));
                this.append = false;               
                this.register = this.acumulator;                   
                break;
                
            case OperationID.DIVIDE:
                System.out.println("Entrando na operação DIVIDE...");
                this.estadoAnterior = this.estadoAtual;
                this.lastOperation = this.operation;
                this.lastAcumulator = this.acumulator;
                this.lastRegister = this.register;

                this.operation = OperationID.DIVIDE;
                System.out.println("Registered Operation = " + this.getOperation(this.operation));
                this.append = false;               
                this.register = this.acumulator;   
                break;
                
            case OperationID.EQUAL:
                if(this.operation == OperationID.ADD)
                {
                    System.out.println("Entrando na operação EQUAL + ADD...");
                    this.acumulator = this.model.Add(this.register, this.acumulator);
                    this.updateScreen(String.valueOf(this.acumulator));
                    this.append = false;
                }
                if(this.operation == OperationID.SUBTRACT)
                {
                    System.out.println("Entrando na operação EQUAL + SUBTRACT...");
                    this.acumulator = this.model.Subtract(this.register, this.acumulator);
                    this.updateScreen(String.valueOf(this.acumulator));
                    this.append = false;
                }
                if(this.operation == OperationID.MULTIPLY)
                {
                    System.out.println("Entrando na operação EQUAL + MULTIPLY...");
                    this.acumulator = this.model.Mutiply(this.register, this.acumulator);
                    this.updateScreen(String.valueOf(this.acumulator));
                    this.append = false;
                }
                if(this.operation == OperationID.DIVIDE)
                {
                    System.out.println("Entrando na operação EQUAL + DIVIDE...");
                    this.acumulator = this.model.Divide(this.register, this.acumulator);
                    this.updateScreen(String.valueOf(this.acumulator));
                    this.append = false;
                }                  
                break;
                
            case OperationID.IDLE:
                System.out.println("Entrando na operação IDLE...");

                break;                
                
            case OperationID.ACUMULATORCLEAR:
                System.out.println("Entrando na operação ACUMULATORCLEAR...");
                this.lastOperation = this.operation;
                this.setOperation(OperationID.IDLE);                
                this.estadoAnterior = this.estadoAtual;
                this.setAction(OperationID.IDLE);
                this.lastAcumulator = this.acumulator;
                this.acumulator = 0;
                this.lastRegister = this.register;
                this.register = 0;
                
                this.append = false;                

                this.updateScreen("0");                
                break;

            case OperationID.CHANGESIGNAL:
                this.operation = OperationID.CHANGESIGNAL;                
                if(this.acumulator != 0)
                {
                    System.out.println("Entrando na operação CHANGESIGNAL...");
                    // Armazena o valor da tela no acumulador.
                    this.setAcumulator(Double.parseDouble(this.view.getJTextFieldScreen().getText()));
                    // Faz o cálculo e coloca o resultado no acumuador.
                    this.setAcumulator(this.model.ChangeSignal(this.getAcumulator()));
                    // Apresenta o valor do acumulador na tela.
                    this.updateScreen(String.valueOf(this.getAcumulator()));                    
                }                
                break;
                
            case OperationID.PERCENTAGE:
                this.operation = OperationID.PERCENTAGE;
                if(this.acumulator != 0)
                {
                    System.out.println("Entrando na operação PERCENTAGE...");
                    // Armazena o valor da tela no acumulador.
                    this.setAcumulator(Double.parseDouble(this.view.getJTextFieldScreen().getText()));
                    // Faz o cálculo e coloca o resultado no acumuador.
                    this.setAcumulator(this.model.Percentage(this.getAcumulator()));
                    // Apresenta o valor do acumulador na tela.
                    this.updateScreen(String.valueOf(this.getAcumulator()));
                }
                this.operation = OperationID.IDLE;
                break;
        }         
        System.out.println("\n\n");
        System.out.println("------------ Saiu do Operation Action Performed ------------");
        System.out.println("Tela = " + this.view.getJTextFieldScreen().getText());
        System.out.println("Acumulator Atual = " + this.acumulator);
        System.out.println("Acumulator Anterior = " + this.lastAcumulator);
        System.out.println("Registrador Atual = " + this.register);
        System.out.println("Registrador Anterior = " + this.lastRegister);
        System.out.println("Operação Atual = " + this.getOperation(this.operation));
        System.out.println("Operação Anterior = " + this.getOperation(this.lastOperation));
        System.out.println("Ação Atual = " + this.getAction(this.estadoAtual));
        System.out.println("Ação Anterior = " + this.getAction(this.estadoAnterior));
        System.out.println("--------------------------------------");
        System.out.println("\n\n");
        
    }

    public void appendScreenValue (String text)
    {
        this.view.setJTextFieldScreen(this.view.getJTextFieldScreen().getText() + text);
    }

    public void updateScreen (String text)
    {
        this.view.setJTextFieldScreen(text);
    }    
}