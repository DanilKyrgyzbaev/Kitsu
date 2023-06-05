package kg.geekstudio.core_ui.common

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kg.geekstudio.core_ui.extensions.loadImageWithGlide
import kg.geekstudio.domain.model.manga.MangaItem
import kg.geekstudio.kitsu.core_ui.databinding.MangaItemBinding

class MangaAdapter(private val anime: ArrayList<MangaItem>, private val context: Context): RecyclerView.Adapter<MangaViewHolder>() {

    @SuppressLint("NotifyDataSetChanged")
    fun updateData(data: List<MangaItem>) {
        anime.clear()
        anime.addAll(data)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MangaViewHolder {
        val binding = MangaItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MangaViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MangaViewHolder, position: Int) {
        holder.binding.imAnime.loadImageWithGlide(anime.get(position).attributes.posterImage.medium)
    }

    override fun getItemCount(): Int {
        return anime.size
    }
}

class MangaViewHolder(val binding: MangaItemBinding): RecyclerView.ViewHolder(binding.root)

