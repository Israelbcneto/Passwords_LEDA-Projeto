# Análise e Ordenação de Senhas

Este projeto em Java realiza a análise, classificação, formatação e ordenação de um conjunto de senhas a partir de um arquivo CSV.

## Estrutura do Projeto

O código está organizado da seguinte forma:

-   `src/main/Main.java`: Classe principal que orquestra a execução das tarefas.
-   `src/domain/`: Contém as classes responsáveis pela lógica de negócio (classificação, formatação, filtragem).
    -   `PasswordClassifier.java`: Classifica senhas com base em critérios (não especificados no `Main`).
    -   `PasswordDateFormatter.java`: Formata as datas associadas às senhas.
    -   `PasswordClassifierFilter.java`: Filtra as senhas classificadas.
-   `src/test/`: Contém as classes para execução dos testes de ordenação.
    -   `RunTests.java`: Executa diferentes cenários de ordenação.
-   `dataset/`: Diretório esperado para conter os arquivos de dados.
    -   `passwords.csv`: Arquivo de entrada contendo as senhas (necessário para a execução).
    -   `password_classifier.csv`: Arquivo intermediário/saída gerado pela classificação.
    -   `passwords_formated_data.csv`: Arquivo de saída gerado pela formatação de datas.
    -   `passwords_classifier.csv`: Arquivo de saída gerado pela filtragem (Nota: parece haver uma sobreposição ou erro de digitação no nome deste arquivo em `Main.java`, comparado ao primeiro `password_classifier.csv`).

## Pré-requisitos

-   JDK (Java Development Kit) instalado.
-   Um arquivo `passwords.csv` no diretório `dataset/` com os dados das senhas a serem processadas. O formato exato deste arquivo não está especificado no código `Main.java`, mas é crucial para a execução.
    -   Você pode baixar o arquivo `passwords.csv` necessário através [deste link](https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fdrive.google.com%2Ffile%2Fd%2F1-8WPvcqCEf7dAnuRTxrdCBln81o_9X4S%2Fview%3Fusp%3Dsharing&followup=https%3A%2F%2Fdrive.google.com%2Ffile%2Fd%2F1-8WPvcqCEf7dAnuRTxrdCBln81o_9X4S%2Fview%3Fusp%3Dsharing&ifkv=ASKV5Mic4_RnoIKRr32DK4ltfNE_x03WTu_xWdOrzL815jIJtdTM9z15Ui0nH2bIUtEHH-kUWXGRww&osid=1&passive=1209600&service=wise&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S-1960747899%3A1746316211840372) (requer login no Google Drive).

## Execução Passo a Passo

1.  **Preparação:**
    *   Certifique-se de que o JDK está instalado e configurado no seu sistema.
    *   Crie um diretório chamado `dataset` na raiz do projeto (ou no local esperado pela sua IDE/ambiente de execução).
    *   Coloque o arquivo `passwords.csv` com os dados das senhas dentro do diretório `dataset`.

2.  **Compilação:**
    *   Abra um terminal ou prompt de comando.
    *   Navegue até o diretório `src` do projeto.
    *   Compile os arquivos Java. Assumindo que as classes `domain` e `test` estão em subdiretórios correspondentes (`domain/` e `test/`), você pode compilar da seguinte forma (ajuste conforme sua estrutura exata):
        ```bash
        javac main/Main.java domain/*.java test/*.java -d ../bin
        ```
        (Isso compilará os arquivos `.java` e colocará os arquivos `.class` em um diretório `bin` na raiz do projeto).

3.  **Execução:**
    *   Ainda no terminal, navegue para o diretório `bin` (ou o diretório onde os arquivos compilados `.class` foram colocados).
    *   Execute a classe `Main`:
        ```bash
        java main.Main
        ```

## O que o Programa Faz

Ao ser executado, o programa realizará as seguintes etapas:

1.  **Classificação:** Lê `dataset/passwords.csv`, classifica as senhas e salva o resultado em `dataset/password_classifier.csv`.
2.  **Formatação de Data:** Lê `dataset/password_classifier.csv`, formata as datas e salva o resultado em `dataset/passwords_formated_data.csv`.
3.  **Filtragem:** Lê `dataset/password_classifier.csv` (o mesmo arquivo da etapa 1), filtra as senhas e salva o resultado em `dataset/passwords_classifier.csv` (Nota: atenção ao nome do arquivo de saída, que é o mesmo da entrada nesta etapa no código fornecido).
4.  **Execução de Testes:**
    *   Instancia `RunTests`.
    *   Imprime "__________Ordenação levando em conta o *TAMANHO DA SENHA*_________".
    *   Chama `runTests.tamanhoSenha()`, que presumivelmente carrega dados (provavelmente de um dos arquivos gerados) e os ordena por tamanho, imprimindo algum resultado no console.
    *   Imprime "__________Ordenação levando em conta o *MES*_________".
    *   Chama `runTests.porMes()`, que ordena os dados por mês.
    *   Imprime "__________Ordenação levando em conta a *DATA*_________".
    *   Chama `runTests.pordata()`, que ordena os dados por data completa.

