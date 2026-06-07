# Explorando Padrões de Projetos na Prática com Java


O repositório original pode ser acessado <a href=https://github.com/digitalinnovationone/lab-padroes-projeto-spring>neste link</a>.

<h3>Alterações realizadas:</h3>
<p>

* Adição da entidade Fornecedor, buscando manter os padrões de projeto já implementados.
    * Possui características em comum com a Entidade Cliente.
    * Adicionalmente, FornecedorService possui uma interface para verificar a situação do CNPJ do Fornecedor.
    * BrasilAPIService é utilizada para consultar várias informações sobre o CNPJ.
    * FornecedorService utiliza o BrasilAPIService para consultar a descrição textual da situação de um CNPJ.
</p>