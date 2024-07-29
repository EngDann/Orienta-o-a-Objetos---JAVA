# Termos

a) **Classe**:
Uma classe é uma descrição que abstrai um conjunto de objetos com características similares, que compartilham atributos e métodos. É o molde para criar objetos.

b) **Objeto**:
Um objeto é uma instância de uma classe. Ele possui estado (dados) e comportamento (métodos).

c) **Elementos de classe**:
São os componentes de uma classe, incluindo atributos (variáveis de classe) e métodos (funções de classe).

d) **Métodos construtores**:
São métodos especiais usados para inicializar objetos de uma classe. Eles são chamados automaticamente quando um objeto é criado.

e) **Métodos destrutores**:
São métodos especiais usados para liberar recursos antes de um objeto ser destruído. Em algumas linguagens, são chamados automaticamente quando o objeto é destruído.

f) **Estado**:
Refere-se aos valores atuais dos atributos de um objeto. O estado de um objeto pode mudar ao longo do tempo.

g) **Retenção de estado**:
A capacidade de um objeto de manter seu estado atual ao longo do tempo, mesmo após a execução de métodos.

h) **Associação entre objetos**:
É um relacionamento entre dois ou mais objetos que permite a comunicação entre eles.

i) **Pacotes**:
São agrupamentos de classes e outros pacotes, usados para organizar o código e gerenciar a visibilidade entre os componentes.

j) **Modificadores de acesso**:
Especificam a visibilidade dos atributos e métodos de uma classe (público, privado, protegido).

k) **Ocultação de informação**:
Princípio de esconder detalhes internos dos objetos e expor apenas o necessário, promovendo a encapsulação.

l) **Escopo de elementos**:
Refere-se à área do código onde um elemento (variável, método) é válido e pode ser acessado.

m) **Modificadores de escopo**:
Determinam o alcance dos elementos dentro do código, como global, local, ou de instância.

n) **Herança**:
Mecanismo pelo qual uma classe (subclasse) herda atributos e métodos de outra classe (superclasse).

o) **Generalização**:
Processo de criar uma classe genérica a partir de classes mais específicas, abstraindo características comuns.

p) **Especialização**:
Processo de criar uma classe específica a partir de uma classe genérica, adicionando ou modificando características.

q) **Polimorfismo**:
Capacidade de um método ou função de se comportar de diferentes maneiras com base no objeto que está operando.

r) **Sobrescrita de métodos**:
Quando uma subclasse fornece uma implementação específica de um método que já existe na sua superclasse.

s) **Sobrecarga de métodos**:
Quando múltiplos métodos com o mesmo nome são definidos em uma classe, mas com diferentes parâmetros.

t) **Polimorfismo por coerção**:
Capacidade de um método ou função de tratar diferentes tipos de dados de forma uniforme.

u) **Polimorfismo por inclusão**:
Capacidade de objetos de diferentes classes serem tratados como objetos de uma classe comum, geralmente através de herança.

v) **Polimorfismo paramétrico**:
Capacidade de um único método ou classe operar em diferentes tipos de dados, usando parâmetros genéricos.

2. **Modificadores de acesso e seus níveis de visibilidade**:

-   Público (public): Visível para todas as outras classes.
-   Privado (private): Visível apenas dentro da própria classe.
-   Protegido (protected): Visível dentro da própria classe e nas subclasses.
-   Padrão (sem modificador, default ou package-private): Visível apenas dentro do mesmo pacote.

3. **Forma de comunicação no paradigma de Orientação por Objetos**:
   A comunicação é feita através de mensagens. Um objeto envia mensagens a outro para invocar métodos e compartilhar dados.

4. **Elemento com escopo dinâmico**:
   Pertence ao contexto ou instância onde foi criado, normalmente associado ao tempo de execução.

5. **Objetos com o mesmo estado são o mesmo objeto?**
   Não, objetos com o mesmo estado (mesmos valores de atributos) não são necessariamente o mesmo objeto. Eles podem ser instâncias diferentes da mesma classe com os mesmos dados.

