# 🚀 DevOps Learning Journey – Phase Tracker

This README tracks each phase of your DevOps practice journey using Spring Boot, Docker, Jenkins, and Kubernetes. It includes configuration, CI/CD pipelines, and microservices evolution.

---

## ✅ DevOps Phase Plan

| Phase | Branch Name                        | Purpose                                                                 | Status        |
|-------|------------------------------------|-------------------------------------------------------------------------|---------------|
| 1     | `phase-1-initial-setup`            | Spring Boot app + Maven build only                                     | ✅ DONE        |
| 2     | `phase-2-dockerization`            | Add Dockerfile + run app in a container                                | ✅ DONE        |
| 3     | `phase-3-jenkins-pipeline`         | Jenkins setup + CI for Maven & Docker image                            | ✅ DONE        |
| 4     | `phase-4-k8s-basic-deployment`     | Kubernetes Deployment + Service YAML + Minikube deploy                 | ✅ DONE        |
| 5     | `phase-5-k8s-config-secrets-volumes` | Externalize config via ConfigMap + Secret + Volume mount               | ✅ DONE        |
| 6     | `phase-6-k8s-autoscaling`          | Add Horizontal Pod Autoscaler (HPA)                                    | ⏳ To Do       |
| 7     | `phase-7-helm-charts`              | Helm chart setup for reusable K8s deployments                          | ⏳ To Do       |
| 8     | `phase-8-jenkins-cicd-k8s`         | Jenkins CI/CD: Full pipeline from code → Docker → K8s                  | ⏳ To Do       |
| 9     | `phase-9-docker-jenkins-advanced`  | Multi-stage Docker + Jenkins shared libs & credentials                 | ⏳ To Do       |
| 10    | `phase-10-cloud-migration`         | Migrate setup to AWS EKS / Azure AKS + Ingress + GitOps                | ⏳ To Do       |

---

## 🧩 Microservices Phase Plan

| Phase     | Branch Name                         | Focus                                                                  | Status        |
|-----------|-------------------------------------|------------------------------------------------------------------------|---------------|
| Phase 6A  | `phase-6a-split-into-microservices` | Convert monolith into 2 Spring Boot services (e.g., Employee + Dept.)  | ⏳ To Do    |
| Phase 6B  | `phase-6b-dockerize-microservices`  | Dockerize both services, run with Docker Compose                       | ⏳ To Do     |
| Phase 7   | `phase-7-k8s-microservices`         | Deploy both services to Kubernetes with service discovery              | ⏳ To Do       |
| Phase 8   | `phase-8-api-gateway-and-ingress`   | Add API gateway (Spring Gateway or Ingress) for external routing      | ⏳ To Do       |

---

## 📘 Legend

- ✅ **DONE** – Fully completed and working
- 🔄 **In Progress** – Under development
- ⏳ **To Do** – Yet to be started

---

Keep pushing forward — one phase at a time!
