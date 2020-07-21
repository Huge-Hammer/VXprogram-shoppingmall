//index.js
//获取应用实例
var app = getApp()

Page({
    // 页面初始数据
    data: {
        colors: ['red', 'orange', 'yellow', 'green', 'purple'],
        curNavId: 1,
        curIndex: 0,
        backUrl:[],
        product:[]
    },

    onLoad: function () {
       this.backload();
       this.productload();
    },

  //后端加载产品
  productload: function () {
    var that = this;
    wx.request({
      url: 'http://localhost:8088/product',
      method: 'POST',
      header: {
        'content-type': 'application/json'
      },
      success(res) {
        console.log("request product success!");
        that.setData({
          product: res.data
        })
        wx.hideLoading();
      }
    })
  },

  //后端加载图片
    backload: function () {
    var that = this;
    wx.request({
      url: 'http://localhost:8088/pic',
      method: 'POST',
      header: {
        'content-type': 'application/json'
      },
      success(res) {
        console.log("request pic success!");
        that.setData({
          backUrl: res.data
        })
        wx.hideLoading();
      }
    })
    },

    //标签切换
    switchTab: function (e) {
        let id = e.currentTarget.dataset.id,
            index = parseInt(e.currentTarget.dataset.index)
        this.curIndex = parseInt(e.currentTarget.dataset.index)
        console.log(e)
        var that = this
        this.setData({
            curNavId: id,
            curIndex: index,
        })

    },
    // 跳转至详情页
    navigateDetail: function (e) {
        wx.navigateTo({
            url: '../details/details?goods.id={{item.id}}'
        })
    },
    // book
    bookTap: function (e) {
        wx.navigateTo({
          url: '../details/details?aid=' + e.currentTarget.dataset.aid
        })
    }

})
