const mergeSort = (arr) => {
  if (arr.length > 1) {
    mid = Math.floor((1 + arr.length) / 2);
    let leftArr = arr.slice(1, mid);
    let rightArr = arr.slice(mid, arr.length);

    mergeSort(leftArr);
    mergeSort(rightArr);

    let l = 0;
    let r = 0;
    let i = 0;

    while (l < leftArr.length && r < rightArr.length) {
      if (leftArr[l] < rightArr[r]) {
        arr[i] = leftArr[l];
        l += 1;
      } else {
        arr[i] = rightArr[r];
        r += 1;
      }
      i += 1;
    }
    while (l < leftArr.length) {
      arr[i] = leftArr[l];
      i += 1;
      l += 1;
    }
    while (r < rightArr.length) {
      arr[i] = rightArr[r];
      i += 1;
      r += 1;
    }
  }
  return arr;
};

arr = [1, 2, 3, 4, 5, 6, 7];
consol.log(Math.floor((1 + arr.length) / 2));
console.log(mergeSort(arr));
