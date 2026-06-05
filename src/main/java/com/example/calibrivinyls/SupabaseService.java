package com.example.calibrivinyls;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class SupabaseService {

    private final WebClient webClient;


    
    public SupabaseService(
            @Value("${supabase.url}") String supabaseUrl,
            @Value("${supabase.publishable-key}") String supabaseKey
    ) {

            System.out.println("SUPABASE URL = " + supabaseUrl);
    System.out.println("SUPABASE KEY = " + supabaseKey);

        this.webClient = WebClient.builder()
                .baseUrl(supabaseUrl + "/rest/v1")
                .defaultHeader("apikey", supabaseKey)
                .defaultHeader("Authorization", "Bearer " + supabaseKey)
                .defaultHeader("Content-Type", "application/json")
                .build();
    }

    public String getAlbums() {
        return webClient.get()
                .uri("/albums?select=*")
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }
}