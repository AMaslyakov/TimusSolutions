import os

TMP_JAVACLASS = """public class Solution{}{{
    public static void main(String[] args){{

    }}
}}
"""


def add_class(file, task_number):
        file.write(TMP_JAVACLASS.format(task_number))


def create_solution_file():
    # Запрашиваем номер задачи у пользователя
    task_number = input("Введите номер задачи (от 1000 до 9000): ")

    # Проверяем, что номер задачи находится в допустимом диапазоне
    if not task_number.isdigit() or int(task_number) < 1000 or int(task_number) > 9000:
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
        add_class(file, task_number) # Просто создаем пустой файл

    # Выводим сообщение об успешном создании файла
    print(f"Файл {file_name} успешно создан.")

if __name__ == "__main__":
    create_solution_file()
