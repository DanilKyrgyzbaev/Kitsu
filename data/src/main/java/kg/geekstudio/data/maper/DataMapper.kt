package kg.geekstudio.data.maper

interface DataMapper<T> {
    fun toDomain(): T
}