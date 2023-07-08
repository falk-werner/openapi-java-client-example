import connexion
import six
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server import util


def greet(whom="you"):  # noqa: E501
    """greet

    Greeting service. # noqa: E501

    :param whom: Contains the name to greet.
    :type whom: str

    :rtype: Union[str, Tuple[str, int], Tuple[str, int, Dict[str, str]]
    """
    return f'Hello, {whom}!'
