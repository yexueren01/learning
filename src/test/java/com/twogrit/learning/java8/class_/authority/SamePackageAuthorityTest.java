package com.twogrit.learning.java8.class_.authority;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

//����Ȩ��   ��   ��  ����  ������
//public     ��   ��   ��     ��
//protect    ��   ��   ��     ��  -->�̳пɼ�
//default    ��   ��   ��     ��  -->friendly
//private    ��   ��   ��     ��


//˵����
//        1��ÿ�����뵥Ԫ�����ļ�����������һ��public class
//2��public class�����ƣ�������Сд������������ļ�ͬ����
//        3��һ�����ļ�(*.java)�п��Բ�����public class��
//        ������ʽ�Ĵ��ڵĳ��������������ĳ������׫дһ��class��������Ϊ�����ͬ���ڵ������๤��������
//        ���ǲ�����Ϊ��׫д˵���ĵ����ͻ�����һ������ʵ����Ŀͻ��������ǵ����������ࣩ�������Խ�����п��ܹ�һ��ʱ��֮��    �п��ܻ᳹�׸ı�ԭ�е�����������ȫ�����ɰ汾����ȫ�µİ汾���档
//        4��class��������private��protected���������ڲ���֮�⣩
//        5�������ϣ���Ǹ��κβ���ĳ��class�Ķ��󣬿��Խ���������й��캯�����ó�private�����Ǽ�ʹ����Ҳ�������ɸ���Ķ��󣬾���class��static�ĳ�Ա�����Ժͷ��������԰쵽��

public class SamePackageAuthorityTest {
    @Test
    public void souldNotImportClass(){
        PublicClass publicClass=new PublicClass();
        //should not import class
    }
    @Test
    public void testClass(){
        PublicClass publicClass=new PublicClass();
        DefaultClass defaultClass=new DefaultClass();
    }
    @Test
    public void testMember(){
        PublicClass publicClass=new PublicClass();
        assertThat(publicClass.defaultStr,equalTo("I can visit defaultStr"));
        assertThat(publicClass.publicStr,equalTo("I can visit publicStr"));
        assertThat(publicClass.protectedStr,equalTo("I can visit protectedStr"));
        //can not visit default(default is private),and private
    }

}
