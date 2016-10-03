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

public class AddBookmarkBatchTest extends RecombeeTestCase {

    @Test
    public void testAddBookmark() throws ApiException {
        Request[] requests = new Request[] {
            new AddBookmark("u_id","i_id").setCascadeCreate(true),
            new AddBookmark("entity_id","entity_id"),
            new AddBookmark("entity_id","entity_id").setTimestamp(parseDate("2013-10-29T09:38:41.341Z")),
            new AddBookmark("entity_id","nonex_id"),
            new AddBookmark("nonex_id","entity_id"),
            new AddBookmark("entity_id","entity_id").setTimestamp(new Date(-15)),
            new AddBookmark("u_id2","i_id2").setCascadeCreate(true).setTimestamp(new Date(5)),
            new AddBookmark("u_id2","i_id2").setCascadeCreate(true).setTimestamp(new Date(5))
        };

        BatchResponse[] responses = this.client.send(new Batch(requests));
        assertEquals(200,responses[0].getStatusCode());
        assertEquals(200,responses[1].getStatusCode());
        assertEquals(200,responses[2].getStatusCode());
        assertEquals(404,responses[3].getStatusCode());
        assertEquals(404,responses[4].getStatusCode());
        assertEquals(400,responses[5].getStatusCode());
        assertEquals(200,responses[6].getStatusCode());
        assertEquals(409,responses[7].getStatusCode());
    }
}
