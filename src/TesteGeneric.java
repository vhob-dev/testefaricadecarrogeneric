import java.util.ArrayList;
import java.util.List;


public class TesteGeneric {
    public static void main(String[] args) {
        List<Carro> lista = new ArrayList<>();
        lista.add(new Mercedes());
        lista.add(new sedan());
        for (Object st : lista)
            System.out.println(lista);

    }
}






