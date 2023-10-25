public class ExcepcionBlanco extends Exception {
        public ExcepcionBlanco(String mensaje) {
            super(mensaje);
        }
}

public class ExcepcionNumero extends Exception {
        public ExcepcionNumero(String mensaje) {
            super(mensaje);
        }
 }

public class ExcepcionSalida extends Exception {
        public ExcepcionSalida(String mensaje) {
            super(mensaje);
        }
 }

public class ExcepcionVocal extends Exception {
        public ExcepcionVocal(String mensaje) {
            super(mensaje);
        }
}  

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

class LeerEntrada {
    private Reader stream;
    
    public LeerEntrada(InputStream Fuente) {
        stream = new InputStreamReader(Fuente);
    }
    
    public char getChar() throws IOException {
        return (char) this.stream.read();
    }
}

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            LeerEntrada lector = new LeerEntrada(System.in);
            
            while (true) {
                char caracter = lector.getChar();
                try {
                    procesar(caracter);
                } catch (ExcepcionVocal e) {
                    System.out.println("Excepción de vocal: " + e.getMessage());
                } catch (ExcepcionNumero e) {
                    System.out.println("Excepción de número: " + e.getMessage());
                } catch (ExcepcionBlanco e) {
                    System.out.println("Excepción de blanco: " + e.getMessage());
                } catch (ExcepcionSalida e) {
                    System.out.println("Excepción de salida: " + e.getMessage());
                    break; // Salir del bucle si se produce una excepción de salida
                }
            }
        } catch (IOException e) {
            System.err.println("Error de lectura: " + e.getMessage());
        }
    }
    
    public static void procesar(char caracter) throws ExcepcionVocal, ExcepcionNumero, ExcepcionBlanco, ExcepcionSalida {
        if (caracter >= 'a' && caracter <= 'z') {
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                throw new ExcepcionVocal("Carácter es una vocal: " + caracter);
            }
        } else if (caracter >= '0' && caracter <= '9') {
            throw new ExcepcionNumero("Carácter es un número: " + caracter);
        } else if (Character.isWhitespace(caracter)) {
            throw new ExcepcionBlanco("Carácter es un espacio en blanco: " + caracter);
        } else if (caracter == 'q') {
            throw new ExcepcionSalida("Carácter de salida detectado: " + caracter);
        }
    }
}
