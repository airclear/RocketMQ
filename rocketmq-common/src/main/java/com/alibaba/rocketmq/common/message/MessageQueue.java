/**
 * Copyright (C) 2010-2013 Alibaba Group Holding Limited
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.rocketmq.common.message;

import java.io.Serializable;


/**
 * 消息队列数据结构，对外提供
 * 
 * @author shijia.wxr<vintage.wang@gmail.com>
 */
public class MessageQueue implements Comparable<MessageQueue>, Serializable {
    private static final long serialVersionUID = 6191200464116433425L;

    private String topic;
    private String brokerName;
    private int queueId;


    public MessageQueue() {

    }


    public MessageQueue(String topic, String brokerName, int queueId) {
        this.topic = topic;
        this.brokerName = brokerName;
        this.queueId = queueId;
    }


    public String getTopic() {
        return topic;
    }


    public void setTopic(String topic) {
        this.topic = topic;
    }


    public String getBrokerName() {
        return brokerName;
    }


    public void setBrokerName(String brokerName) {
        this.brokerName = brokerName;
    }


    public int getQueueId() {
        return queueId;
    }


    public void setQueueId(int queueId) {
        this.queueId = queueId;
    }


    @Override
    public String toString() {
        return "MessageQueue [topic=" + topic + ", brokerName=" + brokerName + ", queueId=" + queueId + "]";
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((brokerName == null) ? 0 : brokerName.hashCode());
        result = prime * result + queueId;
        result = prime * result + ((topic == null) ? 0 : topic.hashCode());
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        MessageQueue other = (MessageQueue) obj;
        if (brokerName == null) {
            if (other.brokerName != null)
                return false;
        }
        else if (!brokerName.equals(other.brokerName))
            return false;
        if (queueId != other.queueId)
            return false;
        if (topic == null) {
            if (other.topic != null)
                return false;
        }
        else if (!topic.equals(other.topic))
            return false;
        return true;
    }


    @Override
    public int compareTo(MessageQueue o) {
        return this.toString().compareTo(o.toString());
    }
}
