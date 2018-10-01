# Compilador-LA
Compilador de linguagem LA para linguagem C.

## Instruções
Para montar o projeto:
  ```bash
       cd Compilador-LA
       ./gradlew fatJar
  ```

Para realizar os testes no compilador:
  - Analisador Sintático:
    ```bash
       ./gradlew testParser
    ```
  - Analisador Semântico:
    ```bash
       ./gradlew testSemantic
    ```
  - Gerador de Código:
    ```bash
       ./gradlew testCodeGen
    ```
  - Integração do compilador (todos os testes acima):
    ```bash
       ./gradlew testCompiler
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
       antlr4 -visitor LA.g4 -o <caminho para o diretorio t1>
    ```
