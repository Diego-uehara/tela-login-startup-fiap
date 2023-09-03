package br.com.fiap.reforcoescolar.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ButtonsLogin(
    texto: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    corFundo: Color = Color.Blue,
    corTexto: Color = Color.White,
    fontWeight: FontWeight? = null,
    forma: Shape = RoundedCornerShape(15.dp),
    icone: ImageVector? = null,
    imagem: Painter? = null,
    contentDescription: String,
    tamanhoFonte: TextUnit? = null
) {
    Button(
        onClick = onClick,
        modifier = modifier
            .fillMaxWidth()
            .padding(8.dp),
        shape = forma,
        colors = ButtonDefaults.buttonColors(
            containerColor = corFundo,
            contentColor = corTexto
        )
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(25.dp)
        ) {
            icone?.let {
                Icon(
                    imageVector = it,
                    contentDescription = null,
                    tint = corTexto
                )
            }
            imagem?.let {
                Image(
                    painter = it,
                    contentDescription = null,
                    modifier = Modifier
                        .size(24.dp)
                )
            }
            Text(text = texto,
                fontWeight = fontWeight,
                fontSize = 18.sp,
            )
        }
    }
}






