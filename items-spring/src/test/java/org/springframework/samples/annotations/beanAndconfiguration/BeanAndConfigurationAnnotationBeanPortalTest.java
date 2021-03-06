package org.springframework.samples.annotations.beanAndconfiguration;

import org.junit.Test;
import org.springframework.samples.testbase.TestBase;
import org.springframework.samples.utils.ShowReferencesUtil;

public class BeanAndConfigurationAnnotationBeanPortalTest extends TestBase {
    public BeanAndConfigurationAnnotationBeanPortalTest() {
        super("spring-annotation-component-scan.xml");
    }

    @Test
    public void testBeanAndConfigurationAnnotation() throws Exception {
        SimpleBeanOne simpleBeanOne = (SimpleBeanOne) getBean("simpleBeanOne");
        SimpleBeanOne simpleBeanOne1 = getBean(SimpleBeanOne.class);
        ShowReferencesUtil.showReferences(simpleBeanOne, simpleBeanOne1);
    }
}