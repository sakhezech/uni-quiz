
import components.GradientBackground
import components.QuestionScreen
import csstype.FontFamily
import csstype.TextAlign
import csstype.em
import dataclasses.QuestionData
import emotion.react.css
import react.FC
import react.Props
import react.dom.html.ReactHTML.p
import react.useState

val MainPage = FC<Props> {
    var currentQuestion by useState<QuestionData>(listOfQuestions.random())
    var correctAnswers by useState(0)
    var highScore by useState(0)

    GradientBackground{}

    QuestionScreen {
        data = currentQuestion
        onChangeQuestion = {
            currentQuestion = listOfQuestions.random()
        }
        onCorrectAnswer = {
            if (correctAnswers >= highScore) {
                highScore = correctAnswers + 1
            }
            correctAnswers++
        }
        onWrongAnswer = {correctAnswers = 0}
    }

    p {
        css {
            fontFamily = FontFamily.monospace
            fontSize = 1.5.em
            textAlign = TextAlign.center
        }
        +"Correct: $correctAnswers; High Score: $highScore"
    }

}