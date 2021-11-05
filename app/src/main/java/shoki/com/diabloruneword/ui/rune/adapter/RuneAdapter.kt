package shoki.com.diabloruneword.ui.rune.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import shoki.com.diabloruneword.databinding.ItemRuneBinding
import shoki.com.diabloruneword.model.RuneModel

class RuneAdapter : ListAdapter<RuneModel, RuneAdapter.RuneViewHolder>(
    object : DiffUtil.ItemCallback<RuneModel>() {
        override fun areItemsTheSame(oldItem: RuneModel, newItem: RuneModel): Boolean {
            return oldItem.index == newItem.index &&
                    oldItem.name == newItem.name
        }

        override fun areContentsTheSame(oldItem: RuneModel, newItem: RuneModel): Boolean {
            return oldItem.index == newItem.index
        }
    }
) {

    inner class RuneViewHolder(
        private val binding: ItemRuneBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(item: RuneModel) {
            binding.item = item
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RuneViewHolder {
        return RuneViewHolder(
            binding = ItemRuneBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: RuneViewHolder, position: Int) {
        holder.onBind(item = getItem(position))
    }
}