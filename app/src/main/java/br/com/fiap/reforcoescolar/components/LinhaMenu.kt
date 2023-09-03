package br.com.fiap.reforcoescolar.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun NewLine(
    modifier: Modifier = Modifier,
    cor: Color = Color.Black,
    largura: Dp = 1.dp,
    altura: Dp = 1.dp
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(altura)
            .background(cor)
    )
}
