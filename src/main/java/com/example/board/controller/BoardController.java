package com.example.board.controller;

import com.example.board.entity.BoardEntity;
import com.example.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BoardController {

    @Autowired
    private BoardService boardService;

    @GetMapping("/board/write")
    public String boardWriteForm() {
        return "boardWrite";
    }

    @PostMapping("/board/writepro")
    public String boardWritePro(BoardEntity board) {
        boardService.write(board);

        return "";
    }
}
