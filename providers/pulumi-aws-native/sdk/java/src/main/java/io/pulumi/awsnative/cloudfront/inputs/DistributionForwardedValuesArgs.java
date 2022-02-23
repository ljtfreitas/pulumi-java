// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.inputs;

import io.pulumi.awsnative.cloudfront.inputs.DistributionCookiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DistributionForwardedValuesArgs extends io.pulumi.resources.ResourceArgs {

    public static final DistributionForwardedValuesArgs Empty = new DistributionForwardedValuesArgs();

    @InputImport(name="cookies")
        private final @Nullable Input<DistributionCookiesArgs> cookies;

    public Input<DistributionCookiesArgs> getCookies() {
        return this.cookies == null ? Input.empty() : this.cookies;
    }

    @InputImport(name="headers")
        private final @Nullable Input<List<String>> headers;

    public Input<List<String>> getHeaders() {
        return this.headers == null ? Input.empty() : this.headers;
    }

    @InputImport(name="queryString", required=true)
        private final Input<Boolean> queryString;

    public Input<Boolean> getQueryString() {
        return this.queryString;
    }

    @InputImport(name="queryStringCacheKeys")
        private final @Nullable Input<List<String>> queryStringCacheKeys;

    public Input<List<String>> getQueryStringCacheKeys() {
        return this.queryStringCacheKeys == null ? Input.empty() : this.queryStringCacheKeys;
    }

    public DistributionForwardedValuesArgs(
        @Nullable Input<DistributionCookiesArgs> cookies,
        @Nullable Input<List<String>> headers,
        Input<Boolean> queryString,
        @Nullable Input<List<String>> queryStringCacheKeys) {
        this.cookies = cookies;
        this.headers = headers;
        this.queryString = Objects.requireNonNull(queryString, "expected parameter 'queryString' to be non-null");
        this.queryStringCacheKeys = queryStringCacheKeys;
    }

    private DistributionForwardedValuesArgs() {
        this.cookies = Input.empty();
        this.headers = Input.empty();
        this.queryString = Input.empty();
        this.queryStringCacheKeys = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionForwardedValuesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DistributionCookiesArgs> cookies;
        private @Nullable Input<List<String>> headers;
        private Input<Boolean> queryString;
        private @Nullable Input<List<String>> queryStringCacheKeys;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionForwardedValuesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cookies = defaults.cookies;
    	      this.headers = defaults.headers;
    	      this.queryString = defaults.queryString;
    	      this.queryStringCacheKeys = defaults.queryStringCacheKeys;
        }

        public Builder setCookies(@Nullable Input<DistributionCookiesArgs> cookies) {
            this.cookies = cookies;
            return this;
        }

        public Builder setCookies(@Nullable DistributionCookiesArgs cookies) {
            this.cookies = Input.ofNullable(cookies);
            return this;
        }

        public Builder setHeaders(@Nullable Input<List<String>> headers) {
            this.headers = headers;
            return this;
        }

        public Builder setHeaders(@Nullable List<String> headers) {
            this.headers = Input.ofNullable(headers);
            return this;
        }

        public Builder setQueryString(Input<Boolean> queryString) {
            this.queryString = Objects.requireNonNull(queryString);
            return this;
        }

        public Builder setQueryString(Boolean queryString) {
            this.queryString = Input.of(Objects.requireNonNull(queryString));
            return this;
        }

        public Builder setQueryStringCacheKeys(@Nullable Input<List<String>> queryStringCacheKeys) {
            this.queryStringCacheKeys = queryStringCacheKeys;
            return this;
        }

        public Builder setQueryStringCacheKeys(@Nullable List<String> queryStringCacheKeys) {
            this.queryStringCacheKeys = Input.ofNullable(queryStringCacheKeys);
            return this;
        }
        public DistributionForwardedValuesArgs build() {
            return new DistributionForwardedValuesArgs(cookies, headers, queryString, queryStringCacheKeys);
        }
    }
}
