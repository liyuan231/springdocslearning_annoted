package com.liyuan;

import com.liyuan.annotation.TestBean;
import com.liyuan.beanPostProcessor.MyBeanPostProcessor;
import com.liyuan.beanWrapper.Company;
import com.liyuan.beanWrapper.Employee;
import com.liyuan.beans.PrimaryAnnotationTest;
import com.liyuan.beans.SelfInjectionBean;
import com.liyuan.config.AppConfig;
import com.liyuan.config.MyConfiguration;
import com.liyuan.convert.ConversionServiceTest;
import com.liyuan.convert.MyConverter;
import com.liyuan.dao.CustomerPreferenceDao;
import com.liyuan.datasourceTest.JdbcTest;
import com.liyuan.editor.Something;
import com.liyuan.event.EmailService;
import com.liyuan.lookupmthodinjection.AsyncCommand;
import com.liyuan.lookupmthodinjection.ClientService;
import com.liyuan.messageSource.Example;
import com.liyuan.model.MovieFinder;
import com.liyuan.model.MovieRecommender;
import com.liyuan.model.Person;
import com.liyuan.model.SimpleMovieLister;
import com.liyuan.property.PropertyTest;
import com.liyuan.resource.ResourceBean;
import com.liyuan.resource.ResourceBean2;
import com.liyuan.validate.Address;
import com.liyuan.validate.AddressValidator;
import com.liyuan.validate.Customer;
import com.liyuan.validate.CustomerValidator;
import org.junit.Test;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.factory.BeanInitializationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.TypeDescriptor;
import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.support.DefaultConversionService;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.Resource;
import org.springframework.lang.Nullable;
import org.springframework.util.ClassUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import javax.servlet.ServletException;
import java.io.IOException;
import java.util.*;

public class test {
    @Test
    public void test1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
        SimpleMovieLister simpleMovieLister = (SimpleMovieLister) applicationContext.getBean("simpleMovieLister");
        System.out.println(simpleMovieLister.toString());
    }

    @Test
    public void test2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        MovieRecommender movieRecommender = (MovieRecommender) applicationContext.getBean("movieRecommender");
        System.out.println(movieRecommender.toString());
    }

    @Test
    public void test3() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        MovieFinder movieFinder = (MovieFinder) applicationContext.getBean("movieFinder");
        System.out.println(movieFinder.toString());
    }

    @Test
    public void test4() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        CustomerPreferenceDao customerPreferenceDao = (CustomerPreferenceDao) applicationContext.getBean("customerPreferenceDao");
        System.out.println(customerPreferenceDao.toString());
    }

    @Test
    public void test5() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        MyBeanPostProcessor myBeanPostProcessor = (MyBeanPostProcessor) applicationContext.getBean("myBeanPostProcessor");
        System.out.println(myBeanPostProcessor.toString());
    }

    @Test
    public void test6() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        PrimaryAnnotationTest primaryAnnotationTest = (PrimaryAnnotationTest) applicationContext.getBean("primaryAnnotationTest");
        System.out.println(primaryAnnotationTest.toString());
    }

    @Test
    public void test7() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        SelfInjectionBean selfInjectionBean = (SelfInjectionBean) applicationContext.getBean("selfInjectionBean");
        System.out.println(selfInjectionBean.toString());
//        CollectionsTest collectionsTest = (CollectionsTest) applicationContext.getBean("collectionsTest");
//        System.out.println(Arrays.toString(collectionsTest.catalogs));
    }

    @Test
    public void test8() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        MyConfiguration myConfiguration = (MyConfiguration) applicationContext.getBean("myConfiguration");
        System.out.println(myConfiguration.toString());
    }

    @Test
    public void test9() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        PropertyTest propertyTest = (PropertyTest) applicationContext.getBean("propertyTest");
        System.out.println(propertyTest.toString());
    }

    @Test
    public void test10() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Map<String, TestBean> beansOfType = applicationContext.getBeansOfType(TestBean.class);
        for (Map.Entry<String, TestBean> entry : beansOfType.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

    @Test
    public void test11() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }

    @Test
    public void test12() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }

