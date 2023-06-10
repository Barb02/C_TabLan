# Tema **TabLan**, grupo **tablan-06**
-----

## Constituição dos grupos e participação individual global

| NMec | Nome | email | Participação |
|:---:|:---|:---|:---:|
| 105937 | BÁRBARA NÓBREGA GALIZA | barbara.galiza@ua.pt | 100/6% |
| 107969 | JOÃO MIGUEL DIAS ANDRADE | joao.andrade06@ua.pt | 100/6% |
| 107403 | JOÃO NUNO DA SILVA LUÍS | jnluis@ua.pt | 100/6% |
| 107449 | MIGUEL DA SILVA PINTO | miguel.silva48@ua.pt | 100/6% |
| 109986 | PEDRO DANIEL FIDALGO DE PINHO | pd.pinho@ua.pt | 100/6% |
| 109018 | TOMÁS ANTÓNIO DE OLIVEIRA VICTAL | tomasvictal@ua.pt | 100/6% |

## Estrutura do repositório

- **src** - deve conter todo o código fonte do projeto.

- **doc** -- deve conter toda a documentação adicional a este README.

- **examples** -- deve conter os exemplos ilustrativos das linguagens criadas.

    - Estes exemplos devem conter comentários (no formato aceite pelas linguagens),
      que os tornem auto-explicativos.

## Relatório

### **Introdução**

Este trabalho pretende desenvolver uma linguagem de programação compilada que permita a manipulação avançada de tabelas. Para isto estas são definidas como um tipo de dados para além dos tipos de dados elementares como inteiros (*integer*),  reais (*real*) e texto (*text*).

Neste trabalho, foram desenvolvidas todas as caraterísticas mínimas solicitadas, listadas a seguir:
- Instrução para definir um novo tipo de dados tabela;
- Os tipo de de dados inteiro, real e texto;
- Aceitar expressões aritméticas standard para os tipos de dados numéricos, aceitando também a operação de concatenação de texto;
- Instrução de escrita no *standard output*;
- Operadores de conversão entre tipos de dados;
- Instrução para adicionar linha no fim de uma tabela;
- Instrução para adicionar cabeçalho à tabela ou a cada coluna da tabela;
- Instrução de iteração (*loop*) das linha de tabelas;
- Verificação semântica do sistema de tipos.

Para atingir estes objetivos foram desenvolvidas quatro componentes que tratam de cada uma das fases de compilação:

Gramática principal da linguagem

Gramática secundária ( Ler ficheiros?? )

Análise Semântica

Geração de código

### **Gramática Principal da Linguagem - Introdução**
### **Gramática Principal**

### **Gramática Secundária**

### **Compilação e execução**
Foram criados três ficheiros em bash por forma a compilar e executar o código desenvolido.
Estes encontram-se na pasta ```examples``` e devem ser corridos pela seguinte ordem:
1. `./build.sh`
2. `./compile.sh <example>` sendo a tag example substituída pelo exemplo que queremos testar
3. `./run.sh`  

Se, aquando da execução de qualquer estes ficheiros, o terminal deolver o erro de *permission denied*, deve ser feito `chmod u+x filename `

- Use esta secção para fazer um relatório sucinto mas explicativo dos objetivos concretizados.

## Contribuições
Nas contribuições individuais, mencionamos as partes gerais do trabalho em que cada um trabalhou, porque existiram partes específicas que tiveram de ser refeitas por outros membros do grupo, pelo que manter o *tracking* dessas contribuições era mais difícil. <br>
De notar que os exemplos não constam nas nossas contribuições visto que apenas usámos os exemplos fornecidos pelos professores.

+ #### **Bárbara Galiza**
  + Gramática Principal
  + Gr.Principal-Análise-Semântica
  + Geração de código
  + Compilador
+ #### **João Andrade**
  + Gramática Principal
  + Gr.Principal-Análise-Semântica
  + Gramática Secundária
  + Secundária-Interpretação/Geração de código
  + Geração de código
  + Compilador
+ #### **João Luís**
  + Gramática Principal
  + Compilador
  + Scripts Bash
  + Relatório;
+ #### **Miguel Pinto**
  + Gramática Principal
  + Gramática Secundária
  + Secundária-Interpretação/Geração de código
  + Java Examples
+ #### **Pedro Pinho**
  + Gramática Principal
  + Gr.Principal-Análise-Semântica
  + Geração de Código
  + Compilador
  + Java Examples
+ #### **Tomás Victal**
  + Gramática Principal
  + Gr.Principal-Análise-Semântica
  + Geração de código
  + Compilador
  + Java Examples

Lista completa de tópicos: <br>
1. Gramática Principal  <br>
2. Gr.Principal-Análise-Semântica  <br>
3. Gramática Secundária  <br>
4. Secundária-Interpretação/Geração de código <br>
5. Geração de código <br>
6. Compilador <br>
7. Scripts Bash <br>
8. Relatório <br>
9. Java Examples <br>
<br>