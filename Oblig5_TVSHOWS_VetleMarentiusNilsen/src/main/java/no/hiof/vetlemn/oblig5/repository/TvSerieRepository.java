package no.hiof.vetlemn.oblig5.repository;

import no.hiof.vetlemn.oblig5.model.Episode;
import no.hiof.vetlemn.oblig5.model.TVSerie;

import java.time.LocalDate;
import java.util.ArrayList;

public interface TvSerieRepository {

    ArrayList<TVSerie> getTvSerier();

    TVSerie getEnTvSerie(String tvSerieNavn);

    ArrayList<Episode> getEpisoderiSesong(String tvSerieNavn, int sesongNr);

    Episode getEpisode(String tvSerieNavn, int sesongNr, int episodeNr);

    Episode oppdaterEpisode(String tvSerieNavn, String episodeTittel, String episodeBeskrivelse, int episodeNummer, int sesongNummer, int spilletid, LocalDate utgivelsesdato, String bildeUrl);

    Episode slettEpisode(String tvSerieNavn, int sesongNr, int episodeNr);

    Episode opprettEpiode(String tvSerieNavn, String episodeTittel, String beskrivelse, int episodeNr, int sesongNr, int spilletid, LocalDate utgivelsesdato, String bildeURL);
}
