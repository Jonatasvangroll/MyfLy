package pucrs.myflight.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class GerenciadorAeronaves {

    private ArrayList<Aeronave> avioes;

    public GerenciadorAeronaves() {
        this.avioes = new ArrayList<>();
    }

    public void adicionar(Aeronave aviao) {
        avioes.add(aviao);
    }

    public ArrayList<Aeronave> listarTodas() {
        return new ArrayList<>(avioes);
    }

    public Aeronave buscarCodigo(String codigo) {
        for(Aeronave a: avioes)
            if(a.getCodigo().equals(codigo))
                return a;
        return null;
    }

    public void ordenarDescricao() {
        /*
        Collections.sort(avioes);
        */
        avioes.sort(Comparator.comparing(Aeronave::getDescricao).reversed());
    }

    public void ordenarCodigoDescricao() {
        avioes.sort(Comparator.comparing(Aeronave::getCodigo).
            thenComparing(Aeronave::getDescricao));
    }

    public void ordenarCodigo() {
        avioes.sort( (Aeronave a1, Aeronave a2) ->
            a1.getCodigo().compareTo(a2.getCodigo()));
    }
}
