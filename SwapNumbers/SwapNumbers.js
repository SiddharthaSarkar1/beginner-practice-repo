function SwapNumbers(a, b){
    console.log(`Before swapping a = ${a}, b = ${b}.`);
    a = a + b;
    b = a - b;
    a = a - b;
    console.log(`After swapping a = ${a}, b = ${b}.`);
}

SwapNumbers(2, 6);
SwapNumbers(10, 5);