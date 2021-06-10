package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.model.Pedido;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {


    @GetMapping("/home")
    public String home(Model model){
        Pedido pedido = new Pedido();
        pedido.setNomeProduto("Xiaomi redmi Note8");
        pedido.setUrlImagem("https://d2r9epyceweg5n.cloudfront.net/stores/001/124/914/products/celular_xiaomi_pocophone_x3_dual_chip_128gb_4g_120949_550x5501-37b84d83248bc2473616180181293616-1024-1024.jpg");
        pedido.setUrlProduto("https://lojaxiaomicuritiba.com.br/produtos/xiaomi-poco-x3-versao-global/");
        pedido.setDescricao("Uma descrição qualquer para esse pedido");

        List<Pedido> pedidos = Arrays.asList(pedido);
        model.addAttribute("pedidos",pedidos);
        return "home";
    }
}
