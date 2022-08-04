public class SingletonLazy {
/*
    singleton "preguiçoso"
    @author BrunoDev2003
*/
    private static SingletonLazy instancia;

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstancia() {
        return instancia;
    }

}
