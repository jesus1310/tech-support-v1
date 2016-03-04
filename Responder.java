import java.util.ArrayList;
import java.util.Random;

/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class Responder
{
    // ArrayList de respuestas
    private ArrayList<String> respuestas;
    // Random para el arrayList de respuestas
    private Random rnd;

    /**
     * Construct a Responder
     */
    public Responder()
    {
        rnd = new Random(System.currentTimeMillis());
        respuestas = new ArrayList<String>();
        respuestas.add("respuesta 1");
        respuestas.add("respuesta 2");
        respuestas.add("respuesta 3");
        respuestas.add("respuesta 4");
        respuestas.add("respuesta 5");
    }
    
    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
        return respuestas.get(rnd.nextInt(respuestas.size()));
    }
}
