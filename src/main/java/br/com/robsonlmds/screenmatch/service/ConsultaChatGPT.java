package br.com.robsonlmds.screenmatch.service;

import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.service.OpenAiService;

public class ConsultaChatGPT {
    public static String obterTraducao(String texto) {
        OpenAiService service = new OpenAiService("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");

        CompletionRequest requisicao = CompletionRequest.builder()
                .model("gpt-3.5-turbo-instruct")
                .prompt("traduza para o português o texto: " + texto)
                .maxTokens(1000)
                .temperature(0.7)
                .build();


        var resposta = service.createCompletion(requisicao);
        return resposta.getChoices().get(0).getText();
    }
}
