@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE", "CAST_NEVER_SUCCEEDS")

package components

import csstype.*
import emotion.react.css
import react.FC
import react.PropsWithClassName
import react.dom.html.ReactHTML.button

external interface CoolButtonInterface: PropsWithClassName {
    var onClick: (Unit) -> Unit
    var title: String
    var gridPosition: Triple<Boolean, Int, Int>
}

val CoolButton = FC<CoolButtonInterface> { props ->
    button {
        css {
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

            if (props.gridPosition.first) {
                gridRow = props.gridPosition.second as GridLineProperty
                gridColumn = props.gridPosition.third as GridLineProperty
            }

        }
        +props.title
        onClick = { props.onClick(Unit) }
    }
    
}