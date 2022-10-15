CREATE TABLE `restaurante_a3`.`tb_cardapio` (
  `cardapio_id` INT NOT NULL AUTO_INCREMENT,
  `prato` VARCHAR(300) NOT NULL,
  `imagem` BLOB NULL,
  `desc_ingredientes` VARCHAR(500) NOT NULL,
  PRIMARY KEY (`cardapio_id`));
