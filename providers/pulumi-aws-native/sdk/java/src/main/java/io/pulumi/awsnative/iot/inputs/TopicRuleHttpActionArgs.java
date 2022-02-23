// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.awsnative.iot.inputs.TopicRuleHttpActionHeaderArgs;
import io.pulumi.awsnative.iot.inputs.TopicRuleHttpAuthorizationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TopicRuleHttpActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final TopicRuleHttpActionArgs Empty = new TopicRuleHttpActionArgs();

    @InputImport(name="auth")
        private final @Nullable Input<TopicRuleHttpAuthorizationArgs> auth;

    public Input<TopicRuleHttpAuthorizationArgs> getAuth() {
        return this.auth == null ? Input.empty() : this.auth;
    }

    @InputImport(name="confirmationUrl")
        private final @Nullable Input<String> confirmationUrl;

    public Input<String> getConfirmationUrl() {
        return this.confirmationUrl == null ? Input.empty() : this.confirmationUrl;
    }

    @InputImport(name="headers")
        private final @Nullable Input<List<TopicRuleHttpActionHeaderArgs>> headers;

    public Input<List<TopicRuleHttpActionHeaderArgs>> getHeaders() {
        return this.headers == null ? Input.empty() : this.headers;
    }

    @InputImport(name="url", required=true)
        private final Input<String> url;

    public Input<String> getUrl() {
        return this.url;
    }

    public TopicRuleHttpActionArgs(
        @Nullable Input<TopicRuleHttpAuthorizationArgs> auth,
        @Nullable Input<String> confirmationUrl,
        @Nullable Input<List<TopicRuleHttpActionHeaderArgs>> headers,
        Input<String> url) {
        this.auth = auth;
        this.confirmationUrl = confirmationUrl;
        this.headers = headers;
        this.url = Objects.requireNonNull(url, "expected parameter 'url' to be non-null");
    }

    private TopicRuleHttpActionArgs() {
        this.auth = Input.empty();
        this.confirmationUrl = Input.empty();
        this.headers = Input.empty();
        this.url = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleHttpActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<TopicRuleHttpAuthorizationArgs> auth;
        private @Nullable Input<String> confirmationUrl;
        private @Nullable Input<List<TopicRuleHttpActionHeaderArgs>> headers;
        private Input<String> url;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleHttpActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auth = defaults.auth;
    	      this.confirmationUrl = defaults.confirmationUrl;
    	      this.headers = defaults.headers;
    	      this.url = defaults.url;
        }

        public Builder setAuth(@Nullable Input<TopicRuleHttpAuthorizationArgs> auth) {
            this.auth = auth;
            return this;
        }

        public Builder setAuth(@Nullable TopicRuleHttpAuthorizationArgs auth) {
            this.auth = Input.ofNullable(auth);
            return this;
        }

        public Builder setConfirmationUrl(@Nullable Input<String> confirmationUrl) {
            this.confirmationUrl = confirmationUrl;
            return this;
        }

        public Builder setConfirmationUrl(@Nullable String confirmationUrl) {
            this.confirmationUrl = Input.ofNullable(confirmationUrl);
            return this;
        }

        public Builder setHeaders(@Nullable Input<List<TopicRuleHttpActionHeaderArgs>> headers) {
            this.headers = headers;
            return this;
        }

        public Builder setHeaders(@Nullable List<TopicRuleHttpActionHeaderArgs> headers) {
            this.headers = Input.ofNullable(headers);
            return this;
        }

        public Builder setUrl(Input<String> url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }

        public Builder setUrl(String url) {
            this.url = Input.of(Objects.requireNonNull(url));
            return this;
        }
        public TopicRuleHttpActionArgs build() {
            return new TopicRuleHttpActionArgs(auth, confirmationUrl, headers, url);
        }
    }
}
