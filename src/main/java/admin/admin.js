import ax from 'axios'
import qs from 'querystring'
// 默认配置
// ax.defaults.baseURL = 'http://adminweb.luckinshop.com:8080/adminback'

const _axios =ax.create({
  baseURL:  'http://adminweb.luckinshop.com:8080/adminback',
  timeout: 10000,
})
_axios.defaults.headers.post['Content-Type'] = 'application/json;charset=UTF-8'
_axios.defaults.baseURL = 'http://adminweb.luckinshop.com:8080/adminback'
_axios.defaults.withCredentials = true
_axios.defaults.withCredentials = true

_axios.interceptors.request.use(
  config => {
    //将token保存到了localStorage，将其添加到请求头
    if (localStorage.getItem("token")) {
      config.headers.Authorization = localStorage.getItem("token")
    }
    return config
  }
)
// TODO  管理员登录请求
export const login = (params) => {
  return _axios.post('/login', params).then(res => res.data)
}

// TODO  管理员退出
export const logout = (params) => {
  return _axios.get('/logout', params).then(res => res.data)
}
// TODO  获取所有可以操作的系统（侧边栏）
export const getSystemList = () => {
  return _axios.get('/getSystemList').then(res => res.data)
}
// TODO  获取的按钮来进行渲染
export const getALLButton = () => {
  return _axios.get('/getAllCode').then(res => res.data)
}

// TODO  获取所有管理员信息
export const listAdmin = () => {
  return _axios.get('/admin/listAdmin').then(res => res.data)
}

// TODO 获取所有系统和权限将其渲染到前端
export const listSystemAndPermission = () => {
  return _axios.get('/admin/listSystemPermission').then(res => res.data)
}
// TODO 修改管理员状态
export const amendAdminStatus = (params) => {
  return _axios.post('/admin/updateAdminStatus', params).then(res => res.data)
}
// TODO 根据用户名查找用户(搜索框）
export const findByName = (params) => {
  return _axios.post('/admin/findByName', params).then(res => res.data)
}
// TODO 添加用户名时根据用户名校验用户是否存在
export const isExistedAdminName = (params) => {
  return _axios.post('/admin/isExistedAdminName', params).then(res => res.data)
}
// TODO 添加用户
export const addAdmin = (params) => {
  return _axios.post('/admin/addAdmin', params).then(res => res.data)
}

// TODO 查看用户可以使用的系统和权限
export const viewAdminUseSystem = (params) => {
  return _axios.post('/admin/viewAdminUseSystem', params).then(res => res.data)
}
// TODO 修改用户的基本信息
export const amendAdminInfo = (params) => {
  return _axios.post('/admin/updateAdminInfo', params).then(res => res.data)
}
// TODO 修改用户可以使用的系统和权限
export const amendAdminUseSystem = (params) => {
  return _axios.post('/admin/updateAdminUseSystem', params).then(res => res.data)
}

// TODO 查找系统名称
export const isExistedSystemName = (params) => {
  return _axios.post('/admin/isExistedSystemName', params).then(res => res.data)
}
// TODO 查找系统标识
export const isExistedSystemCode = (params) => {
  return _axios.post('/admin/isExistedSystemCode', params).then(res => res.data)
}
// TODO 添加系统
export const addSystem= (params) => {
  return _axios.post('/admin/addSystem', params).then(res => res.data)
}
// TODO 添加子路径时渲染下拉框
export const listSystem = () => {
  return _axios.get('/admin/listSystem').then(res => res.data)
}

// TODO 添加权限
export const addPermission= (params) => {
  return _axios.post('/admin/addMenu', params).then(res => res.data)
}

// TODO 删除系统
export const deleteSystem= (params) => {
  return _axios.post('/admin/deleteSystem', params).then(res => res.data)
}

// TODO 删除权限（子路径）
export const deletePermission= (params) => {
  return _axios.post('/admin/deleteMenu', params).then(res => res.data)
}

// TODO 修改系统
export const amendSystem= (params) => {
  return _axios.post('/admin/updateSystem', params).then(res => res.data)
}

// TODO 修改权限（子路径）
export const amendPermission= (params) => {
  return _axios.post('/admin/updatePermission', params).then(res => res.data)
}
