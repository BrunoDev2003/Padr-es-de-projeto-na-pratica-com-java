package facade;

import Robo_em_java.subsistema2cep.CepApi;
import subsistema1crm.CrmService;

public class Facade {

    public void migrarCliente(String nome,String cep) {
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        CrmService.gravarCliente(nome,cep,cidade,estado);
    }
}