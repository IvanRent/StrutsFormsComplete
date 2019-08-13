
  CREATE TABLE "SYSTEM"."REGISTER" 
   (	"ID" NUMBER(10,0) NOT NULL ENABLE, 
	"NOMBRE" VARCHAR2(35 BYTE) NOT NULL ENABLE, 
	"GENERO" VARCHAR2(35 BYTE) NOT NULL ENABLE, 
	"CIUDAD" VARCHAR2(35 BYTE) NOT NULL ENABLE, 
	"DESCRIPCION" VARCHAR2(35 BYTE) NOT NULL ENABLE, 
	"DESARROLLADOR" VARCHAR2(35 BYTE) NOT NULL ENABLE, 
	 CONSTRAINT "REGISTER_PK" PRIMARY KEY ("ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
 