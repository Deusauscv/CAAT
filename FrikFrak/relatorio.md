1. Introdução 
O Frik-Frak é uma variante estratégica do Jogo do Galo. Ao contrário 
do jogo tradicional, cada jogador possui apenas 3 peças e, após a 
colocação inicial, o jogo entra numa fase dinâmica de movimentação. 
Este programa implementa a base necessária para a gestão do tabuleiro 
e a validação das jogadas iniciais. 
2. Estrutura de Dados 
A escolha da estrutura de dados foi fundamental para garantir a 
eficiência das validações: 
• Matriz Bidimensional (String[3][3]): Utilizada para representar 
o tabuleiro. Esta escolha permite um acesso direto $O(1)$ a 
qualquer posição através de coordenadas (linha, coluna). 
• Variável de Estado (pecasColocadas): Um contador inteiro que 
controla a transição entre a fase de colocação e a fase de 
movimento. 
3. Algoritmos Implementados 
3.1. Inicialização e Visualização 
O método inicializa() percorre a matriz utilizando ciclos for aninhados 
para preencher todas as células com um espaço vazio (" "). O método 
mostrarTabuleiro() renderiza a interface em modo consola utilizando 
caracteres ASCII para delimitar as células, garantindo uma 
visualização clara para o utilizador. 
3.2. Validação de Regras 
Para garantir que o jogo segue as regras descritas, foram 
implementados dois filtros de segurança: 
1. posicaoValida: Verifica se os índices introduzidos estão dentro 
do intervalo $[0, 2]$. Isto previne erros de execução do tipo 
ArrayIndexOutOfBoundsException. 
2. posicaoLivre: Garante o cumprimento da regra de não 
sobreposição, verificando se a célula destino contém apenas um 
espaço vazio. 
3.3. Fluxo de Jogo (Main) 
O ciclo while gere o turn-based system. A alternância entre jogadores 
é feita através de um operador ternário: 
jogadorAtual = (jogadorAtual.equals("X")) ? "O" : "X"; 
Esta lógica garante que o fluxo seja contínuo e automático após cada 
jogada válid