package theultimateconverter;
import java.util.Scanner;
/*
    @author Fausto Uribe and Nicolas Uribe
*/
public class TheUltimateConverter {
    
    public static int tempConverter(int _temperature, char primeraUnidad, char segundaUnidad) {
        int product = 0;
        if(primeraUnidad == 'f') {
            if(segundaUnidad == 'c') product = (_temperature*(5/9)) - 32;
            if(segundaUnidad == 'f' )product = (_temperature*(5/9)) + 460;
        } else if (primeraUnidad == 'c') {
            if(segundaUnidad == 'k') product = _temperature + 273;
            if(segundaUnidad == 'f') product = (_temperature*(9/5)) + 32;
        } else if (primeraUnidad == 'k') {
            if(segundaUnidad == 'c' )product = _temperature  - 273;
            if(segundaUnidad == 'f' )product = (_temperature*(9/5))- 460;
        }
        return product;
    }
    
    public static int areaConverter(int _area, char primeraUnidad, char segundaUnidad) {
        int product = 0;
        if(primeraUnidad == 'm') {
            product = (int)(_area * 2.58999);
        } else if(primeraUnidad == 'a') {
            product = (int)(_area / 247.105381);
        } else if(primeraUnidad == 'k') {
            if(segundaUnidad == 'm') product = (int)(_area * 0.621371);
            if(segundaUnidad == 'a') product = (int)(_area * 247.105381);
        }
        return product;
    }
    
    public static void main(String[] args) {
        char fchoice, schoice, mchoice;
        int tmp, convertido=0;
        Scanner bb = new Scanner(System.in);
        System.out.println("Press t to convert temperature\n"
                           + "Press a to convert area");
        mchoice = bb.next().charAt(0);
        if(mchoice == 't') {
            System.out.println("k to convert kelvin, c to convert celsius, f to convert farenheit");
            fchoice = bb.next().charAt(0);
            System.out.println("k to convert to kelvin, c to convert to celsius, f to convert to farenheit");
            schoice = bb.next().charAt(0);
            System.out.println("Type the temperature in your unit");
            tmp = (int)bb.nextDouble();
            convertido = tempConverter(tmp, fchoice, schoice);
        } else if(mchoice == 'a') {
            System.out.println("m to convert miles, a to convert acres, k to convert kilometer");
            fchoice = bb.next().charAt(0);
            System.out.println("m to convert to miles, a to convert to acres, k to convert to kilometer");
            schoice = bb.next().charAt(0);
            System.out.println("Type the area in your unit");
            tmp = (int)bb.nextDouble();
            convertido = areaConverter(tmp, fchoice, schoice);
        }
        System.out.println(convertido);
    }
    
}
