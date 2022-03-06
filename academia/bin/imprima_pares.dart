void main(List<String> args) {
  List<int> n = [1, 5, 3, 4, 2];

  int x = 2;

  int diferenca = n.length ~/ x;
  int contador = 0;
  for (var element in n) {
    final contain = n.contains(element - diferenca);
    if (contain == true) {
      contador++;
    }
  }
  print(contador);
}
