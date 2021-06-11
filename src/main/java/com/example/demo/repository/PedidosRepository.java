package com.example.demo.repository;

import java.util.List;
import com.example.demo.model.Pedido;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


@Repository
public class PedidosRepository {              //fala pro Spring que essa classe é um repositorio, e que ela deve criar instancias toda vez que alguem pedir.

    @PersistenceContext
    private EntityManager entityManager;


    public List<Pedido> recuperaTodosOsPedidos() {
        Query query = entityManager.createQuery("select p from Pedido p",Pedido.class);          //Percorrer os valores populados na query pertencentes a Pedidos.
        return  query.getResultList();
    }


}
