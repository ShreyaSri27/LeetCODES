class Solution {
  
        public static int[] asteroidCollision(int arr[]) {

		Stack<Integer> stack = new Stack<Integer>();

		for (int i = arr.length - 1; i >= 0; --i) {

			int curr = arr[i];

			if (stack.isEmpty()) {
				stack.push(curr);
				continue;
			}

			if (stack.peek() < 0 && curr > 0) { // peek negative and current positive

				orderStack(stack, curr);
                        }

			else
				stack.push(curr);

		}

		int ans[] = new int[stack.size()];

		int counter = -1;
		while (!stack.isEmpty())
			ans[++counter] = stack.pop();

		return ans;

	}

	private static void orderStack(Stack<Integer> stack, int curr) {

		while (!stack.isEmpty()) {

			if (stack.peek() + curr == 0) {
				stack.pop();
				return;
			}

			if (stack.peek() * -1 < curr) // positive larger
			{
				stack.pop();

				if (stack.isEmpty() || stack.peek() > 0) {
					stack.push(curr);
					return;
				}
			} else
				return;
		}

	}
}
