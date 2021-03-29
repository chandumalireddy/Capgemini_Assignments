interface Printable {
  print: () => string;
}

let circle: Printable = {
  print: (): string => {
    return " Circle";
  },
};

let employee: Printable = {
  print: (): string => {
    return "hello emplyee";
  },
};

function printAll(obj: Printable, obj2: Printable) {
  console.log(obj.print());
  console.log(obj2.print());
}

printAll(circle, employee);