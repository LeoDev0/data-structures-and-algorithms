def ordenacao_por_bolha(arr):
    ordenado = False
    while not ordenado:
        ordenado = True
        for i in range(len(arr) - 1):
            if arr[i] > arr[i + 1]:  # Se o item no array for maior que o seu sucessor, troca de posição
                arr[i], arr[i + 1] = arr[i + 1], arr[i]
                ordenado = False
    return arr

arr = [3, 7, 5, 0, 2, 1]

print(ordenacao_por_bolha(arr))
