
const sleepSort = (arr) => {
  arr.forEach(element => {
    setTimeout( () =>{
      console.log(element)
    }
      , element * 100
    )
  })
}

const arr = [1,3,2,2,1,4,6,1,6,2,8,10]
sleepSort(arr)
