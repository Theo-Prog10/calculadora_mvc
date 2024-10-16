package br.ifes.projetosistemas.calculadora.application;

import br.ifes.projetosistemas.calculadora.controller.ControllerCalc;
import br.ifes.projetosistemas.calculadora.dto.RequestDTO;
import br.ifes.projetosistemas.calculadora.dto.ResponseDTO;
import br.ifes.projetosistemas.calculadora.view.Menu;

public class Application {
    public static void main(String[] args) throws Exception {
        Menu menu = new Menu();
        RequestDTO requestDTO = menu.show();
        ControllerCalc controllerCalc = new ControllerCalc();
        ResponseDTO responseDTO = controllerCalc.calc(requestDTO);
        menu.showResult(responseDTO);


    }
}
