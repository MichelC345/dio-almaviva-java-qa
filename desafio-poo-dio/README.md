<h2>Abstraindo um Bootcamp Usando Orientação a Objetos em Java</h2>

O repositório original pode ser acessado <a href=https://github.com/cami-la/desafio-poo-dio/>neste link</a>.

<h3> Decisões tomadas </h3>
<p>

* Sistema Operacional Windows 10
* Gerenciar o projeto pelo VS Code 
* Usar o Maven como gerenciador de pacotes
</p>

<h3>Desafios encontrados:</h3>
<p>

* O terminal exibia caracteres bugados. A solução foi definir a variável de ambiente JAVA_TOOL_OPTIONS=-Dfile.encoding=UTF-8. 

</p>

<h3>Alterações realizadas:</h3>
<p>

* Código-fonte movido para /src/main/java (padrão do Maven).
* Alteração na forma como a XP era computada: antes utilizava a função calcularTotalXp de complexidade O(N). A alteração realizada foi incluir totalXp como um dos atributos de Dev e somá-lo sempre que a pessoa concluir um curso. Dessa forma o método utilizado para consultar o XP de uma pessoa pode ter complexidade O(1), sendo útil para casos em que há várias consultas.
* Implementação de testes básicos envolvendo todas as classes do projeto em MainTest, simulando um caso de uso básico.
</p>