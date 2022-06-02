import controller.ControllerMenuAwal;
import view.ViewMenuAwal;

public class Main {

    public static void main(String[] args) {
        ViewMenuAwal viewMenuAwal = new ViewMenuAwal();
        ControllerMenuAwal controllerMenuAwal = new ControllerMenuAwal(viewMenuAwal);

    }
}
