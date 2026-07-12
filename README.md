# Laboratório 7 - Padrões de Projeto (Visitor)

Disciplina: Princípios e Padrões de Projeto - BCC FACOM UFU
Professora: Fabíola S. F. Pereira

Implementação em Java do padrão de projeto **Visitor**, aplicado a dois cenários propostos no laboratório.

## Estrutura do projeto

```
lab7-visitor/
├── questao1/   # Veículos (Carro, Ônibus, Bicicleta)
└── questao2/   # Editor de Documentos Rich-Text
```

## Questão 1 - Veículos

Modela `Veiculo` com três subclasses (`Carro`, `Onibus`, `Bicicleta`) e dois visitors:

- `ImprimirDadosVisitor`: imprime os dados específicos de cada veículo.
- `EnviarMensagemVisitor`: envia uma mensagem específica para o dono de cada veículo.

**Classes:**

| Classe | Papel no padrão |
|---|---|
| `Veiculo` | Elemento (interface) |
| `Carro`, `Onibus`, `Bicicleta` | Elementos concretos |
| `VeiculoVisitor` | Visitor (interface) |
| `ImprimirDadosVisitor`, `EnviarMensagemVisitor` | Visitors concretos |
| `Main` | Classe de demonstração |

### Executar

```bash
cd questao1
javac *.java
java Main
```

## Questão 2 - Editor de Documentos Rich-Text

Modela a árvore de um documento (`DocumentElement` → `Paragraph`, `Image`, `Table`) e isola, via Visitor, funcionalidades que seriam adicionadas futuramente sem alterar as classes de elementos:

- `HtmlExportVisitor`: exporta o documento para HTML.
- `PdfExportVisitor`: exporta o documento para PDF (representação simplificada).
- `WordCountVisitor`: conta o total de palavras do documento.

**Classes:**

| Classe | Papel no padrão |
|---|---|
| `DocumentElement` | Elemento (interface) |
| `Paragraph`, `Image`, `Table` | Elementos concretos |
| `Document` | Estrutura que agrega os elementos |
| `DocumentVisitor` | Visitor (interface) |
| `HtmlExportVisitor`, `PdfExportVisitor`, `WordCountVisitor` | Visitors concretos |
| `Main` | Classe de demonstração |

### Executar

```bash
cd questao2
javac *.java
java Main
```

## Padrão utilizado: Visitor

O padrão Visitor permite adicionar novas operações sobre uma estrutura de objetos (`accept`) sem modificar as classes desses objetos. Cada nova funcionalidade é implementada como um novo Visitor concreto, respeitando o princípio Aberto/Fechado (Open/Closed Principle).

## Requisitos

- JDK 17+

## Autor

Cauê
