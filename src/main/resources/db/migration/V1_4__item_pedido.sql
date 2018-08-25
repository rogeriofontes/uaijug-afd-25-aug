CREATE TABLE IF NOT EXISTS `item_pedido` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `id_produto` bigint(20) NOT NULL,
  `id_pedido` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=1;