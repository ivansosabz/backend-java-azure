# 00 - Setup y Herramientas

## Herramientas necesarias

| Herramienta | Version recomendada | Proposito |
|-------------|---------------------|-----------|
| JDK | 21 o superior (LTS) | Compilar y ejecutar Java |
| IDE | IntelliJ IDEA (o preferido) | Desarrollo |
| Git | Ultima estable | Control de versiones |
| Docker | Ultima estable | Contenedores y servicios locales |
| Maven | Incluido con el proyecto | Gestion de dependencias y build |
| Cuenta Azure | - | Despliegue y servicios en la nube |

## Verificacion del entorno

### Java
```bash
java -version
# Deberia mostrar version 21+
```

### Maven
```bash
mvn -version
# Verificar que usa el JDK correcto
```

### Docker
```bash
docker --version
docker compose version
```

### Git
```bash
git --version
```

## Notas

- JDK 21 es la version LTS actual. Priorizar LTS sobre versiones intermedias.
- Maven se puede usar via wrapper (`./mvnw`) sin instalacion global.
- En IntelliJ, verificar que el Project SDK este configurado a JDK 21.
- Docker es esencial para levantar bases de datos locales y otros servicios durante el desarrollo.
