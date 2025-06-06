package Q20;

class MotoReservavel extends Moto implements Reservavel {
    private boolean reservado = false;

    public MotoReservavel(String modelo, int capacidade) throws CapacidadeInvalidaException {
        super(modelo, capacidade);
    }

    @Override
    public boolean reservar(String data, Rota rota) throws RotaInvalidaException {
        if (rota == null) {
            throw new RotaInvalidaException("Erro: A rota para reserva não pode ser nula.");
        }
        if (reservado) {
            System.out.println("Moto " + getModelo() + " já está reservada para " + data + " na rota " + rota.getOrigem() + " - " + rota.getDestino() + ".");
            return false;
        }
        reservado = true;
        System.out.println("Moto " + getModelo() + " reservada para " + data + " na rota " + rota.getOrigem() + " - " + rota.getDestino() + ".");
        return true;
    }
}