/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bgames.controller;

/**
 *
 * @author Borgar
 */

import com.bgames.domain.NewMessage;
import java.util.Date;

import org.slf4j.*;
import org.springframework.messaging.handler.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.messaging.simp.annotation.SubscribeMapping;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Controller
public class SocketController {
    @Autowired private SimpMessagingTemplate simpMessagingTemplate;
    
    @MessageMapping("/chat.hei")public void sendMessage(@Payload NewMessage message, SimpMessageHeaderAccessor headers) {
        System.out.println("Message sent was: " + message);
        message.setMessage("Randomly generated stuff from JAVA::: ");
        System.out.println("New message is: " + message);
        simpMessagingTemplate.convertAndSend("/topic/message.hei", message);
    }
    
}

