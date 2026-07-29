# 04 - Security

## Conceptos generales

- Seguridad en capas: autenticacion (quien eres) + autorizacion (que puedes hacer).
- Nunca hardcodear secretos en el codigo fuente.
- Usar servicios gestionados (Key Vault) en lugar de almacenar secretos en archivos de configuracion.

## Azure Key Vault

- Gestion segura de secretos, certificados y claves criptograficas.
- Los secretos se rotan sin cambiar el codigo de la aplicacion.
- Polticas de acceso por identidad (managed identity o service principal).
- En Spring Boot se integra via `azure-key-vault-secrets-spring-boot-starter`.

## Azure Identity / Microsoft Entra ID

- Servicio de identidad en la nube de Microsoft (antes Azure AD).
- Provee autenticacion via OAuth 2.0, OpenID Connect, SAML 2.0.
- RBAC: asignar roles a identidades para controlar acceso a recursos.
- Managed Identity: la app obtiene credenciales automaticamente sin manejar secrets.
- En Spring Boot se integra via `spring-cloud-azure-starter-active-directory`.

## Azure Service Bus (seguridad)

- Autenticacion via Managed Identity o Shared Access Signatures (SAS).
- Cifrado en transito y en reposo.
- RBAC para controlar quien puede enviar/recibir mensajes.

## Azure App Configuration (seguridad)

- Las configuraciones pueden estar cifradas.
- Acceso controlado via Managed Identity.
- Replica la configuracion entre regiones para alta disponibilidad.
