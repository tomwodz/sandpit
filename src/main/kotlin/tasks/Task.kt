package tasks

import java.time.LocalDate

fun main() {
    val library: Library = Library()
    library.addBook(Book("Książka 1", "Autor 1", LocalDate.of(2024, 5, 6)))
    library.addBook(Book("Książka 2", "Autor 2", LocalDate.of(2024, 5, 6)))
    println(
        library.addBook(Book("Książka 3", "Autor 3", LocalDate.of(2024, 5, 6)))
    )
    library.listBooks()
}

data class Book(
    private val title: String,
    private val author: String,
    private val publishDate: LocalDate
)

class Library {
    private var books: List<Book> = mutableListOf()

    fun addBook(book: Book): Boolean {
        if (books.size < Config.MAX_BOOKS) {
            books.addFirst(book)
            return true
        } else {
            return false
        }
    }

    fun listBooks(): Unit {
        println(books)
    }
}

object Config {
    const val MAX_BOOKS = 2
}
