const isPrime = (num) => {
  for (let i = 2; i < num / 2; i++) {
    if (num % i === 0) {
      return false;
    }
  }
  return true;
};

function PrimeNumber(num) {
  isPrime(num)
    ? console.log(`${num} is a prime number.`)
    : console.log(`${num} is not a prime number.`);
}

PrimeNumber(17);
PrimeNumber(12);
PrimeNumber(13);
PrimeNumber(30);
