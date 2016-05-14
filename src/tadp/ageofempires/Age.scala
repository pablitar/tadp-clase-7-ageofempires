package tadp.ageofempires

abstract class Defensor {
  def potencialDefensivo: Int
  var energia = 100

  def perderEnergia(danio: Int): Unit = {
    energia = energia - danio
  }
}

trait Atacante {
  def potencialOfensivo: Int

  def atacarA(defensor: Defensor): Unit = {
    if (potencialOfensivo > defensor.potencialDefensivo) {
      defensor.perderEnergia(
        potencialOfensivo - defensor.potencialDefensivo)
    }
  }
}

class Muralla(altura: Int) extends Defensor {
  energia = {
    val alturaMaxima = altura * 320000
    alturaMaxima / 320
  }
  def potencialDefensivo = altura * 10
}

class Misil(antiguedad: Int) extends Atacante {
  def potencialOfensivo = antiguedad * 2
}

class Guerrero(_potencialOfensivo: Int = 10,
  val potencialDefensivo: Int = 2)
    extends Defensor with Atacante {

  def potencialOfensivo = _potencialOfensivo

  def doblePotencialOfensivo: Double =
    potencialOfensivo * 2

}

class Espada(val potencialOfensivo: Int)

class Espadachin(potencialOfensivoBase: Int,
  potencialDefensivo: Int,
  var espada: Espada)
    extends Guerrero(potencialOfensivoBase, potencialDefensivo) {
  override def potencialOfensivo =
    super.potencialOfensivo + espada.potencialOfensivo
}
  