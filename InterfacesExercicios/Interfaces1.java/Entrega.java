/*
## Exercício 1

**Contextualização:**  
Uma empresa de entregas deseja padronizar os meios de entrega disponíveis, seja por transporte terrestre ou aéreo. Cada tipo deve seguir um contrato com métodos obrigatórios que descrevem a rota e o custo da entrega.

- Crie uma **interface** `Entrega` com dois métodos:
  - `calcularFrete(double distancia)` e `descricaoRota()`.

- Implemente em duas classes:
  - `EntregaTerrestre`: considera R$ 0.75 por km.
  - `EntregaAerea`: considera R$ 2.50 por km, mas entrega em metade do tempo estimado.
 */

public interface Entrega {
    public void calcularFrete (double distancia);
    public void descricaoRota();
}