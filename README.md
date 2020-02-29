# What-is-Maven-for
Trying to learn what is Maven and Spring for

[![Actions Status](https://github.com/1c-syntax/bsl-language-server/workflows/Java%20CI/badge.svg)](https://github.com/1c-syntax/bsl-language-server/actions)

1. В попытках разобраться в отличиях между наследованим и агреацией в Maven проектах, столкнулся с проблемой: если в pom.xml не указать явно версию для maven-compiler-plugin, а также не прописать в <source> и <target> версию java - скомпилировать проект не удастся, т.к. по умолчанию будет применяться устаревшая версия плагина 1.5. Причем настройки в Идее не помогают устранить эту ошибку. Что бы я ни указывал в Идее - Мавен все равно использует свои настройки по умолчанию.

2. Подключил к проекту Spring-context и на примерах разобрался с тем, как создавать бины c помощью стандартных настроек Spring и с помощью java-configuration.
