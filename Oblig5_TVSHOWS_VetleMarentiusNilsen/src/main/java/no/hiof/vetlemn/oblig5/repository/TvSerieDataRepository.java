package no.hiof.vetlemn.oblig5.repository;

import com.fasterxml.jackson.annotation.JsonIgnore;
import no.hiof.vetlemn.oblig5.model.Episode;
import no.hiof.vetlemn.oblig5.model.Person;
import no.hiof.vetlemn.oblig5.model.TVSerie;

import java.time.LocalDate;
import java.util.ArrayList;

public class TvSerieDataRepository implements TvSerieRepository{
    private ArrayList<TVSerie> tvSerieArrayList = new ArrayList<>();

    public TvSerieDataRepository() {
        genererData();
    }

    private void genererData() {

        TVSerie theOffice = new TVSerie("The Office", "A mockumentary on a group of typical office workers, where the workday consists of ego clashes, inappropriate behavior, and tedium.", LocalDate.of(2005,3,24), new ArrayList<>(), "https://mfiles.alphacoders.com/445/445003.jpg");


        Episode pilot = new Episode("Pilot", 23, "The premiere episode introduces the boss and staff of the Dunder-Mifflin Paper Company in Scranton, Pennsylvania in a documentary about the workplace.", LocalDate.of(2005,3,24), "https://m.media-amazon.com/images/M/MV5BY2NkOTllZGYtMzE0My00OTlkLTg5MTgtOTdhMDA0MjcwODgxXkEyXkFqcGdeQXVyNjczMzI0NzE@._V1_UY126_CR0,0,224,126_AL_.jpg", 1, 1);
        Episode diversityDay = new Episode("Diversity Day", 23, "Michael's off color remark puts a sensitivity trainer in the office for a presentation, which prompts Michael to create his own.", LocalDate.of(2005,3,16), "https://m.media-amazon.com/images/M/MV5BMTQ3OTE0MDE3MF5BMl5BanBnXkFtZTgwOTk4MjU1MjE@._V1_UX224_CR0,0,224,126_AL_.jpg", 2, 1);
        Episode healthCare = new Episode("Health Care", 22, "Michael leaves Dwight in charge of picking the new healthcare plan for the staff, with disastrous results ahead.", LocalDate.of(2005,4,5), "https://m.media-amazon.com/images/M/MV5BMTUxNDMxMjg1MV5BMl5BanBnXkFtZTgwNTk4MjU1MjE@._V1_UX224_CR0,0,224,126_AL_.jpg", 3, 1);
        Episode theAlliance = new Episode("The Alliance", 23, "Just for a laugh, Jim agrees to an alliance with Dwight regarding the downsizing rumors.", LocalDate.of(2005,4,12), "https://m.media-amazon.com/images/M/MV5BMjQwODAzNzc2Ml5BMl5BanBnXkFtZTgwNjk4MjU1MjE@._V1_UX224_CR0,0,224,126_AL_.jpg", 4, 1);
        Episode basketball = new Episode("Basketball", 23, "Michael and his staff challenge the warehouse workers to a basketball game with a bet looming over both parties.", LocalDate.of(2005,4,19), "https://m.media-amazon.com/images/M/MV5BZDg0NmQxYmUtZTFmYi00NWUzLWFlOWUtNWVhZDQzN2I0ZjM2XkEyXkFqcGdeQXVyMDgyNjA5MA@@._V1_UY126_CR1,0,224,126_AL_.jpg", 5, 1);
        Episode hotGirl = new Episode("Hot Girl", 23, "Michael is just one of the many male staff who start vying for the attention of an attractive saleswoman in the office.", LocalDate.of(2005,4,26), "https://m.media-amazon.com/images/M/MV5BYjAzMmVkMGItOThkMC00M2I0LWFlOTEtYWE1MmEyNWNmYTZhXkEyXkFqcGdeQXVyNTEzNTM4OTg@._V1_UY126_UX224_AL_.jpg", 6, 1);

        Episode theDundies = new Episode("The Dundies", 21, "Very much unlike his staff, an overeager Michael can't wait for this year's annual Dundies awards.", LocalDate.of(2005,9,20), "https://m.media-amazon.com/images/M/MV5BMTQ5MDM1NjkwM15BMl5BanBnXkFtZTgwMDE5MjU1MjE@._V1_UX224_CR0,0,224,126_AL_.jpg", 1, 2);
        Episode sexualHarassment = new Episode("Sexual Harassment", 22, "The office reviews its sexual harassment policy in light of explicit e-mails.", LocalDate.of(2005,9,27), "https://m.media-amazon.com/images/M/MV5BMTg0NzM0NjAxM15BMl5BanBnXkFtZTgwNjQ5MjU1MjE@._V1_UX224_CR0,0,224,126_AL_.jpg", 2, 2);
        Episode officeOlympics = new Episode("Office Olympics", 22, "Ready to finalize his deal for a new condo, Michael is away with Dwight while Jim rallies the staff together for office games.", LocalDate.of(2005,10,4), "https://m.media-amazon.com/images/M/MV5BMjMzODkyMzAyNF5BMl5BanBnXkFtZTgwMjI5MjU1MjE@._V1_UX224_CR0,0,224,126_AL_.jpg", 3, 2);
        Episode theFire = new Episode("The Fire", 22, "A fire in the kitchen relegates the staff to the parking lot as help is on its way.", LocalDate.of(2005,10,11), "https://m.media-amazon.com/images/M/MV5BMTk1NTIxMzU5MV5BMl5BanBnXkFtZTgwMzM5MjU1MjE@._V1_UX224_CR0,0,224,126_AL_.jpg", 4, 2);
        Episode halloween = new Episode("Halloween", 30, "Michael is pressured by corporate to fire someone, which puts a damper on the office Halloween party.", LocalDate.of(2005,10,18), "https://m.media-amazon.com/images/M/MV5BOTYyNTAwODU2Ml5BMl5BanBnXkFtZTgwOTU4MjU1MjE@._V1_UX224_CR0,0,224,126_AL_.jpg", 5, 2);
        Episode theFight = new Episode("The Fight", 22, "Jim rallies the staff together to witness a showdown between Michael and Dwight at Dwight's martial arts school.", LocalDate.of(2005,11,1), "https://m.media-amazon.com/images/M/MV5BMjExMTc2MDE0MV5BMl5BanBnXkFtZTgwNTk5MjU1MjE@._V1_UX224_CR0,0,224,126_AL_.jpg", 6, 2);

        pilot.setRegissor(new Person("Ken Kwapis"));
        diversityDay.setRegissor(new Person("Ken Kwapis"));
        healthCare.setRegissor(new Person("Ken Whittingham"));
        theAlliance.setRegissor(new Person("Bryan Gordon"));
        basketball.setRegissor(new Person("Greg Daniels"));
        hotGirl.setRegissor(new Person("Amy Heckerling"));

        theDundies.setRegissor(new Person("Greg Daniels"));
        sexualHarassment.setRegissor(new Person("Ken Kwapis"));
        officeOlympics.setRegissor(new Person("Paul Feig"));
        theFire.setRegissor(new Person("Ken Kwapis"));
        halloween.setRegissor(new Person("Paul Feig"));
        theFight.setRegissor(new Person("Ken Kwapis"));

        theOffice.leggTilEpisode(pilot);
        theOffice.leggTilEpisode(diversityDay);
        theOffice.leggTilEpisode(healthCare);
        theOffice.leggTilEpisode(theAlliance);
        theOffice.leggTilEpisode(basketball);
        theOffice.leggTilEpisode(hotGirl);
        theOffice.leggTilEpisode(theDundies);
        theOffice.leggTilEpisode(sexualHarassment);
        theOffice.leggTilEpisode(officeOlympics);
        theOffice.leggTilEpisode(theFire);
        theOffice.leggTilEpisode(halloween);
        theOffice.leggTilEpisode(theFight);

        TVSerie fantasi = new TVSerie("The Witcher", "Geralt of Rivia, a solitary monster hunter, struggles to find his place in a world where people often prove more wicked than beasts.", LocalDate.of(2019,12,20), new ArrayList<>(), "https://i.pinimg.com/736x/d1/c3/8e/d1c38e950a439325388a223171fd955c.jpg");


        Episode theEndsBeginning = new Episode("The End's Beginning", 61, "Hostile townsfolk and a cunning mage greet Geralt in the town of Blaviken. Ciri finds her royal world upended when Nilfgaard sets its sights on Cintra.", LocalDate.of(2019,12,20), "https://m.media-amazon.com/images/M/MV5BM2Q5MGU2ZTktYmE4OS00YTkzLWJjZWUtY2RkZWIyNTZkNmVlXkEyXkFqcGdeQXVyODAxMjg3MTU@._V1_UX224_CR0,0,224,126_AL_.jpg", 1, 1);
        Episode fourMarks = new Episode("Four Marks", 61, "Bullied and neglected, Yennefer accidentally finds a means of escape. Geralt's hunt for a so-called devil goes to hell. Ciri seeks safety in numbers.", LocalDate.of(2019,12,20), "https://m.media-amazon.com/images/M/MV5BZWQ3MzZkY2QtZjA0My00MGI0LWE4ZWEtMGZhMDRhYWRkYzkyXkEyXkFqcGdeQXVyMDM2NDM2MQ@@._V1_UX224_CR0,0,224,126_AL_.jpg", 2, 1);
        Episode betrayerMoon = new Episode("Betrayer Moon", 67, "Geralt takes on another Witcher's unfinished business in a kingdom stalked by a ferocious beast. At a brutal cost, Yennefer forges a magical new future.", LocalDate.of(2019,12,20), "https://m.media-amazon.com/images/M/MV5BZWE3NDI0NGUtY2Q5ZC00ZDA1LWE5MGYtZjlmNTU1OTYwMjAzXkEyXkFqcGdeQXVyMDM2NDM2MQ@@._V1_UX224_CR0,0,224,126_AL_.jpg", 3, 1);
        Episode ofBanquetsBastardsAndBurials = new Episode("Of Banquets, Bastards and Burials", 62, "Against his better judgment, Geralt accompanies Jaskier to a royal ball. Ciri wanders into an enchanted forest. Yennefer tries to protect her charges.", LocalDate.of(2019,12,20), "https://m.media-amazon.com/images/M/MV5BMDhjMzZhOTUtNjBiOC00MGZkLWFmODAtYjc4MDIyN2ViYjkwXkEyXkFqcGdeQXVyNTQxOTM1NTc@._V1_UX224_CR0,0,224,126_AL_.jpg", 4, 1);
        Episode bottledAppetites = new Episode("Bottled Appetites", 59, "Heedless of warnings, Yennefer looks for a cure to restore what she's lost. Geralt inadvertently puts Jaskier in peril. The search for Ciri intensifies.", LocalDate.of(2019,12,20), "https://m.media-amazon.com/images/M/MV5BYTAxZTYwMDUtOWFjNi00M2FhLWI0MzctZjFkNjFmMWE5MzRhXkEyXkFqcGdeQXVyNTQxOTM1NTc@._V1_UX224_CR0,0,224,126_AL_.jpg", 5, 1);
        Episode rareSpecies = new Episode("Rare Species", 59, "A mysterious man tries to entice Geralt to join a hunt for a rampaging dragon, a quest that attracts a familiar face. Ciri questions who she can trust.", LocalDate.of(2019,12,20), "https://m.media-amazon.com/images/M/MV5BZTFkYjU2NDgtZGQ1Yi00NjI2LWJhMjktYjdiNWJlNDBjOTE4XkEyXkFqcGdeQXVyMTEyMjM2NDc2._V1_UX224_CR0,0,224,126_AL_.jpg", 6, 1);
        Episode beforeAFall = new Episode("Before a Fall", 47, "With the Continent at risk from Nilfgaard's rising power, Yennefer revisits her past, while Geralt reconsiders his obligation to the Law of Surprise.", LocalDate.of(2019,12,20), "https://m.media-amazon.com/images/M/MV5BMWI3MDBkMzItNWRkZS00YjdmLWI1ZDAtNTI1YjllODZhMWM4XkEyXkFqcGdeQXVyMjg2MTMyNTM@._V1_UX224_CR0,0,224,126_AL_.jpg", 7, 1);
        Episode muchMore = new Episode("Much More", 59, "A terrifying pack of foes lays Geralt low. Yennefer and her fellow mages prepare to fight back. A shaken Ciri depends on the kindness of a stranger.", LocalDate.of(2019,12,20), "https://m.media-amazon.com/images/M/MV5BYjc3NTk0ODktMTllMS00N2E5LTg4MzgtMjNiOTBhMTZlODM5XkEyXkFqcGdeQXVyMjQ3MTkwNzI@._V1_UY126_UX224_AL_.jpg", 8, 1);

        Episode aGrainOfTruth = new Episode("A Grain of Truth", 63, "Geralt sets off with Ciri on a journey that leads him to an old friend. After the battle of Sodden, Tissaia shows no mercy in her search of information.", LocalDate.of(2021,12,17), "https://m.media-amazon.com/images/M/MV5BNWZjNGZhMGEtNTI3OC00OWUxLThjMzQtNTc0MjhhMzMzMDgxXkEyXkFqcGdeQXVyMTM0MDY5NjA4._V1_UY126_CR14,0,224,126_AL_.jpg", 1, 2);
        Episode kaerMorhen = new Episode("Kaer Morhen", 58, "Seeking a safe place for Ciri, Geralt heads for home, but danger lurks everywhere - even Kaer Morhen. Yennefer's dreams could be the key to her freedom.", LocalDate.of(2021,12,17), "https://m.media-amazon.com/images/M/MV5BYWZlZTc0YmUtZjU0OS00MmU4LThjZjgtZmY1MDI3ZTU4M2YzXkEyXkFqcGdeQXVyMTM2MDI5MzM0._V1_UY126_UX224_AL_.jpg", 2, 2);
        Episode whatIsLost = new Episode("What Is Lost", 59, "Impatient with Geralt's methods, Ciri braves major obstacles to prove her mettle. Scheming and suspicion among the Brotherhood make Yennefer a target.", LocalDate.of(2021,12,17), "https://m.media-amazon.com/images/M/MV5BOGM0MjExNjMtNGFlYS00Y2YzLThkZDAtNGVhNzJlODQzOGFjXkEyXkFqcGdeQXVyMTEzMTI1Mjk3._V1_UX224_CR0,0,224,126_AL_.jpg", 3, 2);
        Episode redanianIntelligence = new Episode("Redanian Intelligence", 55, "A guest at Kaer Morhen extends a guiding hand to Ciri - and an invitation to Geralt. On the run in Redania, Yennefer seeks safety below ground.", LocalDate.of(2021,12,17), "https://m.media-amazon.com/images/M/MV5BMzZhYjRlYjItZWU1NS00NmI2LWI2ZDQtMWViNzIyNDc2NDM0XkEyXkFqcGdeQXVyMTM2MDI5MzM0._V1_UX224_CR0,0,224,126_AL_.jpg", 4, 2);
        Episode turnYourBack = new Episode("Turn Your Back", 56, "As a powerful mage joins the hunt for Ciri, she cuts a deal with Vesemir over his extraordinary discovery. Geralt explores the mystery of the monoliths.", LocalDate.of(2021,12,17), "https://m.media-amazon.com/images/M/MV5BZTFhODQxODgtMTM3Ny00YzU1LWEzY2YtNGExYmYwMWFjNjg0XkEyXkFqcGdeQXVyMTEzMTI1Mjk3._V1_UX224_CR0,0,224,126_AL_.jpg", 5, 2);
        Episode dearFriend = new Episode("Dear Friend...", 57, "A close friend is lost - and another found - as Geralt helps Ciri learn more about her power. Cahir warns Fringilla to focus on their primary mission.", LocalDate.of(2021,12,17), "https://m.media-amazon.com/images/M/MV5BMDgxYTIwODctNTQxMi00YzEwLWJiMzAtMGM3MjYwMGU1ZTAxXkEyXkFqcGdeQXVyOTg1NzY1MDg@._V1_UY126_CR8,0,224,126_AL_.jpg", 6, 2);
        Episode volethMeir = new Episode("Voleth Meir", 54, "Geralt turns to a humble bard for help, Yennifer realizes just how special Ciri is, and tensions rise on the eve of Emperor Emhyr's visit to Cintra.", LocalDate.of(2021,12,17), "https://m.media-amazon.com/images/M/MV5BNDEzMDk2OTAtOTFjZC00NTRhLTg1ZDYtZGZjMGVjZDQyN2JkXkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_UY126_UX224_AL_.jpg", 7, 2);
        Episode family = new Episode("Family", 52, "Geralt faces off with a demon targeting his nearest and dearest while the most powerful players on the continent ramp up their pursuit of Ciri.", LocalDate.of(2021,12,17), "https://m.media-amazon.com/images/M/MV5BZGZlNjI5MzMtMmY1Ni00ZDFhLWI0NTYtMzgxMWU5N2ZkNTM5XkEyXkFqcGdeQXVyMjg2MTMyNTM@._V1_UX224_CR0,0,224,126_AL_.jpg", 8, 2);


        theEndsBeginning.setRegissor(new Person("Alik Sakharov"));
        fourMarks.setRegissor(new Person("Alik Sakharov"));
        betrayerMoon.setRegissor(new Person("Alex Garcia Lopez"));
        ofBanquetsBastardsAndBurials.setRegissor(new Person("Alex Garcia Lopez"));
        bottledAppetites.setRegissor(new Person("Charlotte Brändström"));
        rareSpecies.setRegissor(new Person("Charlotte Brändström"));
        beforeAFall.setRegissor(new Person("Marc Jobst & Alik Sakharov"));
        muchMore.setRegissor(new Person("Marc Jobst"));

        aGrainOfTruth.setRegissor(new Person("Stephen Surjik"));
        kaerMorhen.setRegissor(new Person("Stephen Surjik"));
        whatIsLost.setRegissor(new Person("Sarah O'Gorman"));
        redanianIntelligence.setRegissor(new Person("Sarah O'Gorman"));
        turnYourBack.setRegissor(new Person("Edward Bazalgette"));
        dearFriend.setRegissor(new Person("Louise Hooper"));
        volethMeir.setRegissor(new Person("Louise Hooper"));
        family.setRegissor(new Person("Edward Bazalgette"));

        fantasi.leggTilEpisode(theEndsBeginning);
        fantasi.leggTilEpisode(fourMarks);
        fantasi.leggTilEpisode(betrayerMoon);
        fantasi.leggTilEpisode(ofBanquetsBastardsAndBurials);
        fantasi.leggTilEpisode(bottledAppetites);
        fantasi.leggTilEpisode(rareSpecies);
        fantasi.leggTilEpisode(beforeAFall);
        fantasi.leggTilEpisode(muchMore);

        fantasi.leggTilEpisode(aGrainOfTruth);
        fantasi.leggTilEpisode(kaerMorhen);
        fantasi.leggTilEpisode(whatIsLost);
        fantasi.leggTilEpisode(redanianIntelligence);
        fantasi.leggTilEpisode(turnYourBack);
        fantasi.leggTilEpisode(dearFriend);
        fantasi.leggTilEpisode(volethMeir);
        fantasi.leggTilEpisode(family);

        tvSerieArrayList.add(theOffice);
        tvSerieArrayList.add(fantasi);

    }

