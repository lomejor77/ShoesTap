package cl.awakelabs.shoestap

class CalzadoList {
    companion object {
        fun getCalzado(): List<Calzado> {
            val listShoes = mutableListOf<Calzado>()
            listShoes.add(Calzado("Air Jordan 1","https://nikeclprod.vteximg.com.br/arquivos/ids/638426-1000-1000/DQ8426_060_A_PREM-hei-3144-wid-3144-fmt.jpg?v=638078771245430000",129990))
            listShoes.add(Calzado("Nike Wildhorse 8","https://nikeclprod.vteximg.com.br/arquivos/ids/723104-1000-1000/DR2689_301_A_PREM.jpg?v=638241045569400000",129990))

            return listShoes
        }
    }
}


