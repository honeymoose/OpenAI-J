# Rets-Io

The Rets-Io RETS Client - Java is a library used to access data on RETS compliant servers.

## Links and related projects

| Project          | URL                                                                        | NOTE                   | 
|------------------|----------------------------------------------------------------------------|------------------------|
| jrets            | [https://github.com/jpfielding/jrets](https://github.com/jpfielding/jrets) | fork from this proejct |
| CART RETS client | [http://cart.sourceforge.net/](http://cart.sourceforge.net/)               | Init submit form 2004  |

# 公众平台

我们建议您通过社区论坛来和我们进行沟通，请关注我们公众平台上的账号

## 微信公众号

![](https://cdn.ossez.com/img/cwikius/cwikius-qr-wechat-search-w400.png)

## 头条号

我们也在头条号上创建了我们的公众号，请扫描下面的 QR 关注我们的头条号。

![](https://cdn.ossez.com/img/cwikius/cwikus-qr-toutiao.png)

## 知乎

请关注我们的知乎：https://www.zhihu.com/people/huyuchengus

![Maven Central](https://img.shields.io/maven-central/v/com.theokanning.openai-gpt3-java/client?color=blue)

> ⚠️The [Answers](https://help.openai.com/en/articles/6233728-answers-transition-guide),
>[Classifications](https://help.openai.com/en/articles/6272941-classifications-transition-guide),
>and [Searches](https://help.openai.com/en/articles/6272952-search-transition-guide) APIs are deprecated,
>and will stop working on December 3rd, 2022.

> ⚠️OpenAI has deprecated all Engine-based APIs. See [Deprecated Endpoints](https://github.com/TheoKanning/openai-java#deprecated-endpoints) below for more info.

# OpenAI-Java
Java libraries for using OpenAI's GPT-3 api.

Includes the following artifacts:
- `api` : request/response POJOs for the GPT-3 engine, completion, and search APIs.
- `client` : a basic retrofit client for the GPT-3 endpoints, includes the `api` module

as well as an example project using the client.

## Supported APIs
- [Models](https://beta.openai.com/docs/api-reference/models)
- [Completions](https://beta.openai.com/docs/api-reference/completions)
- [Edits](https://beta.openai.com/docs/api-reference/edits)
- [Embeddings](https://beta.openai.com/docs/api-reference/embeddings)
- [Files](https://beta.openai.com/docs/api-reference/files)
- [Fine-tunes](https://beta.openai.com/docs/api-reference/fine-tunes)
- [Moderations](https://beta.openai.com/docs/api-reference/moderations)

#### Deprecated by OpenAI
- [Searches](https://beta.openai.com/docs/api-reference/searches)
- [Classifications](https://beta.openai.com/docs/api-reference/classifications)
- [Answers](https://beta.openai.com/docs/api-reference/answers)
- [Engines](https://beta.openai.com/docs/api-reference/engines)

## Usage

### Importing into a gradle project
`implementation 'com.theokanning.openai-gpt3-java:api:<version>'`  
or   
`implementation 'com.theokanning.openai-gpt3-java:client:<version>'`

### Using OpenAiService
If you're looking for the fastest solution, import the `client` and use [OpenAiService](client/src/main/java/com/theokanning/openai/OpenAiService.java).
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
If you're using retrofit, you can import the `client` module and use the [OpenAiApi](client/src/main/java/com/theokanning/openai/OpenAiApi.java).  
You'll have to add your auth token as a header (see [AuthenticationInterceptor](client/src/main/java/com/theokanning/openai/AuthenticationInterceptor.java))
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
For example, instead of using `v1/engines/{engine_id}/completions`, switch to `v1/completions` and specify the model in the `CompletionRequest`.
The code includes upgrade instructions for all deprecated endpoints.

I won't remove the old endpoints from this library until OpenAI shuts them down.

## License
Published under the MIT License
## License

[OpenAI-J is licensed under the MIT License](https://github.com/honeymoose/openai-j/blob/main/LICENSE)
