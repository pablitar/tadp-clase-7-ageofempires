package tadp.ageofempires

import org.junit.Test
import org.junit.Assert._

class AgeSuite {
  
  val atila = new Guerrero(30, 5)
  val muralla = new Muralla(2)
 
  @Test
  def unGuerreroAtacaAUnGuerrero():Unit = {
    val conan = new Guerrero(15, 6)
    
    atila.atacarA(conan)
    
    assertEquals(76, conan.energia)
  }
  
  @Test
  def unGuerreroAtacaAUnaMuralla():Unit = {
    atila.atacarA(muralla)
    
    assertEquals(1990, muralla.energia)
  }
  
  @Test
  def unMisilAtacaAUnaMuralla():Unit = {
    val misil = new Misil(60)
    
    misil.atacarA(muralla)
    
    assertEquals(1900, muralla.energia)
  }
  
  @Test
  def unEspadachinAtacaAUnGuerrero():Unit = {
    val espadachin = new Espadachin(30, 10, new Espada(10))
    espadachin.atacarA(atila)
    
    assertEquals(65, atila.energia)
  }
  
}