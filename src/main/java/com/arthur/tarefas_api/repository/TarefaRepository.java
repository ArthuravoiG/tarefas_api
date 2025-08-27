package com.arthur.tarefas_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arthur.tarefas_api.model.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
}
