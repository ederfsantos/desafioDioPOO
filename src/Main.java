import desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso c = new Curso();
        c.setTitulo("curso java");
        c.setCargaHoraria(3);
        c.setDescricao("descrição do curso java");


        Curso c2 = new Curso();
        c2.setTitulo("curso javascript");
        c2.setCargaHoraria(5);
        c2.setDescricao("descrição do curso javascript");

        Mentoria m = new Mentoria();
        m.setCargaHoraria(2);
        m.setDescricao("descrição da mentoria de java");
        m.setTitulo("aprendendo java");
        m.setData(LocalDate.now());

       /* System.out.println(c);
        System.out.println(c2);
        System.out.println(m);*/

        Bootcamp bootcamp  = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(c);
        bootcamp.getConteudos().add(c2);
        bootcamp.getConteudos().add(m);

        Dev eder = new Dev();
        eder.setNome("Eder");
        eder.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos " + eder.getConteudosInscritos());
        eder.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos " + eder.getConteudosInscritos());
        System.out.println("Conteudos Concluidos " + eder.getConteudosConcluidos());
        System.out.println("XP: " + eder.calcularXp());
        System.out.println("------------------");
        Dev joao = new Dev();
        joao.setNome("João");
        joao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos " + joao.getConteudosInscritos());
       joao.progredir();
       joao.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos " + joao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos " + joao.getConteudosConcluidos());
        System.out.println("XP: " + joao.calcularXp());









    }
    }