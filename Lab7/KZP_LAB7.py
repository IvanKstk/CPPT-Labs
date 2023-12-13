def main():
    # Отримуємо значення розміру квадратної матриці
    n_rows = int(input("Enter the size of the square matrix: "))

    arr = []

    filler = input("Enter the filler symbol of the square matrix: ")
    
    if len(filler) == 1:
        # Створення зубчастого списку
        for i in range(n_rows):
            row = []
            for j in range(n_rows):
                if i + j >= n_rows - 1:
                    row.append(filler)
                else:
                    row.append(' ')
            arr.append(row)
        
        # Виведення матриці
        for row in arr:
            for symbol in row:
                print(symbol, end=" ")
            print()
    elif len(filler) == 0:
        print("No filler symbol entered")
    else:
        print("Too many filler symbols")

if __name__ == "__main__":
    main()