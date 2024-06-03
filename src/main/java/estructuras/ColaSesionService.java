package estructuras;
import java.util.Queue;

public class ColaSesionService {
    private Queue<String> cola;

    public ColaSesionService(Queue<String> cola) {
        this.cola = cola;
    }
    public Queue<String> getCola() {
        return cola;
    }

    public void setCola(Queue<String> cola) {
        this.cola = cola;
    }
    
    
}


