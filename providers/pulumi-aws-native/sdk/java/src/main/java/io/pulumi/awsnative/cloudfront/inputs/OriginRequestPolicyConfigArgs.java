// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.inputs;

import io.pulumi.awsnative.cloudfront.inputs.OriginRequestPolicyCookiesConfigArgs;
import io.pulumi.awsnative.cloudfront.inputs.OriginRequestPolicyHeadersConfigArgs;
import io.pulumi.awsnative.cloudfront.inputs.OriginRequestPolicyQueryStringsConfigArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OriginRequestPolicyConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final OriginRequestPolicyConfigArgs Empty = new OriginRequestPolicyConfigArgs();

    @Import(name="comment")
      private final @Nullable Output<String> comment;

    public Output<String> getComment() {
        return this.comment == null ? Output.empty() : this.comment;
    }

    @Import(name="cookiesConfig", required=true)
      private final Output<OriginRequestPolicyCookiesConfigArgs> cookiesConfig;

    public Output<OriginRequestPolicyCookiesConfigArgs> getCookiesConfig() {
        return this.cookiesConfig;
    }

    @Import(name="headersConfig", required=true)
      private final Output<OriginRequestPolicyHeadersConfigArgs> headersConfig;

    public Output<OriginRequestPolicyHeadersConfigArgs> getHeadersConfig() {
        return this.headersConfig;
    }

    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    @Import(name="queryStringsConfig", required=true)
      private final Output<OriginRequestPolicyQueryStringsConfigArgs> queryStringsConfig;

    public Output<OriginRequestPolicyQueryStringsConfigArgs> getQueryStringsConfig() {
        return this.queryStringsConfig;
    }

    public OriginRequestPolicyConfigArgs(
        @Nullable Output<String> comment,
        Output<OriginRequestPolicyCookiesConfigArgs> cookiesConfig,
        Output<OriginRequestPolicyHeadersConfigArgs> headersConfig,
        Output<String> name,
        Output<OriginRequestPolicyQueryStringsConfigArgs> queryStringsConfig) {
        this.comment = comment;
        this.cookiesConfig = Objects.requireNonNull(cookiesConfig, "expected parameter 'cookiesConfig' to be non-null");
        this.headersConfig = Objects.requireNonNull(headersConfig, "expected parameter 'headersConfig' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.queryStringsConfig = Objects.requireNonNull(queryStringsConfig, "expected parameter 'queryStringsConfig' to be non-null");
    }

    private OriginRequestPolicyConfigArgs() {
        this.comment = Output.empty();
        this.cookiesConfig = Output.empty();
        this.headersConfig = Output.empty();
        this.name = Output.empty();
        this.queryStringsConfig = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OriginRequestPolicyConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> comment;
        private Output<OriginRequestPolicyCookiesConfigArgs> cookiesConfig;
        private Output<OriginRequestPolicyHeadersConfigArgs> headersConfig;
        private Output<String> name;
        private Output<OriginRequestPolicyQueryStringsConfigArgs> queryStringsConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(OriginRequestPolicyConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comment = defaults.comment;
    	      this.cookiesConfig = defaults.cookiesConfig;
    	      this.headersConfig = defaults.headersConfig;
    	      this.name = defaults.name;
    	      this.queryStringsConfig = defaults.queryStringsConfig;
        }

        public Builder comment(@Nullable Output<String> comment) {
            this.comment = comment;
            return this;
        }

        public Builder comment(@Nullable String comment) {
            this.comment = Output.ofNullable(comment);
            return this;
        }

        public Builder cookiesConfig(Output<OriginRequestPolicyCookiesConfigArgs> cookiesConfig) {
            this.cookiesConfig = Objects.requireNonNull(cookiesConfig);
            return this;
        }

        public Builder cookiesConfig(OriginRequestPolicyCookiesConfigArgs cookiesConfig) {
            this.cookiesConfig = Output.of(Objects.requireNonNull(cookiesConfig));
            return this;
        }

        public Builder headersConfig(Output<OriginRequestPolicyHeadersConfigArgs> headersConfig) {
            this.headersConfig = Objects.requireNonNull(headersConfig);
            return this;
        }

        public Builder headersConfig(OriginRequestPolicyHeadersConfigArgs headersConfig) {
            this.headersConfig = Output.of(Objects.requireNonNull(headersConfig));
            return this;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder queryStringsConfig(Output<OriginRequestPolicyQueryStringsConfigArgs> queryStringsConfig) {
            this.queryStringsConfig = Objects.requireNonNull(queryStringsConfig);
            return this;
        }

        public Builder queryStringsConfig(OriginRequestPolicyQueryStringsConfigArgs queryStringsConfig) {
            this.queryStringsConfig = Output.of(Objects.requireNonNull(queryStringsConfig));
            return this;
        }
        public OriginRequestPolicyConfigArgs build() {
            return new OriginRequestPolicyConfigArgs(comment, cookiesConfig, headersConfig, name, queryStringsConfig);
        }
    }
}
