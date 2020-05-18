package com.lgsvc.wxserv.service;

import com.lgsvc.wxserv.dto.ChannelHisExecution;

public interface ChannelHisService {

    public ChannelHisExecution getChannelHisList(Integer customId, String Channel_id, String fristDate, String lastDate, Integer page_index, Integer page_size);
}
