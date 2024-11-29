package br.com.robsonlmds.screenmatch;
import br.com.robsonlmds.screenmatch.model.Episodio;
import br.com.robsonlmds.screenmatch.model.Serie;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
    
    import static org.junit.jupiter.api.Assertions.*;
    
    import java.time.LocalDate;
    
    public class GetSetTest {
    
        private Episodio episodio;
    
        @BeforeEach
        public void setUp() {
            episodio = new Episodio();
        }
    
        @Test
        public void testSetGetTemporada() {

            episodio.setTemporada(1);
            assertEquals(1, episodio.getTemporada());
        }
    
        @Test
        public void testSetGetTitulo() {
  
            episodio.setTitulo("Episódio 1");
            assertEquals("Episódio 1", episodio.getTitulo());
        }
    
        @Test
        public void testSetGetNumeroEpisodio() {

            episodio.setNumeroEpisodio(1);
            assertEquals(1, episodio.getNumeroEpisodio());
        }
    
        @Test
        public void testSetGetAvaliacao() {
  
            episodio.setAvaliacao(9.5);
            assertEquals(9.5, episodio.getAvaliacao());
        }
    
        @Test
        public void testSetGetDataLancamento() {
     
            LocalDate data = LocalDate.of(2024, 11, 28);
            episodio.setDataLancamento(data);
            assertEquals(data, episodio.getDataLancamento());
        }
    
        @Test
        public void testSetGetSerie() {
    
            Serie serie = new Serie();
            episodio.setSerie(serie);
            assertEquals(serie, episodio.getSerie());
        }
    
        @Test
        public void testToString() {
   
            episodio.setTemporada(1);
            episodio.setTitulo("Episódio 1");
            episodio.setNumeroEpisodio(1);
            episodio.setAvaliacao(8.5);
            episodio.setDataLancamento(LocalDate.of(2024, 11, 28));
    
            String expectedString = "temporada=1, titulo='Episódio 1', numeroEpisodio=1, avaliacao=8.5, dataLancamento=2024-11-28";
            assertEquals(expectedString, episodio.toString());
        }
    }
    

