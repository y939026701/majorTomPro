class Nav{
    constructor($div,$login,$user){
        this.$div = $div;
        this.$login = $login;
        this.$user = $user;
    }
    build() {
        let html = `<ul class="layui-nav layui-bg-cyan right">
                <span class=" layui-layout-left" style="font-size: 40px">
                <!--            <img>-->
                logo
                <!--           <i class="layui-icon layui-icon-picture-fine"/>-->
                <select class="layui-bg-cyan" name="city" lay-verify="">
                <option value="">城市</option>
                <option value="010">北京</option>
                <option value="021">上海</option>
                <option value="0571">杭州</option>
                </select>
                </span>
                <div class="layui-input-inline">
                <input type="text" name="username" lay-verify="required" placeholder="人才辈出阿卡姆" autocomplete="off" class="layui-input">
                </div>
                <button type="submit" class="layui-btn layui-btn-primary"><i class="layui-icon layui-icon-search"></i></button>`
        if (this.$login) {
            html += `<li class="layui-nav-item">
                    <a href="javascript:;"><img src="../img/timg.jif" class="layui-nav-img">${this.$user.userName}</a>
                    <dl class="layui-nav-child left">
                    <dd class="center"><img src="../img/timg.jif" class="layui-nav-img"></dd>
                    <dd class="black center">
                    癔病猫
                    </dd>
                    <dd class="center black">
                    level：1
                    </dd>
                    <dd>
                    <div class="layui-progress layui-bg-orange">
                    <div class="layui-progress-bar layui-bg-red" lay-percent="22%"></div>
                    </div>
                    </dd>
                    <dd><a href="javascript:;">个人中心</a></dd>
                    <dd><a href="javascript:;">我的观影团</a></dd>
                    <dd>
                    <a href="javascript:;">
                    账号设置
                    <i class="layui-icon layui-icon-set"></i></a>
                    </dd>
                    <dd><a href="javascript:;">退出登录</a></dd>
                    </dl>
                    </li>
                    <li class="layui-nav-item">
                    <a href="">历史<span class="layui-badge">7</span></a>
                    </li>
                    <li class="layui-nav-item">
                    <a href="">收藏<span class="layui-badge">7</span></a>
                    </li>
                    <li class="layui-nav-item">
                    <a href="">动态<span class="layui-badge">7</span></a>
                    </li>
                    <li class="layui-nav-item hidden">
                    <a href="">消息<span class="layui-badge-dot"></span></a>
                    <dl class="layui-nav-child left">
                    <dd>
                    <a href="javascript:;">公告
                    <span class="layui-badge">3</span>
                    </a>
                    </dd>
                    <dd>
                    <a href="javascript:;">
                    私信<span class="layui-badge">6</span>
                    </a>
                    </dd>
                    <dd>
                    <a href="javascript:;">存档</a>
                    </dd>
                    <dd>
                    <a href="javascript:;">
                    消息设置
                    <i class="layui-icon layui-icon-set"></i>
                    </a>
                    </dd>
                    </dl>
                    </li>
                    <li class="layui-nav-item">&emsp;&emsp;</li>`;
        }else{
            html += `<li class="layui-nav-item">
                    <a href="">注册/登陆</a>
                    </li>
                    <li class="layui-nav-item">&emsp;&emsp;</li>`;
        }
        html += `</ul>`;
        this.$div.append(html);
    }
}
let $div = $("nav");
let $login = true;
$.getJSON('/tlt',function(user){
    new Nav($div,$login,user).build();
});
