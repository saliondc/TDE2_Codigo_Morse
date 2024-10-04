package TDE2_Codigo_Morse;

public class Aplicacao {
    public static void main(String[] args) {
        ArvoreMorse arvoreMorse = new ArvoreMorse();
        arvoreMorse.inserirMorse(".-", "A");
        arvoreMorse.inserirMorse("-...", "B");
        arvoreMorse.inserirMorse("-.-.", "C");
        arvoreMorse.inserirMorse("-..", "D");
        arvoreMorse.inserirMorse(".", "E");
        arvoreMorse.inserirMorse("..-.", "F");
        arvoreMorse.inserirMorse("--.", "G");
        arvoreMorse.inserirMorse("....", "H");
        arvoreMorse.inserirMorse("..", "I");
        arvoreMorse.inserirMorse(".---", "J");
        arvoreMorse.inserirMorse("-.-", "K");
        arvoreMorse.inserirMorse(".-..", "L");
        arvoreMorse.inserirMorse("--", "M");
        arvoreMorse.inserirMorse("-.", "N");
        arvoreMorse.inserirMorse("---", "O");
        arvoreMorse.inserirMorse(".--.", "P");
        arvoreMorse.inserirMorse("--.-", "Q");
        arvoreMorse.inserirMorse(".-.", "R");
        arvoreMorse.inserirMorse("...", "S");
        arvoreMorse.inserirMorse("-", "T");
        arvoreMorse.inserirMorse("..-", "U");
        arvoreMorse.inserirMorse("...-", "V");
        arvoreMorse.inserirMorse(".--", "W");
        arvoreMorse.inserirMorse("-..-", "X");
        arvoreMorse.inserirMorse("-.--", "Y");
        arvoreMorse.inserirMorse("--..", "Z");
        arvoreMorse.inserirMorse("-----", "0");
        arvoreMorse.inserirMorse(".----", "1");
        arvoreMorse.inserirMorse("..---", "2");
        arvoreMorse.inserirMorse("...--", "3");
        arvoreMorse.inserirMorse("....-", "4");
        arvoreMorse.inserirMorse(".....", "5");
        arvoreMorse.inserirMorse("-....", "6");
        arvoreMorse.inserirMorse("--...", "7");
        arvoreMorse.inserirMorse("---..", "8");
        arvoreMorse.inserirMorse("----.", "9");

        System.out.println("Letra encontrada para '.-': " + arvoreMorse.buscarMorse(".-"));
        System.out.println("Letra encontrada para '-...': " + arvoreMorse.buscarMorse("-..."));
        System.out.println("Número encontrado para '-----': " + arvoreMorse.buscarMorse("-----"));
        System.out.println("Número encontrado para '.----': " + arvoreMorse.buscarMorse(".----"));

        String mensagem = "--. .- -. -.- .-/-- .. -../.--. --- .-. .-. .-";
        String mensagemDecodificada = arvoreMorse.decodificarMorse(mensagem);
        System.out.println("Mensagem decodificada: " + mensagemDecodificada);

        String mensagem2 = "-.. . ... -.-. ..- .-.. .--. .-/---/.--. .- .-.. .- ...- .-. . .- .-./.--. .-. --- ..-.";
        String mensagemDecodificada2 = arvoreMorse.decodificarMorse(mensagem2);
        System.out.println("Mensagem decodificada: " + mensagemDecodificada2);

        String mensagem3 = "- . .- --/-. --- --- -...";
        String mensagemDecodificada3 = arvoreMorse.decodificarMorse(mensagem3);
        System.out.println("Mensagem decodificada: " + mensagemDecodificada3);

        arvoreMorse.imprimirArvore();
    }
}
