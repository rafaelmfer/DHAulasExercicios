package exercise03.kotlin

data class Cliente(
    var id: Int,
    var sobrenome: String = "",
    var rg: String,
    var cpf: String
)