# Stage 1: Build the Angular app
FROM node:20-alpine AS build
WORKDIR /app
COPY package*.json ./
RUN npm install
COPY . .
RUN npm run build --configuration=production

# Stage 2: Serve the app with Nginx
FROM nginx:alpine
# Copy the build output to replace the default Nginx contents
# Note: Check your 'dist/' folder name, it usually matches your project name
COPY --from=build /app/dist/blueprint-ui /usr/share/nginx/html

# Copy a custom nginx.conf to handle Angular routing (see below)
COPY nginx.conf /etc/nginx/conf.d/default.conf

EXPOSE 80