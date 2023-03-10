package com.ikeda.minhasfinancas.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import com.ikeda.minhasfinancas.model.entity.Lancamento;
import com.ikeda.minhasfinancas.model.enums.StatusLancamento;
import org.springframework.stereotype.Service;

@Service
public interface LancamentoService {

   /* @Autowired
    private LancamentoRepository lancamentoRepository;*/

    Lancamento salvar(Lancamento lancamento);

    Lancamento atualizar(Lancamento lancamento);

    void deletar(Lancamento lancamento);

    List<Lancamento> buscar( Lancamento lancamentoFiltro );

    void atualizarStatus(Lancamento lancamento, StatusLancamento status);

    void validar(Lancamento lancamento);

    Optional<Lancamento> obterPorId(Long id);

    BigDecimal obterSaldoPorUsuario(Long id);
}