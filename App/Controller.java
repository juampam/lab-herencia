package App;

public class Controller {
    Inventario inventario = new Inventario(); 

    public void readCSv(){
        inventario.cargarDatos("./data/datos.csv");
    }
}
