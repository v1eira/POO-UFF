/*

Resposta: o modificador synchronized serve para sincronizar o acesso das threads
aos métodos. Deve ser usado em situações de leitura/escrita em vetores ou
variáveis. Por exemplo: duas threads têm acesso à um mesmo método que é
responsável por alterar o valor de uma variável e realizar alguma operação
envolvendo a mesma. Uma thread só pode executar sua operação (chamar o método)
após a a outra ter completado sua execuçao, caso contrário os resultados serão
inconsistentes.
Este modificador não é utilizado em todos os métodos porque ele deixa o programa
menos paralelizável, já que o synchronized impede o acesso simultâneo àquele
método (outras threads só podem acessá-lo após a thread atual terminar sua
execução do método).

*/