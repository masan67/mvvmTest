package com.example.mvvmtest

import androidx.recyclerview.widget.RecyclerView

@BindingAdapter("bind:background")
fun setBackgroundColor(view: RecyclerView, colorId: Int) {
    view.setBackgroundColor(view.context.resources.getColor(colorId))
}

@BindingAdapter("bind:items")
fun setItems(view: RecyclerView, items: List<Character>?) {
    view.adapter = DetailAdapter().apply {
        itemList = items ?: emptyList()
        notifyDataSetChanged()
    }
}

@BindingAdapter("bind:itemDeco")
fun setDecoration(view: RecyclerView, space: Float) {
    view.addItemDecoration(SpaceItemDecoration(space.toInt(), 3))
}