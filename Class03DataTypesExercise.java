import java.math.BigDecimal;
import java.time.LocalDateTime;

/*

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salario>, na data <data>.
 */
public class Class03DataTypesExercise {
    public static void main(String[] args) {
        String name = "John Doe";
        String address = "Rua Todos os Santos 1021";
        BigDecimal salary = new BigDecimal("1310.89");
        LocalDateTime salaryDate = LocalDateTime.of(2025, 4, 2, 9, 30);

        System.out.println("Eu " + name + ", morando no endereço " + address +
                ", confirmo que recebi o salário de " + salary +
                ", na data " + salaryDate
        );
    }
}