6. **Objetos que uma referência de uma classe pode referenciar**:
   Uma referência de uma classe pode referenciar qualquer objeto que é uma instância dessa classe ou de suas subclasses.

7. **Uma referência de uma subclasse pode referenciar um objeto de alguma superclasse? Justifique sua resposta.**
   Não, uma referência de uma subclasse não pode referenciar um objeto de uma superclasse. A subclasse pode ter métodos e atributos adicionais que a superclasse não possui. Permitir isso causaria erros ao tentar acessar esses membros específicos da subclasse que não existem na superclasse.

8. **Elementos privados de uma superclasse são herdados e acessíveis por suas subclasses?**
   Elementos privados de uma superclasse são herdados, mas não são acessíveis diretamente pelas subclasses. Embora sejam herdados, esses elementos só podem ser acessados através de métodos públicos ou protegidos da superclasse, mantendo o princípio do encapsulamento.

9. **Considere a seguinte descrição: uma classe A possui 2 atributos e 3 métodos, uma classe B (herdeira de A) possui outros 2 atributos e 3 métodos. Uma referência do tipo A referencia um objeto do tipo B. Quantos atributos e métodos estão disponíveis para a referência A?**
   A referência do tipo A terá acesso a 2 atributos e 3 métodos. Mesmo que o objeto seja do tipo B e possua mais atributos e métodos, a referência de tipo A só pode acessar o que está definido na classe A.

10. **Considerando um conjunto de classes hierarquicamente dispostas, qual é a vantagem de se utilizar uma referência da superclasse mais alta nessa hierarquia?**
    Usar uma referência da superclasse mais alta proporciona maior flexibilidade e reutilização do código. Permite tratar diferentes objetos de subclasses de maneira uniforme, facilitando a implementação de algoritmos genéricos e permitindo a adição de novas subclasses sem modificar o código existente.

# UML

1. **Elementos sublinhados**: No diagrama de classes, os elementos sublinhados normalmente representam **atributos ou métodos estáticos**. Isso significa que esses membros pertencem à classe em si, em vez de a instâncias individuais da classe. Eles podem ser acessados sem a necessidade de criar uma instância da classe.

2. **Nomes nas origens das setas fechadas e \* na outra extremidade**:

    - Os nomes nas origens das setas fechadas (como `- professores`, `- alunos`) indicam os **nomes das associações** ou papéis desempenhados pelos objetos no relacionamento.
    - O asterisco (\*) na outra extremidade das setas representa uma **multiplicidade**, indicando que uma instância da classe pode estar associada a muitas instâncias da outra classe. Por exemplo, `CadastroProfessores` pode estar associado a muitos `Professor` e `CadastroAlunos` a muitos `Aluno`.

3. **Setas abertas no pacote app**: As setas abertas no pacote `app`, que são representações de **herança** (também conhecidas como generalização/especialização). Indicam que `Professor` e `Aluno` são subclasses que herdam de `PessoaFisica`. Isso significa que `Professor` e `Aluno` herdam atributos e métodos da classe `PessoaFisica`.

4. **Seta tracejada entre MenuPrincipal e MenuAluno**: A seta tracejada representa um **relacionamento de uso ou dependência**. Isso significa que a classe `MenuPrincipal` usa ou depende da classe `MenuAluno`, o que pode significar que `MenuPrincipal` cria instâncias de `MenuAluno` ou chama seus métodos.

5. **Polimorfismo**: Sim, existe polimorfismo neste diagrama, especialmente relacionado à herança entre `PessoaFisica`, `Professor`, e `Aluno`. `PessoaFisica` é a superclasse, e `Professor` e `Aluno` são subclasses. O polimorfismo permite que um objeto do tipo `PessoaFisica` seja usado para referenciar objetos de suas subclasses (`Professor` ou `Aluno`), e que métodos específicos das subclasses possam ser chamados, mesmo que o tipo de referência seja o da superclasse.
