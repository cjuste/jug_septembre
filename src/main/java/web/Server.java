package web;

import net.codestory.http.WebServer;
import net.codestory.http.annotations.Get;

import java.util.Arrays;
import java.util.List;

public class Server {
  public static void main(String[] args) {
    new WebServer(
            routes -> {
                routes.get("/toto","toto");
                routes.get("/tutu", "<html><body>hello</body></html>");
                routes.get("/hello/:name", (context,name) -> "<html><body>hello " + name + "</body></html>");
                routes.add(MyRessource.class);
            }
    ).start();
  }

    public static class MyRessource {

        @Get("/helloRessource/:name")
        public String hello(String name) {
            return "<html><body>hello ressource " + name + "</body></html>";
        }

        @Get("/age/:age")
        public String age(int age) {
            return "<html><body>Age " + age + "</body></html>";
        }

        @Get("/programmers")
        public List<Programmer> getProgrammers() {
            return Arrays.asList(new Programmer("programmerNom1", "programmerPrenom1"), new Programmer("programmerNom2", "programmerPrenom2"));
        }
    }

    public static class Programmer {
        private String nom;
        private String prenom;

        public Programmer(String nom, String prenom) {
            this.nom = nom;
            this.prenom = prenom;
        }
    }
}
