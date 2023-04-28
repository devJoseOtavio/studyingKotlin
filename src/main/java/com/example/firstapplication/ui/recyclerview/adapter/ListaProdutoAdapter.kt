package com.example.firstapplication.ui.recyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.firstapplication.R
import com.example.firstapplication.model.Produto

class ListaProdutoAdapter (
        private val context : Context,
        private val produtos: List<Produto>
): RecyclerView.Adapter<ListaProdutoAdapter.ViewHolder>() {

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {
        fun vincula(produto: Produto) {
            val nome = itemView.findViewById<TextView>(R.id.nome)
            nome.text = produto.nome
            val descricao = itemView.findViewById<TextView>(R.id.descricao)
            descricao.text = produto.descricao
            val valor = itemView.findViewById<TextView>(R.id.valor)
            valor.text = produto.valor.toPlainString()
        }
    }

    //pega cada view apresentada e faz processo de binder, segura a view e faz as modificações desejadas
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.produto_item, parent, false)
        return ViewHolder(view)
    }

    //verifica em qual item está e indica a posição e viewHolder que está com a view especifica
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val produto = produtos[position]
        holder.vincula(produto)
    }

    //determina quantos itens queremos apresentar dentro dele, verifica o size
    override fun getItemCount(): Int = produtos.size
}
