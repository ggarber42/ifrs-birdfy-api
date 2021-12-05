# Rodando Localmente

```bash
systemctl stop postgresql
mvn clean install -DskipTests=true
docker-compose up --build
```

# Deploy no Heroku

Ver [este tutorial](https://devcenter.heroku.com/articles/deploying-spring-boot-apps-to-heroku)
caso nunca tenha deployado antes

```bash
heroku login
git push heroku master
```