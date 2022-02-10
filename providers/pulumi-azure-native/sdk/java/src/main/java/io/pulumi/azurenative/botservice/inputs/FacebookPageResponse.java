// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FacebookPageResponse extends io.pulumi.resources.InvokeArgs {

    public static final FacebookPageResponse Empty = new FacebookPageResponse();

    @InputImport(name="accessToken")
    private final @Nullable String accessToken;

    public Optional<String> getAccessToken() {
        return this.accessToken == null ? Optional.empty() : Optional.ofNullable(this.accessToken);
    }

    @InputImport(name="id", required=true)
    private final String id;

    public String getId() {
        return this.id;
    }

    public FacebookPageResponse(
        @Nullable String accessToken,
        String id) {
        this.accessToken = accessToken;
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
    }

    private FacebookPageResponse() {
        this.accessToken = null;
        this.id = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FacebookPageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String accessToken;
        private String id;

        public Builder() {
    	      // Empty
        }

        public Builder(FacebookPageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessToken = defaults.accessToken;
    	      this.id = defaults.id;
        }

        public Builder setAccessToken(@Nullable String accessToken) {
            this.accessToken = accessToken;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public FacebookPageResponse build() {
            return new FacebookPageResponse(accessToken, id);
        }
    }
}