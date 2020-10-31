package com.example.aula28todo.listatarefas.repository

import com.example.aula28todo.listatarefas.model.Tarefa

interface ICriaritem {
    fun criarItem(tarefa: Tarefa)
}