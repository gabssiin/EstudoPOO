package Q14;

interface ExportadorRelatorio {
    String exportar(String titulo, String conteudo) throws ExportacaoFalhouException;
}