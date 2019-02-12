package com.vermeulen.trial;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.core.ResolvableType;

import static org.assertj.core.api.Assertions.assertThat;

public abstract class AbstractResourceTest<T> {
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
    private final JacksonTester<T> json;
    private final String JSON_TEST_FILE;
    protected T resource;

    protected AbstractResourceTest(Class<T> resourceTestClass, String jsonFileName) {
        json = new JacksonTester<>(resourceTestClass, ResolvableType.forClass(resourceTestClass), OBJECT_MAPPER);
        JSON_TEST_FILE = jsonFileName;
        OBJECT_MAPPER.registerModule(new JavaTimeModule());
        OBJECT_MAPPER.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
    }

    @Test
    void shouldSerialize() throws Exception {
        System.out.println(json.write(resource));
        assertThat(json.write(resource)).isEqualToJson(JSON_TEST_FILE);
    }

    @Test
    void shouldDeserialize() throws Exception {
        System.out.println(json.read(JSON_TEST_FILE));
        assertThat(json.read(JSON_TEST_FILE)).isEqualTo(resource);
    }
}
