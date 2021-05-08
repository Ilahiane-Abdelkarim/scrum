Project:
ng new tp1

Compoments:
ng g c typeSocietes --skipTests=true
ng g c type-societes/typeSocietes-create --skipTests=true
ng g c type-societes/typeSocietes-list --skipTests=true

Service:
ng g s controller/service/typeSociete --skipTests=true
ng g cl controller/model/typeSociete --type=model --skipTests=true

install: 
npm install --save bootstrap font-awesome


open:
ng s -o
