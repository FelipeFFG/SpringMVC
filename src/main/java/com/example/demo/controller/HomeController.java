package com.example.demo.controller;

import com.example.demo.model.Pedido;
import com.example.demo.repository.PedidosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;

@Controller
public class HomeController {

    @Autowired                                    //pedi para o spring uma instancia de repository
    private PedidosRepository repository;         //separando a controladora do repositorio, onde agora para acessar o banco de dados ele tem que chamar a clase PedidosRepository

    @GetMapping("/home")
    public String home(Model model){
        List<Pedido> pedidos =repository.recuperaTodosOsPedidos();
        model.addAttribute("pedidos",pedidos);
        return "home";
    }



}
