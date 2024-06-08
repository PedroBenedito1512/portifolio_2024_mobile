package com.example.portifolio.telas
import AffirmationProjetos
import DatasourceProjetos
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.portifolio.componentes.Title
import com.example.portifolio.componentes.meuButton
import com.example.portifolio.R
import com.example.portifolio.componentes.Paragraph
import com.example.portifolio.componentes.Subtitle

@Composable
fun TelaDeProjetos() {
    Column(modifier = Modifier.padding(16.dp)) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.DarkGray)
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = null,
                    modifier = Modifier.size(80.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Title(text = "PROJETOS", modifier = Modifier.fillMaxWidth())
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        ListaDeProjetos(
            affirmationList = DatasourceProjetos().loadAffirmationsProjetos(),
            modifier = Modifier.weight(1f)
        )
    }
}

@Composable
fun ListaDeProjetos(affirmationList: List<AffirmationProjetos>, modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier) {
        items(affirmationList) { affirmation ->
            CartaoDeProjetos(
                affirmation = affirmation,
                modifier = Modifier.padding(30.dp)
            )
        }
    }
}

@Composable
fun CartaoDeProjetos(affirmation: AffirmationProjetos, modifier: Modifier = Modifier) {
    Card(
        modifier = modifier
            .fillMaxWidth()
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Subtitle(
                text = affirmation.subtitle,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )

            Image(
                painter = painterResource(id = affirmation.imageResId),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
            )

            affirmation.paragraphs.forEach { paragraph ->
                Paragraph(
                    text = paragraph,
                    modifier = Modifier.padding(vertical = 8.dp)
                )
            }

            affirmation.buttons.forEach { button ->
                meuButton(text = button.buttonText, githubUrl = button.githubUrl)
            }
        }
    }
}
