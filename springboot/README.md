# spring-boot-xchaset
1.前端传参数校验，使用javax.validation.constraints注解形式校验，如@NotNull等，
并在controller层的VO参数前添加@Valid使校验注解生效，并在参数后紧跟另外的参数
BindingResult ，并在方法中判断如果 result.hasErrors为true,则抛出异常，并将异常中
某些属性通过构造器设置进自定义异常，并在@ExceptionHandler中，并将设置的异常信息
返回到BaseResponse的msg中。返回前端

2.mybatis-generator:generate

3.swagger2

4.@EnableScheduling
  @Scheduled(cron="0 0 4 ? * 6")

5.@profile

6.@JSONField 如果参数和VO对象的值不同可以通过@JSONField进行设置

7.RequestBodyAdvice 如果想对http请求的消息进行提前处理可以通过实现RequestBodyAdvice，并重写方法，栗子：对加密的http信息解密后发送给controller.
  同理：ResponseBodyAdvice 如果要对返回参数进行加密，可实现ResponseBodyAdvice，并实现其中的方法 。栗子：对返回参数进行解密。
  使用@RestControllerAdvice构造切面


  
