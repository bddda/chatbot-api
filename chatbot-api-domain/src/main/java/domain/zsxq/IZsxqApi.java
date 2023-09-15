package domain.zsxq;

import domain.zsxq.model.aggregates.UnAnsweredQuestionsAggregates;

import java.io.IOException;

/**
 * @description 知识星球 API 接口
 * @github https://github.com/bddda/chatbot-api/tree/master
 */
public interface IZsxqApi {

    //返回未回答的信息数据
    UnAnsweredQuestionsAggregates queryUnAnsweredQuestionsTopicId(String groupId, String cookie) throws IOException;

    //问题接口
    boolean answer(String groupId, String cookie, String topicId, String text, boolean silenced) throws IOException;

}