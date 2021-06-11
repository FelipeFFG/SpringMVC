package com.example.demo.repository;

import com.example.demo.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository                                                             //fala pro Spring que essa classe é um repositorio, e que ela deve criar instancias toda vez que alguem pedir.
public interface PedidosRepository extends JpaRepository<Pedido, Long> {      //Utilizando SpringDataJPA

}
