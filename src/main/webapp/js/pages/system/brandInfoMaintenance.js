/**
 * ブランド情報メンテナンスに関するjsファイル.
 */

$(function() {
	
	getBrandInfo().then(BrandInfoList => {
		setBrandInfoListGrid(BrandInfoList);
	});
	
});

async function getBrandInfo() {
	var contextPath = $("#contextPath").text();
	
	var ajaxObj = new ajax();
	ajaxObj.setOption({
		type: "GET",
		url: contextPath + "/BrandInfoMaintenance/getDataList",
		data: {},
		dataType: "json" 
	});
	// 結果の取得
	return await ajaxObj.execute();
}

function setBrandInfoListGrid(BrandInfoList) {
	console.log(BrandInfoList);
	var jqGridObj = new jqGrid();
	jqGridObj.setOption({
		data: BrandInfoList,
		colNames: ["No.", "ブランドCD", "ブランド名称", "生まれの国", "詳細", "削除フラグ"],
		colModel: [
			{name:"brandId",index:"brandId",width:50,align:"center",classes:"radio_class"},
			{name:"brandCd",index:"brandCd",width:100,align:"left",classes:"no_class"},
			{name:"brandName",index:"brandName",width:150,align:"left",classes:"name_class"},
			{name:"country",index:"country",width:150,align:"left",classes:"name_class"},
			{name:"details",index:"details",width:650,align:"left",classes:"name_class"},
			{name:"deleteFlgStr",index:"deleteFlgStr",width:100,align:"center",classes:"name_class"}
			],
		rowNum: 30,
		rowList: [10, 30, 50],
		caption: "",
		height: 1000,
		width: 1000,
		pager: "pager1"
	});
	jqGridObj.execute($("#brandInfoGrid"), $("#pager1"));
	jqGridObj.resize($("#brandInfoGrid"));
	
}