package files;

import com.fasterxml.jackson.databind.ObjectMapper;
import files.model.Employee;
import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.io.InputStreamReader;
import static org.assertj.core.api.Assertions.assertThat;


public class JsonParsingTest {
    ClassLoader cl = JsonParsingTest.class.getClassLoader();

    @Test
    void jsonParsingTest() throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        try (
                InputStream resource = cl.getResourceAsStream("exampleFiles/jsonFile.json");
                InputStreamReader reader = new InputStreamReader(resource);
        ) {
            Employee employee = mapper.readValue(reader, Employee.class);
            assertThat(employee.name).isEqualTo("John");
            assertThat(employee.salary).isEqualTo(150000);
            assertThat(employee.married).isTrue();
            assertThat(employee.hobbies[0]).isEqualTo("sport");
        }
    }
}
