package com.rain.demo.controller;

import com.rain.demo.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GameController {

    @Autowired
    private GameService gameService;

    @RequestMapping("/")
    @ResponseBody
    public String start(){
        return "游戏开始";
    }


    @RequestMapping("/1")
    @ResponseBody
    public void fightAer(){
        gameService.fightAer();
    }

    @RequestMapping("/2")
    @ResponseBody
    public void fightCai(){
        gameService.fightCai();
    }

    @RequestMapping("/3")
    @ResponseBody
    public void fightQiong(){
        gameService.fightQiong();
    }

}
