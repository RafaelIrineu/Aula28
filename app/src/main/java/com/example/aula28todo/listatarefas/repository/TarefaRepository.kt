package com.example.aula28todo.listatarefas.repository

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.aula28todo.listatarefas.model.Tarefa

class TarefaRepository(private val context: Context) {
    var listaTarefa = mutableListOf<Tarefa>()
    fun obterLista(callback: (tarefas: List<Tarefa>) -> Unit) {
//        var tarefa = listOf<Tarefa>(
//            Tarefa("1asdfasdf", false),
//            Tarefa("2asdfasdf", false),
//            Tarefa("3asdfasdf", false),
//            Tarefa("4asdfasdf", false),
//            Tarefa("5asdfasdf", false),
//            Tarefa("6asdfasdf", false)
//        )
        callback.invoke(listaTarefa)
    }

    fun criarItem(tarefa: Tarefa) {
        listaTarefa.add(tarefa)
    }


}