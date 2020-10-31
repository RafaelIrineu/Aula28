package com.example.aula28todo.listatarefas.view

import android.view.View
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.aula28todo.R
import com.example.aula28todo.listatarefas.model.Tarefa
import kotlinx.android.synthetic.main.fragment_meu.view.*

class TarefaViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
    private val texto = view.findViewById<TextView>(R.id.text)
    private val check = view.findViewById<CheckBox>(R.id.checkbox)

    fun bind(tarefa: Tarefa) {
        texto.text = tarefa.texto
        check.isChecked = tarefa.check
    }
}