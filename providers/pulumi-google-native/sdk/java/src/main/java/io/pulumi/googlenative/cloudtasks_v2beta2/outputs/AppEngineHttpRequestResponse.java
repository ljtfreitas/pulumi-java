// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudtasks_v2beta2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.cloudtasks_v2beta2.outputs.AppEngineRoutingResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class AppEngineHttpRequestResponse {
    /**
     * Task-level setting for App Engine routing. If set, app_engine_routing_override is used for all tasks in the queue, no matter what the setting is for the task-level app_engine_routing.
     * 
     */
    private final AppEngineRoutingResponse appEngineRouting;
    /**
     * HTTP request headers. This map contains the header field names and values. Headers can be set when the task is created. Repeated headers are not supported but a header value can contain commas. Cloud Tasks sets some headers to default values: * `User-Agent`: By default, this header is `"AppEngine-Google; (+http://code.google.com/appengine)"`. This header can be modified, but Cloud Tasks will append `"AppEngine-Google; (+http://code.google.com/appengine)"` to the modified `User-Agent`. If the task has a payload, Cloud Tasks sets the following headers: * `Content-Type`: By default, the `Content-Type` header is set to `"application/octet-stream"`. The default can be overridden by explicitly setting `Content-Type` to a particular media type when the task is created. For example, `Content-Type` can be set to `"application/json"`. * `Content-Length`: This is computed by Cloud Tasks. This value is output only. It cannot be changed. The headers below cannot be set or overridden: * `Host` * `X-Google-*` * `X-AppEngine-*` In addition, Cloud Tasks sets some headers when the task is dispatched, such as headers containing information about the task; see [request headers](https://cloud.google.com/appengine/docs/python/taskqueue/push/creating-handlers#reading_request_headers). These headers are set only when the task is dispatched, so they are not visible when the task is returned in a Cloud Tasks response. Although there is no specific limit for the maximum number of headers or the size, there is a limit on the maximum size of the Task. For more information, see the CreateTask documentation.
     * 
     */
    private final Map<String,String> headers;
    /**
     * The HTTP method to use for the request. The default is POST. The app's request handler for the task's target URL must be able to handle HTTP requests with this http_method, otherwise the task attempt fails with error code 405 (Method Not Allowed). See [Writing a push task request handler](https://cloud.google.com/appengine/docs/java/taskqueue/push/creating-handlers#writing_a_push_task_request_handler) and the App Engine documentation for your runtime on [How Requests are Handled](https://cloud.google.com/appengine/docs/standard/python3/how-requests-are-handled).
     * 
     */
    private final String httpMethod;
    /**
     * Payload. The payload will be sent as the HTTP message body. A message body, and thus a payload, is allowed only if the HTTP method is POST or PUT. It is an error to set a data payload on a task with an incompatible HttpMethod.
     * 
     */
    private final String payload;
    /**
     * The relative URL. The relative URL must begin with "/" and must be a valid HTTP relative URL. It can contain a path and query string arguments. If the relative URL is empty, then the root path "/" will be used. No spaces are allowed, and the maximum length allowed is 2083 characters.
     * 
     */
    private final String relativeUrl;

    @OutputCustomType.Constructor({"appEngineRouting","headers","httpMethod","payload","relativeUrl"})
    private AppEngineHttpRequestResponse(
        AppEngineRoutingResponse appEngineRouting,
        Map<String,String> headers,
        String httpMethod,
        String payload,
        String relativeUrl) {
        this.appEngineRouting = Objects.requireNonNull(appEngineRouting);
        this.headers = Objects.requireNonNull(headers);
        this.httpMethod = Objects.requireNonNull(httpMethod);
        this.payload = Objects.requireNonNull(payload);
        this.relativeUrl = Objects.requireNonNull(relativeUrl);
    }

    /**
     * Task-level setting for App Engine routing. If set, app_engine_routing_override is used for all tasks in the queue, no matter what the setting is for the task-level app_engine_routing.
     * 
     */
    public AppEngineRoutingResponse getAppEngineRouting() {
        return this.appEngineRouting;
    }
    /**
     * HTTP request headers. This map contains the header field names and values. Headers can be set when the task is created. Repeated headers are not supported but a header value can contain commas. Cloud Tasks sets some headers to default values: * `User-Agent`: By default, this header is `"AppEngine-Google; (+http://code.google.com/appengine)"`. This header can be modified, but Cloud Tasks will append `"AppEngine-Google; (+http://code.google.com/appengine)"` to the modified `User-Agent`. If the task has a payload, Cloud Tasks sets the following headers: * `Content-Type`: By default, the `Content-Type` header is set to `"application/octet-stream"`. The default can be overridden by explicitly setting `Content-Type` to a particular media type when the task is created. For example, `Content-Type` can be set to `"application/json"`. * `Content-Length`: This is computed by Cloud Tasks. This value is output only. It cannot be changed. The headers below cannot be set or overridden: * `Host` * `X-Google-*` * `X-AppEngine-*` In addition, Cloud Tasks sets some headers when the task is dispatched, such as headers containing information about the task; see [request headers](https://cloud.google.com/appengine/docs/python/taskqueue/push/creating-handlers#reading_request_headers). These headers are set only when the task is dispatched, so they are not visible when the task is returned in a Cloud Tasks response. Although there is no specific limit for the maximum number of headers or the size, there is a limit on the maximum size of the Task. For more information, see the CreateTask documentation.
     * 
     */
    public Map<String,String> getHeaders() {
        return this.headers;
    }
    /**
     * The HTTP method to use for the request. The default is POST. The app's request handler for the task's target URL must be able to handle HTTP requests with this http_method, otherwise the task attempt fails with error code 405 (Method Not Allowed). See [Writing a push task request handler](https://cloud.google.com/appengine/docs/java/taskqueue/push/creating-handlers#writing_a_push_task_request_handler) and the App Engine documentation for your runtime on [How Requests are Handled](https://cloud.google.com/appengine/docs/standard/python3/how-requests-are-handled).
     * 
     */
    public String getHttpMethod() {
        return this.httpMethod;
    }
    /**
     * Payload. The payload will be sent as the HTTP message body. A message body, and thus a payload, is allowed only if the HTTP method is POST or PUT. It is an error to set a data payload on a task with an incompatible HttpMethod.
     * 
     */
    public String getPayload() {
        return this.payload;
    }
    /**
     * The relative URL. The relative URL must begin with "/" and must be a valid HTTP relative URL. It can contain a path and query string arguments. If the relative URL is empty, then the root path "/" will be used. No spaces are allowed, and the maximum length allowed is 2083 characters.
     * 
     */
    public String getRelativeUrl() {
        return this.relativeUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppEngineHttpRequestResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppEngineRoutingResponse appEngineRouting;
        private Map<String,String> headers;
        private String httpMethod;
        private String payload;
        private String relativeUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(AppEngineHttpRequestResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appEngineRouting = defaults.appEngineRouting;
    	      this.headers = defaults.headers;
    	      this.httpMethod = defaults.httpMethod;
    	      this.payload = defaults.payload;
    	      this.relativeUrl = defaults.relativeUrl;
        }

        public Builder setAppEngineRouting(AppEngineRoutingResponse appEngineRouting) {
            this.appEngineRouting = Objects.requireNonNull(appEngineRouting);
            return this;
        }

        public Builder setHeaders(Map<String,String> headers) {
            this.headers = Objects.requireNonNull(headers);
            return this;
        }

        public Builder setHttpMethod(String httpMethod) {
            this.httpMethod = Objects.requireNonNull(httpMethod);
            return this;
        }

        public Builder setPayload(String payload) {
            this.payload = Objects.requireNonNull(payload);
            return this;
        }

        public Builder setRelativeUrl(String relativeUrl) {
            this.relativeUrl = Objects.requireNonNull(relativeUrl);
            return this;
        }
        public AppEngineHttpRequestResponse build() {
            return new AppEngineHttpRequestResponse(appEngineRouting, headers, httpMethod, payload, relativeUrl);
        }
    }
}
