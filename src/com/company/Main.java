package com.company;
import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(80);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso C#");
        curso2.setDescricao("Descrição do curso Csharp");
        curso2.setCargaHoraria(10);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrção mentoria de Java");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devLeiliane = new Dev();
        System.out.println("Leiliane");
        devLeiliane.setNome("Leiliane");
        devLeiliane.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devLeiliane.getCconteudosInscritos());
        devLeiliane.progredir();
        devLeiliane.progredir();
        devLeiliane.progredir();
        System.out.println(" - ");
        System.out.println("Conteúdos Inscritos" + devLeiliane.getCconteudosInscritos());
        System.out.println("Conteúdos Concluido" + devLeiliane.getCconteudosConcluidos());
        System.out.println("XP: " + devLeiliane.calcularTotalXp());


        Dev devMaria = new Dev();
        System.out.println("Maria");
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devMaria.getCconteudosInscritos());
        devMaria.progredir();
        System.out.println(" - ");
        System.out.println("Conteúdos Inscritos" + devMaria.getCconteudosInscritos());
        System.out.println("Conteúdos Concluidos" + devMaria.getCconteudosConcluidos());
        System.out.println("XP: " + devMaria.calcularTotalXp());


    }
}
