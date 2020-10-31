package com.example.aula28todo.listatarefas.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.aula28todo.R
import com.example.aula28todo.listatarefas.model.Tarefa
import com.example.aula28todo.listatarefas.repository.ICriaritem
import com.example.aula28todo.listatarefas.repository.TarefaRepository
import com.example.aula28todo.listatarefas.viewmodel.TarefaViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var viewModel: TarefaViewModel
    //var btn = findViewById<Button>(R.id.btnAdd)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(
            this,
            TarefaViewModel.ListaTarefaViewModelFactory(TarefaRepository(this))
        ).get(TarefaViewModel::class.java)

        /*btn.setOnClickListener {

//            TarefaRepository
        }*/

        viewModel.tarefas.observe(this, Observer {
            criarLista(it)
        })

        findViewById<Button>(R.id.btnAdd).setOnClickListener { viewModel.criarItem() }
        viewModel.obterLista()
    }


    fun criarLista(tarefas: List<Tarefa>) {
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)

        val manager = LinearLayoutManager(this)

        val customAdapter = CustomAdapter(tarefas) {
//            val intent = Intent(this@MainActivity)
        }

        recyclerView.apply {
            setHasFixedSize(true)
            layoutManager = manager
            adapter = customAdapter
        }
    }
}