# OpenAI-J

<p align="center">
    <a href="https://github.com/honeymoose">
        <img height=85 src="https://avatars1.githubusercontent.com/u/45009982?s=200&v=4">
    </a>
    <br>This project builds by JDK 17 and OpenJ9 for JVM.
</p>

* [社区和讨论 (community)](https://www.ossez.com/tag/chat-gpt)

Java libraries for using OpenAI's GPT-3 api.

We forked this API from:  https://github.com/TheoKanning/openai-java/.

The major reason we rebuild this API was OpenAI-JAVA include lombok, we think it is better build this in plain java
code.

# 联系方式

请使用下面的联系方式和我们联系。

* [社区和讨论](https://www.ossez.com/tag/chat-gpt)

| 联系方式名称           | 联系方式                                  |
|------------------|---------------------------------------|
| 电子邮件（Email）      | [yhu@ossez.com](mailto:yhu@ossez.com) |
| QQ 或微信（WeChat）   | 103899765                             |
| QQ 交流群           | 15186112                              |
| 社区论坛 （Community） | https://www.ossez.com/tag/chat-gpt    |

# 公众平台

我们建议您通过社区论坛来和我们进行沟通，请关注我们公众平台上的账号

## 微信公众号

![](https://cdn.ossez.com/img/sharkfly/sharkfly-qr-wechat-search-w400.png)

关注公众号以后，可以通过向这个公众号发送消息来测试 ChatGPT 的微信消息集成功能。

<img src="https://cdn.ossez.com/discourse-uploads/original/2X/5/5f1cf67c4349029be682a30268df06d77202d510.png"  width="600">

有关更多 ChatGPT 的讨论，请访问我们的 [ChatGPT 社区](https://www.ossez.com/tag/chat-gpt)。

## 头条号

我们也在头条号上创建了我们的公众号，请扫描下面的 QR 关注我们的头条号。

![](https://cdn.ossez.com/img/cwikius/cwikus-qr-toutiao.png)

## 知乎

请关注我们的知乎：https://www.zhihu.com/people/huyuchengus

# Deprecated OpenAI API Endpoint

* [Answers](https://help.openai.com/en/articles/6233728-answers-transition-guide),
* [Classifications](https://help.openai.com/en/articles/6272941-classifications-transition-guide),
* [Searches](https://help.openai.com/en/articles/6272952-search-transition-guide) 
 
APIs are deprecated, and will stop working on December 3rd, 2022.

️OpenAI has deprecated all Engine-based APIs.

See [Deprecated Endpoints](https://github.com/TheoKanning/openai-java#deprecated-endpoints) below for more info.

# How To Use

Includes the following artifacts:

- `api` : request/response POJOs for the GPT-3 engine, completion, and search APIs.
- `client` : a basic retrofit client for the GPT-3 endpoints, includes the `api` module

as well as an example project using the client.

## Usage

### Importing into a gradle project

`implementation 'com.theokanning.openai-gpt3-java:api:<version>'`  
or   
`implementation 'com.theokanning.openai-gpt3-java:client:<version>'`

### Using OpenAiService

If you're looking for the fastest solution, import the `client` and
use [OpenAiService](client/src/main/java/com/theokanning/openai/OpenAiService.java).

```
OpenAiService service = new OpenAiService("your_token");
CompletionRequest completionRequest = CompletionRequest.builder()
        .prompt("Somebody once told me the world is gonna roll me")
        .model("ada")
        .echo(true)
        .build();
service.createCompletion(completionRequest).getChoices().forEach(System.out::println);
```

### Using OpenAiApi Retrofit client

If you're using retrofit, you can import the `client` module and use
the [OpenAiApi](client/src/main/java/com/theokanning/openai/OpenAiApi.java).  
You'll have to add your auth token as a header (
see [AuthenticationInterceptor](client/src/main/java/com/theokanning/openai/AuthenticationInterceptor.java))
and set your converter factory to use snake case and only include non-null fields.

### Using data classes only

If you want to make your own client, just import the POJOs from the `api` module.  
Your client will need to use snake case to work with the OpenAI API.

## Running the example project

There is an [example](https://github.com/honeymoose/OpenAI-J/blob/main/example/src/main/java/com/ossez/openai/example/OpenAiApiExample.java) project 
with a OpenAiApiExample file contain main function to run.

Also, you can run all tests by JUnit too.

[OpenAI-J 如何进行测试](https://www.ossez.com/t/openai-j/14338)

## Deprecated Endpoints

OpenAI has deprecated engine-based endpoints in favor of model-based endpoints.
For example, instead of using `v1/engines/{engine_id}/completions`, switch to `v1/completions` and specify the model in
the `CompletionRequest`.
The code includes upgrade instructions for all deprecated endpoints.

I won't remove the old endpoints from this library until OpenAI shuts them down.

# FAQ （常见问题）

## Supported APIs

- [Models](https://beta.openai.com/docs/api-reference/models)
- [Completions](https://beta.openai.com/docs/api-reference/completions)
- [Edits](https://beta.openai.com/docs/api-reference/edits)
- [Embeddings](https://beta.openai.com/docs/api-reference/embeddings)
- [Files](https://beta.openai.com/docs/api-reference/files)
- [Fine-tunes](https://beta.openai.com/docs/api-reference/fine-tunes)
- [Moderations](https://beta.openai.com/docs/api-reference/moderations)

## Deprecated by OpenAI

- [Searches](https://beta.openai.com/docs/api-reference/searches)
- [Classifications](https://beta.openai.com/docs/api-reference/classifications)
- [Answers](https://beta.openai.com/docs/api-reference/answers)
- [Engines](https://beta.openai.com/docs/api-reference/engines)


# License（许可证）

[OpenAI-J is licensed under the MIT License](https://github.com/honeymoose/openai-j/blob/main/LICENSE)
