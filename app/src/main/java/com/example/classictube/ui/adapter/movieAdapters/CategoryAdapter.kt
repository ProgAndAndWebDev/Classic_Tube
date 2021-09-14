package com.example.classictube.ui.adapter.movieAdapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.classictube.R
import com.example.classictube.data.domain.CategoryItem
import com.example.classictube.databinding.ItemMovieCategoryBinding
import com.example.classictube.ui.adapter.HomeActionListener

class CategoryAdapter (items: List<CategoryItem>, listener: HomeActionListener) :BaseRecyclerAdapter<CategoryItem>(items, listener) {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): BaseMovieViewHolder =
        MovieOneViewHolder(
            LayoutInflater
                .from(parent.context)
                .inflate(R.layout.item_movie_category, parent, false)
        )

    override fun onBindViewHolder(holder: BaseMovieViewHolder, position: Int) {
        when(holder){
            is MovieOneViewHolder ->{
                holder.binding.apply {

                }
            }
        }
    }

    class MovieOneViewHolder(itemView: View) : BaseRecyclerAdapter.BaseMovieViewHolder(itemView){
        val binding = ItemMovieCategoryBinding.bind(itemView)
    }


}