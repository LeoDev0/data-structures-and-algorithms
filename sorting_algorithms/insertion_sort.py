def ordenacao_por_insercao(arr):
    for i in range(1, len(arr)):
        j = i
        while j > 0 and arr[j] < arr[j - 1]:
            arr[j], arr[j - 1] = arr[j - 1], arr[j]
            j -= 1
    return arr

arr = [3, 7, 5, 0, 2, 1]

print(ordenacao_por_insercao(arr))
