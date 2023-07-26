package cl.awakelabs.shoestap

class CalzadoList {
    companion object {
        fun getCalzado(): List<Calzado> {
            val listShoes = mutableListOf<Calzado>()

            listShoes.add(Calzado("Air Jordan 1","https://nikeclprod.vteximg.com.br/arquivos/ids/638426-1000-1000/DQ8426_060_A_PREM-hei-3144-wid-3144-fmt.jpg?v=638078771245430000",129990))
            listShoes.add(Calzado("Nike Wildhorse 8","https://nikeclprod.vteximg.com.br/arquivos/ids/723104-1000-1000/DR2689_301_A_PREM.jpg?v=638241045569400000",129990))
            listShoes.add(Calzado("Botin Cuero Mujer Recife Boot","https://hushpuppiescl.vtexassets.com/arquivos/ids/312248-1600-auto?v=638107100899630000&width=1600&height=auto&aspect=true",49990))
            listShoes.add(Calzado("Zapato Cuero Hombre Bremen","https://hushpuppiescl.vtexassets.com/arquivos/ids/311524-800-auto?v=638107092783330000&width=800&height=auto&aspect=true",39990))

            return listShoes
        }
    }
}


