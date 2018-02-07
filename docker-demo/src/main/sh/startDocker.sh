docker run -p 8080:7070 -t docker-demo:1.0.0-SNAPSHOT

# 1. 登录docker账号 命令行登录  docker login 如果docker cloud中未创建镜像,需创建,例如创建镜像:catface
# 2. tag 镜像
# 3. push 镜像
docker tag docker-demo:1.0.0-SNAPSHOT zlyxzq/catface:latest
docker push zlyxzq/catface:latest
