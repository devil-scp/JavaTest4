docker stop $(docker ps -a -q)
docker-compose build
docker-compose up &
bash ./stop.sh
