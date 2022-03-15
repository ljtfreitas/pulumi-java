// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.aws.cloudfront.inputs.OriginRequestPolicyCookiesConfigCookiesGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OriginRequestPolicyCookiesConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final OriginRequestPolicyCookiesConfigGetArgs Empty = new OriginRequestPolicyCookiesConfigGetArgs();

    @Import(name="cookieBehavior", required=true)
      private final Output<String> cookieBehavior;

    public Output<String> getCookieBehavior() {
        return this.cookieBehavior;
    }

    @Import(name="cookies")
      private final @Nullable Output<OriginRequestPolicyCookiesConfigCookiesGetArgs> cookies;

    public Output<OriginRequestPolicyCookiesConfigCookiesGetArgs> getCookies() {
        return this.cookies == null ? Output.empty() : this.cookies;
    }

    public OriginRequestPolicyCookiesConfigGetArgs(
        Output<String> cookieBehavior,
        @Nullable Output<OriginRequestPolicyCookiesConfigCookiesGetArgs> cookies) {
        this.cookieBehavior = Objects.requireNonNull(cookieBehavior, "expected parameter 'cookieBehavior' to be non-null");
        this.cookies = cookies;
    }

    private OriginRequestPolicyCookiesConfigGetArgs() {
        this.cookieBehavior = Output.empty();
        this.cookies = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OriginRequestPolicyCookiesConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> cookieBehavior;
        private @Nullable Output<OriginRequestPolicyCookiesConfigCookiesGetArgs> cookies;

        public Builder() {
    	      // Empty
        }

        public Builder(OriginRequestPolicyCookiesConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cookieBehavior = defaults.cookieBehavior;
    	      this.cookies = defaults.cookies;
        }

        public Builder cookieBehavior(Output<String> cookieBehavior) {
            this.cookieBehavior = Objects.requireNonNull(cookieBehavior);
            return this;
        }

        public Builder cookieBehavior(String cookieBehavior) {
            this.cookieBehavior = Output.of(Objects.requireNonNull(cookieBehavior));
            return this;
        }

        public Builder cookies(@Nullable Output<OriginRequestPolicyCookiesConfigCookiesGetArgs> cookies) {
            this.cookies = cookies;
            return this;
        }

        public Builder cookies(@Nullable OriginRequestPolicyCookiesConfigCookiesGetArgs cookies) {
            this.cookies = Output.ofNullable(cookies);
            return this;
        }
        public OriginRequestPolicyCookiesConfigGetArgs build() {
            return new OriginRequestPolicyCookiesConfigGetArgs(cookieBehavior, cookies);
        }
    }
}
