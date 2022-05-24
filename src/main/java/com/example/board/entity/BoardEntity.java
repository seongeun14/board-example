package com.example.board.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "board")
@Data
public class BoardEntity {

    @Id
    @Column(name="BOARD_SEQ")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer boardSeq;

    @Column(name="TITLE")
    private String title;

    @Column(name="CONTENT")
    private String content;

}