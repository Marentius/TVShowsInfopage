package no.hiof.vetlemn.oblig5.controller;

import io.javalin.http.Context;
import no.hiof.vetlemn.oblig5.model.TVSerie;
import no.hiof.vetlemn.oblig5.repository.TvSerieRepository;

import java.util.ArrayList;

public class TvSerieController {
    private TvSerieRepository tvSerieRepository;

    public TvSerieController(TvSerieRepository tvSerieRepository) {
        this.tvSerieRepository = tvSerieRepository;
    }

    public void getTvSerier(Context context){
        ArrayList<TVSerie> tvSerier = tvSerieRepository.getTvSerier();

        context.json(tvSerier);
    }

    public void getEnTvserie(Context context){
        String tvSerieNavn = context.pathParam("tvserie-id");

        TVSerie tvSerie = tvSerieRepository.getEnTvSerie(tvSerieNavn);

        context.json(tvSerie);
    }
}
