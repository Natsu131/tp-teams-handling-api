package fr.sorbonne.paris.nord.university.api.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "team")
public class TeamEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }
}
