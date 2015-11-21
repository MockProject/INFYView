
$(function () {
	//var unformattedChartData = [{"name":"IE","y":45},{"name":"Firefox","y":26.8},{"name":"Chrome","y":12.8},{"name":"Safari","y":8.5},{"name":"Opera","y":6.9}];
	var unformattedChartData = document.getElementById('pieHiddenData').value;
	
	
	var chartData = $.map(unformattedChartData, function(obj, i) {
	    return [[obj.name, obj.y]];
	});
	
	//window.alert(JSON.stringify(chartData));
	
	$('#pie_container').highcharts({
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
	            pointFormat: '{series.name}: <b>{point.percentage:.2f}%</b>'
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
	            /*data: [
	                ['Firefox', 45.0],
	                ['IE', 26.8],
	                {
	                    name: 'Chrome',
	                    y: 12.8,
	                    sliced: true,
	                    selected: true
	                },
	                ['Chrome',12.8],
	                ['Safari', 8.5],
	                ['Opera', 6.2],
	                ['Others', 0.7]
	            ]*/
	            data: chartData
	        }]
	    });
	});