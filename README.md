# Padroes de Projeto (Design Patterns)

Repositório educacional contendo implementações práticas de diversos padrões de projeto (Design Patterns) em Java.

## Sobre o Projeto

Este repositório contém 17 projetos que demonstram a implementação de diferentes padrões de projeto, incluindo exemplos práticos e casos de uso. Cada projeto foi desenvolvido como um exercício de aprendizado para compreender melhor a aplicação dos padrões GoF (Gang of Four) e outros padrões importantes.

## Padrões Implementados

### 1. Padrões Criacionais (Creational Patterns)

| # | Projeto | Padrão | Descrição |
|---|---------|--------|-----------|
| 1 | Singleton Banheiro | **Singleton** | Controle de acesso único a um banheiro |
| 5 | Factory Method PizzaFactory | **Factory Method** | Fábrica de pizzas de diferentes tamanhos |
| 7 | Projeto Fabrica Pizza | **Abstract Factory** | Sistema completo de fábrica de pizzas |
| 8 | Fabrica de Fabricas E-Commerce | **Abstract Factory** | Sistema de e-commerce com múltiplas fábricas |

### 2. Padrões Estruturais (Structural Patterns)

| # | Projeto | Padrão | Descrição |
|---|---------|--------|-----------|
| 3 | Adapter Chimpanzee | **Adapter** | Adaptação de interface para chimpanzés e humanos |
| 3 | Adapter Faculdade | **Adapter** | Sistema de mensalidades universitárias |
| 6 | Decorator Acai | **Decorator** | Sistema de complementos para açaí |
| 6 | Decorator Bar | **Decorator** | Sistema de bebidas de bar |
| 6 | Decorator Cafeteria | **Decorator** | Sistema de bebidas de cafeteria |
| 12 | Composite Departamento | **Composite** | Estrutura hierárquica de departamentos |

### 3. Padrões Comportamentais (Behavioral Patterns)

| # | Projeto | Padrão | Descrição |
|---|---------|--------|-----------|
| 2 | Iterator Funcionários | **Iterator** | Iteração sobre diferentes estruturas de dados de funcionários |
| 4 | Template Method Cafeteria | **Template Method** | Preparação de bebidas cafeinadas (café e chá) |
| 4 | Template Method Ordenação | **Template Method** | Sistema de ordenação de alunos com múltiplos critérios |
| 9 | Observer Polícia | **Observer** | Sistema de observação policial |
| 10 | Strategy Transporte | **Strategy** | Cálculo de tempo de percurso com diferentes meios de transporte |
| 11 | Strategy Ordenação | **Strategy** | Estratégias de ordenação de alunos |

### 4. Projeto Final

| # | Projeto | Padrões | Descrição |
|---|---------|---------|-----------|
| 13 | Whiskas Imobiliaria | **Múltiplos** | Sistema imobiliário completo utilizando: Singleton (banco de dados), Factory (criação de imóveis), Composite (estrutura de imóveis), Strategy (validação e comissão), Iterator (dados) |

## Estrutura do Repositório

Cada projeto segue a estrutura padrão de projeto Java (NetBeans):

```
Padrão-Nome/
├── src/              # Código fonte
│   ├── Package1/     # Pacotes organizados
│   ├── Package2/
│   └── ...
├── dist/             # Compilados (não versionados)
├── nbproject/        # Configurações NetBeans
└── build.xml         # Script de build Ant
```

## Como Compilar e Executar

### Requisitos
- Java JDK 8 ou superior
- NetBeans IDE (recomendado) ou Apache Ant

### Opção 1: NetBeans IDE
1. Abra o NetBeans
2. File > Open Project
3. Selecione a pasta do projeto desejado
4. Clique com botão direito no projeto > Run

### Opção 2: Linha de Comando (Ant)
```bash
cd "nome-do-projeto"
ant compile
ant run
```

### Opção 3: Compilação Manual
```bash
cd "nome-do-projeto/src"
javac -d ../build **/*.java
java -cp ../build PackagePrincipal.ClassePrincipal
```

## Projeto Final - Whiskas Imobiliaria

O projeto final é um sistema imobiliário completo que integra múltiplos padrões:

- **Singleton**: Gerenciamento único de conexão com banco de dados SQLite
- **Factory**: Criação de diferentes tipos de imóveis (casas e apartamentos)
- **Composite**: Estrutura hierárquica de imóveis
- **Strategy**: Validação de dados (CPF, email, telefone) e cálculo de comissões (venda/aluguel)
- **Iterator**: Iteração sobre dados de locatários e imóveis

### Configuração do Banco de Dados

O projeto utiliza SQLite. O banco de dados será criado automaticamente no diretório de execução do projeto.

## Conceitos de Design Patterns

### Padrões Criacionais
Lidam com mecanismos de criação de objetos, tentando criar objetos de maneira adequada à situação.

### Padrões Estruturais
Lidam com a composição de classes e objetos, formando estruturas maiores.

### Padrões Comportamentais
Lidam com a comunicação entre objetos e a delegação de responsabilidades.

## Observações Técnicas

- **Linguagem**: Java
- **IDE**: NetBeans
- **Build System**: Apache Ant
- **Banco de Dados**: SQLite (Projeto Final)
- **Codificação**: UTF-8

## Melhorias Recentes

- Correção de caminho hardcoded do banco de dados para suportar múltiplas plataformas (Windows, Linux, macOS)
- Adição de .gitignore para evitar versionamento de arquivos compilados
- Remoção de arquivos duplicados e desnecessários
- Limpeza geral do repositório

## Contribuindo

Este é um projeto educacional. Sugestões de melhorias são bem-vindas através de issues ou pull requests.

## Referências

- **Design Patterns: Elements of Reusable Object-Oriented Software** - Gang of Four (GoF)
- **Head First Design Patterns** - Eric Freeman, Elisabeth Robson
- Documentação oficial Java

## Licença

Projeto educacional - uso livre para fins de aprendizado.

---

**Desenvolvido como material de estudo de Padrões de Projeto em Java**
