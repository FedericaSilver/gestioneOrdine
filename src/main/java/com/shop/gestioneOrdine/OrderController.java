package com.shop.gestioneOrdine;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.service.annotation.PatchExchange;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class OrderController {
    /*
    L'applicazione deve permettere di creare un nuovo ordine,(FATTO)
ottenere l'elenco degli ordini (FATTO)
aggiornare lo stato di un ordine esistente.
     */
    public List<Order> orders = new ArrayList<>();

    @PostMapping("/crea-ordine/{id}")
    public CustomResponse<Order> createOrder(@PathVariable long id, @RequestBody List<Product> productList) {
        if (productList.isEmpty()) {
            return new CustomResponse<>(400, HttpStatus.BAD_REQUEST);
        } else {
            Order order = new Order();
            order.setListaProdotti(productList);
            order.setId(id);
            order.setStatus(Status.IN_ELABORAZIONE);
            order.setQuantitaProdotti(productList.size());
            orders.add(order);
            return new CustomResponse<>(200, HttpStatus.OK, order);
        }
    }

    @GetMapping("/all-orders")
    public CustomResponse<List<Order>> getAllOrders() {
        return new CustomResponse<>(200, HttpStatus.OK, orders);
    }

    @PutMapping("/{id}/status")
    public CustomResponse<Order> changeStatus(@PathVariable long id, @RequestBody Status status){
        Optional<Order> orderById = orders.stream().filter(o->o.getId() == id).findFirst();
        if(orderById.isPresent()){
            orderById.get().setStatus(status);
            return new CustomResponse<>(200, HttpStatus.OK, orderById.get());
        } else{
            return new CustomResponse<>(400, HttpStatus.BAD_REQUEST);
        }

    }
    @PatchMapping("/{id}/patch")
    public CustomResponse<Order> changeStatusWithPatch(@PathVariable long id, @RequestBody Status status){
        Optional<Order> orderById = orders.stream().filter(o->o.getId() == id).findFirst();
        if(orderById.isPresent()){
            orderById.get().setStatus(status);
            return new CustomResponse<>(200, HttpStatus.OK, orderById.get());
        } else{
            return new CustomResponse<>(400, HttpStatus.BAD_REQUEST);
        }
    }

    }

