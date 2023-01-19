package com.arnab.newsapp.database.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.arnab.newsapp.model.Source

@Entity(tableName = "article")
data class ArticlesDBModel(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val author: String?,
    val content: String?,
    val category: String,
    val description: String?,
    val publishedAt: String?,
    val source: Source?,
    val title: String?,
    val url: String?,
    val urlToImage: String?
)
