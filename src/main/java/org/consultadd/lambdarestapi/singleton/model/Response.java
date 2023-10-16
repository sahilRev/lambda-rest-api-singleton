package org.consultadd.lambdarestapi.singleton.model;

import lombok.Data;

import java.util.Map;

@Data
public class Response {

    private Map<String, Object> apiData;
}
