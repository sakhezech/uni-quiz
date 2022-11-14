package dataclasses

data class QuestionData(
    val title: String,
    val right: String,
    val wrong: List<String>,
    val trivia: String = ""
)
