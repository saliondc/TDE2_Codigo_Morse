package TDE2_Codigo_Morse;

public class ArvoreMorse {
    private NoMorse noRaiz;

    public ArvoreMorse() {
        noRaiz = new NoMorse();
    }

    public void inserirMorse(String codigoMorse, String letraOuNumero) {
        NoMorse noAtual = noRaiz;
        for (char simbolo : codigoMorse.toCharArray()) {
            if (simbolo == '.') {
                if (noAtual.getFilhoEsquerdo() == null) {
                    noAtual.setFilhoEsquerdo(new NoMorse());
                }
                noAtual = noAtual.getFilhoEsquerdo();
            } else if (simbolo == '-') {
                if (noAtual.getFilhoDireito() == null) {
                    noAtual.setFilhoDireito(new NoMorse());
                }
                noAtual = noAtual.getFilhoDireito();
            }
        }
        noAtual.setValor(letraOuNumero);
    }

    public String buscarMorse(String codigoMorse) {
        NoMorse noAtual = noRaiz;

        for (char simbolo : codigoMorse.toCharArray()) {
            if (simbolo == '.') {
                noAtual = noAtual.getFilhoEsquerdo();
            } else if (simbolo == '-') {
                noAtual = noAtual.getFilhoDireito();
            }

            if (noAtual == null) {
                return null;
            }
        }

        return noAtual.getValor();
    }
    public String decodificarMorse(String mensagemMorse) {
        StringBuilder resultado = new StringBuilder();
        String[] palavras = mensagemMorse.trim().split("/");

        for (String palavra : palavras) {
            String[] letras = palavra.split(" ");
            for (String letraMorse : letras) {
                String letra = buscarMorse(letraMorse);
                if (letra != null) {
                    resultado.append(letra);
                } else {
                    System.out.println("Código Morse inválido: " + letraMorse);
                    resultado.append("?");
                }
            }
            resultado.append(" ");
        }

        return resultado.toString().trim();
    }

    public void imprimirArvore() {
        Stack<NoMorse> pilhaGlobal = new Stack<>(100);
        pilhaGlobal.push(noRaiz);
        int espacos = 66;
        boolean linhaVazia = false;
        String separador = "-----------------------------------------------------------------";
        System.out.println(separador);

        while (!linhaVazia) {
            Stack<NoMorse> pilhaLocal = new Stack<>(100);
            linhaVazia = true;

            for (int j = 0; j < espacos; j++)
                System.out.print(' ');

            while (!pilhaGlobal.isEmpty()) {
                NoMorse temp = pilhaGlobal.pop();
                if (temp != null) {
                    System.out.print(temp.getValor() != null ? temp.getValor() : "__");
                    pilhaLocal.push(temp.getFilhoEsquerdo());
                    pilhaLocal.push(temp.getFilhoDireito());

                    if (temp.getFilhoEsquerdo() != null || temp.getFilhoDireito() != null)
                        linhaVazia = false;
                } else {
                    System.out.print("__");
                    pilhaLocal.push(null);
                    pilhaLocal.push(null);
                }
                for (int j = 0; j < espacos * 2 - 2; j++)
                    System.out.print(' ');
            }
            System.out.println();
            espacos /= 2;
            while (!pilhaLocal.isEmpty())
                pilhaGlobal.push(pilhaLocal.pop());
        }
        System.out.println(separador);
    }
}