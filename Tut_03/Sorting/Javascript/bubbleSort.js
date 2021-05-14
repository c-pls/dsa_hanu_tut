const bubbleSort = (a) => {
  let i = 0,
    j = 0,
    temp = 0;
  let len = arr.length;
  for (i = 0; i < len; i++) {
    let check = false;
    for (j = 0; j < len - 1 - i; j++) {
      if (a[j + 1] < a[j]) {
        temp = a[j];
        a[j] = a[j + 1];
        a[j + 1] = temp;
        check = true;
      }
    }
    if (!check) {
      break;
    }
  }
};

const arr = [4,2,41,5,14,1,1,12,5,12]
bubbleSort(arr)
console.log(arr)
