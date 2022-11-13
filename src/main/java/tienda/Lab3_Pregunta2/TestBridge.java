package tienda.Lab3_Pregunta2;

public class TestBridge {

    public static void main(String[] args) {
            //INTANCIAR TIPOS DE REPARTO Y HORARIOS
            AbstractHorarioEntrega h1 = new ConcreteManana();
            AbstractHorarioEntrega h2 = new ConcreteTarde();
            AbstractHorarioEntrega h3 = new ConcreteNoche();
            TipoReparto obj1= new TipoRecojoTienda();
            TipoReparto obj2= new TipoEnvioDeposito();
            TipoReparto obj3= new TipoEnvioDelivery();

            //MOSTRAR LOS TESTEOS
            obj1.definirReparto(h1) ;
            obj1.definirReparto(h2) ;
            obj1.definirReparto(h3) ;
            obj2.definirReparto(h1) ;
            obj2.definirReparto(h2) ;
            obj2.definirReparto(h3) ;
            obj3.definirReparto(h1) ;
            obj3.definirReparto(h2) ;
            obj3.definirReparto(h3) ;
    }
}

