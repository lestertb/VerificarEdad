public class MAIN {
    public static void main(String args[]) {
        int edad = 17;

        System.out.println(func(edad));
    }

    static String func(int edad){
        boolean esAdulto,esNinno,esAdolescente;
        boolean puedeTenerLicencia = false;
        String result = "";
        int count = 0;
        result += ("Edad actual es: " + edad + "\n");
        if(edad < 18) {
            if (edad >= 0){
                while (edad <= 17){
                    count +=1;
                    edad +=1;
                }
                if(count <= 5){
                    esAdolescente = true;
                    result += ("Es adoslecente: " + esAdolescente +
                            "\nPuede tener licencia?: " + puedeTenerLicencia +
                            "\nLe falta \"" + count + "\" años para ser adulto");
                }else{
                    esNinno = true;
                    result += ("Es niño: " + esNinno + "\nPuede tener licencia?: " + puedeTenerLicencia +
                            "\nLe falta \"" + count + "\" años para ser adulto");
                }
            }else
                result += ("No se admiten valores negativos");
        }else{
            esAdulto = true;
            puedeTenerLicencia = true;
            result += ("Es adulto: " + esAdulto + "\nPuede tener licencia?: " + puedeTenerLicencia);
        }
        return result;
    }
}