package com.shop.gestioneOrdine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GestioneOrdineApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestioneOrdineApplication.class, args);
	}
/*
Implementare un'API REST per gestire un sistema di ordini.
L'applicazione deve permettere di creare un nuovo ordine,
ottenere l'elenco degli ordini e
aggiornare lo stato di un ordine esistente.

Struttura:
Order: Rappresenta un ordine.
OrderController: Espone le API per gestire gli ordini.

L'order ha un id, una lista di prodotti, una quantità e uno status
 */
}
