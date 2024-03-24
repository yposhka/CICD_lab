# Используем официальный образ OpenJDK для Java 17
FROM openjdk:17

# Копируем JAR файл вашего проекта внутрь контейнера
ADD /build/libs/CICD_lab-0.0.1-SNAPSHOT.jar app.jar

# Команда запускающая JAR файл при запуске контейнера
CMD ["java", "-jar", "app.jar"]
