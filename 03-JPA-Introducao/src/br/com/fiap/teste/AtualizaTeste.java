package br.com.fiap.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Cliente;
import br.com.fiap.entity.Genero;

public class AtualizaTeste {

	public static void main(String[] args) {
		EntityManagerFactory fabrica =
				Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		
		EntityManager em = fabrica.createEntityManager();
		
		//Atualizar um cliente
		//Instanciar um cliente com um Id que existe no banco
		Cliente cliente = new Cliente(1, "Maria", new GregorianCalendar(1970, Calendar.AUGUST,2), "321.321.321-02", Genero.FEMININO, null, false);
		em.merge(cliente);
		
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		
		Cliente cliente2 = em.find(Cliente.class, 1);
		
		System.out.println(cliente2.getNome());
				
		em.close();
		fabrica.close();
	}

}
