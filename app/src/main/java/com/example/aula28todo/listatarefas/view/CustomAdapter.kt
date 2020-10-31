package com.example.aula28todo.listatarefas.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.aula28todo.R
import com.example.aula28todo.listatarefas.model.Tarefa


class CustomAdapter(private val dataset: List<Tarefa>, private val listener: (Tarefa) -> Unit) :
    RecyclerView.Adapter<TarefaViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TarefaViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.fragment_meu, parent, false)

        return TarefaViewHolder(view)
    }

    override fun getItemCount() = dataset.size

    override fun onBindViewHolder(holder: TarefaViewHolder, position: Int) {
        val item = dataset[position]
        holder.bind(item)

        holder.itemView.setOnClickListener { listener(item) }
    }
}