package br.com.senac.defesa.model;

import java.util.List;

public abstract class RegraDeAlvo {

    public abstract Inimigo escolher(Ponto posicaoDaTorre, List<Inimigo> candidatos);

    public abstract String getNome();
}