//    @Test
//    public void test13() {
//        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
//        applicationContext.register(AppConfig.class);
//        applicationContext.refresh();
//        AnnotationJavaxTest annotationJavaxTest = (AnnotationJavaxTest) applicationContext.getBean("annotationJavaxTest");
//        System.out.println(annotationJavaxTest.toString());
//        SimpleMovieLister simpleMovieLister = (SimpleMovieLister) applicationContext.getBean("simpleMovieLister");
//        Provider<MovieFinder> movieFinderProvider = simpleMovieLister.getMovieFinderProvider();
//        System.out.println(movieFinderProvider.get());
//    }


    @Test
    public void test14() throws ServletException {
        AnnotationConfigWebApplicationContext configWebApplicationContext = new AnnotationConfigWebApplicationContext();
        configWebApplicationContext.register(AppConfig.class);
        configWebApplicationContext.refresh();
        String[] beanDefinitionNames = configWebApplicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
        JdbcTest jdbcTest = (JdbcTest) configWebApplicationContext.getBean("jdbcTest");
//        jdbcTest.test();
        configWebApplicationContext.close();

    }

    @Test
    public void test15() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        for (int i = 0; i < 10; i++) {
            AsyncCommand aBean = (AsyncCommand) applicationContext.getBean("asyncCommand");
            System.out.println(aBean);
        }
    }

    @Test
    public void test16() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        ClientService clientService1 = (ClientService) applicationContext.getBean("clientService1");
        ClientService clientService2 = (ClientService) applicationContext.getBean("clientService2");

        System.out.println("----------------");
        ClientService clientService3 = (ClientService) applicationContext.getBean("clientService1");
        ClientService clientService4 = (ClientService) applicationContext.getBean("clientService2");
    }

    @Test
    public void test17() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
