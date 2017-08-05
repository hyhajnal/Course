$("#grid-data").bootgrid({
    ajax: true,
    post: function ()
    {
        /* To accumulate custom parameter with the request object */
        return {
            id: "b0df282a-0d67-40e5-8558-c9e93b7befed"
        };
    },
    url: "json/tab.json",
    formatters: {
        "link": function(column, row)
        {
            return "<a href=\"#\">" + column.id + ": " + row.id + "</a>";
        }
    }
});