/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utils;

/**
 *
 * @author Heitor
 */
public final class UtilitarioString {
    
    private static UtilitarioString INSTANCE = null;
    
    private UtilitarioString() {}
    
    public static UtilitarioString getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new UtilitarioString();
        }
        return INSTANCE;
    }
    
    public String substituirTexto(String texto, String marca, CharSequence simbolo) throws Exception {
        validarArgumentos(texto, marca, simbolo);
        
        String novaString = getNovaString(marca, simbolo);
        
        return texto.replaceAll(marca, novaString);
    }

    private void validarArgumentos(String texto, String marca, CharSequence simbolo) throws Exception {
        if (texto == null || texto.isEmpty() || texto.isBlank()) {
            throw new Exception("Informe o texto que ser processado");
        }
        
        if (marca == null || marca.isEmpty()) {
            throw new Exception("Informe a marca a ser removida do texto");
        }
        
        if (simbolo.length() == 0) {
            throw new Exception("Informe o simbolo");
        }
        
        if (simbolo.length() > 1) {
            throw new Exception("O símbolo deve conter apenas caracter");
        }
    }

    private String getNovaString(String marca, CharSequence simbolo) {   
        return simbolo.toString().repeat(marca.length());
    }
}
