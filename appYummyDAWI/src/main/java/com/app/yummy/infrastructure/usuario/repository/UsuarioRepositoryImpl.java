package com.app.yummy.infrastructure.usuario.repository;

import com.app.yummy.domain.usuario.model.UsuarioModel;
import com.app.yummy.domain.usuario.repository.UsuarioRepository;
import com.app.yummy.infrastructure.usuario.entity.UsuarioEntity;
import com.app.yummy.infrastructure.usuario.entity.UsuarioEntity;
import com.app.yummy.infrastructure.usuario.jpa.UsuarioRepositoryJpa;
import com.app.yummy.infrastructure.usuario.mapper.UsuarioMapper;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Repository
public class UsuarioRepositoryImpl implements UsuarioRepository {

    private final UsuarioRepositoryJpa usuarioRepositoryJpa;
    private final UsuarioMapper usuarioMapper;

    public UsuarioRepositoryImpl(UsuarioRepositoryJpa usuarioRepositoryJpa, UsuarioMapper usuarioMapper) {
        this.usuarioRepositoryJpa = usuarioRepositoryJpa;
        this.usuarioMapper = usuarioMapper;
    }

    @Override
    public Optional<UsuarioModel> buscaPorId(Long usuarioId) {

        return usuarioRepositoryJpa.findById(usuarioId)
                .stream()
                .map(usuarioMapper::usuarioMap)
                .findFirst();
    }

    @Override
    public List<UsuarioModel> todosLosUsuarios(String nombre) {
        return List.of();
    }

    @Override
    public UsuarioModel guardar(UsuarioModel model) {

        UsuarioEntity usuarioEntity=new UsuarioEntity();

        usuarioEntity.setIdUsuario(model.getIdUsuario());

        usuarioEntity.setNombre(model.getNombre());
        UsuarioEntity usuario = usuarioRepositoryJpa.save(usuarioEntity);
        UsuarioModel usuarioModel = new UsuarioModel();
        usuarioModel.setIdUsuario(usuario.getIdUsuario());
        usuarioModel.setNombre(usuarioEntity.getNombre());

        return usuarioModel;
    }

    @Override
    public Optional<UsuarioModel> buscaPorCorreo(String correo) {
        return usuarioRepositoryJpa.findByCorreo(correo)
                .map(usuarioMapper::usuarioMap);

    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends UsuarioModel> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends UsuarioModel> List<S> saveAllAndFlush(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public void deleteAllInBatch(Iterable<UsuarioModel> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public UsuarioModel getOne(Long aLong) {
        return null;
    }

    @Override
    public UsuarioModel getById(Long aLong) {
        return null;
    }

    @Override
    public UsuarioModel getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends UsuarioModel> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends UsuarioModel> List<S> findAll(Example<S> example) {
        return List.of();
    }

    @Override
    public <S extends UsuarioModel> List<S> findAll(Example<S> example, Sort sort) {
        return List.of();
    }

    @Override
    public <S extends UsuarioModel> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends UsuarioModel> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends UsuarioModel> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends UsuarioModel, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends UsuarioModel> S save(S entity) {
        return null;
    }

    @Override
    public <S extends UsuarioModel> List<S> saveAll(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public Optional<UsuarioModel> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<UsuarioModel> findAll() {
        return List.of();
    }

    @Override
    public List<UsuarioModel> findAllById(Iterable<Long> longs) {
        return List.of();
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(UsuarioModel entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends UsuarioModel> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<UsuarioModel> findAll(Sort sort) {
        return List.of();
    }

    @Override
    public Page<UsuarioModel> findAll(Pageable pageable) {
        return null;
    }
}