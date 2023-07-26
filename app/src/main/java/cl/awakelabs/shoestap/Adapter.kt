package cl.awakelabs.shoestap

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import cl.awakelabs.shoestap.Adapter.*
import cl.awakelabs.shoestap.databinding.ItemBinding
import coil.load
import com.squareup.picasso.Picasso

class Adapter: RecyclerView.Adapter<Adapter.ViewHolder>() {
    var listaCalzado = mutableListOf<Calzado>()
    //var callBack: Shoes? = null


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val binding = ItemBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        return ViewHolder(binding)
    }



    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = listaCalzado[position]
        holder.binding(item)

    }



    inner class ViewHolder(val binding: ItemBinding) : RecyclerView.ViewHolder(binding.root) {


        fun binding(calzado: Calzado) {
            binding.txName.text = calzado.name
            binding.imageView.load(calzado.url)
            binding.txPrice.text = calzado.price.toString()
            binding.cardProduct.setOnClickListener {

            }

        }

    }

    override fun getItemCount(): Int {
        return listaCalzado.size
    }

    fun setData(listShoes: List<Calzado>) {
        this.listaCalzado = listShoes.toMutableList()

    }

}

private fun Adapter.ViewHolder.bind(item: Calzado) {

}

interface Shoes {
    fun showShoes(text: String)

}