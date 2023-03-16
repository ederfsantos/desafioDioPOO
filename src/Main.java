import desafio.dominio.Conteudo;
import desafio.dominio.Curso;
import desafio.dominio.Mentoria;

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

        System.out.println(c);
        System.out.println(c2);
        System.out.println(m);


    }
    }