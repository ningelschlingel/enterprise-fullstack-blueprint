# Enterprise Fullstack Blueprint

This blueprint is the result of careful considerations I've made in a different project whose repository is not public.
It's intent is, to offer a quick entrypoint into a modern enterprise level fullstack application.
The focus is primarily:
- Quick start - no need to install 20 tools, 30 plugins and then somethings is still not working
- 

## Overview

Project to showcase a clean approach to a docker-first fullstack setup of an enterprise level application.

- Easy zero-touch deployment of the full application without any local requirements
- Deployment recovers after `docker-compose down -v` and reconnects databases as well as imports realm settings automatically

## Architecture

- Nginx Reverse Proxy as single entrypoint into all user-facing parts
- Fully dockerized
- Frontend is served by second nginx layer acting as a highly efficient webserver
- Both databases for the App and Keycloak are accessible via PgAdmin, also containerized
- Dozzle as a leightweight monitoring tool, also showing the health check status of all the services
- Mailpit as a simple dev-stage mailing utility
- Architectual decision records (ADRs) with template to persist important decisions in a structured format

## Backend

- Java/SpringBoot for community, support, platform-independency, ...
- Swagger API docs & OpenApi
- Simple, versioned API structure to manage access: `/api/v1/public/...` and `/api/v1/...`
- Lombok to reduce boilerplate code
- REST: Stateless -> Local development can run outside of docker for quick testing and will still work
- Clean Architecture
    - Group by feature rather than by type
    - No mandatory interfaces, reduce boilerplate by only using interfaces when there are multiple implementations

## Frontend

- Angular for simple SPA setup
- SCSS for better structured styling

## Keycloak

- Leave authentication and sensitive data to the professionals
- Custom Login-Page to make the user feel at home: Own corporate identity / corporate design