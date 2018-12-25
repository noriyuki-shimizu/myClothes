/**
 * 
 */

var _Cookie = {
	create: function() {
		var _cookie = Object.create(_Cookie.prototype);
		
		_cookie.o = Object.freeze({type: 'CommonFunc'});
		
		return _cookie;
	},

	prototype: {
		isType: function(mcp_o) {
			if(typeof mcp_o !== 'object' && typeof mcp_o.o !== 'object') {
				throw new TypeError('Argument type is wrong.');
			}
			return mcp_o.o.type = this.o.type;
		},
		getCookieValue: async function(key) {
			var r = document.cookie.split(';');

		    var result;
		    
			await r.pForEach(v => {
			    //cookie名と値に分ける
			    var content = v.split('=');
			    
			    if(key === content[0]) {
			    	result = decodeURIComponent(content[1]);
			    }
			});
			
			return result;
		}
	}
}
