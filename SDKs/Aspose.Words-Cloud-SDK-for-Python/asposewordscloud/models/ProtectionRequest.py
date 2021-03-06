#!/usr/bin/env python

class ProtectionRequest(object):
    """NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually."""


    def __init__(self):
        """
        Attributes:
          swaggerTypes (dict): The key is attribute name and the value is attribute type.
          attributeMap (dict): The key is attribute name and the value is json key in definition.
        """
        self.swaggerTypes = {
            'Password': 'str',
            'NewPassword': 'str',
            'ProtectionType': 'str'

        }

        self.attributeMap = {
            'Password': 'Password','NewPassword': 'NewPassword','ProtectionType': 'ProtectionType'}       

        self.Password = None # str
        self.NewPassword = None # str
        self.ProtectionType = None # str
        
