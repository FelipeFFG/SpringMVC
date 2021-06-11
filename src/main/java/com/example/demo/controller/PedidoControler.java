package com.example.demo.controller;


import com.example.demo.dto.RequisicaoNovoPedido;
import com.example.demo.model.Pedido;
import com.example.demo.repository.PedidosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("pedido")                    //definir uma parte da rota
public class PedidoControler {


    @Autowired                                  //pedir pro Spring criar uma classe
    private PedidosRepository pedidosRepository;

    @GetMapping("formulario")
    public String formulario(){
        return "pedido/formulario";
    }

    @PostMapping("novo")
    public String novo(RequisicaoNovoPedido requisicao){   //Criar um DTO(Data transfer Objetct) para receber os dados da requisição,evitando assim uma falha de segurança chamada Web Parameter Tampering,
                                                           // visto que passar um objeto passaria mais dados do que foi previsto.
        Pedido pedido = requisicao.toPedido();
        pedidosRepository.save(pedido);          //salvar o pedido ndo banco de daos, usando JpaRepository

        return "pedido/formulario";
    }


}
