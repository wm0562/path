let draw = false;

var dataset = [
  ["DR Congo", "84,004,989", "37"],
  ["Germany", "82,293,457", "236"],
  ["Iran", "82,011,735", "50"],
  ["Turkey", "81,916,871", "106"],
  ["Thailand", "69,183,173", "135"],
  ["U.K.", "66,573,504", "275"],
  ["France", "65,233,271", "119"],
  ["Italy", "59,290,969", "202"],
  ["Tanzania", "59,091,392", "67"],
  ["South Africa", "57,398,421", "47"],
  ["Myanmar", "53,855,735", "82"],
  ["South Korea", "51,164,435	", "526"],
  ["Kenya", "50,950,879", "90"],
  ["Colombia", "49,464,683	", "45"],
  ["Spain", "46,397,452", "93"],
  ["Argentina", "44,688,864", "16"],
  ["Uganda", "44,270,563", "222"],
  ["Ukraine", "44,009,214", "76"],
  ["Algeria", "42,008,054", "18"],
  ["Sudan", "41,511,526", "24"]
];

var i = 0;

init();

function init() {
  const table = $("#dt-table").DataTable({
    "paging": false,
    "searching": false,
    "ordering": false,
    "info": false
  });
  
  $('#dt-table tbody').on( 'click', 'tr', function () {
        if ( $(this).hasClass('selected') ) {
            $(this).removeClass('selected');
        }
        else {
            table.$('tr.selected').removeClass('selected');
            $(this).addClass('selected');
        }
    } );
 
    $('#rm-btn').click( function () {
        table.row('.selected').remove().draw(false);
    } );
  
  
  $("#add-btn").on("click", function() {
  table.row.add([
    dataset[i][0],
    dataset[i][1],
    dataset[i][2]
    ]).draw(false);
  i++;
});

  const tableData = getTableData(table);
  createHighcharts(tableData);
  setTableEvents(table);
  

}



function getTableData(table) {
  const dataArray = [],
    countryArray = [],
    populationArray = [],
    densityArray = [];
 
  
  table.rows().every(function() {
    const data = this.data();
    countryArray.push(data[0]);
    populationArray.push(parseInt(data[1].replace(/\,/g, "")));
    densityArray.push(parseInt(data[2].replace(/\,/g, "")));
  });
 

  dataArray.push(countryArray, populationArray, densityArray);
 
  return dataArray;
}


function createHighcharts(data) {
  Highcharts.setOptions({
    lang: {
      thousandsSep: ","
    }
  });

  Highcharts.chart("chart", {
    title: {
      text: "统计图表"
    },
/*    subtitle: {
      text: "Finstop Audition"
    },*/
    xAxis: [
      {
        categories: data[0],
        labels: {
          rotation: -45
        }
      }
    ],
    yAxis: [
      {
  
        title: {
          text: "数量"
        }
      },
      {
 
        title: {
          text: "占比（%）"
        },
        min: 0,
        opposite: true
      }
    ],
    series: [
      {
        name: "数量",
        color: "#0071A7",
        type: "column",
        data: data[1],
        tooltip: {
          valueSuffix: " M"
        }
      },
      {
        name: "占比（%）",
        color: "#FF404E",
        type: "spline",
        data: data[2],
        yAxis: 1
      }
    ],
    tooltip: {
      shared: true
    },
    legend: {
      backgroundColor: "#ececec",
      shadow: true
    },
    credits: {
      enabled: false
    },
    noData: {
      style: {
        fontSize: "16px"
      }
    }
  });
}

function setTableEvents(table) {
  table.on("page", () => {
    draw = true;
  });

  table.on("draw", () => {
    if (draw) {
      draw = false;
    } else {
      const tableData = getTableData(table);
      createHighcharts(tableData);
    }
  });
}