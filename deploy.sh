#!/usr/bin/env bash

set -ex

git checkout gh-pages

# Build Clojurescript
lein clean
lein package

# Copy built files into root
cp public/index.html .
mkdir -p js
cp public/js/app.js js
cp -R public/css .

git add index.html js css
git commit -m "Deploy"
git push
git checkout master
