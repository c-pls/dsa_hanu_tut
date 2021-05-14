function s_sort(arr) {
  for (let i = 0; i < arr.length - 1; i++) {
    let minIndex = i;
    for (let j = i + 1; j < arr.length; j++) {
      if (arr[j] < arr[minIndex]) {
        minIndex = j;
      }
    }
    let temp = arr[min];
  }

  return arr;
}

let arr = [4, 3, 4, 2, 2, 6, 6, 2, 4, 1, 2, 5, 8, 6, 12];
console.log(s_sort(arr));
