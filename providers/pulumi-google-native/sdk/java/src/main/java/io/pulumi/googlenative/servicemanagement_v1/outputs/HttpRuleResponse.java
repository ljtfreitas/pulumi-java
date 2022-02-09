// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.servicemanagement_v1.outputs.CustomHttpPatternResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class HttpRuleResponse {
    private final List<HttpRuleResponse> additionalBindings;
    private final String body;
    private final CustomHttpPatternResponse custom;
    private final String delete;
    private final String get;
    private final String patch;
    private final String post;
    private final String put;
    private final String responseBody;
    private final String selector;

    @OutputCustomType.Constructor({"additionalBindings","body","custom","delete","get","patch","post","put","responseBody","selector"})
    private HttpRuleResponse(
        List<HttpRuleResponse> additionalBindings,
        String body,
        CustomHttpPatternResponse custom,
        String delete,
        String get,
        String patch,
        String post,
        String put,
        String responseBody,
        String selector) {
        this.additionalBindings = Objects.requireNonNull(additionalBindings);
        this.body = Objects.requireNonNull(body);
        this.custom = Objects.requireNonNull(custom);
        this.delete = Objects.requireNonNull(delete);
        this.get = Objects.requireNonNull(get);
        this.patch = Objects.requireNonNull(patch);
        this.post = Objects.requireNonNull(post);
        this.put = Objects.requireNonNull(put);
        this.responseBody = Objects.requireNonNull(responseBody);
        this.selector = Objects.requireNonNull(selector);
    }

    public List<HttpRuleResponse> getAdditionalBindings() {
        return this.additionalBindings;
    }
    public String getBody() {
        return this.body;
    }
    public CustomHttpPatternResponse getCustom() {
        return this.custom;
    }
    public String getDelete() {
        return this.delete;
    }
    public String getGet() {
        return this.get;
    }
    public String getPatch() {
        return this.patch;
    }
    public String getPost() {
        return this.post;
    }
    public String getPut() {
        return this.put;
    }
    public String getResponseBody() {
        return this.responseBody;
    }
    public String getSelector() {
        return this.selector;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<HttpRuleResponse> additionalBindings;
        private String body;
        private CustomHttpPatternResponse custom;
        private String delete;
        private String get;
        private String patch;
        private String post;
        private String put;
        private String responseBody;
        private String selector;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalBindings = defaults.additionalBindings;
    	      this.body = defaults.body;
    	      this.custom = defaults.custom;
    	      this.delete = defaults.delete;
    	      this.get = defaults.get;
    	      this.patch = defaults.patch;
    	      this.post = defaults.post;
    	      this.put = defaults.put;
    	      this.responseBody = defaults.responseBody;
    	      this.selector = defaults.selector;
        }

        public Builder setAdditionalBindings(List<HttpRuleResponse> additionalBindings) {
            this.additionalBindings = Objects.requireNonNull(additionalBindings);
            return this;
        }

        public Builder setBody(String body) {
            this.body = Objects.requireNonNull(body);
            return this;
        }

        public Builder setCustom(CustomHttpPatternResponse custom) {
            this.custom = Objects.requireNonNull(custom);
            return this;
        }

        public Builder setDelete(String delete) {
            this.delete = Objects.requireNonNull(delete);
            return this;
        }

        public Builder setGet(String get) {
            this.get = Objects.requireNonNull(get);
            return this;
        }

        public Builder setPatch(String patch) {
            this.patch = Objects.requireNonNull(patch);
            return this;
        }

        public Builder setPost(String post) {
            this.post = Objects.requireNonNull(post);
            return this;
        }

        public Builder setPut(String put) {
            this.put = Objects.requireNonNull(put);
            return this;
        }

        public Builder setResponseBody(String responseBody) {
            this.responseBody = Objects.requireNonNull(responseBody);
            return this;
        }

        public Builder setSelector(String selector) {
            this.selector = Objects.requireNonNull(selector);
            return this;
        }

        public HttpRuleResponse build() {
            return new HttpRuleResponse(additionalBindings, body, custom, delete, get, patch, post, put, responseBody, selector);
        }
    }
}