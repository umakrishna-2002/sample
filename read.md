If you want to host the same application on multiple host instance which are private:


- Install the nginx on public instance which we are using to SSH into that particular private instances:
- Then add the private ip's in the 

`sudo nano /etc/nginx/sites-available/default`

server {
        listen 80 default_server;
        listen [::]:80 default_server;

        root /var/www/html;
        index index.html index.htm index.nginx-debian.html;

        server_name _;

        location / {
                proxy_pass http://;   # private IP
                proxy_set_header Host $host;
                proxy_set_header X-Real-IP $remote_addr;
                proxy_set_header X-Forwarded-For $proxy_add_x_forwarded_for;
        }
}
