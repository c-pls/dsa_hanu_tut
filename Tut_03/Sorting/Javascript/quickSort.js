const partition = (a, left, right) => {
  // take the pivot as a last position
  let pivot = arr[right];

  let i, j, temp;
  i = left;
  j = i - 1;
  for (i = left; i < right; i++) {
    if (a[i] < pivot) {
      j += 1;
      // make the swap here a[i], a[j]
      temp = a[i];
      a[i] = a[j];
      a[j] = temp;
    }
    // Swap the pivot with the current at j + 1 index
  }
  temp = a[j + 1];
  a[j + 1] = a[right];
  a[right] = temp;
  return j + 1;
};

const quickSort = (a, left, right) => {
  if (left < right){
  let pivot;
  pivot = partition(a, left, right);

  // recursive
  quickSort(a, left, pivot - 1);
  quickSort(a, pivot + 1, right);
    
}
};

let arr = [1, 6, 4, 8, 7, 10, 5];
console.log(partition(arr, 0, arr.length - 1));
quickSort(arr, 0, arr.length - 1);
console.log(arr);
