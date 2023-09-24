# Orientação a Objetos e UML: Diagramação de Classes do iPhone

![terraform](https://img.shields.io/badge/-UML-white?style=for-the-badge&logo=UML&color=FABD14&logoColor=white)

Este é um diagrama UML que representa a estrutura de classes e interfaces para um sistema que inclui a modelagem do iPhone, um dispositivo que incorpora funcionalidades de um reprodutor de música, um telefone e um navegador de internet. Este diagrama foi criado como parte do desafio de projeto do **Santander Bootcamp 2023 - Backend Java** na DIO.me.

![iphone](https://user-images.githubusercontent.com/80369346/270133277-df40289a-d2ab-4c4c-9bb7-d3e73b53b179.png)


## Descrição das Interfaces e Classes

### Reprodutor Musical (ReprodutorMusical)

A interface `Reprodutor Musical` é responsável por implementar a funcionalidade de reprodução de arquivos de áudio. Ela possui métodos como `tocar()`, `pausar()`, `selecionarMusica()`, `aumetarVolume()` e `diminuirVolume()`. A classe `Ipod` implementa somente os métodos da interface `Reprodutor Musical`.

### Aparelho Telefônico (AparelhoTelefonico)

A interface `Aparelho Telefônico` é responsável por implementar a funcionalidade de um telefone. Ela possui métodos como `ligar()`, `atender()`, `iniciarCorreioVoz()`, `vivaVoz()`, `silenciar()`, `colocarEmEsperar()` e `adicionarChamada()`. A classe `Telefone` implementa somente os métodos da interface `Aparelho Telefonico`.

### Navegador de Internet (NavegadorInternet)

A interface `Navegador de Internet` é responsável por implementar a funcionalidade de um navegador web. Ela possui métodos como `exibirPagina()`, `adicionarNovaAba()`, `fecharAbaNavegador()`, `atualizarPagina()` e `fecharPagina()`.

## Entidades

Existem algumas entidades representadas no diagrama, como `IPhone`, `Safari` e `Ipod`, que representam diferentes dispositivos ou aplicativos que podem usar as interfaces e classes mencionadas acima.

## Diagrama

Para visualizar e alterar o diagrama UML, você pode fazer o download da imagem .drawio e abrir no site da draw.io.

Exemplo de uso com a ferramenta UML Online:
1. Acesse o site https://www.draw.io/.
2. Baixe e abra a imagem com extenção .drawio do repositório no site.

Este é apenas um diagrama de classe de exemplo e pode ser personalizado e estendido para atender às necessidades específicas do seu projeto.
