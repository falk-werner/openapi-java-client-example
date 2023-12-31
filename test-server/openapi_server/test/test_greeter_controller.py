# coding: utf-8

from __future__ import absolute_import
import unittest

from flask import json
from six import BytesIO

from openapi_server.test import BaseTestCase


class TestGreeterController(BaseTestCase):
    """GreeterController integration test stubs"""

    def test_greet(self):
        """Test case for greet

        
        """
        query_string = [('whom', 'Bob')]
        headers = { 
            'Accept': 'text/plain',
        }
        response = self.client.open(
            '/greeter/v1/greet',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
