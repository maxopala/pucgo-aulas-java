public class Data {
    private String data;

    public Data(int dia, int mes, int ano) {
        if (ano >= 1000 && ano <= 9999) {
            if (mes >= 1 && mes <= 12) {
                int maximo;
                switch(mes) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        maximo = 31;
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        maximo = 30;
                        break;
                    default:
                        if (ano % 4 == 0) {
                            maximo = 29;
                        } else {
                            maximo = 28;
                        }
                }
                if (dia >= 1 && dia <= maximo) {
                    this.data = "" + ano;
                    if (mes <= 9) {
                        this.data += "0";
                    }
                    this.data += mes;
                    if (dia <= 9) {
                        this.data += "0";
                    }
                    this.data += dia;
                }
            } else {
            }
        } else {
        }
    }

    public int getDia() {
        if (data == null) {
            return 0;
        }
        String d = data.substring(6, 8);
        return Integer.parseInt(d);
    }

    public int getMes() {
        if (data == null) {
            return 0;
        }
        String d = data.substring(4, 6);
        return Integer.parseInt(d);
    }

    public int getAno() {
        if (data == null) {
            return 0;
        }
        String d = data.substring(0, 4);
        return Integer.parseInt(d);
    }

    public String getDataFormatada() {
        if (data == null) {
            return "Data inválida";
        }

        int dia = getDia();
        int mes = getMes();
        int ano = getAno();

        if (dia == 0) {
            return "Data inválida";
        } else {
            String dt = "";

            if (dia <= 9) {
                dt = dt + "0";
            }
            dt = dt + dia + "/";
            if (mes <= 9) {
                dt = dt + "0";
            }
            dt = dt + mes + "/" + ano;

            return dt;
        }
    }
}
