package com.br.dio.santanderdevweek.data.local

import com.br.dio.santanderdevweek.data.Cartao
import com.br.dio.santanderdevweek.data.Cliente
import com.br.dio.santanderdevweek.data.Conta

class FakeData {
    fun getLocalData(): Conta {
        val cliente = Cliente("Reuber")
        val cartao = Cartao("1722652156")
        return Conta(
            "012256-4",
            "1450-4",
            "R$ 2.478,80",
            "R$ 8.478,80",
            cliente,
            cartao
        );
    }
}