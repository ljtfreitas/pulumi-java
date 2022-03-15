// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kms.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSecretSecret extends io.pulumi.resources.InvokeArgs {

    public static final GetSecretSecret Empty = new GetSecretSecret();

    @Import(name="context")
      private final @Nullable Map<String,String> context;

    public Map<String,String> getContext() {
        return this.context == null ? Map.of() : this.context;
    }

    @Import(name="grantTokens")
      private final @Nullable List<String> grantTokens;

    public List<String> getGrantTokens() {
        return this.grantTokens == null ? List.of() : this.grantTokens;
    }

    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    @Import(name="payload", required=true)
      private final String payload;

    public String getPayload() {
        return this.payload;
    }

    public GetSecretSecret(
        @Nullable Map<String,String> context,
        @Nullable List<String> grantTokens,
        String name,
        String payload) {
        this.context = context;
        this.grantTokens = grantTokens;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.payload = Objects.requireNonNull(payload, "expected parameter 'payload' to be non-null");
    }

    private GetSecretSecret() {
        this.context = Map.of();
        this.grantTokens = List.of();
        this.name = null;
        this.payload = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecretSecret defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,String> context;
        private @Nullable List<String> grantTokens;
        private String name;
        private String payload;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSecretSecret defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.context = defaults.context;
    	      this.grantTokens = defaults.grantTokens;
    	      this.name = defaults.name;
    	      this.payload = defaults.payload;
        }

        public Builder context(@Nullable Map<String,String> context) {
            this.context = context;
            return this;
        }

        public Builder grantTokens(@Nullable List<String> grantTokens) {
            this.grantTokens = grantTokens;
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder payload(String payload) {
            this.payload = Objects.requireNonNull(payload);
            return this;
        }
        public GetSecretSecret build() {
            return new GetSecretSecret(context, grantTokens, name, payload);
        }
    }
}
