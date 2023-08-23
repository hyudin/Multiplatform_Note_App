package br.com.hyudin.multiplatformnoteapp.domain.note

import br.com.hyudin.multiplatformnoteapp.presentation.BabyBlueHex
import br.com.hyudin.multiplatformnoteapp.presentation.LightGreenHex
import br.com.hyudin.multiplatformnoteapp.presentation.RedOrangeHex
import br.com.hyudin.multiplatformnoteapp.presentation.RedPinkHex
import br.com.hyudin.multiplatformnoteapp.presentation.VioletHex
import kotlinx.datetime.LocalDateTime

data class Note(
    val id: Long?,
    val title: String,
    val content: String,
    val colorHex: Long,
    val created: LocalDateTime
) {
    companion object {
        private val colors = listOf(RedOrangeHex, RedPinkHex, LightGreenHex, BabyBlueHex, VioletHex)

        fun generateRandomColor() = colors.random()
    }
}
