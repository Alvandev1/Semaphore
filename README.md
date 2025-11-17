# 🅿️ Control Concurrente de un Aparcamiento con Semaphore

Este proyecto simula el acceso concurrente a un aparcamiento con plazas limitadas usando hilos en Java. La idea es reproducir una situación real donde varios coches intentan entrar al mismo tiempo, pero solo pueden aparcar tres a la vez. Para controlar esto se utiliza la clase `Semaphore`, que permite restringir el acceso simultáneo a un recurso compartido.

---

## 🚗 ¿En qué consiste el programa?

- Hay un aparcamiento con **3 plazas máximas**.
- Llegan **7 coches al mismo tiempo** (7 hilos).
- Cada coche intenta entrar, aparca durante un tiempo aleatorio y finalmente sale.
- Nunca puede haber más de **3 coches** dentro a la vez.

El programa está dividido en tres clases principales:
- **Aparcamiento** → Gestiona el semáforo y las plazas.
- **Coche** → Representa cada hilo (Runnable).
- **PrincipalParking** → Crea el parking, los coches y lanza los hilos.

---

---

## ⚙️ Requisitos

- Java JDK 8 o superior  
- IDE opcional (IntelliJ, Eclipse, NetBeans)  
- Consola para ejecutar el programa  

---

## ▶️ Cómo ejecutar el programa

1. Descargar o clonar el proyecto.
2. Abrirlo en tu IDE o compilarlo desde consola:
   ```bash
   javac parking/*.java

