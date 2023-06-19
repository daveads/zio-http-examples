import unittest
import requests

class MainAppTest(unittest.TestCase):
    BASE_URL = "http://localhost:8080"

    def test_text_route(self):
        url = self.BASE_URL + "/text"
        response = requests.get(url)
        self.assertEqual(response.status_code, 200)
        self.assertEqual(response.text, "Hello World!")

    def test_fruits_route(self):
        fruit_id = "b"
        url = f"{self.BASE_URL}/fruits/{fruit_id}"
        response = requests.get(url)
        self.assertEqual(response.status_code, 200)
        self.assertEqual(response.text, "banana")

    def test_json_route(self):
        url = self.BASE_URL + "/json"
        response = requests.get(url)
        self.assertEqual(response.status_code, 200)
        self.assertEqual(response.json(), {"greetings": "Hello World!"})

if __name__ == '__main__':
    unittest.main()
