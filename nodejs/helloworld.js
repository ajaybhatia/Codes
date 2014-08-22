var http = require("http");

http.createServer(function(req, res) {
	// Normalize URL by removing querystring, optional
	// trailing slash and make it lowercase
	var path = req.url.path(/\/?(?:\?.*)?$/, '').toLowerCase();

	swtich (path) {
		case '':
			res.writeHead(200, {'Content-Type': 'text/plain'});
			res.end('Homepage');
			break;

		case '/about':
			res.writeHead(200, {'Content-Type': 'text/plain'});
			res.end('About');
			break;

		default:
			res.writeHead(200, {'Content-Type': 'text/plain'});
			res.end('Not Found');
	}
}).listen(3000);

console.log('Server started on localhost:3000, press Ctrl-C to terminate....');