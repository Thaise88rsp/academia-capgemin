void main(List<String> args) {
   String frase = ('tenha um bom dia');

  frase = frase.replaceAll(' ', '');

  print(frase[2][0]);

  var contando = frase.length;
  //print(contando);
  var raiz = (sqrt(contando) ~/ 1);
  // List<String> senha = [''];
  //var senha = [''];

  int row = raiz + 1;
  int col = raiz + 1;

  List<List<dynamic>> matriz = [
    [row],
    [col]
  ];
  int index = 0;

  for (int r = 0; r < row; r++) {
    for (int c = 0; c < col; c++) {
      if (index < contando) {
        matriz[r][c] = frase[index];
      }
      index++;
    }
  }

  String resultado = "";

  for (int r = 0; r < row; r++) {
    for (int c = 0; c < col; c++) {
      resultado = resultado + matriz[r][c];
    }
    print(resultado);
    resultado = "";
  }
}

