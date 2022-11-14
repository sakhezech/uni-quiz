@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE", "CAST_NEVER_SUCCEEDS")

package components

import csstype.*
import dataclasses.QuestionData
import emotion.react.css
import react.FC
import react.Props
import react.dom.html.ReactHTML.button
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
    var wrongcopy = props.data.wrong.toMutableList()
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
                fun wrongButton(){
                    button {
                        css {
                            CoolCSS()
                        }
                        val aaa = wrongcopy.random()
                        wrongcopy.remove(aaa)
                        +aaa
                        onClick = {
                            answered = true
                            props.onWrongAnswer(Unit)
                        }
                    }
                }
                css {
                    display = Display.grid
                    gridTemplateColumns = "auto auto" as GridTemplateColumns
                    gap = "20px 20px" as Gap
                }
                button {
                    css {
                        gridRow = rightX as GridLineProperty
                        gridColumn = rightY as GridLineProperty
                        CoolCSS()
                    }
                    +props.data.right
                    onClick = {
                        answered = true
                        correct = true
                        props.onCorrectAnswer(Unit)
                    }
                }
                wrongButton()
                wrongButton()
                wrongButton()
            }
        }
        else {
            p{+if (correct) {"YOU ARE CORRECT"} else {"you are not correct"}; css {fontSize = 1.5.em}}
//            if (props.data.trivia != "") {
//                p { +props.data.trivia }
//            }
            button {
                css {
                    CoolCSS()
                }
                +"Next"
                onClick = {
                    props.onChangeQuestion(Unit)
                    answered = false
                    correct = false
                    rightX = Random.nextInt(1,3)
                    rightY = Random.nextInt(1,3)
                    wrongcopy = props.data.wrong.toMutableList()
                }
            } // NEXT QUESTION BUTTON
        }
    }

}

private fun PropertiesBuilder.CoolCSS() {
    height = 100.px
    width = 150.px
    backgroundColor = NamedColor.transparent
    border = Border(2.px, LineStyle.solid, NamedColor.black)
    fontSize = 1.5.em
    fontFamily = FontFamily.monospace
    transitionDuration = 0.1.s
    transitionTimingFunction = TransitionTimingFunction.easeIn
    transitionProperty = TransitionProperty.all

    hover {
        backgroundColor = Color("#FFFFFF64")
        border = Border(2.px, LineStyle.solid, NamedColor.white)
    }
}