class Stack {
  constructor() {
    this.items = [];
  }
  push(element) {
    this.items.push(element);
  }
  pop() {
    return this.items.pop();
  }
  peek() {
    return this.items[this.items.length - 1];
  }
  isEmpty() {
    return this.items.length == 0;
  }
  size() {
    return this.items.length;
  }
  clear() {
    this.items = [];
  }
}
console.log('running!');
const stack = new Stack();
console.log('stack.isEmpty(): ' + stack.isEmpty());
stack.push(13);
stack.push(23);
console.log('stack.size: ' + stack.size());
console.log(stack.peek());
stack.push(29);
console.log('stack.size: ' + stack.size());
console.log('stack.isEmpty(): ' + stack.isEmpty());
console.log(stack.pop());
console.log(stack.pop());
console.log('stack.size: ' + stack.size());
