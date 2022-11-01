import com.openBootcamp.CocheCRUD;
import com.openBootcamp.CocheCRUDImpl;
import com.openBootcamp.Model.Coche;

public class Main {
    public static void main(String[] args) {

        Coche amarok = new Coche("Volkswagen", 2.0D, "Nicolás");
        Coche prisma = new Coche("Chevrolet", 1.4D, "Nicolás");
        Coche sw4 = new Coche("Toyota", 3.0D, "Mario");

        CocheCRUD cocheCrud = new CocheCRUDImpl();

        cocheCrud.findAll(amarok);
        cocheCrud.save(prisma);
        cocheCrud.delete(sw4);
    }
}