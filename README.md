# pdf-r2l

PDFの綴じ方向をR2L(Right-to-Left)に変えるためのツールです．

## 使い方（Dockerを使う場合）

```
$ docker run --rm -v "$PWD":/work ottijp/pdf-r2l pdf-r2l R2L book.pdf book-r2l.pdf
```

`R2L`の部分を`L2R`にすると，Left-to-Rightに変更もできます．

## 使い方（Homebrewを使う場合）

```
$ brew install ottijp/tap/pdf-r2l
$ pdf-r2l R2L book.pdf book-r2l.pdf
```

`R2L`の部分を`L2R`にすると，Left-to-Rightに変更もできます．

## 開発

### ビルド

```
$ make build
```

### ローカルでの実行

```
$ make run ARGS="R2L book.pdf book-r2l.pdf"
```

### Dockerイメージのビルド

```
$ make docker-build
```

## ライブラリ

このツールは[iText 7 Community](https://itextpdf.com/ja/products/itext-7/itext-7-community)を使っています．

## LICENSE

AGPL v3
