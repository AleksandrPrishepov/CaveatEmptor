package me.dev;


import me.dev.entity.Item;
import org.hibernate.Metamodel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.metamodel.ManagedType;
import javax.persistence.metamodel.SingularAttribute;
import java.security.Signature;
import java.util.List;
import java.util.Set;


public class App {

    public static void main( String[] args )
    {
        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("CaveatEmptor");
        EntityManager em = emf.createEntityManager();
//        em.getTransaction().begin();
//        Item item = new Item();
//        item.setName("fausfffffffffffff");
//        em.persist(item);
//        em.getTransaction().commit();
//        List<Item> messages =
//                em.createQuery("select m from Item m").getResultList();
//        System.out.println(messages);
//        em.close();
        Metamodel mm = (Metamodel) em.getMetamodel();
        Set<ManagedType<?>> managedTypes = mm.getManagedTypes();
        ManagedType itemType = managedTypes.iterator().next();
        SingularAttribute na = itemType.getSingularAttribute("name");
        System.out.println(na.getJavaType());
        System.out.println(na.isOptional());

    }
}
