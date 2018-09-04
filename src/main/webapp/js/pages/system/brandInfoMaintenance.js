/**
 * ブランド情報メンテナンスに関するjsファイル.
 */

$(function() {
	
	// ページタイトルの設定
	$(".pageTitle").text("ブランド情報メンテナンス");
	
	getBrandInfo().then(BrandInfoList => {
		setBrandInfoListGrid(BrandInfoList);
	});
	
});

async function getBrandInfo() {
	var contextPath = $("#contextPath").text();
	
	return await mcpAjax.setOption({
		type: "GET",
		url: contextPath + "/BrandInfoMaintenance/getDataList",
		data: {},
		dataType: "json" 
	})
	// 非同期処理実行
	.execute();
}

function setBrandInfoListGrid(BrandInfoList) {
	var option = {
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
			height: "10%",
			width: "100%",
			pager: "pager1"
		}
	
	mcpJqGrid
		.setOption(option)
		.execute($("#brandInfoGrid"), $("#pager1"))
		.resize($("#brandInfoGrid"));
	
}