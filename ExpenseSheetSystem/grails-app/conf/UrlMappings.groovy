class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }
        //Default page to load on website start
        "/"(controller: "Home")
        "500"(view:'/error')
	}
}
