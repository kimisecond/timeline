from locust import HttpLocust, TaskSet, task


class WebsiteTasks(TaskSet):
    def on_start(self):
        pass

    # self.client.post("/register", {
    #         #     "username": "test",
    #         #     "password": "123456"
    #         # })

    @task(2)
    def index(self):
        self.client.get("/")

    @task(1)
    def about(self):
        self.client.get("/profile/")


class WebsiteUser(HttpLocust):
    task_set = WebsiteTasks
    host = "http://127.0.0.1:8080"
    min_wait = 10
    max_wait = 500
