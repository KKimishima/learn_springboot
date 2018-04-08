package com.github.kkimishima.learn_springboot;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyDateRepository extends JpaRepository<Mydata,Long> {

}
