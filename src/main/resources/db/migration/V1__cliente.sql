CREATE TABLE IF NOT EXISTS `tb_cliente` (
   `id` bigint(20) NOT NULL AUTO_INCREMENT,
   `nm_nome` varchar(150) NOT NULL,
   `ix_email` varchar(150) NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=1;
