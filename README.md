# task26-2


GET http://localhost:8181/cientificos/findAll

GET http://localhost:8181/proyectos/findAll

GET http://localhost:8181/asignados/findAll

PUT http://localhost:8181/cientificos/delete{id}

PUT http://localhost:8181/asignados/delete{id}

PUT http://localhost:8181/proyectos/delete{id}

PUT http://localhost:8181/cientificos/create {"dni":"43597789","nomApel":"Alvaro Bernabey"}

PUT http://localhost:8181/proyectos/create {"id":"001A","nombre":"Reaccion de Caustificacion","horas":100),

PUT http://localhost:8181/asginado/create {"cientifico":"12345678","proyecto":"001A"}

PUT http://localhost:8181/cientifico/update {"dni":"43597789","nomApel":"Alvaro Bernabey"}

PUT http://localhost:8181/proyectos/update {"id":"001A","nombre":"Reaccion de Caustificacion","horas":100),

PUT http://localhost:8181/asignados/update {"cientifico":"12345678","proyecto":"001A"}
