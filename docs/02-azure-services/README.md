# 02 - Azure Services

## Servicios de Computo

Opciones para desplegar aplicaciones backend Java en Azure.

### Azure App Service

- Plataforma administrada (PaaS) para aplicaciones web.
- Ideal para APIs REST y aplicaciones empresariales.
- Escalabilidad integrada (scale-up y scale-out).
- Soporta Java, Spring Boot nativamente sin necesidad de contenedores.
- Es la opcion mas simple para desplegar un JAR o WAR.

### Azure Container Apps

- Ejecucion de aplicaciones contenerizadas sin gestionar infraestructura.
- Basado en Docker: empaquetas tu app en una imagen y la despliegas.
- Escalado automatico (incluye scale-to-zero).
- Ideal cuando necesitas mas control sobre el entorno de ejecucion.

### Azure Kubernetes Service (AKS)

- Kubernetes administrado por Azure.
- Para arquitecturas complejas y microservicios.
- Requiere mas configuracion pero ofrece maxima flexibilidad.
- Permite orquestar multiples contenedores con networking y storage avanzado.

### Criterio de seleccion rapido

| Necesidad | Servicio |
|-----------|----------|
| Desplegar un JAR/WAR simple | App Service |
| Contenedores sin gestionar cluster | Container Apps |
| Microservicios complejos | AKS |

## Servicios de Seguridad, Integracion y Configuracion

Componentes transversales para aplicaciones empresariales.

### Azure Key Vault

- Gestion segura de secretos (contraseñas, connection strings, claves API).
- Almacena certificados y claves criptograficas.
- Evita hardcodear secretos en el codigo o en variables de entorno sin proteccion.
- Integracion directa con App Service, AKS y otros servicios Azure.

### Azure Identity (Microsoft Entra ID)

- Autenticacion y autorizacion basada en identidades en la nube.
- Integracion con Microsoft Entra ID (antes Azure AD).
- Soporta OAuth 2.0, OpenID Connect, SAML.
- Permite implementar RBAC (Role-Based Access Control).

### Azure Service Bus

- Comunicacion asincrona entre servicios.
- Colas (FIFO) y mensajeria pub/sub (topics).
- Desacopla productores de consumidores.
- Garantia de entrega y dead-lettering.

### Azure App Configuration

- Configuracion centralizada para multiples instancias y entornos.
- Feature flags dinamicos.
- Evita reiniciar la app para cambiar configuraciones.
