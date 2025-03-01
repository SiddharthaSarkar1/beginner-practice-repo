function Fibonacci(num) {
  let first = 0,
    second = 1,
    next;

  console.log("Fibonacci series is:");
  for (let i = 0; i < num; i++) {
    console.log(first);
    next = first + second;
    first = second;
    second = next;
  }
}

Fibonacci(7);
