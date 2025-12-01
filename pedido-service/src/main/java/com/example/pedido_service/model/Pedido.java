package com.example.pedido_service.model;

import com.example.pedido_service.dto.ProductoDTO;

public record Pedido(String id, ProductoDTO producto, int cantidad) {}