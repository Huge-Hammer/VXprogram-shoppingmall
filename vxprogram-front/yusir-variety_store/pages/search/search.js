let timeId = null;
Page({
    data: {
        history: [],
        hot: ['恩希玛', '打屎棒儿', '野鸡'],
        result: [
            {
                id: 1,
                url: '../details/details',
                thumb: '/images/products/1.jpg',
                title: '恩希玛 500g',
                price: 10
            },
            {
                id: 2,
                url: '../details/details',
                thumb: '/images/products/4.jpg',
                title: '野鸡',
                price: 200
            }
        ],
        showKeywords: false,
        keywords: ['恩希玛', '野鸡', '打屎棒儿'],
        value: '',
        showResult: false,
    },
    cancelSearch() {
        this.setData({
            showResult: false,
            showKeywords: false,
            value: ''
        })
    },
    searchInput(e) {
        if(!e.detail.value){
            this.setData({
                showKeywords: false
            })
        }else{
            if(!this.data.showKeywords){
                timeId && clearTimeout(timeId);
                timeId = setTimeout(() => {
                    this.setData({
                        showKeywords: true
                    })
                }, 1000)
            }
        }
    },
    keywordHandle(e) {
        const text = e.target.dataset.text;
        this.setData({
            value: text,
            showKeywords: false,
            showResult: true
        })
        this.historyHandle(text);
    },
    historyHandle(value) {
        let history = this.data.history;
        const idx = history.indexOf(value);
        if (idx === -1) {
            // 搜索记录只保留8个
            if (history.length > 7) {
                history.pop();
            }
        } else {
            history.splice(idx, 1);
        }
        history.unshift(value);
        wx.setStorageSync('history', JSON.stringify(history));
        this.setData({
            history
        });
    },
    onLoad() {
        const history = wx.getStorageSync('history');
        if (history) {
            this.setData({
                history: JSON.parse(history)
            })
            console.log(this.data.history);
        }
    }
})