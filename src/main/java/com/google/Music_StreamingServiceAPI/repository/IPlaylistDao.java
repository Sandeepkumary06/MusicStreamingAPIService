package com.google.Music_StreamingServiceAPI.repository;

import com.google.Music_StreamingServiceAPI.model.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPlaylistDao extends JpaRepository<Playlist,Integer> {
}
