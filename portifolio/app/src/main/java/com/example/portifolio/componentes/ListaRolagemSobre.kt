package com.example.portifolio.data

import com.example.portifolio.R

data class AffirmationSobre(
    val title: String,
    val subtitle: String,
    val imageResId: Int,
    val paragraphs: List<String>
)

class DatasourceSobre {
    fun loadAffirmationsSobre(): List<AffirmationSobre> {
        return listOf(
            AffirmationSobre(
                title = "Olá, seja bem vindo(a)",
                subtitle = "Eu sou Pedro BeneditO",
                imageResId = R.drawable.perfil,
                paragraphs = listOf(
                    "Atualmente, sou estudante de Ciência da Computação na UNICAP, no 5º período. Tenho experiência em backend com Java e Python, além de criação e manipulação de bancos de dados, desde o modelo lógico relacional até o conceitual, incluindo DML e DQL.",
                    "Estou explorando o desenvolvimento web com CSS, JavaScript e HTML, e gosto de criar soluções visuais e úteis que ajudam as pessoas a otimizar seus trabalhos.",
                    "Busco uma oportunidade de estágio para continuar desenvolvendo minhas habilidades e contribuir para projetos desafiadores. Motivado pela busca de uma educação de qualidade, mudei-me para Recife, deixando minha família no interior.",
                    "Sou colaborativo, calmo e resiliente, capaz de trabalhar bem em equipe e me adaptar a diferentes situações. Reconheço a necessidade de melhorar minha impulsividade, mas estou comprometido em crescer profissionalmente e contribuir para o sucesso da equipe. Embora minha experiência prática fora do ambiente acadêmico seja limitada, sou dedicado e busco constantemente me aprimorar."
                )
            )
        )
    }
}
