const insertionSort = (a) => {
  let len = a.length;
  let j = 0,
    i = 0;
  let key = 0;
  for (i = 0; i < len; i++) {
    j = i - 1;
    key = a[i];
    while (j >= 0 && a[j] > key) {
      a[j + 1] = a[j];
      j -= 1;
    }
    a[j + 1] = key;
  }
};


const arr = [4,2,25,1,45,21,3,4,132]
insertionSort(arr)
console.log(arr)
