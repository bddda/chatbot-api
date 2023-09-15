package domain.ai;

import java.io.IOException;

/**
 * @description ChatGPT open ai 接口：https://beta.openai.com/account/api-keys
 * @github https://github.com/bddda/chatbot-api/tree/master
 */
public interface IOpenAI {

    String doChatGPT(String openAiKey, String question) throws IOException;

}
