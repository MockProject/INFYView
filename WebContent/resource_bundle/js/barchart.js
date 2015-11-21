$(function () {
    // Create the chart
    $('#barchart_container').highcharts({
        chart: {
            type: 'column'
        },
        title: {
            text: 'Infosys current allocation for bench'
        },
        subtitle: {
            text: 'Click the columns to view versions. Source: <a href="http://www.infosys.com/">visit Infy official website</a>.'
        },
        xAxis: {
            type: 'category'
        },
        yAxis: {
            title: {
                text: 'Percent Employee'
            }

        },
        legend: {
            enabled: false
        },
        plotOptions: {
            series: {
                borderWidth: 0,
                dataLabels: {
                    enabled: true,
                    format: '{point.y:.1f}%'
                }
            }
        },

        tooltip: {
            headerFormat: '<span style="font-size:11px">{series.name}</span><br>',
            pointFormat: '<span style="color:{point.color}">{point.name}</span>: <b>{point.y:.2f}%</b> of total<br/>'
        },

        series: [{
            name: 'Brands',
            colorByPoint: true,
            data: [{
                name: 'Chennai',
                y: 56.33,
                drilldown: 'Chennai'
            }, {
                name: 'Pune',
                y: 24.03,
                drilldown: 'Pune'
            }, {
                name: 'Beijing',
                y: 10.38,
                drilldown: 'Beijing'
            }, {
                name: 'Munich',
                y: 4.77,
                drilldown: 'Munich'
            }, {
                name: 'Bangalore',
                y: 0.91,
                drilldown: 'Bangalore'
            }, {
                name: 'Other DCs',
                y: 0.2,
                drilldown: null
            }]
        }],
        drilldown: {
            series: [{
                name: 'Chennai',
                id: 'Chennai',
                data: [
                    [
                        'Trainee',
                        24.13
                    ],
                    [
                        'SE',
                        17.2
                    ],
                    [
                        'SSE',
                        8.11
                    ],
                    [
                        'Lead',
                        5.33
                    ],
                    [
                        'TA',
                        1.06
                    ],
                    [
                        'Tech Arch',
                        0.5
                    ]
                ]
            }, {
                name: 'Pune',
                id: 'Pune',
                data: [
                    [
                        'Trainee',
                        5
                    ],
                    [
                        'SE',
                        4.32
                    ],
                    [
                        'SSE',
                        3.68
                    ],
                    [
                        'TA',
                        2.96
                    ],
                    [
                        'Lead',
                        2.53
                    ],
                    [
                        'PM',
                        1.45
                    ],
                    [
                        'SPM',
                        1.24
                    ],
                    [
                        'GPM',
                        0.85
                    ],
                    [
                        'DM',
                        0.6
                    ],
                    [
                        'CCD',
                        0.55
                    ],
                    [
                        'Tech Arch',
                        0.38
                    ],
                    [
                        'Facilities',
                        0.19
                    ],
                    [
                        'Security',
                        0.14
                    ],
                    [
                        'Vendors',
                        0.14
                    ]
                ]
            }, {
                name: 'Beijing',
                id: 'Beijing',
                data: [
                    [
                        'Trainee',
                        2.76
                    ],
                    [
                        'SE',
                        2.32
                    ],
                    [
                        'SSE',
                        2.31
                    ],
                    [
                        'TA',
                        1.27
                    ],
                    [
                        'Lead',
                        1.02
                    ],
                    [
                        'PM',
                        0.33
                    ],
                    [
                        'SPM',
                        0.22
                    ],
                    [
                        'Consultant',
                        0.15
                    ]
                ]
            }, {
                name: 'Munich',
                id: 'Munich',
                data: [
                    [
                        'Trainee',
                        2.56
                    ],
                    [
                        'SE',
                        0.77
                    ],
                    [
                        'SSE',
                        0.42
                    ],
                    [
                        'TA',
                        0.3
                    ],
                    [
                        'Lead',
                        0.29
                    ],
                    [
                        'Consultant',
                        0.26
                    ],
                    [
                        'Tech Arch',
                        0.17
                    ]
                ]
            }, {
                name: 'Bangalore',
                id: 'Bangalore',
                data: [
                    [
                        'Trainee',
                        0.34
                    ],
                    [
                        'SE',
                        0.24
                    ],
                    [
                        'SSE',
                        0.17
                    ],
                    [
                        'TA',
                        0.16
                    ]
                ]
            }]
        }
    });
});