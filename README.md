# OpenAI-J

<p align="center">
    <a href="https://github.com/honeymoose">
        <img height=85 src="https://avatars1.githubusercontent.com/u/45009982?s=200&v=4">
    </a>
    <br>We build this project by use OpenJ9 and JDK 11.
</p>


Java libraries for using OpenAI's GPT-3 api.

We forked this API from:  https://github.com/TheoKanning/openai-java/.

The major reason we rebuild this API was OpenAI-JAVA include lombok, we think it is better build this in plain java
code.

## Deprecated

The [Answers](https://help.openai.com/en/articles/6233728-answers-transition-guide),
[Classifications](https://help.openai.com/en/articles/6272941-classifications-transition-guide),
and [Searches](https://help.openai.com/en/articles/6272952-search-transition-guide) APIs are deprecated, and will stop
working on December 3rd, 2022.

️OpenAI has deprecated all Engine-based APIs.
See [Deprecated Endpoints](https://github.com/TheoKanning/openai-java#deprecated-endpoints) below for more info.

# 联系方式

请使用下面的联系方式和我们联系。

* [社区和讨论](https://www.ossez.com/tag/chat-gpt)

| 联系方式名称           | 联系方式                                          |
|------------------|-----------------------------------------------|
| 电子邮件（Email）      | [yhu@ossez.com](mailto:yhu@ossez.com)         |
| QQ 或微信（WeChat）   | 103899765                                     |
| QQ 交流群           | 15186112                                      |
| 社区论坛 （Community） | https://www.ossez.com/c/computer-technology/7 |

# 公众平台

我们建议您通过社区论坛来和我们进行沟通，请关注我们公众平台上的账号

## 微信公众号

![](https://cdn.ossez.com/img/cwikius/cwikius-qr-wechat-search-w400.png)

## 头条号

我们也在头条号上创建了我们的公众号，请扫描下面的 QR 关注我们的头条号。

![](https://cdn.ossez.com/img/cwikius/cwikus-qr-toutiao.png)

## 知乎

请关注我们的知乎：https://www.zhihu.com/people/huyuchengus

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

All the [example](example/src/main/java/example/OpenAiApiExample.java) project requires is your OpenAI api token

```
export OPENAI_TOKEN="sk-XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX"
./gradlew example:run
```

## Deprecated Endpoints

OpenAI has deprecated engine-based endpoints in favor of model-based endpoints.
For example, instead of using `v1/engines/{engine_id}/completions`, switch to `v1/completions` and specify the model in
the `CompletionRequest`.
The code includes upgrade instructions for all deprecated endpoints.

I won't remove the old endpoints from this library until OpenAI shuts them down.

#FAQ

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

# License
[OpenAI-J is licensed under the MIT License](https://github.com/honeymoose/openai-j/blob/main/LICENSE)
