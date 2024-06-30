## DESAFIO POO

Neste desafio vamos modelar e diagramar a representação UML do componente iPhone, abrangendo suas funcionalidades como Reprodutor Musical, Aparelho Telefônico e Navegador na Internet.

### Funcionalidades a Modelar

Reprodutor Musical
- Métodos: tocar(), pausar(), selecionarMusica(String musica)

Aparelho Telefônico
- Métodos: ligar(String numero), atender(), iniciarCorreioVoz()

Navegador na Internet
- Métodos: exibirPagina(String url), adicionarNovaAba(), atualizarPagina()

### Diagrma UML (Mermaid)
```mermaid
classDiagram
    class ReprodutorMusical {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
        +ligar(String numero)
        +atender(String exemplo)
        +iniciarCorreioDeVoz()
    }

    class NavegadorInternet {
        +atualizarPagina()
        +adicionarNovaAba()
        +exibirPagina(String url)
    }

    class iPhone {
    }

    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet
```
