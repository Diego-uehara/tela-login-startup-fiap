package br.com.fiap.reforcoescolar.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import br.com.fiap.reforcoescolar.R
import br.com.fiap.reforcoescolar.components.ButtonsLogin
import br.com.fiap.reforcoescolar.components.NewLine
import br.com.fiap.reforcoescolar.components.NewOutlinedTextField


@Composable
fun CadastroScreen(navController: NavController) {

    val txtRegistroNome = remember {
        mutableStateOf("")
    }

    val txtRegistrosSobrenome = remember{
        mutableStateOf("")
    }

    val txtRegistroEmail = remember{
        mutableStateOf("")
    }

    val txtRegistroSenha = remember{
        mutableStateOf("")
    }

    Box {
        Column {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(127, 179, 226, 255))
            ) {
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Row(
                        horizontalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.Blue)
                            .height(95.dp)
                            .background(Color.White)
                    ) {
                        Image(
                            modifier = Modifier
                                .size(280.dp),
                            painter = painterResource(id = R.drawable.logo_reforce),
                            contentDescription = "Logo Reforço",
                            alignment = Alignment.Center
                        )
                    }

                    Spacer(modifier = Modifier.height(10.dp))

                    ButtonsLogin(
                        modifier = Modifier
                            .height(65.dp)
                            .padding(start = 25.dp, end = 25.dp),
                        texto = "LOGIN VIA FACEBOOK",
                        imagem = painterResource(id = R.drawable.logo_facebook),
                        contentDescription = "Icone Facebook",
                        fontWeight = FontWeight.Bold,
                        onClick = { /*TODO*/ },
                        corFundo = Color(13, 72, 128, 255),
                        forma = RoundedCornerShape(30.dp),
                    )
                    ButtonsLogin(
                        modifier = Modifier
                            .height(65.dp)
                            .padding(start = 25.dp, end = 25.dp),
                        texto = "LOGIN VIA GOOGLE",
                        imagem = painterResource(id = R.drawable.logo_google),
                        contentDescription = "Icone Google",
                        corFundo = Color.White,
                        corTexto = Color.Black,
                        fontWeight = FontWeight.Bold,
                        onClick = { /*TODO*/ },
                        forma = RoundedCornerShape(30.dp)
                    )
                    NewLine(Modifier
                        .padding(start = 16.dp, end = 16.dp, top = 10.dp))
                    Spacer(modifier = Modifier
                        .height(10.dp))

                    NewOutlinedTextField(
                        modifier = Modifier
                        .padding(start = 30.dp, end = 30.dp),
                        value = txtRegistroNome.value,
                        onValueChange = {
                                        txtRegistroNome
                                            .value = it },
                        placeholder = "Nome",
                        backgroundColor = Color.White,
                        keyboardType = KeyboardType.Text,
                        maxLines = 1,
                        shape = RoundedCornerShape(30.dp)
                    )

                    NewOutlinedTextField(modifier = Modifier
                        .padding(start = 30.dp, end = 30.dp, top = 10.dp),
                        value = txtRegistrosSobrenome.value,
                        onValueChange = {
                                        txtRegistrosSobrenome
                                            .value = it },
                        placeholder = "Sobrenome",
                        backgroundColor = Color.White,
                        keyboardType = KeyboardType.Text,
                        maxLines = 1,
                        shape = RoundedCornerShape(30.dp)
                    )

                    NewOutlinedTextField(modifier = Modifier
                        .padding(start = 30.dp, end = 30.dp, top = 10.dp),
                        value = txtRegistroEmail.value,
                        onValueChange = {
                                        txtRegistroEmail
                                            .value = it },
                        placeholder = "E-mail",
                        backgroundColor = Color.White,
                        keyboardType = KeyboardType.Email,
                        maxLines = 1,
                        shape = RoundedCornerShape(30.dp)
                    )

                    NewOutlinedTextField(modifier = Modifier
                        .padding(start = 30.dp, end = 30.dp, top = 10.dp),
                        value = txtRegistroSenha.value,
                        onValueChange = {
                                        txtRegistroNome.value = it },
                        placeholder = "Senha",
                        backgroundColor = Color.White,
                        keyboardType = KeyboardType.Password,
                        maxLines = 1,
                        shape = RoundedCornerShape(30.dp)
                    )

                    NewLine(Modifier
                        .padding(start = 16.dp, end = 16.dp, top = 10.dp))
                    Spacer(modifier = Modifier
                        .height(16.dp))

                    ButtonsLogin(
                        modifier = Modifier
                            .height(65.dp)
                            .padding(start = 35.dp, end = 35.dp),
                        texto = "REGISTRAR",
                        onClick = { /*TODO*/ },
                        contentDescription = "",
                        corTexto = Color.Black,
                        corFundo = Color(100, 158, 36, 255),
                        forma = RoundedCornerShape(30.dp)
                        )

                    ButtonsLogin(
                        modifier = Modifier
                            .height(65.dp)
                            .padding(start = 35.dp, end = 35.dp),
                        texto = "CLIQUE AQUI SE JÁ É USUÁRIO",
                        onClick = { navController.navigate("login")},
                        contentDescription = "",
                        corTexto = Color.Black,
                        corFundo = Color.White,
                        forma = RoundedCornerShape(30.dp)
                    )
                }
            }
        }
    }
}


