package com.example.calibrivinyls;

import com.example.calibrivinyls.model.Album;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AlbumController {

    private final SupabaseService supabaseService;

    public AlbumController(SupabaseService supabaseService) {
        this.supabaseService = supabaseService;
    }

    @GetMapping("/api/albums")
    public List<Album> getAlbums() {
        return supabaseService.getAlbums();
    }
}