# Compilador-LA
Compilador de linguagem LA para linguagem C.

## Instruções
Para montar o projeto:
  - Analisador Sintático:
    ```bash
       cd Compilador-LA
       ./gradlew fatJar
       ./gradlew testParser
    ```
  - Analisador Semântico:
    ```bash
       ./gradlew testParser2
    ```

Para realizar testes a parte:
  ```bash
     cd Compilador-LA
     ./gradlew fatJar
     java -jar ./build/libs/cla.jar <arquivo de teste>
  ```

Caso seja feita alguma mudança na gramática:
  - [Tenha o antlr instalado](http://www.antlr.org/)
  - Compile a gramática:
    ```bash
    cd /Compilador-LA/src/main/java
    antlr4 -visitor LA.g4 -o <caminho para o .g4>
    ```
