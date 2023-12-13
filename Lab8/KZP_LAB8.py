import os
import struct
import math

# запис результату в .txt файл 
def write_res_txt(result, file_name):
    try:
        with open(file_name, "w") as f:
            f.write(str(result))
        print(f"File '{file_name}' has been successfully written.")
    except Exception as e:
        print(f"Error writing to file '{file_name}': {e}")

# читання результату з .txt файлу
def read_res_txt(file_name):
    result = 0.0
    try:
        if os.path.exists(file_name):
            with open(file_name, "r") as f:
                result = f.read()
        else:
            raise FileNotFoundError(f"File {file_name} not found.")
    except FileNotFoundError as e:
        print(e)
    return result

# запис результату в .bin файл
def write_res_bin(result, file_name):
    try:
        with open(file_name, "wb") as f:
            f.write(struct.pack("f", result))
        print(f"File '{file_name}' has been successfully written.")
    except Exception as e:
        print(f"Error writing to file '{file_name}': {e}")

# читання результату з .bin файлу
def read_res_bin(file_name):
    result = 0.0
    try:
        if os.path.exists(file_name):
            with open(file_name, "rb") as f:
                result = struct.unpack("f", f.read())[0]
        else:
            raise FileNotFoundError(f"File {file_name} not found.")
    except FileNotFoundError as e:
        print(e)
    return result

# обчислення виразу
def calculate(x):
    try:
        tan_temp = math.tan(math.radians(x))
        ctg_temp = 1 / tan_temp
        if (
            math.isnan(tan_temp)
            or math.isinf(tan_temp)
            or math.isnan(ctg_temp)
            or math.isinf(ctg_temp)
            or x == 0
            or x == 90
            or x == -90
            or x == 180
        ):
            print("Error: Result is undefined or infinite.")
            # Stop execution after error
            return None
        else:
            res = tan_temp / ctg_temp
    except ValueError as e:
        print(f"Error: {e}")
    except ZeroDivisionError as e:
        print(f"Error: {e}")
    except Exception as e:
        print(f"Unexpected error: {e}")
    return res


if __name__ == "__main__":
    x = float(input("Enter x: "))
    res = calculate(x)
    if res is None:
        # Print error message and stop execution
        print("Exit the program.")
    else:
        # Вивести результат і обробити файли
        write_res_txt(res, "Lab8_textRes.txt")
        write_res_bin(res, "Lab8_binRes.txt")
        print(f"Result is: {res}")
        print("Result from .txt file is:", read_res_txt("Lab8_textRes.txt"))
        print("Result from .bin file is:", read_res_bin("Lab8_binRes.txt"))