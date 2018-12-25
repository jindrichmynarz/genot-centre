# Live coding CSS with Genot Centre

A demo of live coding CSS with [Genot Centre](http://genot.cz) (check out the [music](https://genot.bandcamp.com) they put out). The demo is available at <http://mynarz.net/genot-centre>. A video of the live coding is [here](https://youtu.be/IIJjkrmey5M).

If you want to play along, clone this repository, start Figwheel by running `lein figwheel`, and live edit CSS file in `public/css/site.css`.

### Development mode

To start the Figwheel compiler, navigate to the project folder and run the following command in the terminal:

```
lein figwheel
```

Figwheel will automatically push cljs changes to the browser.
Once Figwheel starts up, you should be able to open the `public/index.html` page in the browser.

### REPL

The project is setup to start nREPL on port `7002` once Figwheel starts.
Once you connect to the nREPL, run `(cljs)` to switch to the ClojureScript REPL.

### Building for production

```
lein clean
lein package
```
