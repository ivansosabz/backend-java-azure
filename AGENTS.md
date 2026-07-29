# AGENTS.md

## Stack

- Java 21+ (LTS), Spring Boot, Maven, Azure
- IDE: IntelliJ IDEA (not tracked - `.idea/` is gitignored)
- Docker for local services (databases, etc.)

## Project structure

- `docs/` - Course notes organized by topic. Update the relevant README as new concepts are covered. Structure:
  - `00-setup/` - Tools and environment
  - `01-spring-boot/` - Spring Boot fundamentals
  - `02-azure-services/` - Azure compute, integration, config services
  - `03-database/` - Cloud database connections
  - `04-security/` - Auth, Key Vault, Entra ID
  - `05-monitoring/` - Azure Monitor, Application Insights
  - `06-best-practices/` - Enterprise practices

## Conventions

- Local config files (`application-local.yml`, `application-local.properties`, `.env`) are gitignored. Never commit secrets.
- Maven wrapper (`./mvnw`) preferred over global Maven once the project has a `pom.xml`.

## Build / Test / Lint

No commands yet - project has no source code. Update this section when `pom.xml` and tests exist.

## Azure

- Account required for deployment and cloud services.
- Key Vault for secrets, never hardcode.
- Managed Identity preferred over service principals where possible.
