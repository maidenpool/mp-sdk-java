package com.recombee.api_client;
/*
 This file is auto-generated, do not edit
*/


import com.recombee.api_client.api_requests.*;
import com.recombee.api_client.bindings.*;
import com.recombee.api_client.exceptions.ApiException;
import com.recombee.api_client.exceptions.ResponseException;

import java.util.HashMap;
import java.util.Date;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.fail;

public class RecommendItemsToItemTest extends RecommendationTestCase {

    @Test
    public void testRecommendItemsToItem() throws ApiException {
        RecommendItemsToItem req;
        Request req2;
        RecommendationResponse  resp;
        // it 'recommends'
        req = new RecommendItemsToItem("entity_id","entity_id",9);
        resp = this.client.send(req);
        // it 'recommends to previously nonexisting entity with cascadeCreate'
        req = new RecommendItemsToItem("nonexisting","entity_id",9).setCascadeCreate(true);
        resp = this.client.send(req);
        // it 'recommends with expert settings'
        req = new RecommendItemsToItem("nonexisting2","entity_id",9).setCascadeCreate(true).setExpertSettings(new HashMap<String, Object>(){{}});
        resp = this.client.send(req);
    }
}
