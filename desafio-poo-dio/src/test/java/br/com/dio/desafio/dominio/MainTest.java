package br.com.dio.desafio.dominio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

public class MainTest {

	@Test
	void criacao() {

		assertDoesNotThrow(() -> new Bootcamp());
		assertDoesNotThrow(() -> new Curso());
		assertDoesNotThrow(() -> new Mentoria());
		assertDoesNotThrow(() -> new Dev());
		assertDoesNotThrow(() -> new Conteudo() {
            @Override
            public double calcularXp() {
                throw new UnsupportedOperationException("Método não implementado 'calcularXp'");
            }});
	}

    private <T> void comparar(T obtido, T esperado) {
        assertEquals(obtido, esperado, "A saída não procede! Obtive " + obtido + " esperava " + esperado + "\n");
    }

    @Test
    void verificarInformacoes() {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.of(2026, 6, 6));

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);

        comparar((devCamila.getConteudosInscritos()).toString(), "[Curso{titulo='curso java', descricao='descrição curso java', cargaHoraria=8}, Curso{titulo='curso js', descricao='descrição curso js', cargaHoraria=4}, Mentoria{titulo='mentoria de java', descricao='descrição mentoria java', data=2026-06-06}]");
        devCamila.progredir();
        devCamila.progredir();
        comparar(devCamila.getConteudosInscritos().toString(), "[Mentoria{titulo='mentoria de java', descricao='descrição mentoria java', data=2026-06-06}]");

        comparar(devCamila.getConteudosConcluidos().toString(), "[Curso{titulo='curso java', descricao='descrição curso java', cargaHoraria=8}, Curso{titulo='curso js', descricao='descrição curso js', cargaHoraria=4}]");
        comparar(devCamila.getTotalXp(),120.0);

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        comparar(devJoao.getConteudosInscritos().toString(), "[Curso{titulo='curso java', descricao='descrição curso java', cargaHoraria=8}, Curso{titulo='curso js', descricao='descrição curso js', cargaHoraria=4}, Mentoria{titulo='mentoria de java', descricao='descrição mentoria java', data=2026-06-06}]");
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        comparar(devJoao.getConteudosInscritos().toString(), "[]");
        comparar(devJoao.getConteudosConcluidos().toString(), "[Curso{titulo='curso java', descricao='descrição curso java', cargaHoraria=8}, Curso{titulo='curso js', descricao='descrição curso js', cargaHoraria=4}, Mentoria{titulo='mentoria de java', descricao='descrição mentoria java', data=2026-06-06}]");
        comparar(devJoao.getTotalXp(), 150.0);

    }
}
