// page/component/details/details.js
Page({
  data:{
    goods: [
      {
      id: 1,
      image: '/images/products/1.jpg',
      title: '新鲜恩希玛',
      price: 10,
      stock: '于老师现做的',
      detail: '恩希玛（Nshima）又译希玛，是赞国（赞比亚）的主食。它是由磨碎的玉米面粉制成的，在当地称为玉米餐（mealie-meal）。与东部非洲、津巴布韦、南非和西非富富巴氏萨扎的ugali或posho、Nshima是非常相似的。',
      parameter: '500g一碗',
      service: '不支持退货'
    },
    {
      id: 2,
      image: '/images/products/2.jpg',
      title: '琥珀鹿',
      price: 18888,
      stock: '于老师家的',
      detail: '琥珀鹿',
      parameter: '一吨',
      service: '不支持退货'
    }
    ],
    num: 1,
    totalNum: 0,
    hasCarts: false,
    curIndex: 0,
    show: false,
    scaleCart: false
  },

  addCount() {
    let num = this.data.num;
    num++;
    this.setData({
      num : num
    })
  },

  addToCart() {
    const self = this;
    const num = this.data.num;
    let total = this.data.totalNum;

    self.setData({
      show: true
    })
    setTimeout( function() {
      self.setData({
        show: false,
        scaleCart : true
      })
      setTimeout( function() {
        self.setData({
          scaleCart: false,
          hasCarts : true,
          totalNum: num + total
        })
      }, 200)
    }, 300)

  },

  bindTap(e) {
    const index = parseInt(e.currentTarget.dataset.index);
    this.setData({
      curIndex: index
    })
  }
 
})