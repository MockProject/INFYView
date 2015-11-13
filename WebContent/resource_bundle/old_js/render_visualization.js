 
$(function () {

	var seriesData = [{
        code: 'IN',
        value: 115
    }, {
        code: 'US',
        value: 115
    }, {
        code: 'CN',
        value: 115
    }, {
        code: 'AU',
        value: 115
    }, {
        code: 'ZA',
        value: 115
    }, {
        code: 'DE',
        value: 115
    }];
	
    // Initiate the chart
    $('#geochart_container').highcharts('Map', {


        mapNavigation: {
            enabled: true,
            enableDoubleClickZoomTo: true
        },

        colorAxis: {
            min: 1,
            max: 1000,
            type: 'logarithmic'
        },

        series: [{
            data: seriesData,
            mapData: Highcharts.maps['custom/world'],
            joinBy: ['iso-a2', 'code'],
        }]
    });
    
    $('#chart').highcharts({
        chart: {
            type: 'pie',
            options3d: {
                enabled: true,
                alpha: 45,
                beta: 0
            }
        },
        title: {
            text: 'Browser market shares at a specific website, 2014'
        },
        tooltip: {
            pointFormat: '{series.name}: <b>{point.percentage:.1f}%</b>'
        },
        plotOptions: {
            pie: {
                allowPointSelect: true,
                cursor: 'pointer',
                depth: 35,
                dataLabels: {
                    enabled: true,
                    format: '{point.name}'
                }
            }
        },
        series: [{
            type: 'pie',
            name: 'Browser share',
            data: [
                ['ECS',   45.0],
                ['FSI',       26.8],
                /*{
                    name: 'Chrome',
                    y: 12.8,
                    sliced: true,
                    selected: true
                },*/
                ['CCD',    8.5],
                ['Maintanance',     6.2],
                ['Security',   0.7],
                ['RCL',   0.7]
            ]
        }]
    });
});

