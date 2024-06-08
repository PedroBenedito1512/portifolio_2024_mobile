import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.portifolio.R
import com.example.portifolio.componentes.Title
import com.example.portifolio.componentes.Subtitle
import com.example.portifolio.componentes.Paragraph
import com.example.portifolio.data.DatasourceSobre
import com.example.portifolio.data.AffirmationSobre

@Composable
fun TelaSobre() {
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
                Title(text = "SOBRE", modifier = Modifier.fillMaxWidth())
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        listaSobre(
            affirmationList = DatasourceSobre().loadAffirmationsSobre(),
            modifier = Modifier.weight(1f)
        )
    }
}

@Composable
fun listaSobre(affirmationList: List<AffirmationSobre>, modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier) {
        items(affirmationList) { affirmation ->
            cartaoSobre(affirmation = affirmation, modifier = Modifier.padding(8.dp))
        }
    }
}

@Composable
fun cartaoSobre(affirmation: AffirmationSobre, modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(8.dp)) {
        Title(
            text = affirmation.title,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
        Subtitle(
            text = affirmation.subtitle,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
        Image(
            painter = painterResource(id = affirmation.imageResId),
            contentDescription = null,
            modifier = Modifier
                .padding(top = 8.dp)
                .align(Alignment.CenterHorizontally)
        )
        affirmation.paragraphs.forEach { paragraph ->
            Paragraph(
                text = paragraph,
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}
