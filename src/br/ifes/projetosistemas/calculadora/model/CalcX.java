package br.ifes.projetosistemas.calculadora.model;

import br.ifes.projetosistemas.calculadora.model.operation.IOperation;

public class CalcX implements ICalc{

    public int calculation (IOperation operation, int value1, int value2){
        System.out.println("XXXX");
        return operation.calc(value1,value2);
    }

}
