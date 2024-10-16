package br.ifes.projetosistemas.calculadora.model;

import br.ifes.projetosistemas.calculadora.model.operation.IOperation;

public interface ICalc {

    public int calculation (IOperation operation, int value1, int value2);
}
