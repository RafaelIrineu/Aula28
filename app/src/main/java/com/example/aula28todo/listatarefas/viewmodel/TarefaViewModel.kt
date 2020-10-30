package com.example.aula28todo.listatarefas.viewmodel

import androidx.lifecycle.ViewModel
import com.example.aula28todo.listatarefas.repository.TarefaRepository

class TarefaViewModel(
    private val repository: TarefaRepository
) : ViewModel() {

}