package com.example.classictube


data class HomeItem<T>(
    val item: T,
    val type: HomeItemType,
)