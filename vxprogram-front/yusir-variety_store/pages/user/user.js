//index.js
//获取应用实例
var app = getApp()

Page({
  //获取用户信息
  getMyInfo: function (e) {
    let info = e.detail.userInfo;
    //动态更新头像和昵称
    this.setData({
      src: info.avatarUrl,//更新头像
      name: info.nickName //更新昵称
    })
  }, 
  data: {
    src: '/images/c.gif',//页面初始图片
    name: "hello",  //页面初始提示字
  },

})
