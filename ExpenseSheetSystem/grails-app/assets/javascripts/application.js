if (typeof jQuery !== 'undefined') {
	(function($) {
		$('#spinner').ajaxStart(function() {
			$(this).fadeIn();
		}).ajaxStop(function() {
			$(this).fadeOut();
		});
	})(jQuery);
}

function setActiveTab(evt)
{
    var i, tablinks;
    
    tablinks = document.getElementsByClassName("tablinks");
    for(i = 0; i < tablinks.length; i++)
    {
        tablinks[i].className = tablinks[i].className.replace(" active", "");
    }
    
    evt.currentTarget.className += " active";
}

function changeContent(name)
{
    if(name === "register")
    {
        var removeContent = document.getElementById('login');
        removeContent.style.display = 'none';
        
        var addContent = document.getElementById(name);
        addContent.style.display = 'flex';
    }
    else if(name === "login")
    {
        var removeContent = document.getElementById('register');
        removeContent.style.display = 'none';
        
        var addContent = document.getElementById(name);
        addContent.style.display = 'flex';
    }
}