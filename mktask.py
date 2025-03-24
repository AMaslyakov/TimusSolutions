import os

TMP_JAVACLASS = """public class Solution{}{{
    public static void main(String[] args){{

    }}
}}
"""

TMP_FAST = """import java.io.*;

public class Solution{0} {{

  public static void main(String[] args) throws IOException {{
    new Solution{0}().run();}}

  StreamTokenizer input;
  PrintWriter output;

  void run() throws IOException  {{
          input = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
          output = new PrintWriter(System.out);
          solve();
          output.flush();}}

  int nextInt() throws IOException
  {{ input.nextToken();
    return (int)input.nval;
  }}

  void solve() throws IOException {{

 }}
}}
"""

def add_class(file, task_number, tmp):
        file.write(tmp.format(task_number))


def create_solution_file():
    # Запрашиваем номер задачи у пользователя
    task_type = input("Как шаблон использовать:\n1 Scanner\n2 Tokenizer")

    match task_type:
        case "1":
            tmp = TMP_JAVACLASS
        case "2":
            tmp = TMP_FAST


    task_number = input("Введите номер задачи (от 1000 до 2200): ")

    # Проверяем, что номер задачи находится в допустимом диапазоне
    if not task_number.isdigit() or int(task_number) < 1000 or int(task_number) > 2200:
        print("Ошибка: номер задачи должен быть числом от 1000 до 9000.")
        return

    # Формируем имя файла
    file_name = f"Solution{task_number}.java"

    # Проверяем, существует ли файл с таким именем
    if os.path.exists(file_name):
        print(f"Файл {file_name} уже существует.")
        return

    # Создаем пустой файл
    with open(file_name, "w") as file:
        add_class(file, task_number, tmp) # Просто создаем пустой файл

    # Выводим сообщение об успешном создании файла
    print(f"Файл {file_name} успешно создан.")

if __name__ == "__main__":
    create_solution_file()
