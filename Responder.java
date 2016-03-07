import java.util.ArrayList;
import java.util.Random;
import java.util.HashMap;

/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael K�lling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class Responder
{
    // ArrayList de respuestas
    private ArrayList<String> respuestas;
    // HashMap
    private HashMap<String,String> mapaDeRespuestas;
    // Random para el arrayList de respuestas
    private Random rnd;

    /**
     * Construct a Responder
     */
    public Responder()
    {
        rnd = new Random(System.currentTimeMillis());
        respuestas = new ArrayList<String>();
        mapaDeRespuestas = new HashMap<String,String>();
        respuestas.add("respuesta aleatoria 1");
        respuestas.add("respuesta aleatoria 2");
        respuestas.add("respuesta aleatoria 3");
        respuestas.add("respuesta aleatoria 4");
        respuestas.add("respuesta aleatoria 5");
    }
    
    /**
     * M�todo para introducir en el hashmap las respuestas que se devolver�n en funci�n de la palabra introducida
     */
    public void rellenarMapa(){
        mapaDeRespuestas.put("hola","Ey, qu� tal? Cu�nto tiempo sin verte por aqu�");
        mapaDeRespuestas.put("diccionario","S�, m�s o menos los HashMap funcionan como un diccionario");
        mapaDeRespuestas.put("deporte","Soy una m�quina, no hago deporte");
        mapaDeRespuestas.put("adios","Muchas gracias por consultarme, escribe bye para salir");
    }
    
    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(String palabraBuscada)
    {
        String respuestaGenerada = respuestas.get(rnd.nextInt(respuestas.size()));
        for (int i = 0; i<mapaDeRespuestas.size();i++){
            if (mapaDeRespuestas.containsKey(palabraBuscada)){
                respuestaGenerada = mapaDeRespuestas.get(palabraBuscada);
            }
        }
        return respuestaGenerada;
    }
}
