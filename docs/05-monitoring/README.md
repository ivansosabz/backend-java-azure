# 05 - Monitoring

## Observabilidad en Azure

La observabilidad tiene tres pilares: metricas, logs y trazas. Azure provee herramientas para cada uno.

## Azure Monitor

- Recopila metricas del sistema y de los recursos Azure.
- Alertas configurables (CPU alta, errores, latencia, etc.).
- Dashboard personalizado para ver el estado de los recursos.
- Integra diagnostic settings para enviar logs a distintos destinos (Log Analytics, Storage, Event Hub).

## Application Insights

- Parte de Azure Monitor, enfocado en aplicaciones.
- Seguimiento de solicitudes (request tracking) y dependencias.
- Deteccion automatica de errores y excepciones.
- Metricas de rendimiento: tiempo de respuesta, tasa de fallos, throughput.
- Trazabilidad distribuida: seguir una peticion a traves de multiples servicios.
- En Spring Boot se integra via `applicationinsights-spring-boot-starter`.
- No requiere cambios de codigo para telemetria basica.

## Flujo tipico

1. App envia telemetria a Application Insights.
2. Application Insights envia datos a Azure Monitor.
3. Azure Monitor genera alertas y dashboards.
4. Los logs se consultan via Log Analytics con KQL (Kusto Query Language).
