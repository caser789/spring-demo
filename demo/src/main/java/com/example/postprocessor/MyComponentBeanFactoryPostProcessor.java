package com.example.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;

public class MyComponentBeanFactoryPostProcessor implements BeanDefinitionRegistryPostProcessor {
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        // scan MyComponent classes
        // for each class
        //   name = clazz.getName()
        //   defi = new RootBeanDefinition()
        //   defi.setName
        //   register to definition map
        // need to register this post processor to xml
    }
}
