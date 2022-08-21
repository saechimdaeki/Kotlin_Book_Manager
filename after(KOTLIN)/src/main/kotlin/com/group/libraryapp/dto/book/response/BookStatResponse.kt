package com.group.libraryapp.dto.book.response

import com.group.libraryapp.controller.book.BookType

data class BookStatResponse (
    val type: BookType,
    val count: Long,
) {

}