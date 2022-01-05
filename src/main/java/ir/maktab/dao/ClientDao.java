package ir.maktab.dao;

import ir.maktab.model.entity.Client;
import ir.maktab.model.entity.Person;
import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * @author Mahsa Alikhani m-58
 */
@Repository
@RequiredArgsConstructor
public class ClientDao {
    private final SessionFactory sessionFactory;

    public void save(Client client){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(client);
        session.getTransaction().commit();
        session.close();
    }

    public Optional<Client> findByEmail(String email) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Query<Client> hql = session.createQuery("from Client where email=:email");
        hql.setParameter("email", email);
        List<Client> list = hql.getResultList();
        session.getTransaction().commit();
        session.close();
        return Optional.ofNullable(list.isEmpty() ? null : list.get(0));
    }
}
