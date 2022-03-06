void main(List<String> args) {
  List<int> lista = [92, 27, 12, 41, 31, 7, 33, 0, 3, 11, 14];
  lista.sort();

  int mediana = (lista.length - 0) ~/ 2;
  print(lista[mediana]);
}
