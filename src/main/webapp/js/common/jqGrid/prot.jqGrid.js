/**
 * jqGridの表示などを行うjsファイル.
 */

var JqGrid = {
		create: function() {
			var jqGrid = Object.create(JqGrid.prototype);
			
			jqGrid.o = Object.freeze({type: 'JqGrid'});
			
			// 表示したいデータ
			jqGrid.data = null;
			// 列の表示名
			jqGrid.colNames = null;
			// 列ごとの設定
			jqGrid.colModel = null;
			// 1ページに表示する行数
			jqGrid.rowNum = null;
			// 変更可能な1ページあたりの行数
			jqGrid.rowList = null;
			// ヘッダーのキャプション
			jqGrid.caption = null;
			// 高さ
			jqGrid.height = null;
			// 幅
			jqGrid.width = null;
			// footerのページャ―要素のid
			jqGrid.pager = null;
			
			return jqGrid;
		},
		
		prototype: {
			getType: function() {
				return this.o.type;
			},
			resetOption: function() {
				this.data = null;
				this.colNames = null;
				this.colModel = null;
				this.rowNum = null;
				this.rowList = null;
				this.caption = null;
				this.height = null;
				this.width = null;
				this.pager = null;
			},
			setOption: function(option) {
				
				// 引数チェック
				if(arguments.length !== 1) {
					throw new Error('引数の数は1つです。');
				}
				
				// TODO: $gridとかもメンバ変数に持たせて!!
				this.data = option.data;
				this.colNames = option.colNames;
				this.colModel = option.colModel;
				this.rowNum = option.rowNum;
				this.rowList = option.rowList;
				this.caption = option.caption;
				this.height = option.height;
				this.width = option.width;
				this.pager = option.pager;
				return this;
			},
			execute: function($grid, $gridFooter) {
				// jqGrid
				$grid.jqGrid({
					data:this.data,             //表示したいデータ
		            datatype : "local",         //データの種別 他にjsonやxmlも選べます。
		            colNames : this.colNames,   //列の表示名
		            colModel : this.colModel,   //列ごとの設定
		            rowNum : this.rowNum,       //一ページに表示する行数
		            rowList : this.rowList,     //変更可能な1ページ当たりの行数
		            caption : this.caption,     //ヘッダーのキャプション
		            height : this.height,       //高さ
		            width : this.width,         //幅
		            'loadError' : function (xhr, status, error){
	                    alert(error);
	                },
	                rownumber:true,             // 行番号を表示
	                viewrecords: true,          // フッターに行数を表示する
		            pager : this.pager,         //footerのページャー要素のid
		            regional : 'ja',            //日本語
		            shrinkToFit : true,         //画面サイズに依存せず固定の大きさを表示する設定
		            viewrecords: true,           //footerの右下に表示する。
		            loadComplete : function () {
		            	// div_dummy 枠の横幅を取得してグリッドに設定する
		                $($grid).jqGrid('setGridWidth', $("#viewGrid").width(), true);
		            }
				});
				
				//検索追加
		        $grid.jqGrid('navGrid', $gridFooter,{
		            add:false,   // 追加
		            edit:false,  // 編集
		            del:false,   // 削除
		            search: {    // 検索オプション
		                odata: ['equal', 'not equal', 'less', 'less or equal',
		                                 'greater','greater or equal', 'begins with',
		                                 'does not begin with','is in','is not in','ends with',
		                                 'does not end with','contains','does not contain']
		            }   //検索の一致条件を入れられる
		        });

		        //filterバー追加
		        $grid.filterToolbar({
		            defaultSearch:'cn'     //一致条件を入れる。
		                                   //選択肢['eq','ne','lt','le','gt','ge','bw','bn','in','ni','ew','en','cn','nc']
		        });
		        
		        return this;
			},
			// グリッドのサイズを動的に変更する
			resize: function($grid) {
				$(window).bind('resize', function() {
					$grid.setGridWidth(window.innerWidth * 0.88)
						.setGridHeight(window.innerHeight * 0.7);
				}).trigger('resize');
			}
		}
}

var mcpJqGrid = JqGrid.create();