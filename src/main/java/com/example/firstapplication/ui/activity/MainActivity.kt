package com.example.firstapplication.ui.activity

import android.app.Activity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.firstapplication.R
import com.example.firstapplication.model.Produto
import com.example.firstapplication.ui.recyclerview.adapter.ListaProdutoAdapter
import java.math.BigDecimal

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val nome = findViewById<TextView>(R.id.nome)
//        nome.setText("Cesta de frutas")
//        var descricao = findViewById<TextView>(R.id.descricao)
//        descricao.setText("Laranja, manga e maça")
//        var valor = findViewById<TextView>(R.id.valor)
//        valor.setText("19.99")
        var recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ListaProdutoAdapter(context = this, produtos = listOf(
            Produto(nome = "abacaxi",
                    descricao = "amarelo",
                    valor = BigDecimal("3.99")
            ),
            Produto(nome = "pera",
                    descricao = "verde",
                    valor = BigDecimal("6.99")
        ),
        ))
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}