package com.example.note.note_feature_app.domain.util

sealed class OrderType {
    object Ascending: OrderType()
    object Descending: OrderType()
}
