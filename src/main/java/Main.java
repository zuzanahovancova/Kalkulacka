import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Main {

    public static void main(String[] args) {
        ScriptEngineManager factory = new ScriptEngineManager();
        ScriptEngine engine = factory.getEngineByName("nashorn");
        String vzorec = "2*3+(1-1)";
        try {
            System.out.println(engine.eval(vzorec)); // vysledok Stringu, ktory obsahuje vzorec vypisem
        } catch (ScriptException e) {
            throw new RuntimeException(e);
        }
    }
}
