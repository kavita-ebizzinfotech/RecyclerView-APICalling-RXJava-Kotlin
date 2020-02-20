package android.com.rxkotlin

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.recycler_view_row.view.*

class DataAdapter(
    private val dataList: ArrayList<Hero>,
    private val listener: Listener,
    public val context: MainActivity
) :
    RecyclerView.Adapter<DataAdapter.ViewHolder>() {

    interface Listener {

        fun onItemClick(hero: Hero)
    }

    private val colors: Array<String> =
        arrayOf("#EF5350", "#EC407A", "#AB47BC", "#7E57C2", "#5C6BC0", "#42A5F5")

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.bind(dataList[position], listener, colors, position)
    }

    override fun getItemCount(): Int = dataList.count()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_row, parent, false)

        return ViewHolder(view)
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        fun bind(hero: Hero, listener: Listener, colors: Array<String>, position: Int) {

            itemView.textView.text = hero.getName()
            itemView.imageView.visibility = View.GONE;
            itemView.setOnClickListener { listener.onItemClick(hero) }
        }
    }
}