package org.jeka.demowebinar1no_react.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LoadedDocument {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String filename;
    private String contentHash;

    private String documentType;

    private int chunkCount;

    @CreationTimestamp
    private LocalDateTime loadedAt ;
}

//    id            SERIAL PRIMARY KEY,
//    filename      VARCHAR(255) NOT NULL,
//    content_hash  VARCHAR(64) NOT NULL,
//    document_type VARCHAR(10) NOT NULL,
//    chunk_count   INTEGER,
//    loaded_at     TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,