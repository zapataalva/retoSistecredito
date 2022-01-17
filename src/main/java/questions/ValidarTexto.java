package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class ValidarTexto implements Question<String> {

    private String texto;
    private Target target;

    public ValidarTexto(String texto, Target target) {
        this.texto = texto;
        this.target = target;
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(target.of(texto)).viewedBy(actor).asString();
    }

    public static ValidarTexto con(String texto, Target target){
        return new ValidarTexto(texto, target);
    }
}
