package br.com.fiap.entity;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Exercicio {

	public static void main(String[] args) {
		
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		EntityManager em = fabrica.createEntityManager();
		
		//Realizar o CRUD para o produto
		//Cadastro
		
		Cliente cliente = new Cliente(2, "Pedro", new GregorianCalendar(1985, Calendar.JANUARY,2), "111.111.111-11", Genero.MASCULINO , null, false);
		em.persist(cliente);
		
		em.getTransaction().begin();
				
		
		//Pesquisar
		
		//Atualizar
		
		//Remover


	}

}
