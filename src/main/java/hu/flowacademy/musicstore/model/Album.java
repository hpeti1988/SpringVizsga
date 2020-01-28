package hu.flowacademy.musicstore.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "album")
@Data
@NoArgsConstructor
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String title;
    @Column
    private Long count;

    public Album(Long id, String title, Long count) {
        this.id = id;
        this.title = title;
        this.count = count;
    }
}
