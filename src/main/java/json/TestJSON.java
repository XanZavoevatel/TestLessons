package json;


import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;

import java.io.*;
import java.nio.file.Path;

public class TestJSON {

    public static final String CAT_DAT = "cat.dat";
    public static final String FILE_YAML = "src/yamlFile.yaml";

    public static void main(String[] args) throws IOException {
        Cat cat = new Cat("Barsik", 3);

        File fileYaml = new File(FILE_YAML);
        JsonMapper mapper = new JsonMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        String jsonString = mapper.writeValueAsString(cat);
        System.out.println(jsonString);
        Path path = Path.of(FILE_YAML);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(CAT_DAT));
        objectOutputStream.write(mapper.writeValueAsBytes(cat));

        YAMLMapper yamlMapper = new YAMLMapper(new YAMLFactory());
        yamlMapper.enable(SerializationFeature.INDENT_OUTPUT);
        yamlMapper.writeValue(fileYaml, cat);


//        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(CAT_DAT));
//        objectInputStream.read(mapper.writeValueAsBytes(cat));

    }
}
