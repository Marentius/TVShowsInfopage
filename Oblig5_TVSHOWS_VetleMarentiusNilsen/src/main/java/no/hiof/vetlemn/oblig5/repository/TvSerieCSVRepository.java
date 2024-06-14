package no.hiof.vetlemn.oblig5.repository;
import no.hiof.vetlemn.oblig5.model.Episode;
import no.hiof.vetlemn.oblig5.model.Person;
import no.hiof.vetlemn.oblig5.model.TVSerie;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;


public class TvSerieCSVRepository implements TvSerieRepository {
    private HashMap<String, TVSerie> tvSeries;

    public TvSerieCSVRepository(File file) {
        this.tvSeries = new HashMap<>();
        this.readFromCSVFile(file);
        this.readAndWrite();
    }



    public HashMap<String, TVSerie> readFromCSVFile(File source){

        try (BufferedReader reader = new BufferedReader(new FileReader(source))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(";");
                String tvSerieTitle = fields[0];
                String tvSerieBeskrivelse = fields[1];
                LocalDate tvSerieUtgivelsesDato = LocalDate.parse(fields[2]);
                String tvSerieBildeURL = fields[3];
                String episodeTitle = fields[4];
                String episodeBeskrivelse = fields[5];
                int episodeNummer = Integer.parseInt(fields[6]);
                int sesongNummer = Integer.parseInt(fields[7]);
                int spilletid = Integer.parseInt(fields[8]);
                LocalDate episodeUtgivelsesdato = LocalDate.parse(fields[9]);
                String episodeURL = fields[10];
                String regissorFornavn = fields[11];
                String regissorEtternavn = fields[12];
                LocalDate regissorFodselsdato = LocalDate.parse(fields[13]);

                TVSerie tvSerie = tvSeries.get(tvSerieTitle);
                if (tvSerie == null) {
                    tvSerie = new TVSerie(tvSerieTitle, tvSerieBeskrivelse, tvSerieUtgivelsesDato, new ArrayList<>(), tvSerieBildeURL);
                    tvSeries.put(tvSerieTitle, tvSerie);
                }

                Episode episode = new Episode(episodeTitle, spilletid, episodeBeskrivelse, episodeUtgivelsesdato, episodeURL, episodeNummer, sesongNummer);
                Person regissor = new Person(regissorFornavn, regissorEtternavn, regissorFodselsdato);
                episode.setRegissor(regissor);
                tvSerie.leggTilEpisode(episode);


            }

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

        return tvSeries;
    }


    @Override
    public ArrayList<TVSerie> getTvSerier() {
        ArrayList<TVSerie> tvSeriesList = new ArrayList<>(tvSeries.values());
        ArrayList<TVSerie> tv = new ArrayList<>();

        for (TVSerie tvSerie : tvSeriesList) {
            tv.add(tvSerie);
        }
        return tv;
    }

    @Override
    public TVSerie getEnTvSerie(String tvSerieNavn) {
        ArrayList<TVSerie> tvSeriesList = new ArrayList<>(tvSeries.values());

        for (TVSerie tvSerie : tvSeriesList) {
            if (tvSerie.getTittel().equals(tvSerieNavn)) {
                return tvSerie;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Episode> getEpisoderiSesong(String tvSerieNavn, int sesongNr) {
        ArrayList<TVSerie> tvSeriesList = new ArrayList<>(tvSeries.values());
        ArrayList<Episode> episodes = new ArrayList<>();
        TVSerie tvSerie = null;

        for (TVSerie serie : tvSeriesList) {
            if (serie.getTittel().equals(tvSerieNavn)) {
                tvSerie = serie;
            }
        }

        if (tvSerie != null) {
            for (Episode episode : tvSerie.getEpisoder()) {
                if (episode.getSesongNummer() == sesongNr) {
                    episodes.add(episode);
                }
            }
        }
        return episodes;
    }

    @Override
    public Episode getEpisode(String tvSerieNavn, int sesongNr, int episodeNr) {
        ArrayList<TVSerie> tvSeriesList = new ArrayList<>(tvSeries.values());
        for (TVSerie serie : tvSeriesList) {
            if (serie.getTittel().equals(tvSerieNavn)) {
                for (Episode episode : serie.getEpisoder()) {
                    if (episode.getSesongNummer() == sesongNr && episode.getEpisodeNummer() == episodeNr) {
                        return episode;
                    }
                }
            }
        }
        return null;
    }

    @Override
    public Episode oppdaterEpisode(String tvSerieNavn, String episodeTittel, String episodeBeskrivelse, int episodeNummer, int sesongNummer, int spilletid, LocalDate utgivelsesdato, String bildeUrl) {
        return null;
    }


    @Override
    public Episode slettEpisode(String tvSerieNavn, int sesongNr, int episodeNr) {
        return null;
    }

    @Override
    public Episode opprettEpiode(String tvSerieNavn, String episodeTittel, String beskrivelse, int episodeNr, int sesongNr, int spilletid, LocalDate utgivelsesdato, String bildeURL) {
        return null;
    }


    public void readAndWrite(){
    ArrayList<TVSerie> tvSeriesList = new ArrayList<>(tvSeries.values());
    //Jeg oppretter nye json. filer bare for å vise at filene blir oppdatert uten å endre den eksisterende tvshows_10 filen
    try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("backup.csv"))) {
        for (TVSerie tvSerie : tvSeriesList) {
            for (Episode episode : tvSerie.getEpisoder()) {
                try {
                    bufferedWriter.write(tvSerie.getTittel() + ";" + tvSerie.getBeskrivelse() + ";" + tvSerie.getUtgivelsesdato() + ";" + tvSerie.getBildeUrl() + ";" + episode.getTittel() + ";" + episode.getBeskrivelse() + ";" + episode.getEpisodeNummer() + ";" + episode.getSesongNummer() + ";" + episode.getSpilletid() + ";" + episode.getUtgivelsesdato() + ";" + episode.getBildeUrl() + ";" + episode.getRegissor().getFornavn() + ";" + episode.getRegissor().getEtterNavn() + ";" + episode.getRegissor().getFodselsDato() + "\n");
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }
    } catch (IOException ex) {
        throw new RuntimeException(ex);
    }
}

}


