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

public class AddCartAdditionTest extends RecombeeTestCase {

    @Test
    public void testAddCartAddition() throws ApiException {
        AddCartAddition req;
        Request req2;
        String  resp;
        // it 'does not fail with cascadeCreate'
        req = new AddCartAddition("u_id","i_id").setCascadeCreate(true).setAdditionalData(new HashMap<String, Object>(){{put("answer",42);}});
        resp = this.client.send(req);
        // it 'does not fail with existing item and user'
        req = new AddCartAddition("entity_id","entity_id");
        resp = this.client.send(req);
        // it 'does not fail with valid timestamp'
        req = new AddCartAddition("entity_id","entity_id").setTimestamp(parseDate("2013-10-29T09:38:41.341Z"));
        resp = this.client.send(req);
        // it 'fails with nonexisting item id'
        req = new AddCartAddition("entity_id","nonex_id");
        try {
            this.client.send(req);
            fail("No exception thrown");
        } catch (ResponseException ex) {
            assertEquals(404,ex.getStatusCode());
        }
        // it 'fails with nonexisting user id'
        req = new AddCartAddition("nonex_id","entity_id");
        try {
            this.client.send(req);
            fail("No exception thrown");
        } catch (ResponseException ex) {
            assertEquals(404,ex.getStatusCode());
        }
        // it 'fails with invalid time'
        req = new AddCartAddition("entity_id","entity_id").setTimestamp(new Date(-15));
        try {
            this.client.send(req);
            fail("No exception thrown");
        } catch (ResponseException ex) {
            assertEquals(400,ex.getStatusCode());
        }
        // it 'really stores interaction to the system'
        req = new AddCartAddition("u_id2","i_id2").setCascadeCreate(true).setTimestamp(new Date(5));
        resp = this.client.send(req);
        try {
            this.client.send(req);
            fail("No exception thrown");
        } catch (ResponseException ex) {
            assertEquals(409,ex.getStatusCode());
        }
    }
}
