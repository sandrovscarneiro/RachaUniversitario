package br.upe.rachauniversitario.services.implementations;

import br.upe.rachauniversitario.entities.TimeFantasy;
import br.upe.rachauniversitario.repositories.TimeFantasyRepository;
import br.upe.rachauniversitario.repositories.UsuarioRepository;
import br.upe.rachauniversitario.services.TimeFantasyService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TimeFantasyServiceImpl implements TimeFantasyService {
    private final TimeFantasyRepository timeFantasyRepository;
    private final UsuarioRepository usuarioRepository;
    @Override
    @Transactional
    public TimeFantasy criarTime(String nome, Integer idUsuario){
        TimeFantasy time = new TimeFantasy();
        time.setNome(nome);
        time.setOrcamento(BigDecimal.valueOf(75));
        time.setPontuacaoTotal((float) 0);
        time.setUsuario(usuarioRepository.findById(idUsuario).orElseThrow());
        return timeFantasyRepository.save(time);
    }
    @Override
    public TimeFantasy buscarTime(Integer idTime){
        return timeFantasyRepository.findById(idTime).orElse(null);
    }
    @Override
    public List<TimeFantasy> buscarTimes(){
        return timeFantasyRepository.findAll();
    }
    @Override
    public void deletarTime(Integer idTime){
        timeFantasyRepository.deleteById(idTime);
    }
}
