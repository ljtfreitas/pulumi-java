// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.outputs;

import io.pulumi.awsnative.iot.enums.AuthorizerStatus;
import io.pulumi.awsnative.iot.outputs.AuthorizerTag;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetAuthorizerResult {
    private final @Nullable String arn;
    private final @Nullable String authorizerFunctionArn;
    private final @Nullable AuthorizerStatus status;
    private final @Nullable List<AuthorizerTag> tags;
    private final @Nullable String tokenKeyName;
    private final @Nullable Object tokenSigningPublicKeys;

    @OutputCustomType.Constructor({"arn","authorizerFunctionArn","status","tags","tokenKeyName","tokenSigningPublicKeys"})
    private GetAuthorizerResult(
        @Nullable String arn,
        @Nullable String authorizerFunctionArn,
        @Nullable AuthorizerStatus status,
        @Nullable List<AuthorizerTag> tags,
        @Nullable String tokenKeyName,
        @Nullable Object tokenSigningPublicKeys) {
        this.arn = arn;
        this.authorizerFunctionArn = authorizerFunctionArn;
        this.status = status;
        this.tags = tags;
        this.tokenKeyName = tokenKeyName;
        this.tokenSigningPublicKeys = tokenSigningPublicKeys;
    }

    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    public Optional<String> getAuthorizerFunctionArn() {
        return Optional.ofNullable(this.authorizerFunctionArn);
    }
    public Optional<AuthorizerStatus> getStatus() {
        return Optional.ofNullable(this.status);
    }
    public List<AuthorizerTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }
    public Optional<String> getTokenKeyName() {
        return Optional.ofNullable(this.tokenKeyName);
    }
    public Optional<Object> getTokenSigningPublicKeys() {
        return Optional.ofNullable(this.tokenSigningPublicKeys);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAuthorizerResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String authorizerFunctionArn;
        private @Nullable AuthorizerStatus status;
        private @Nullable List<AuthorizerTag> tags;
        private @Nullable String tokenKeyName;
        private @Nullable Object tokenSigningPublicKeys;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAuthorizerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.authorizerFunctionArn = defaults.authorizerFunctionArn;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.tokenKeyName = defaults.tokenKeyName;
    	      this.tokenSigningPublicKeys = defaults.tokenSigningPublicKeys;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setAuthorizerFunctionArn(@Nullable String authorizerFunctionArn) {
            this.authorizerFunctionArn = authorizerFunctionArn;
            return this;
        }

        public Builder setStatus(@Nullable AuthorizerStatus status) {
            this.status = status;
            return this;
        }

        public Builder setTags(@Nullable List<AuthorizerTag> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTokenKeyName(@Nullable String tokenKeyName) {
            this.tokenKeyName = tokenKeyName;
            return this;
        }

        public Builder setTokenSigningPublicKeys(@Nullable Object tokenSigningPublicKeys) {
            this.tokenSigningPublicKeys = tokenSigningPublicKeys;
            return this;
        }
        public GetAuthorizerResult build() {
            return new GetAuthorizerResult(arn, authorizerFunctionArn, status, tags, tokenKeyName, tokenSigningPublicKeys);
        }
    }
}
