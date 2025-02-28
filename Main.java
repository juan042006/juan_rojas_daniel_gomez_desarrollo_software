//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

git flow init

git checkout develop
git pull origin develop
git flow feature start metodoA
git add .
git commit -m "Implementado método A"
git push origin feature/metodoA

git checkout develop
git pull origin develop
git flow feature start metodoB
git add .
git commit -m "Implementado método B"
git push origin feature/metodoB

git checkout develop
git pull origin develop
git flow feature start metodoC
git add .
git commit -m "Implementado método C"
git push origin feature/metodoC

git checkout develop
git pull origin develop
git flow feature start metodoD
git add .
git commit -m "Implementado método D"
git push origin feature/metodoD

git checkout develop
git pull origin develop
git flow feature finish metodoA
git flow feature finish metodoB
git flow feature finish metodoC
git flow feature finish metodoD
git push origin develop

        }
    }
