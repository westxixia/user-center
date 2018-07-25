# 基于哪个镜像
FROM java:8u111
# 将本地文件夹挂载到当前容器
VOLUME /tmp
# 拷贝文件到容器
ADD eureka-server-1.0-SNAPSHOT.jar /app.jar
# 开放端口
EXPOSE 8761
# 配置容器启动后执行的命令
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Dspring.profiles.active=docker","-jar","/app.jar"]