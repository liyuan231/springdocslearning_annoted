package com.liyuan.lookupmthodinjection;

import org.springframework.context.annotation.*;

@Configuration
public class ABean {
    @Bean
//    @Scope(value = "prototype",proxyMode = ScopedProxyMode.TARGET_CLASS)
    public AsyncCommand asyncCommand() {
        System.out.println("method asyncCommand is called!");
        AsyncCommand command = new AsyncCommand();
        return command;
    }

//    @Bean
    public CommandManager commandManager() {
        return new CommandManager() {
            @Override
            protected Command createCommand() {
                return asyncCommand();
            }
        };
    }


    @Bean
    @Scope("prototype")
    public ClientService clientService1(){
        System.out.println("clientService2 is called!");
        ClientServiceImpl clientService = new ClientServiceImpl();
        clientService.setClientDao(clientDao());
        return clientService;
    }
    @Bean
    @Scope("prototype")
    public ClientService clientService2(){
        System.out.println("clientService2 is called!");
        ClientServiceImpl clientService = new ClientServiceImpl();
        clientService.setClientDao(clientDao());
        return clientService;
    }
    @Bean

    public ClientDao clientDao(){
        System.out.println("clientDao is called!");
        return new ClientDao();
    }
}
