FROM node:20 AS builder
WORKDIR /app
COPY spring-angular-template/frontend/ ./
RUN npm install && npm run build

FROM nginx:alpine
COPY --from=builder app/dist/angular-template/browser /usr/share/nginx/html/
EXPOSE 80