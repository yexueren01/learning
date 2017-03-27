//package com.twogrit.learning.jdk8.authority;
//
//import com.twogirt.learning.jdk8.authority.PublicClass;
//import org.junit.Test;
//
//import static org.hamcrest.core.IsEqual.equalTo;
//import static org.junit.Assert.assertThat;
//
////访问权限   类   包  子类  其他包
////public     ∨   ∨   ∨     ∨
////protect    ∨   ∨   ∨     ×  -->继承可见
////default    ∨   ∨   ×     ×  -->friendly
////private    ∨   ×   ×     ×
//
//
////说明：
////        1、每个编译单元（类文件）都仅能有一个public class
////2、public class的名称（包含大小写）必须和其类文件同名。
////        3、一个类文件(*.java)中可以不存在public class。
////        这种形式的存在的场景：如果我们在某个包内撰写一个class，仅仅是为了配合同包内的其他类工作，而且
////        我们不想再为了撰写说明文档给客户（不一定是现实意义的客户，可能是调用这个类的类）看而伤脑筋，而且有可能过一段时间之后    有可能会彻底改变原有的做法，并完全舍弃旧版本，以全新的版本代替。
////        4、class不可以是private和protected。（除了内部类之外）
////        5、如果不希望那个任何产生某个class的对象，可以将该类得所有构造函数设置成private。但是即使这样也可以生成该类的对象，就是class的static的成员（属性和方法）可以办到。
//
//public class SamePackageAuthorityTest {
//    @Test
//    public void souldNotImportClass(){
//        PublicClass publicClass=new PublicClass();
//        //should not import class
//    }
//    @Test
//    public void testClass(){
//        PublicClass publicClass=new PublicClass();
//        DefaultClass defaultClass=new DefaultClass();
//    }
//    @Test
//    public void testMember(){
//        PublicClass publicClass=new PublicClass();
//        assertThat(publicClass.defaultStr,equalTo("I can visit defaultStr"));
//        assertThat(publicClass.publicStr,equalTo("I can visit publicStr"));
//        assertThat(publicClass.protectedStr,equalTo("I can visit protectedStr"));
//        //can not visit default(default is private),and private
//    }
//
//}
