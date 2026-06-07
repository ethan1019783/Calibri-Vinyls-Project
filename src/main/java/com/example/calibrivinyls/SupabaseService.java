package com.example.calibrivinyls;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.calibrivinyls.model.Album;

@Service
public class SupabaseService {

    private final WebClient webClient;


    
    public SupabaseService(
            @Value("${supabase.url}") String supabaseUrl,
            @Value("${supabase.publishable-key}") String supabaseKey
    ) {

        this.webClient = WebClient.builder()
                .baseUrl(supabaseUrl + "/rest/v1")
                .defaultHeader("apikey", supabaseKey)
                .defaultHeader("Authorization", "Bearer " + supabaseKey)
                .defaultHeader("Content-Type", "application/json")
                .build();
    }

    // public List<Album> getAlbums() {
    //     return webClient.get()
    //             .uri("/albums?select=*")
    //             .retrieve()
    //             .bodyToFlux(Album.class)
    //             .collectList()
    //             .block();

    // }

    public List<Album> getAlbums() {
    List<Album> albums = webClient.get()
            .uri("/albums?select=*")
            .retrieve()
            .bodyToFlux(Album.class)
            .collectList()
            .block();

    return albums;
}
}