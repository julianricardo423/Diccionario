import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Object[] claves;
        Map<String, String> diccionario = new HashMap<>();
        String clave = "", valor = "", valorIngresado = "";
        int ciclo = 1, numeroAleatorio = 0, correctas = 0, incorrectas = 0;


        diccionario.put("Hola", "Hello");
        diccionario.put("Azul", "Blue");
        diccionario.put("Negro", "Black");
        diccionario.put("Amarillo", "Yellow");
        diccionario.put("Blanco", "White");
        diccionario.put("Cinco", "Five");
        diccionario.put("Seis", "Six");
        diccionario.put("Siete", "Seven");
        diccionario.put("Nueve", "Nine");
        diccionario.put("Humo", "Smoke");
        diccionario.put("Diez", "Ten");
        diccionario.put("Gordo", "Fat");
        diccionario.put("Rojo", "Red");
        diccionario.put("Pelo", "Hair");
        diccionario.put("Ojo", "Eye");
        diccionario.put("Alto", "Tall");
        diccionario.put("Perro", "Dog");
        diccionario.put("Gato", "Cat");
        diccionario.put("Sol", "Sun");
        diccionario.put("Luna", "Moon");

        claves = diccionario.keySet().toArray();

        while(ciclo <= 5)
        {
            numeroAleatorio = (int)(Math.random() * 20 - 1 + 1);
            clave = (String)claves[numeroAleatorio];
            valor = diccionario.get(clave);
            System.out.print("Puedes ingresar la traducción de la palabra " + clave + ": ");
            valorIngresado = sc.next();
            if(valor.equalsIgnoreCase(valorIngresado))
            {
                correctas++;
            }
            else
            {
                System.out.println("Lo siento, la traducción de la palabra " + clave + " es: " + valor);
                incorrectas++;
            }
            ciclo++;
        }

        System.out.println("Correctas: " + correctas);
        System.out.println("Incorrectas: " + incorrectas);
    }
}