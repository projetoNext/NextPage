package net.javaguides.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.sms.entity.Livro;


public interface LivroRepository extends JpaRepository<Livro, Long> {

}
