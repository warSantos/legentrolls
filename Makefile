all:
	mkdir -p build
	javac -d ./build ./src/*/*.java
	cp -r nomes build/
	gcc src/run.c -o build/run
clean:
	rm -rf build
