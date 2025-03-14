# Определяем переменные
JAVAC = javac
JAVA = java
SRC_DIR = src/semestr2
OUT_DIR = out/semestr2
TMP_DIR = tmp

# Находим текущий файл SolutionXXXX.java
SOLUTION_FILE = $(wildcard Solution*.java)
SOLUTION_CLASS = $(basename $(SOLUTION_FILE))

# Правило для компиляции Java-файла
compile:
	$(JAVAC) -d $(OUT_DIR) $(SOLUTION_FILE)

# Правило для запуска скомпилированного класса
run: compile
	$(JAVA) -cp $(OUT_DIR) $(SOLUTION_CLASS)

# Правило для перемещения файла SolutionXXXX.java в пакет src/semestr2
move:
	mv $(SOLUTION_FILE) $(SRC_DIR)

# Правило для временного перемещения файла SolutionXXXX.java в tmp
move_to_tmp:
	mv $(SOLUTION_FILE) $(TMP_DIR)

# Правило для возвращения файла SolutionXXXX.java из tmp
move_from_tmp:
	mv $(TMP_DIR)/$(SOLUTION_FILE) .

# Очистка скомпилированных файлов
clean:
	rm -rf $(OUT_DIR)/*.class

# Основное правило
all: compile run move

new_task:
	python mktask.py

.PHONY: all compile run move move_to_tmp move_from_tmp clean new_task
