@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE", "CAST_NEVER_SUCCEEDS")

package components

import csstype.*
import dataclasses.QuestionData
import emotion.react.css
import react.FC
import react.Props
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.h1
import react.dom.html.ReactHTML.p
import react.useState
import kotlin.random.Random

external interface QuestionInterface: Props {
    var data: QuestionData
    var onChangeQuestion: (Unit) -> Unit
    var onCorrectAnswer: (Unit) -> Unit
    var onWrongAnswer: (Unit) -> Unit
}

val QuestionScreen = FC<QuestionInterface> {props ->
    var wrongAnswers = props.data.wrong.toMutableList()
    var answered by useState(false)
    var correct by useState(false)
    var rightX by useState(Random.nextInt(1,3))
    var rightY by useState(Random.nextInt(1,3))


    div {
        css {
            fontFamily = "Rodondo" as FontFamily
            margin = Auto.auto
            display = Display.flex
            flexDirection = FlexDirection.column
            alignItems = AlignItems.center
            textAlign = TextAlign.center
        }

        h1{+props.data.title; css {fontSize = 2.em}}

        if (!answered) {
            div {
                css {
                    display = Display.grid
                    gridTemplateColumns = "auto auto" as GridTemplateColumns
                    gap = "20px 20px" as Gap
                }
                CoolButton {
                    onClick = {
                        answered = true
                        correct = true
                        props.onCorrectAnswer(Unit)
                    }
                    title = props.data.right
                    gridPosition = Triple(true, rightX, rightY)
                }

                for (i in 1..3) { //WRONG BUTTONS
                    CoolButton {
                        onClick = {
                            answered = true
                            correct = false
                            props.onWrongAnswer(Unit)
                        }
                        val falseAnswer = wrongAnswers.random()
                        wrongAnswers.remove(falseAnswer)
                        title = falseAnswer
                        gridPosition = Triple(false,0,0)
                    }
                }
            }
        }
        else {
            p{+if (correct) {"YOU ARE CORRECT"} else {"you are not correct"}; css {fontSize = 1.5.em}}
            if (props.data.trivia != "yea") {
                p { +props.data.trivia }
            }
            CoolButton {
                onClick = {
                    props.onChangeQuestion(Unit)
                    answered = false
                    rightX = Random.nextInt(1,3)
                    rightY = Random.nextInt(1,3)
                    wrongAnswers = props.data.wrong.toMutableList()
                }
                title = "Next"
                gridPosition = Triple(false,0,0)
            }
        }
    }
}