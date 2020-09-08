package com.liyuan.beans;

import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.context.annotation.SessionScope;

@SessionScope(proxyMode = ScopedProxyMode.DEFAULT)
public class SessionScopeBean {
}
