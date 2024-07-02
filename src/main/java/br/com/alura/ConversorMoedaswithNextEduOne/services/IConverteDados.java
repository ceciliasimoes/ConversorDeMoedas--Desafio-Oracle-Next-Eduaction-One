package br.com.alura.ConversorMoedaswithNextEduOne.services;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
