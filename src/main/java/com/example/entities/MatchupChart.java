package com.example.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "matchup_charts")
public class MatchupChart {
    @Id
    @SequenceGenerator(
            name = "matchup_chart_sequence",
            sequenceName = "matchup_chart_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "matchup_chart_sequence"
    )
    private Long id;
    private Long user;
    private Long character;
}
