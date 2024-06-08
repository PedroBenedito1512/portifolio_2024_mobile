import com.example.portifolio.R
data class ButtonInfo(
    val buttonText: String,
    val githubUrl: String
)
data class AffirmationProjetos(
    val subtitle: String,
    val imageResId: Int,
    val paragraphs: List<String>,
    val buttons: List<ButtonInfo>
)

class DatasourceProjetos {
    fun loadAffirmationsProjetos(): List<AffirmationProjetos> {
        return listOf(
            AffirmationProjetos(
                subtitle = "Desafio fila visual",
                imageResId =(R.drawable.fila),
                paragraphs = listOf(
                    "Este desafio visou aprimorar habilidades adicionando elementos visuais dinâmicos. Usei técnicas de manipulação de arrays, implementei o efeito glass e a seleção de cores via input. Foi uma oportunidade essencial para melhorar minha compreensão da interconexão entre HTML, CSS e JavaScript, ampliando meu repertório de técnicas e abrindo novas possibilidades de criação."
                ),
                buttons = listOf(
                    ButtonInfo(buttonText = "Veja mais no GitHub", githubUrl = "https://github.com/PedroBenedito1512/web_2024_pedro_benedito/tree/main/fifo")
                )
            ),
            AffirmationProjetos(
                subtitle = "Portfólio web",
                imageResId =(R.drawable.portifolio),
                paragraphs = listOf(
                    "Desenvolvi um portfólio web interativo utilizando HTML, CSS e JavaScript, que permite aos visitantes personalizar a cor do site. O portfólio inclui uma seção sobre mim, detalhando minhas habilidades e experiências, além de apresentar projetos anteriores e fornecer meios de contato. Também criei uma página de um jogo interativo baseado no clássico Touros e Vacas, onde os visitantes podem jogar e conhecer mais sobre minhas competências. Este projeto evidencia tanto meu conhecimento técnico quanto minha habilidade de criar experiências de usuário envolventes e personalizadas."
                ),
                buttons = listOf(
                    ButtonInfo(buttonText = "Veja mais no GitHub", githubUrl = "https://github.com/PedroBenedito1512/PedroBeneditoPortifolio_Web2024"),
                    ButtonInfo(buttonText = "Abrir site", githubUrl = "https://pedro-benedito-portifolio-web2024.vercel.app/")
                )
            ),
            AffirmationProjetos(
                subtitle = "Projeto Hotel P3",
                imageResId =(R.drawable.hotel),
                paragraphs = listOf(
                    "Em um projeto de programação orientada a objetos, minha dupla e eu criamos uma aplicação em Java com JavaFX para simular um sistema de hotel. O sistema permite registrar e gerenciar funcionários, quartos e hóspedes, abordando as tarefas administrativas comuns de um hotel."
                ),
                buttons = listOf(
                    ButtonInfo(buttonText = "Veja mais no GitHub", githubUrl = "https://github.com/HeloisaJ/Projeto_P3_JavaFX")
                )
            ),
            AffirmationProjetos(
                subtitle = "Chain: Plataforma de Gestão de Projetos",
                imageResId =(R.drawable.chainlogin),
                paragraphs = listOf(
                    "O Chain é uma plataforma completa para otimizar a gestão de projetos e equipes de desenvolvimento de software. Destinado a técnicos em TI e engenheiros de software, oferece funcionalidades como criação de conta, login seguro e ferramentas para gerenciar projetos. Com calendário de atividades e recursos para colaboração, o Chain promove um planejamento claro e eficiente, facilitando a comunicação e organização das equipes."
                ),
                buttons = listOf(
                    ButtonInfo(buttonText = "Veja mais no GitHub", githubUrl = "https://github.com/PedroPepeu/chain")
                )
            ),
            AffirmationProjetos(
                subtitle = "Hotel continental Osaka",
                imageResId =(R.drawable.hotelosaka),
                paragraphs = listOf(
                    "Eu e meu colega, Pedro Pepeu, desenvolvemos um site de hotel inspirado no universo de filmes de John Wick. O projeto resultou em um site completo com páginas personalizadas, proporcionando uma experiência imersiva e temática.",
                    "Criamos uma página inicial apresentando o hotel e seus serviços, além de uma página detalhada sobre a cidade e o estabelecimento. Desenvolvemos também páginas específicas para os diferentes tipos de quartos disponíveis e uma seção para explicar os padrões de qualidade do hotel.",
                    "Implementamos um sistema de reservas integrado com o Back4App para facilitar as reservas dos usuários. Por fim, disponibilizamos um Livro de Reclamações para feedback dos clientes, contribuindo para a melhoria contínua dos serviços oferecidos."
                ),
                buttons = listOf(
                    ButtonInfo(buttonText = "Veja mais no GitHub", githubUrl = "https://github.com/PedroPepeu/chain"),
                    ButtonInfo(buttonText = "Abrir site", githubUrl = "https://hotel-continental-osaka.vercel.app/index.html")
                )
            )

        )
    }
}
