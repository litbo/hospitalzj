var main_list =
    [
        {
            "title": "首页",
            "url": "?p=home",
            "href": "?p=home",
            "id": "0",
            "icon": "home",
            "shiro": "a",
            "func": function () {
            }
        },
        {
            "page": "home",
            "tools": [],
            "items": [
                {
                    "title": "我的任务",
                    "url": "./home/my_task.html",
                    "id": "11",
                    "icon": "calendar-check",
                    "shiro": "a"
                },
                {
                    "title": "提醒事项",
                    "url": "./home/remind.html",
                    "id": "12",
                    "icon": "clipboard",
                    "shiro": "a"
                },
                {
                    "title": "共享信息",
                    "url": "javascript:void;",
                    "id": "13",
                    "icon": "star",
                    "shiro": "a",
                    "list": [
                        {
                            "title": "通知公告",
                            "url": "./home/announcement.html",
                            "id": "14",
                            "shiro": "a"
                        },
                        {
                            "title": "公共信息",
                            "url": "./home/public_info.html",
                            "id": "15",
                            "shiro": "a"
                        }
                    ]
                }
            ]
        },
        {
            "page": "data",
            "tools": [
                {
                    "title": "联网设备",
                    "icon": "globe-asia",
                    "shiro": "a",
                    "content": [
                        {
                            "title": "运行记录",
                            "url": "data&t=0&n=0",
                            "shiro": "a",
                            "id": "2",
                            "items": [
                                {
                                    "title": "供应商基本信息",
                                    "url": "./supplier/basic_infomation.html",
                                    "icon": "book-open",
                                    "id": "21",
                                    "shiro": "a"
                                },
                                {
                                    "title": "验收申请",
                                    "url": "./supplier/acceptance_application.html",
                                    "icon": "network-wired",
                                    "id": "22",
                                    "shiro": "a"
                                },
                                {
                                    "title": "验收进度",
                                    "url": "./supplier/acceptance_progress.html",
                                    "icon": "book-open",
                                    "id": "23",
                                    "shiro": "a"
                                }
                            ]
                        }
                    ]
                }
            ],
            "items": []
        },
        {
            "page": "life",
            "tools": [
                {
                    "title": "采购管理",
                    "icon": "shopping-cart",
                    "shiro": "a",
                    "content": [
                        {
                            "title": "申购管理",
                            "url": "life&t=0&n=0",
                            "shiro": "a",
                            "id": "3",
                            "items": [
                                {
                                    "title": "待验收管理",
                                    "url": "./check/accepting.html",
                                    "icon": "credit-card",
                                    "id": "31",
                                    "shiro": "a"
                                },
                                {
                                    "title": "验收管理",
                                    "url": "./check/accept.html",
                                    "icon": "clipboard-list",
                                    "id": "32",
                                    "shiro": "a"
                                },
                                {
                                    "title": "统计查询",
                                    "url": "./check/statistics.html",
                                    "icon": "comments",
                                    "id": "33",
                                    "shiro": "a"
                                }
                            ]
                        }
                    ]
                }
            ],
            "items": []
        },
        {
            "page": "safe",
            "tools": [
                {
                    "title": "风险管理",
                    "icon": "exclamation-triangle",
                    "shiro": "a",
                    "content": [
                        {
                            "title": "风险管理",
                            "url": "safe&t=0&n=0",
                            "shiro": "a",
                            "id": "4",
                            "items": [
                                {
                                    "title": "待检设备管理",
                                    "url": "./table.html",
                                    "icon": "poll",
                                    "id": "41",
                                    "shiro": "a",
                                    "list": [
                                        {
                                            "title": "在用设备定期检测",
                                            "url": "./control/use/on_use.html",
                                            "id": "42",
                                            "shiro": "a"
                                        },
                                        {
                                            "title": "新设备验收检测",
                                            "url": "./control/use/new_use.html",
                                            "id": "43",
                                            "shiro": "a"
                                        },
                                        {
                                            "title": "故障设备维修检测",
                                            "url": "./control/use/un_use.html",
                                            "id": "44",
                                            "shiro": "a"
                                        }
                                    ]
                                },
                                {
                                    "title": "检测仪器管理",
                                    "url": "./table.html",
                                    "icon": "user-edit",
                                    "id": "45",
                                    "shiro": "a",
                                    "list": [
                                        {
                                            "title": "检测仪器信息管理",
                                            "url": "./control/check/check_info.html",
                                            "id": "46",
                                            "shiro": "a"
                                        },
                                        {
                                            "title": "检测数据模板管理",
                                            "url": "./control/check/check_mould.html",
                                            "id": "47",
                                            "shiro": "a"
                                        },
                                        {
                                            "title": "检测仪器培训管理",
                                            "url": "./control/check/check_train.html",
                                            "id": "48",
                                            "shiro": "a"
                                        }
                                    ]
                                },
                                {
                                    "title": "年度计划",
                                    "url": "./control/yearly_plan.html.html",
                                    "icon": "sliders-h",
                                    "id": "49",
                                    "shiro": "a"
                                },
                                {
                                    "title": "统计查询",
                                    "url": "./control/statistics.html",
                                    "icon": "sliders-h",
                                    "id": "50",
                                    "shiro": "a"
                                }
                            ]
                        }
                    ]
                }
            ],
            "items": []
        },
        {
            "page": "beneft",
            "tools": [
                {
                    "title": "事前论证",
                    "icon": "thumbtack",
                    "shiro": "a",
                    "content": [
                        {
                            "title": "可行性论证",
                            "url": "beneft&t=0&n=0",
                            "shiro": "a",
                            "id": "5",
                            "items": [
                                {
                                    "title": "检测人员管理",
                                    "url": "./personnel/personnel.html",
                                    "icon": "credit-card",
                                    "id": "51",
                                    "shiro": "a"
                                }
                            ]
                        }
                    ]
                }
            ],
            "items": []
        },
        {
            "page": "admin",
            "tools": [
                {
                    "title": "基础管理",
                    "icon": "building",
                    "shiro": "a",
                    "content": [
                        {
                            "title": "安全指标体系",
                            "url": "admin&t=0&n=0",
                            "shiro": "a",
                            "id": "6",
                            "items": [
                                {
                                    "title": "字典管理",
                                    "icon": "chart-line",
                                    "url": "./system/dectionary.html",
                                    "id": "61",
                                    "shiro": "a"
                                },
                                {
                                    "title": "权限分配",
                                    "icon": "eye",
                                    "url": "./system/authority.html",
                                    "id": "62",
                                    "shiro": "a"
                                },
                                {
                                    "title": "人员分配设置",
                                    "icon": "sliders-h",
                                    "url": "./people_allot.html",
                                    "id": "63",
                                    "shiro": "a"
                                },
                                {
                                    "title": "检测仪器分配设置",
                                    "icon": "sliders-h",
                                    "url": "./system/instrument_allot.html",
                                    "id": "64",
                                    "shiro": "a"
                                }
                            ]
                        }
                    ]
                }
            ],
            "items": []
        }
    ];

var nav_list = [
    {
        "page": "data",
        "title": "供应商管理",
        "icon": "fas fa-chart-bar"
    },
    {
        "page": "life",
        "title": "验收管理",
        "icon": "far fa-heart"
    },
    {
        "page": "safe",
        "title": "质控管理",
        "icon": "far fa-smile"
    },
    {
        "page": "beneft",
        "title": "检测员管理",
        "icon": "far fa-gem"
    },
    {
        "page": "admin",
        "title": "系统设置",
        "icon": "fas fa-sitemap"
    }
]