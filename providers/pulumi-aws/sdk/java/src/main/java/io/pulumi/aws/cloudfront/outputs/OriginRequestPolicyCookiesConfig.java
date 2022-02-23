// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.outputs;

import io.pulumi.aws.cloudfront.outputs.OriginRequestPolicyCookiesConfigCookies;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class OriginRequestPolicyCookiesConfig {
    private final String cookieBehavior;
    private final @Nullable OriginRequestPolicyCookiesConfigCookies cookies;

    @OutputCustomType.Constructor({"cookieBehavior","cookies"})
    private OriginRequestPolicyCookiesConfig(
        String cookieBehavior,
        @Nullable OriginRequestPolicyCookiesConfigCookies cookies) {
        this.cookieBehavior = Objects.requireNonNull(cookieBehavior);
        this.cookies = cookies;
    }

    public String getCookieBehavior() {
        return this.cookieBehavior;
    }
    public Optional<OriginRequestPolicyCookiesConfigCookies> getCookies() {
        return Optional.ofNullable(this.cookies);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OriginRequestPolicyCookiesConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cookieBehavior;
        private @Nullable OriginRequestPolicyCookiesConfigCookies cookies;

        public Builder() {
    	      // Empty
        }

        public Builder(OriginRequestPolicyCookiesConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cookieBehavior = defaults.cookieBehavior;
    	      this.cookies = defaults.cookies;
        }

        public Builder setCookieBehavior(String cookieBehavior) {
            this.cookieBehavior = Objects.requireNonNull(cookieBehavior);
            return this;
        }

        public Builder setCookies(@Nullable OriginRequestPolicyCookiesConfigCookies cookies) {
            this.cookies = cookies;
            return this;
        }
        public OriginRequestPolicyCookiesConfig build() {
            return new OriginRequestPolicyCookiesConfig(cookieBehavior, cookies);
        }
    }
}
