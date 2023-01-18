package com.arnab.newsapp.model

data class News(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)