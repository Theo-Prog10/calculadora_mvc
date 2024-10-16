package br.ifes.projetosistemas.calculadora.controller;

import br.ifes.projetosistemas.calculadora.dto.RequestDTO;
import br.ifes.projetosistemas.calculadora.dto.ResponseDTO;
import br.ifes.projetosistemas.calculadora.model.Calc;
import br.ifes.projetosistemas.calculadora.model.CalcX;
import br.ifes.projetosistemas.calculadora.model.ICalc;

import br.ifes.projetosistemas.calculadora.model.operation.IOperation;

import java.util.Objects;

public class ControllerCalc {

    public ResponseDTO calc(RequestDTO requestDTO) throws Exception {
        int result = 0;
        ICalc calc = null;
        if (Objects.equals(requestDTO.getOpcao(), "Somar")) {
            calc = new Calc();
        } else {
            calc = new CalcX();
        }

        Class<?> operationClass = Class.forName("br.ifes.projetosistemas.calculadora.model.operation." + requestDTO.getOpcao());//pegando a classe
        IOperation operation = (IOperation) operationClass.getDeclaredConstructor().newInstance(); //instanciando dinamicamente

        result = calc.calculation(operation, requestDTO.getValor1(), requestDTO.getValor2());
        return new ResponseDTO(result);
    }
}


