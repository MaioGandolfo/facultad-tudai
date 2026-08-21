//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        public static void main (String[] args) {
                Empresa empresa = new Empresa("mali");

                Empleado em1 = new Empleado(1);
                Empleado em2 = new Empleado(2);
                Empleado em3 = new Empleado(3);

                Encuesta en1 = new Encuesta(5);
                Encuesta en2 = new Encuesta(6);
                Encuesta en3 = new Encuesta(8);
                Encuesta en4 = new Encuesta(10);
                Encuesta en5 = new Encuesta(9);
                Encuesta en6 = new Encuesta(11);

                Persona p1 = new Persona(45578289);
                Persona p2 = new Persona(35578289);
                Persona p3 = new Persona(45578281);
                Persona p4 = new Persona(45548289);
                Persona p5 = new Persona(40578229);
                Persona p6 = new Persona(42579289);

                empresa.addEncuesta(en1);
                empresa.addEncuesta(en2);
                empresa.addEncuesta(en3);
                empresa.addEncuesta(en4);
                empresa.addEncuesta(en5);
                empresa.addEncuesta(en6);

                empresa.addEmpleado(em1);
                empresa.addEmpleado(em2);
                empresa.addEmpleado(em3);

                EncuestaRespondida enr1 = new EncuestaRespondida(em1, p1, en1);
                EncuestaRespondida enr2 = new EncuestaRespondida(em2, p2, en2);
                EncuestaRespondida enr3 = new EncuestaRespondida(em3, p3, en3);
                EncuestaRespondida enr4 = new EncuestaRespondida(em2, p4, en4);
                EncuestaRespondida enr5 = new EncuestaRespondida(em3, p5, en5);
                EncuestaRespondida enr6 = new EncuestaRespondida(em1, p6, en6);
                EncuestaRespondida enr7 = new EncuestaRespondida(em2, p3, en3);
                EncuestaRespondida enr8 = new EncuestaRespondida(em3, p4, en4);

                em1.agregarEncuestaRespondida(enr1, p1);
                em1.agregarEncuestaRespondida(enr6, p6);
                em2.agregarEncuestaRespondida(enr2, p2);
                em2.agregarEncuestaRespondida(enr4, p4);
                em2.agregarEncuestaRespondida(enr7, p3);
                em3.agregarEncuestaRespondida(enr3, p3);
                em3.agregarEncuestaRespondida(enr5, p5);
                em3.agregarEncuestaRespondida(enr8, p4);

                System.out.println(em1.getCantEncuestasRealizadas());
                System.out.println(em2.getCantEncuestasRealizadas());
                System.out.println(em3.getCantEncuestasRealizadas());
        }
}