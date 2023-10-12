package TestCalculadora;

import org.example.Calculadora;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

    @TestFactory
    Stream<DynamicTest> dynamicTestsFromStreamInJava8() {

        Calculadora calculadora = new Calculadora();
        Object[] entradas = IntStream.range(0, 1000).boxed().toArray();
        Object[] resultados = IntStream.range(0, 1000).map(n -> n * 2).boxed().toArray();

        return IntStream.range(0, 1000)
                .mapToObj(numero -> DynamicTest.dynamicTest("multiplicando: " + numero,
                        () -> {
                            assertEquals(calculadora.multiplica((Integer) entradas[numero], 2),
                                    resultados[(Integer) entradas[numero]]);
                        }));
    }
}
