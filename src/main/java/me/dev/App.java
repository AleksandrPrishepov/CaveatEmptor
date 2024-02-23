package me.dev;


import me.dev.entity.Adress;
import me.dev.entity.Item;
import org.hibernate.Session;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;


public class App {

    public static void main( String[] args )
    {
        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("CaveatEmptor");
        EntityManager em = emf.createEntityManager();
//        Session session = em.unwrap(Session.class);
        em.getTransaction().begin();

        Item item = new Item();

        item.setName("fausf");
        item.setFamily("Smith");
        item.setAdress(new Adress("Truda","zipcod","VTB"));
        item.setBillingAddress(new Adress("uui","235","Vitebsk" ));
        em.persist(item);
        em.getTransaction().commit();
        List<Item> messages =
                em.createQuery("select m from Item m").getResultList();
        System.out.println(messages);
        em.close();
//        Metamodel mm = (Metamodel) em.getMetamodel();
//        Set<ManagedType<?>> managedTypes = mm.getManagedTypes();
//        ManagedType itemType = managedTypes.iterator().next();
//        SingularAttribute na = itemType.getSingularAttribute("name");
//        System.out.println(na.getJavaType());
//        System.out.println(na.isOptional());

    }
}
