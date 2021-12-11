javac -d out ./classes/*
jar -cmf manifest.mf Project.jar  -C out .