    @Override     @JsonIgnore
    public ArrayList<TVSerie> getTvSerier() {
        ArrayList<TVSerie> tv = new ArrayList<>();

        for (TVSerie tvSerie : tvSerieArrayList){
            tv.add(tvSerie);
        }
        return tv;
    }

    @Override     @JsonIgnore
    public TVSerie getEnTvSerie(String tvSerieNavn) {
        for (TVSerie tvSerie : tvSerieArrayList){
            if (tvSerie.getTittel().equals(tvSerieNavn)){
                return tvSerie;
            }
        }
        return null;
    }

    @Override     @JsonIgnore
    public ArrayList<Episode> getEpisoderiSesong(String tvSerieNavn, int sesongNr) {
        ArrayList<Episode> episodes = new ArrayList<>();
        TVSerie tvSerie = null;

        for (TVSerie serie : tvSerieArrayList) {
            if (serie.getTittel().equals(tvSerieNavn)){
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


    @Override     @JsonIgnore
    public Episode getEpisode(String tvSerieNavn, int sesongNr, int episodeNr) {
        for (TVSerie serie : tvSerieArrayList) {
            if (serie.getTittel().equals(tvSerieNavn)){
                for (Episode episode : serie.getEpisoder()) {
                    if (episode.getSesongNummer() == sesongNr && episode.getEpisodeNummer() == episodeNr){
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


}
