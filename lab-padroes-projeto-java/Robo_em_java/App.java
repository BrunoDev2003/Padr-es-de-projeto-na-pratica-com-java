import facade.Facade;

public class App {
   //usando padrão strategy para criar um robo em java,tambem usando polimorfismo
    public static void main(String[] args) throws Exception {
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.mover();


        Facade facade = new Facade();
        facade.migrarCliente("bruno","45318965");
    }
}

//baixar o spring initilizer java for web, importar no projeto e colocar em sub-pacotes,e usar openfeign