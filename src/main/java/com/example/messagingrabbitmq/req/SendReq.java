package com.example.messagingrabbitmq.req;


import com.fasterxml.jackson.databind.JsonNode;

public class SendReq {

    private JsonNode message;

    private String exchangeName;

    public JsonNode getMessage() {
        return message;
    }

    public void setMessage(JsonNode message) {
        this.message = message;
    }

    public String getExchangeName() {
        return exchangeName;
    }

    public void setExchangeName(String exchangeName) {
        this.exchangeName = exchangeName;
    }
}
