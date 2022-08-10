package com.group.libraryapp.dto.book.request

import com.group.libraryapp.controller.book.BookType

data class BookRequest(
    val name: String,
    val type: BookType,
)