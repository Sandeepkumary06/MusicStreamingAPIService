package com.google.Music_StreamingServiceAPI.repository;

import com.google.Music_StreamingServiceAPI.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISongDao extends JpaRepository<Song,Integer> {
}
