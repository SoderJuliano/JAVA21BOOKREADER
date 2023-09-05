# 📚 Java 21 Book Reader

Bem-vindo ao Java 21 Book Reader, um projeto emocionante que explora as novas funcionalidades do Java 21! 😄

O Java 21 ainda não foi oficialmente lançado, mas você pode começar a experimentar as mudanças incríveis agora mesmo! ✨ Siga as etapas abaixo para começar:

## Como Executar

1. Certifique-se de ter o Java 21 instalado em seu ambiente de desenvolvimento.

2. Clone o repositório para o seu computador:
   ```bash
   git clone [<URL_DO_SEU_REPOSITORIO>](https://github.com/SoderJuliano/JAVA21BOOKREADER)https://github.com/SoderJuliano/JAVA21BOOKREADER

Navegue até o diretório do projeto:

bash
Copy code
``cd JAVA21BOOKREAADER/src/java``
Compile o código-fonte:

bash
Copy code
``javac --release 21 --enable-preview MainApp.java`
Execute o programa:

bash
Copy code
``java --enable-preview MainApp``
Lembre-se de que você pode substituir MainApp pelo nome da sua classe principal, se necessário. Agora, você está pronto para explorar as novidades do Java 21!

O Projeto
Este projeto é um leitor de livros simples que utiliza algumas das novas funcionalidades do Java 21, incluindo registros (Records), strings interpoladas, uso da classe StringBuilder e melhorias nos switches.

Aqui estão alguns exemplos do que você pode fazer com este projeto:

java
Copy code
// Criar uma instância de BookRecord
BookRecord book = new BookRecord("Texto longo do livro...", 10);

// Imprimir informações sobre o livro
System.out.println(book);

// Utilizar strings interpoladas
String interpolatedString = STR."O livro tem \{book.paragraphs()} parágrafos.";

// Manipular strings com StringBuilder
StringBuilder sb = new StringBuilder("HELLO WORLD ");
System.out.println(sb.repeat(0x1f600, 1));

// Experimentar os novos switches
printSwitcher(book);
Contribuições
Se você deseja contribuir para este projeto, sinta-se à vontade para abrir problemas (issues) ou enviar um pull request. Adoraríamos receber sua ajuda para tornar este projeto ainda melhor!

Aproveite e explore as incríveis mudanças do Java 21 com o Java 21 Book Reader! 🚀

Lembre-se de substituir <URL_DO_SEU_REPOSITORIO> pelo URL real do seu repositório no GitHub. Este README fornece informações sobre como executar o projeto e destaca algumas das funcionalidades interessantes que você incorporou ao Java 21 Book Reader. Personalize-o de acordo com suas necessidades e objetivos. Boa sorte com seu projeto!
