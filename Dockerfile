FROM nginx:alpine

# Copy static HTML to nginx default directory
COPY index.html /usr/share/nginx/html/

# Expose port
EXPOSE 80

# Run nginx
CMD ["nginx", "-g", "daemon off;"]
