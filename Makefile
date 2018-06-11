all:
	javac -d ./ ./src/legentrolls/*.java
	cp -r nomes build/
run:
	java lengentrolls.LegenTrolls
clean:
	rm -rf legentrolls
