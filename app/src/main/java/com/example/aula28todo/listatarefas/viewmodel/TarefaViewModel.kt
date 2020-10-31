package com.example.aula28todo.listatarefas.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.aula28todo.listatarefas.model.Tarefa
import com.example.aula28todo.listatarefas.repository.TarefaRepository

class TarefaViewModel(
    private val repository: TarefaRepository
) : ViewModel() {
    val tarefas = MutableLiveData<List<Tarefa>>()

    fun obterLista() {
        repository.obterLista { lista ->
            tarefas.value = lista
        }
        repository.criarItem()
    }

    class ListaTarefaViewModelFactory(
        private val repository: TarefaRepository
    ) : ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return TarefaViewModel(repository) as T
        }

    }
}