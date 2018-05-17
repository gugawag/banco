package br.edu.gugawag.banco;

public class ContaJahExistenteException extends Exception{

    public ContaJahExistenteException(String mensagem){
        super(mensagem);
    }
}
