package com.example.board.service;

import com.example.board.entity.BoardEntity;
import com.example.board.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;

    public void write(BoardEntity board) {
        boardRepository.save(board);
    }
}
