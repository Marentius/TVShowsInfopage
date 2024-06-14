package no.hiof.vetlemn.oblig5.thread;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import no.hiof.vetlemn.oblig5.model.TVSerie;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class WriteToFileThread  extends  Thread implements Runnable {
    private final ArrayList<TVSerie> series;
    private final File file;

    public WriteToFileThread(ArrayList<TVSerie> series, File file) {
        this.series = series;
        this.file = file;
    }

    @Override
    public void run() {
        ObjectMapper objectMapper = new ObjectMapper().registerModule(new JavaTimeModule());
        try {
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(file, series);
            System.out.println(Thread.currentThread().getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