//        applicationContext.getEnvironment().setActiveProfiles("production");
        applicationContext.register(AppConfig.class);
        applicationContext.refresh();
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }

    @Test
    public void test18() {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MutablePropertySources propertySources = annotationConfigApplicationContext.getEnvironment().getPropertySources();
        for (PropertySource<?> propertySource : propertySources) {
//            propertySource.
            System.out.println(propertySource);
        }
    }

    @Test
    public void test19() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        String message = applicationContext.getMessage("message", null, Locale.CHINESE);
        System.out.println(message);
    }

    @Test
    public void test20() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        String message = applicationContext.getMessage("message", null, Locale.UK);
        System.out.println(message);
    }

    @Test
    public void test21() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        Map<String, Object> systemProperties = environment.getSystemProperties();
        System.out.println();
        for (Map.Entry<String, Object> entry : systemProperties.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        Map<String, Object> systemEnvironment = environment.getSystemEnvironment();
        System.out.println();
        for (Map.Entry<String, Object> entry : systemEnvironment.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

    @Test
    public void test21_() {
        Properties properties = System.getProperties();
        for (Map.Entry<Object, Object> entry : properties.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        Map<String, String> getenv = System.getenv();
        for (Map.Entry<String, String> entry : getenv.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

    @Test
    public void test22() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Example example = (Example) applicationContext.getBean("example");
        example.execute();
    }

    @Test
    public void test23() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
//        applicationContext.publishEvent(new ContextRefreshedEventTest(applicationContext));
//        applicationContext.start();
        EmailService emailService = (EmailService) applicationContext.getBean("emailService");
        emailService.sendEmail("广州市", "你好！");
        emailService.sendEmail("123@qq.com", "123hello!");
    }

    @Test
    public void test24() throws IOException {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        ResourceBean resourceBean = (ResourceBean) applicationContext.getBean("resourceBean");
        resourceBean.test();
    }

    @Test
    public void test25() throws IOException {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Resource resource = applicationContext.getResource("//img2.huashi6.com/images/resource/2019/11/10/7773h4148p0.jpg?imageView2/3/q/100/interlace/1/w/2560/h/2560/format/webp");
        System.out.println(resource.getFilename() + ":" + resource.getDescription() + ":" + resource.contentLength());
    }

    @Test
    public void test26() throws IOException {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Resource resource = applicationContext.getResource("spring.xml");
        System.out.println(resource.getFilename() + ":" + resource.getDescription() + ":" + resource.contentLength());
    }

    @Test
    public void test27() throws IOException {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Resource resource = applicationContext.getResource("file://C:\\Users\\Administrator\\Desktop\\2.PNG");
        System.out.println(resource.getFilename() + ":" + resource.getDescription() + ":" + resource.contentLength());
//        Runtime.getRuntime().gc();
        System.runFinalization();
    }

    @Test
    public void test28() throws IOException {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        ResourceBean2 resourceBean2 = (ResourceBean2) applicationContext.getBean("resourceBean2");
        resourceBean2.test();

    }

    @Test
    public void test29() {
        Properties properties = System.getProperties();
        Set<Map.Entry<Object, Object>> entries = properties.entrySet();
        for (Map.Entry<Object, Object> entry : entries) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

    @Test
    public void test30() {
        Customer customer = new Customer();
        Address address = new Address();
        customer.setAddress(address);
        DataBinder dataBinder = new DataBinder(customer);
        dataBinder.setValidator(new CustomerValidator(new AddressValidator()));
        dataBinder.validate();
        BindingResult results = dataBinder.getBindingResult();
        System.out.println(results);
    }

    @Test
    public void test31() {
        BeanWrapper company = new BeanWrapperImpl(new Company());
        company.setPropertyValue("name", "XXX有限公司");

//        BeanWrapper employee = new BeanWrapperImpl(new Employee());
//        employee.setPropertyValue("name","LIYUAN");
//        employee.setPropertyValue("salary",110000);

        company.setPropertyValue("managingDirector", new Employee());

        System.out.println(company.getWrappedInstance().toString());

    }

    @Test
    public void test32() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Something something = (Something) applicationContext.getBean("something");
//        something.test();

    }

    @Test
    public void test33() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        PropertyTest propertyTest = (PropertyTest) applicationContext.getBean("propertyTest");
        System.out.println(propertyTest.toString());
    }

    @Test
    public void test34() {
        Validator validator = null;
        if (validator == null) {
            if (ClassUtils.isPresent("javax.validation.Validator", getClass().getClassLoader())) {
                Class<?> clazz;
                try {
                    String className = "org.springframework.validation.beanvalidation.OptionalValidatorFactoryBean";
                    clazz = ClassUtils.forName(className, WebMvcConfigurationSupport.class.getClassLoader());
                } catch (ClassNotFoundException | LinkageError ex) {
                    throw new BeanInitializationException("Failed to resolve default validator class", ex);
                }
                validator = (Validator) BeanUtils.instantiateClass(clazz);
            } else {
                validator = new Validator() {
                    @Override
                    public boolean supports(Class<?> clazz) {
                        return false;
                    }

                    @Override
                    public void validate(@Nullable Object target, Errors errors) {
                    }
                };
            }
        }
        System.out.println(validator);
    }

    @Test
    public void test35() {
        Converter<String, Integer> converter = new MyConverter();
        Integer convert = converter.convert("123");
        System.out.println(convert);
    }

    @Test
    public void test36() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        PropertyTest propertyTest = (PropertyTest) applicationContext.getBean("propertyTest");
        System.out.println(propertyTest);
        ConversionServiceTest<Map, Set> conversionServiceTest = (ConversionServiceTest) applicationContext.getBean("conversionServiceTest");
        Map<String, String> map = new HashMap<>();
        map.put("1", "one");
        map.put("2", "two");
        Set test = conversionServiceTest.test(map, Set.class);
        System.out.println(Arrays.toString(test.toArray()));
    }

    @Test
    public void test37() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        ConversionService conversionService = (ConversionService) applicationContext.getBean("conversionService");
//        Map convert = conversionService.convert(AEnum.E, Map.class);
//        System.out.println(convert);
    }

    @Test
    public void test38() {
        DefaultConversionService defaultConversionService = new DefaultConversionService();
//        defaultConversionService.
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        List<String> convert = (List<String>) defaultConversionService.convert(list, TypeDescriptor.forObject(list), TypeDescriptor.collection(List.class, TypeDescriptor.valueOf(String.class)));
        System.out.println(convert.get(1));
//        Enhancer
    }

    @Test
    public void test39() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Person person = (Person) applicationContext.getBean("person");
//        System.out.println(person.getName());/**/
        EmailService proxy = (EmailService) applicationContext.getBean("proxy");
        List<String> blockedList = proxy.getBlockedList();
        System.out.println(Arrays.toString(blockedList.toArray()));
    }

}
