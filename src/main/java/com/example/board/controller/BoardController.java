package com.example.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class BoardController {

    @GetMapping("/board/write")
    public String boardWriteForm() {
        return "boardWrite";
    }
}
