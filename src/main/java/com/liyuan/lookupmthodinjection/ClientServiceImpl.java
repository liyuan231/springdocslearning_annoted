package com.liyuan.lookupmthodinjection;

public class ClientServiceImpl implements ClientService {
    public ClientDao getClientDao() {
        return clientDao;
    }

    public void setClientDao(ClientDao clientDao) {
        this.clientDao = clientDao;
    }

    private ClientDao clientDao;
}
