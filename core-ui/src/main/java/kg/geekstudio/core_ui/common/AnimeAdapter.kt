package kg.geekstudio.core_ui.common

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kg.geekstudio.core_ui.extensions.loadImageWithGlide
import kg.geekstudio.domain.model.anime.AnimeData
import kg.geekstudio.kitsu.core_ui.databinding.AnimeItemBinding

class AnimeAdapter(private val anime: ArrayList<AnimeData>, private val context: Context): RecyclerView.Adapter<AnimeViewHolder>() {

    @SuppressLint("NotifyDataSetChanged")
    fun updateData(data: List<AnimeData>) {
        anime.clear()
        anime.addAll(data)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimeViewHolder {
        val binding = AnimeItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return AnimeViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AnimeViewHolder, position: Int) {
        holder.binding.imAnime.loadImageWithGlide(anime.get(position).attributes.posterImage.medium)
    }

    override fun getItemCount(): Int {
        return anime.size
    }
}

class AnimeViewHolder(val binding: AnimeItemBinding): RecyclerView.ViewHolder(binding.root)