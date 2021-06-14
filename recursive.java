class Indirect {
 static void funB(int n) {
 }

 static void funA(int n) {
  if (n > 0) {
   System.out.print(n + " ");

   funB(n - 1);

  }
 }

 static void funB(int n) {
  if (n > 1) {
   System.out.print(n + " ");
  }
 }

 public static void main(String[] args) {
  int x = 20;
  funA(x);
 }
}
