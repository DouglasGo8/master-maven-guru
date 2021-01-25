package com.udemy.guru.master.maven.jpa.entities;

import com.udemy.guru.master.maven.jpa.entities.domain.User;
import lombok.extern.slf4j.Slf4j;


import javax.persistence.Persistence;

@Slf4j
public class Main {

  public static void main(String... args) {

    log.info("Ok I'm here!!!");

    var emf = Persistence.createEntityManagerFactory("postgreSQLPersistentFile");
    var em = emf.createEntityManager();

    var users = em.createQuery("SELECT u from User u", User.class).getResultList();

    users.forEach(user -> log.info("User Id-Name :: {}-{} {}",
            user.getId(), user.getFirstName(), user.getLastName()));

    em.close();
    emf.close();


  }
}
