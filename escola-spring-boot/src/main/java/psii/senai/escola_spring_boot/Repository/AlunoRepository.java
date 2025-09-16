package psii.senai.escola_spring_boot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import psii.senai.escola_spring_boot.Model.Aluno;


public interface AlunoRepository extends JpaRepository<Aluno, Long> {


}
