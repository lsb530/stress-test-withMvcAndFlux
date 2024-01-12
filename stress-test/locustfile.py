# locustfile.py
from locust import HttpUser, task, between, TaskSet

# class UserBehavior(TaskSet):
#     # @task
#     # def home(self):
#     #     self.client.get('/')
#
#     @task
#     def delay(self):
#         self.client.get('/delay')
#
#
# class LocustUser(HttpUser):
#     host = "http://localhost:3000"
#     tasks = [UserBehavior]
#     wait_time = between(1, 4)

from locust import HttpUser, task, between

# Tomcat 서버를 테스트하기 위한 사용자 정의
class TomcatUser(HttpUser):
    host = "http://localhost:4000"
    wait_time = between(1, 4)

    @task
    def delay(self):
        self.client.get("/mvc-request")

# Netty 서버를 테스트하기 위한 사용자 정의
class NettyUser(HttpUser):
    host = "http://localhost:4500"
    wait_time = between(1, 4)

    @task
    def delay(self):
        self.client.get("/webflux-request")
