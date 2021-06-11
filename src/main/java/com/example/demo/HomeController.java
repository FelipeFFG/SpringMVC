package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    @PersistenceContext
    private EntityManager entityManager;    //se conecntar com o banco de dados


    @GetMapping("/home")
    public String home(Model model){

        Query query = entityManager.createQuery("select p from Pedido p",Pedido.class);          //Percorrer os valores populados na query pertencentes a Pedidos.
        List<Pedido> pedidos = query.getResultList();

        model.addAttribute("pedidos",pedidos);
        return "home";
    }
}
