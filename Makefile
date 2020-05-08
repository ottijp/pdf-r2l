.PHONY: run
run:
	docker run --rm -u gradle -v "$(CURDIR)":/home/gradle/pdf-r2l -w /home/gradle/pdf-r2l gradle:6.4-jdk11 gradle -q run --args="${ARGS}"

.PHONY: build
build:
	docker run --rm -u gradle -v "$(CURDIR)":/home/gradle/pdf-r2l -w /home/gradle/pdf-r2l gradle:6.4-jdk11 gradle -q installDist

.PHONY: docker-build
docker-build: build
	docker build -t ottijp/pdf-r2l .

.PHONY: clean
clean:
	docker run --rm -u gradle -v "$(CURDIR)":/home/gradle/pdf-r2l -w /home/gradle/pdf-r2l gradle:6.4-jdk11 gradle -q clean
