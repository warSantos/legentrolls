all:
	javac -d ./ ./src/*/*.java
	cp -r nomes build/
run:
	java lengentrolls.LegenTrolls
clean:
	rm -rf legentrolls
