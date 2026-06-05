package com.example.calibrivinyls;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class CalibriVinylsApplication {

    private final SupabaseService supabaseService;

    public CalibriVinylsApplication(SupabaseService supabaseService) {
        this.supabaseService = supabaseService;
    }

    public static void main(String[] args) {
        SpringApplication.run(CalibriVinylsApplication.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }


    @GetMapping("/api/albums")
    @ResponseBody
    public String getAlbums() {
        return supabaseService.getAlbums();
    }

    
}

